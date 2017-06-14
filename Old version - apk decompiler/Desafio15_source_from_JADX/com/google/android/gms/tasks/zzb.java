package com.google.android.gms.tasks;

import android.support.annotation.NonNull;
import java.util.concurrent.Executor;

class zzb<TResult, TContinuationResult> implements OnFailureListener, OnSuccessListener<TContinuationResult>, zzf<TResult> {
    private final Executor zzbFQ;
    private final Continuation<TResult, Task<TContinuationResult>> zzbNt;
    private final zzh<TContinuationResult> zzbNu;

    /* renamed from: com.google.android.gms.tasks.zzb.1 */
    class C04371 implements Runnable {
        final /* synthetic */ Task zzbNv;
        final /* synthetic */ zzb zzbNx;

        C04371(zzb com_google_android_gms_tasks_zzb, Task task) {
            this.zzbNx = com_google_android_gms_tasks_zzb;
            this.zzbNv = task;
        }

        public void run() {
            try {
                Task task = (Task) this.zzbNx.zzbNt.then(this.zzbNv);
                if (task == null) {
                    this.zzbNx.onFailure(new NullPointerException("Continuation returned null"));
                    return;
                }
                task.addOnSuccessListener(TaskExecutors.zzbNH, this.zzbNx);
                task.addOnFailureListener(TaskExecutors.zzbNH, this.zzbNx);
            } catch (Exception e) {
                if (e.getCause() instanceof Exception) {
                    this.zzbNx.zzbNu.setException((Exception) e.getCause());
                } else {
                    this.zzbNx.zzbNu.setException(e);
                }
            } catch (Exception e2) {
                this.zzbNx.zzbNu.setException(e2);
            }
        }
    }

    public zzb(@NonNull Executor executor, @NonNull Continuation<TResult, Task<TContinuationResult>> continuation, @NonNull zzh<TContinuationResult> com_google_android_gms_tasks_zzh_TContinuationResult) {
        this.zzbFQ = executor;
        this.zzbNt = continuation;
        this.zzbNu = com_google_android_gms_tasks_zzh_TContinuationResult;
    }

    public void cancel() {
        throw new UnsupportedOperationException();
    }

    public void onComplete(@NonNull Task<TResult> task) {
        this.zzbFQ.execute(new C04371(this, task));
    }

    public void onFailure(@NonNull Exception exception) {
        this.zzbNu.setException(exception);
    }

    public void onSuccess(TContinuationResult tContinuationResult) {
        this.zzbNu.setResult(tContinuationResult);
    }
}
