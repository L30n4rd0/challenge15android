package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.support.annotation.MainThread;
import com.google.android.gms.common.internal.zzac;

public final class zzaum {
    private final Context mContext;
    private final Handler mHandler;
    private final zza zzbvX;

    /* renamed from: com.google.android.gms.internal.zzaum.1 */
    class C02871 implements Runnable {
        final /* synthetic */ int zzabA;
        final /* synthetic */ zzaue zzbtD;
        final /* synthetic */ zzatx zzbtG;
        final /* synthetic */ zzaum zzbvY;

        /* renamed from: com.google.android.gms.internal.zzaum.1.1 */
        class C02861 implements Runnable {
            final /* synthetic */ C02871 zzbvZ;

            C02861(C02871 c02871) {
                this.zzbvZ = c02871;
            }

            public void run() {
                if (this.zzbvZ.zzbvY.zzbvX.callServiceStopSelfResult(this.zzbvZ.zzabA)) {
                    this.zzbvZ.zzbtD.zzKm().zzLf();
                    this.zzbvZ.zzbtG.zzMd().log("Local AppMeasurementService processed last upload request");
                }
            }
        }

        C02871(zzaum com_google_android_gms_internal_zzaum, zzaue com_google_android_gms_internal_zzaue, int i, zzatx com_google_android_gms_internal_zzatx) {
            this.zzbvY = com_google_android_gms_internal_zzaum;
            this.zzbtD = com_google_android_gms_internal_zzaue;
            this.zzabA = i;
            this.zzbtG = com_google_android_gms_internal_zzatx;
        }

        public void run() {
            this.zzbtD.zzMK();
            this.zzbtD.zzMF();
            this.zzbvY.mHandler.post(new C02861(this));
        }
    }

    public interface zza {
        boolean callServiceStopSelfResult(int i);

        Context getContext();
    }

    public zzaum(zza com_google_android_gms_internal_zzaum_zza) {
        this.mContext = com_google_android_gms_internal_zzaum_zza.getContext();
        zzac.zzw(this.mContext);
        this.zzbvX = com_google_android_gms_internal_zzaum_zza;
        this.mHandler = new Handler();
    }

    private zzatx zzKk() {
        return zzaue.zzbM(this.mContext).zzKk();
    }

    public static boolean zzj(Context context, boolean z) {
        zzac.zzw(context);
        return zzaut.zzy(context, z ? "com.google.android.gms.measurement.PackageMeasurementService" : "com.google.android.gms.measurement.AppMeasurementService");
    }

    @MainThread
    public IBinder onBind(Intent intent) {
        if (intent == null) {
            zzKk().zzLX().log("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new zzauf(zzaue.zzbM(this.mContext));
        }
        zzKk().zzLZ().zzj("onBind received unknown action", action);
        return null;
    }

    @MainThread
    public void onCreate() {
        zzaue zzbM = zzaue.zzbM(this.mContext);
        zzatx zzKk = zzbM.zzKk();
        zzbM.zzKm().zzLf();
        zzKk.zzMd().log("Local AppMeasurementService is starting up");
    }

    @MainThread
    public void onDestroy() {
        zzaue zzbM = zzaue.zzbM(this.mContext);
        zzatx zzKk = zzbM.zzKk();
        zzbM.zzKm().zzLf();
        zzKk.zzMd().log("Local AppMeasurementService is shutting down");
    }

    @MainThread
    public void onRebind(Intent intent) {
        if (intent == null) {
            zzKk().zzLX().log("onRebind called with null intent");
            return;
        }
        zzKk().zzMd().zzj("onRebind called. action", intent.getAction());
    }

    @MainThread
    public int onStartCommand(Intent intent, int i, int i2) {
        zzaue zzbM = zzaue.zzbM(this.mContext);
        zzatx zzKk = zzbM.zzKk();
        if (intent == null) {
            zzKk.zzLZ().log("AppMeasurementService started with null intent");
        } else {
            String action = intent.getAction();
            zzbM.zzKm().zzLf();
            zzKk.zzMd().zze("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
            if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
                zzbM.zzKj().zzm(new C02871(this, zzbM, i2, zzKk));
            }
        }
        return 2;
    }

    @MainThread
    public boolean onUnbind(Intent intent) {
        if (intent == null) {
            zzKk().zzLX().log("onUnbind called with null intent");
        } else {
            zzKk().zzMd().zzj("onUnbind called for intent. action", intent.getAction());
        }
        return true;
    }
}
