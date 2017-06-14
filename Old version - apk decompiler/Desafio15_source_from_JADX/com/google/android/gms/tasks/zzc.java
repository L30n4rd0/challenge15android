package com.google.android.gms.tasks;

import android.support.annotation.NonNull;
import java.util.concurrent.Executor;

class zzc<TResult> implements zzf<TResult> {
    private final Executor zzbFQ;
    private OnCompleteListener<TResult> zzbNy;
    private final Object zzrJ;

    /* renamed from: com.google.android.gms.tasks.zzc.1 */
    class C04381 implements Runnable {
        final /* synthetic */ Task zzbNv;
        final /* synthetic */ zzc zzbNz;

        C04381(zzc com_google_android_gms_tasks_zzc, Task task) {
            this.zzbNz = com_google_android_gms_tasks_zzc;
            this.zzbNv = task;
        }

        public void run() {
            synchronized (this.zzbNz.zzrJ) {
                if (this.zzbNz.zzbNy != null) {
                    this.zzbNz.zzbNy.onComplete(this.zzbNv);
                }
            }
        }
    }

    public zzc(@NonNull Executor executor, @NonNull OnCompleteListener<TResult> onCompleteListener) {
        this.zzrJ = new Object();
        this.zzbFQ = executor;
        this.zzbNy = onCompleteListener;
    }

    public void cancel() {
        synchronized (this.zzrJ) {
            this.zzbNy = null;
        }
    }

    public void onComplete(@NonNull Task<TResult> task) {
        synchronized (this.zzrJ) {
            if (this.zzbNy == null) {
                return;
            }
            this.zzbFQ.execute(new C04381(this, task));
        }
    }
}
