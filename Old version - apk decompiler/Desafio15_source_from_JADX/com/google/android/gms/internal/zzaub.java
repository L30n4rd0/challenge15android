package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.MainThread;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.measurement.AppMeasurement;

public final class zzaub {
    private final zza zzbtC;

    /* renamed from: com.google.android.gms.internal.zzaub.1 */
    class C02521 implements Runnable {
        final /* synthetic */ zzaue zzbtD;
        final /* synthetic */ long zzbtE;
        final /* synthetic */ Bundle zzbtF;
        final /* synthetic */ zzatx zzbtG;
        final /* synthetic */ Context zztf;

        C02521(zzaub com_google_android_gms_internal_zzaub, zzaue com_google_android_gms_internal_zzaue, long j, Bundle bundle, Context context, zzatx com_google_android_gms_internal_zzatx) {
            this.zzbtD = com_google_android_gms_internal_zzaue;
            this.zzbtE = j;
            this.zzbtF = bundle;
            this.zztf = context;
            this.zzbtG = com_google_android_gms_internal_zzatx;
        }

        public void run() {
            zzaus zzS = this.zzbtD.zzKf().zzS(this.zzbtD.zzKa().zzke(), "_fot");
            long longValue = (zzS == null || !(zzS.mValue instanceof Long)) ? 0 : ((Long) zzS.mValue).longValue();
            long j = this.zzbtE;
            longValue = (longValue <= 0 || (j < longValue && j > 0)) ? j : longValue - 1;
            if (longValue > 0) {
                this.zzbtF.putLong("click_timestamp", longValue);
            }
            AppMeasurement.getInstance(this.zztf).logEventInternal("auto", "_cmp", this.zzbtF);
            this.zzbtG.zzMd().log("Install campaign recorded");
        }
    }

    public interface zza {
        void doStartService(Context context, Intent intent);
    }

    public zzaub(zza com_google_android_gms_internal_zzaub_zza) {
        zzac.zzw(com_google_android_gms_internal_zzaub_zza);
        this.zzbtC = com_google_android_gms_internal_zzaub_zza;
    }

    public static boolean zzi(Context context, boolean z) {
        zzac.zzw(context);
        return zzaut.zza(context, z ? "com.google.android.gms.measurement.PackageMeasurementReceiver" : "com.google.android.gms.measurement.AppMeasurementReceiver", false);
    }

    @MainThread
    public void onReceive(Context context, Intent intent) {
        zzaue zzbM = zzaue.zzbM(context);
        zzatx zzKk = zzbM.zzKk();
        if (intent == null) {
            zzKk.zzLZ().log("Receiver called with null intent");
            return;
        }
        zzbM.zzKm().zzLf();
        String action = intent.getAction();
        zzKk.zzMd().zzj("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            zzaum.zzj(context, false);
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            this.zzbtC.doStartService(context, className);
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            action = intent.getStringExtra("referrer");
            if (action == null) {
                zzKk.zzMd().log("Install referrer extras are null");
                return;
            }
            Bundle zzu = zzbM.zzKg().zzu(Uri.parse(action));
            if (zzu == null) {
                zzKk.zzMd().log("No campaign defined in install referrer broadcast");
                return;
            }
            long longExtra = 1000 * intent.getLongExtra("referrer_timestamp_seconds", 0);
            if (longExtra == 0) {
                zzKk.zzLZ().log("Install referrer is missing timestamp");
            }
            zzbM.zzKj().zzm(new C02521(this, zzbM, longExtra, zzu, context, zzKk));
        }
    }
}
