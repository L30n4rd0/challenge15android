package com.google.android.gms.tasks;

import android.app.Activity;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.internal.zzabe;
import com.google.android.gms.internal.zzabf;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

final class zzh<TResult> extends Task<TResult> {
    private final zzg<TResult> zzbNI;
    private boolean zzbNJ;
    private TResult zzbNK;
    private Exception zzbNL;
    private final Object zzrJ;

    private static class zza extends zzabe {
        private final List<WeakReference<zzf<?>>> mListeners;

        private zza(zzabf com_google_android_gms_internal_zzabf) {
            super(com_google_android_gms_internal_zzabf);
            this.mListeners = new ArrayList();
            this.zzaCR.zza("TaskOnStopCallback", (zzabe) this);
        }

        public static zza zzw(Activity activity) {
            zzabf zzs = zzabe.zzs(activity);
            zza com_google_android_gms_tasks_zzh_zza = (zza) zzs.zza("TaskOnStopCallback", zza.class);
            return com_google_android_gms_tasks_zzh_zza == null ? new zza(zzs) : com_google_android_gms_tasks_zzh_zza;
        }

        @MainThread
        public void onStop() {
            synchronized (this.mListeners) {
                for (WeakReference weakReference : this.mListeners) {
                    zzf com_google_android_gms_tasks_zzf = (zzf) weakReference.get();
                    if (com_google_android_gms_tasks_zzf != null) {
                        com_google_android_gms_tasks_zzf.cancel();
                    }
                }
                this.mListeners.clear();
            }
        }

        public <T> void zzb(zzf<T> com_google_android_gms_tasks_zzf_T) {
            synchronized (this.mListeners) {
                this.mListeners.add(new WeakReference(com_google_android_gms_tasks_zzf_T));
            }
        }
    }

    zzh() {
        this.zzrJ = new Object();
        this.zzbNI = new zzg();
    }

    private void zzTF() {
        zzac.zza(this.zzbNJ, (Object) "Task is not yet complete");
    }

    private void zzTG() {
        zzac.zza(!this.zzbNJ, (Object) "Task is already complete");
    }

    private void zzTH() {
        synchronized (this.zzrJ) {
            if (this.zzbNJ) {
                this.zzbNI.zza((Task) this);
                return;
            }
        }
    }

    @NonNull
    public Task<TResult> addOnCompleteListener(@NonNull Activity activity, @NonNull OnCompleteListener<TResult> onCompleteListener) {
        zzf com_google_android_gms_tasks_zzc = new zzc(TaskExecutors.MAIN_THREAD, onCompleteListener);
        this.zzbNI.zza(com_google_android_gms_tasks_zzc);
        zza.zzw(activity).zzb(com_google_android_gms_tasks_zzc);
        zzTH();
        return this;
    }

    @NonNull
    public Task<TResult> addOnCompleteListener(@NonNull OnCompleteListener<TResult> onCompleteListener) {
        return addOnCompleteListener(TaskExecutors.MAIN_THREAD, (OnCompleteListener) onCompleteListener);
    }

    @NonNull
    public Task<TResult> addOnCompleteListener(@NonNull Executor executor, @NonNull OnCompleteListener<TResult> onCompleteListener) {
        this.zzbNI.zza(new zzc(executor, onCompleteListener));
        zzTH();
        return this;
    }

    @NonNull
    public Task<TResult> addOnFailureListener(@NonNull Activity activity, @NonNull OnFailureListener onFailureListener) {
        zzf com_google_android_gms_tasks_zzd = new zzd(TaskExecutors.MAIN_THREAD, onFailureListener);
        this.zzbNI.zza(com_google_android_gms_tasks_zzd);
        zza.zzw(activity).zzb(com_google_android_gms_tasks_zzd);
        zzTH();
        return this;
    }

    @NonNull
    public Task<TResult> addOnFailureListener(@NonNull OnFailureListener onFailureListener) {
        return addOnFailureListener(TaskExecutors.MAIN_THREAD, onFailureListener);
    }

    @NonNull
    public Task<TResult> addOnFailureListener(@NonNull Executor executor, @NonNull OnFailureListener onFailureListener) {
        this.zzbNI.zza(new zzd(executor, onFailureListener));
        zzTH();
        return this;
    }

    @NonNull
    public Task<TResult> addOnSuccessListener(@NonNull Activity activity, @NonNull OnSuccessListener<? super TResult> onSuccessListener) {
        zzf com_google_android_gms_tasks_zze = new zze(TaskExecutors.MAIN_THREAD, onSuccessListener);
        this.zzbNI.zza(com_google_android_gms_tasks_zze);
        zza.zzw(activity).zzb(com_google_android_gms_tasks_zze);
        zzTH();
        return this;
    }

    @NonNull
    public Task<TResult> addOnSuccessListener(@NonNull OnSuccessListener<? super TResult> onSuccessListener) {
        return addOnSuccessListener(TaskExecutors.MAIN_THREAD, (OnSuccessListener) onSuccessListener);
    }

    @NonNull
    public Task<TResult> addOnSuccessListener(@NonNull Executor executor, @NonNull OnSuccessListener<? super TResult> onSuccessListener) {
        this.zzbNI.zza(new zze(executor, onSuccessListener));
        zzTH();
        return this;
    }

    @NonNull
    public <TContinuationResult> Task<TContinuationResult> continueWith(@NonNull Continuation<TResult, TContinuationResult> continuation) {
        return continueWith(TaskExecutors.MAIN_THREAD, continuation);
    }

    @NonNull
    public <TContinuationResult> Task<TContinuationResult> continueWith(@NonNull Executor executor, @NonNull Continuation<TResult, TContinuationResult> continuation) {
        Task com_google_android_gms_tasks_zzh = new zzh();
        this.zzbNI.zza(new zza(executor, continuation, com_google_android_gms_tasks_zzh));
        zzTH();
        return com_google_android_gms_tasks_zzh;
    }

    @NonNull
    public <TContinuationResult> Task<TContinuationResult> continueWithTask(@NonNull Continuation<TResult, Task<TContinuationResult>> continuation) {
        return continueWithTask(TaskExecutors.MAIN_THREAD, continuation);
    }

    @NonNull
    public <TContinuationResult> Task<TContinuationResult> continueWithTask(@NonNull Executor executor, @NonNull Continuation<TResult, Task<TContinuationResult>> continuation) {
        Task com_google_android_gms_tasks_zzh = new zzh();
        this.zzbNI.zza(new zzb(executor, continuation, com_google_android_gms_tasks_zzh));
        zzTH();
        return com_google_android_gms_tasks_zzh;
    }

    @Nullable
    public Exception getException() {
        Exception exception;
        synchronized (this.zzrJ) {
            exception = this.zzbNL;
        }
        return exception;
    }

    public TResult getResult() {
        TResult tResult;
        synchronized (this.zzrJ) {
            zzTF();
            if (this.zzbNL != null) {
                throw new RuntimeExecutionException(this.zzbNL);
            }
            tResult = this.zzbNK;
        }
        return tResult;
    }

    public <X extends Throwable> TResult getResult(@NonNull Class<X> cls) throws Throwable {
        TResult tResult;
        synchronized (this.zzrJ) {
            zzTF();
            if (cls.isInstance(this.zzbNL)) {
                throw ((Throwable) cls.cast(this.zzbNL));
            } else if (this.zzbNL != null) {
                throw new RuntimeExecutionException(this.zzbNL);
            } else {
                tResult = this.zzbNK;
            }
        }
        return tResult;
    }

    public boolean isComplete() {
        boolean z;
        synchronized (this.zzrJ) {
            z = this.zzbNJ;
        }
        return z;
    }

    public boolean isSuccessful() {
        boolean z;
        synchronized (this.zzrJ) {
            z = this.zzbNJ && this.zzbNL == null;
        }
        return z;
    }

    public void setException(@NonNull Exception exception) {
        zzac.zzb((Object) exception, (Object) "Exception must not be null");
        synchronized (this.zzrJ) {
            zzTG();
            this.zzbNJ = true;
            this.zzbNL = exception;
        }
        this.zzbNI.zza((Task) this);
    }

    public void setResult(TResult tResult) {
        synchronized (this.zzrJ) {
            zzTG();
            this.zzbNJ = true;
            this.zzbNK = tResult;
        }
        this.zzbNI.zza((Task) this);
    }

    public boolean trySetException(@NonNull Exception exception) {
        boolean z = true;
        zzac.zzb((Object) exception, (Object) "Exception must not be null");
        synchronized (this.zzrJ) {
            if (this.zzbNJ) {
                z = false;
            } else {
                this.zzbNJ = true;
                this.zzbNL = exception;
                this.zzbNI.zza((Task) this);
            }
        }
        return z;
    }

    public boolean trySetResult(TResult tResult) {
        boolean z = true;
        synchronized (this.zzrJ) {
            if (this.zzbNJ) {
                z = false;
            } else {
                this.zzbNJ = true;
                this.zzbNK = tResult;
                this.zzbNI.zza((Task) this);
            }
        }
        return z;
    }
}