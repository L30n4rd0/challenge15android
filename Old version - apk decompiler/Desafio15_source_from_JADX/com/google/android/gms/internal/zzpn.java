package com.google.android.gms.internal;

import android.os.Process;
import com.google.android.gms.ads.internal.zzw;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@zzme
public final class zzpn {
    private static final ThreadPoolExecutor zzXu;
    private static final ThreadPoolExecutor zzXv;

    /* renamed from: com.google.android.gms.internal.zzpn.1 */
    class C03911 implements Callable<Void> {
        final /* synthetic */ Runnable zzXw;

        C03911(Runnable runnable) {
            this.zzXw = runnable;
        }

        public /* synthetic */ Object call() throws Exception {
            return zzbk();
        }

        public Void zzbk() {
            this.zzXw.run();
            return null;
        }
    }

    /* renamed from: com.google.android.gms.internal.zzpn.2 */
    class C03922 implements Callable<Void> {
        final /* synthetic */ Runnable zzXw;

        C03922(Runnable runnable) {
            this.zzXw = runnable;
        }

        public /* synthetic */ Object call() throws Exception {
            return zzbk();
        }

        public Void zzbk() {
            this.zzXw.run();
            return null;
        }
    }

    /* renamed from: com.google.android.gms.internal.zzpn.3 */
    class C03933 implements Runnable {
        final /* synthetic */ zzqj zzXx;
        final /* synthetic */ Callable zzXy;

        C03933(zzqj com_google_android_gms_internal_zzqj, Callable callable) {
            this.zzXx = com_google_android_gms_internal_zzqj;
            this.zzXy = callable;
        }

        public void run() {
            try {
                Process.setThreadPriority(10);
                this.zzXx.zzh(this.zzXy.call());
            } catch (Throwable e) {
                zzw.zzcQ().zza(e, "AdThreadPool.submit");
                this.zzXx.zze(e);
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.zzpn.4 */
    class C03944 implements Runnable {
        final /* synthetic */ zzqj zzXx;
        final /* synthetic */ Future zzXz;

        C03944(zzqj com_google_android_gms_internal_zzqj, Future future) {
            this.zzXx = com_google_android_gms_internal_zzqj;
            this.zzXz = future;
        }

        public void run() {
            if (this.zzXx.isCancelled()) {
                this.zzXz.cancel(true);
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.zzpn.5 */
    class C03955 implements ThreadFactory {
        private final AtomicInteger zzXA;
        final /* synthetic */ String zzXB;

        C03955(String str) {
            this.zzXB = str;
            this.zzXA = new AtomicInteger(1);
        }

        public Thread newThread(Runnable runnable) {
            String str = this.zzXB;
            return new Thread(runnable, new StringBuilder(String.valueOf(str).length() + 23).append("AdWorker(").append(str).append(") #").append(this.zzXA.getAndIncrement()).toString());
        }
    }

    static {
        zzXu = new ThreadPoolExecutor(10, 10, 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), zzaW("Default"));
        zzXv = new ThreadPoolExecutor(5, 5, 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), zzaW("Loader"));
        zzXu.allowCoreThreadTimeOut(true);
        zzXv.allowCoreThreadTimeOut(true);
    }

    public static zzqm<Void> zza(int i, Runnable runnable) {
        return i == 1 ? zza(zzXv, new C03911(runnable)) : zza(zzXu, new C03922(runnable));
    }

    public static zzqm<Void> zza(Runnable runnable) {
        return zza(0, runnable);
    }

    public static <T> zzqm<T> zza(Callable<T> callable) {
        return zza(zzXu, (Callable) callable);
    }

    public static <T> zzqm<T> zza(ExecutorService executorService, Callable<T> callable) {
        Object com_google_android_gms_internal_zzqj = new zzqj();
        try {
            com_google_android_gms_internal_zzqj.zzd(new C03944(com_google_android_gms_internal_zzqj, executorService.submit(new C03933(com_google_android_gms_internal_zzqj, callable))));
        } catch (Throwable e) {
            zzqf.zzc("Thread execution is rejected.", e);
            com_google_android_gms_internal_zzqj.cancel(true);
        }
        return com_google_android_gms_internal_zzqj;
    }

    private static ThreadFactory zzaW(String str) {
        return new C03955(str);
    }
}
