package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import java.util.concurrent.Executor;

public final class TaskExecutors {
    public static final Executor MAIN_THREAD;
    static final Executor zzbNH;

    /* renamed from: com.google.android.gms.tasks.TaskExecutors.1 */
    class C04341 implements Executor {
        C04341() {
        }

        public void execute(@NonNull Runnable runnable) {
            runnable.run();
        }
    }

    private static final class zza implements Executor {
        private final Handler mHandler;

        public zza() {
            this.mHandler = new Handler(Looper.getMainLooper());
        }

        public void execute(@NonNull Runnable runnable) {
            this.mHandler.post(runnable);
        }
    }

    static {
        MAIN_THREAD = new zza();
        zzbNH = new C04341();
    }

    private TaskExecutors() {
    }
}
