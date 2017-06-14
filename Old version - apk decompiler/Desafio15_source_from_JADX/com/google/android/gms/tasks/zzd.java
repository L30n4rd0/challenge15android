package com.google.android.gms.tasks;

import android.support.annotation.NonNull;
import java.util.concurrent.Executor;

class zzd<TResult> implements zzf<TResult> {
    private final Executor zzbFQ;
    private OnFailureListener zzbNA;
    private final Object zzrJ;

    /* renamed from: com.google.android.gms.tasks.zzd.1 */
    class C04391 implements Runnable {
        final /* synthetic */ zzd zzbNB;
        final /* synthetic */ Task zzbNv;

        C04391(zzd com_google_android_gms_tasks_zzd, Task task) {
            this.zzbNB = com_google_android_gms_tasks_zzd;
            this.zzbNv = task;
        }

        public void run() {
            synchronized (this.zzbNB.zzrJ) {
                if (this.zzbNB.zzbNA != null) {
                    this.zzbNB.zzbNA.onFailure(this.zzbNv.getException());
                }
            }
        }
    }

    public zzd(@NonNull Executor executor, @NonNull OnFailureListener onFailureListener) {
        this.zzrJ = new Object();
        this.zzbFQ = executor;
        this.zzbNA = onFailureListener;
    }

    public void cancel() {
        synchronized (this.zzrJ) {
            this.zzbNA = null;
        }
    }

    public void onComplete(@NonNull Task<TResult> task) {
        if (!task.isSuccessful()) {
            synchronized (this.zzrJ) {
                if (this.zzbNA == null) {
                    return;
                }
                this.zzbFQ.execute(new C04391(this, task));
            }
        }
    }
}
