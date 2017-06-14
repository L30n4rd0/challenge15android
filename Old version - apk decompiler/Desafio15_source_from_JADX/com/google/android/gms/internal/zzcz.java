package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import java.lang.ref.WeakReference;

class zzcz implements ActivityLifecycleCallbacks {
    private final Application zzwS;
    private final WeakReference<ActivityLifecycleCallbacks> zzxm;
    private boolean zzxn;

    public interface zza {
        void zza(ActivityLifecycleCallbacks activityLifecycleCallbacks);
    }

    /* renamed from: com.google.android.gms.internal.zzcz.1 */
    class C05831 implements zza {
        final /* synthetic */ Activity val$activity;
        final /* synthetic */ Bundle zzxo;

        C05831(zzcz com_google_android_gms_internal_zzcz, Activity activity, Bundle bundle) {
            this.val$activity = activity;
            this.zzxo = bundle;
        }

        public void zza(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            activityLifecycleCallbacks.onActivityCreated(this.val$activity, this.zzxo);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzcz.2 */
    class C05842 implements zza {
        final /* synthetic */ Activity val$activity;

        C05842(zzcz com_google_android_gms_internal_zzcz, Activity activity) {
            this.val$activity = activity;
        }

        public void zza(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            activityLifecycleCallbacks.onActivityStarted(this.val$activity);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzcz.3 */
    class C05853 implements zza {
        final /* synthetic */ Activity val$activity;

        C05853(zzcz com_google_android_gms_internal_zzcz, Activity activity) {
            this.val$activity = activity;
        }

        public void zza(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            activityLifecycleCallbacks.onActivityResumed(this.val$activity);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzcz.4 */
    class C05864 implements zza {
        final /* synthetic */ Activity val$activity;

        C05864(zzcz com_google_android_gms_internal_zzcz, Activity activity) {
            this.val$activity = activity;
        }

        public void zza(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            activityLifecycleCallbacks.onActivityPaused(this.val$activity);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzcz.5 */
    class C05875 implements zza {
        final /* synthetic */ Activity val$activity;

        C05875(zzcz com_google_android_gms_internal_zzcz, Activity activity) {
            this.val$activity = activity;
        }

        public void zza(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            activityLifecycleCallbacks.onActivityStopped(this.val$activity);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzcz.6 */
    class C05886 implements zza {
        final /* synthetic */ Activity val$activity;
        final /* synthetic */ Bundle zzxo;

        C05886(zzcz com_google_android_gms_internal_zzcz, Activity activity, Bundle bundle) {
            this.val$activity = activity;
            this.zzxo = bundle;
        }

        public void zza(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            activityLifecycleCallbacks.onActivitySaveInstanceState(this.val$activity, this.zzxo);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzcz.7 */
    class C05897 implements zza {
        final /* synthetic */ Activity val$activity;

        C05897(zzcz com_google_android_gms_internal_zzcz, Activity activity) {
            this.val$activity = activity;
        }

        public void zza(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            activityLifecycleCallbacks.onActivityDestroyed(this.val$activity);
        }
    }

    public zzcz(Application application, ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.zzxn = false;
        this.zzxm = new WeakReference(activityLifecycleCallbacks);
        this.zzwS = application;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        zza(new C05831(this, activity, bundle));
    }

    public void onActivityDestroyed(Activity activity) {
        zza(new C05897(this, activity));
    }

    public void onActivityPaused(Activity activity) {
        zza(new C05864(this, activity));
    }

    public void onActivityResumed(Activity activity) {
        zza(new C05853(this, activity));
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zza(new C05886(this, activity, bundle));
    }

    public void onActivityStarted(Activity activity) {
        zza(new C05842(this, activity));
    }

    public void onActivityStopped(Activity activity) {
        zza(new C05875(this, activity));
    }

    protected void zza(zza com_google_android_gms_internal_zzcz_zza) {
        try {
            ActivityLifecycleCallbacks activityLifecycleCallbacks = (ActivityLifecycleCallbacks) this.zzxm.get();
            if (activityLifecycleCallbacks != null) {
                com_google_android_gms_internal_zzcz_zza.zza(activityLifecycleCallbacks);
            } else if (!this.zzxn) {
                this.zzwS.unregisterActivityLifecycleCallbacks(this);
                this.zzxn = true;
            }
        } catch (Throwable e) {
            zzqf.zzb("Error while dispatching lifecycle callback.", e);
        }
    }
}
