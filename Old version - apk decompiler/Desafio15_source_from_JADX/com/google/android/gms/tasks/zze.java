package com.google.android.gms.tasks;

import android.support.annotation.NonNull;
import java.util.concurrent.Executor;

class zze<TResult> implements zzf<TResult> {
    private final Executor zzbFQ;
    private OnSuccessListener<? super TResult> zzbNC;
    private final Object zzrJ;

    /* renamed from: com.google.android.gms.tasks.zze.1 */
    class C04401 implements Runnable {
        final /* synthetic */ zze zzbND;
        final /* synthetic */ Task zzbNv;

        C04401(zze com_google_android_gms_tasks_zze, Task task) {
            this.zzbND = com_google_android_gms_tasks_zze;
            this.zzbNv = task;
        }

        public void run() {
            synchronized (this.zzbND.zzrJ) {
                if (this.zzbND.zzbNC != null) {
                    this.zzbND.zzbNC.onSuccess(this.zzbNv.getResult());
                }
            }
        }
    }

    public zze(@NonNull Executor executor, @NonNull OnSuccessListener<? super TResult> onSuccessListener) {
        this.zzrJ = new Object();
        this.zzbFQ = executor;
        this.zzbNC = onSuccessListener;
    }

    public void cancel() {
        synchronized (this.zzrJ) {
            this.zzbNC = null;
        }
    }

    public void onComplete(@NonNull Task<TResult> task) {
        if (task.isSuccessful()) {
            synchronized (this.zzrJ) {
                if (this.zzbNC == null) {
                    return;
                }
                this.zzbFQ.execute(new C04401(this, task));
            }
        }
    }
}
