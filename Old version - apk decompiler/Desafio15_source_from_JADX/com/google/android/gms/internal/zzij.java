package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.common.ConnectionResult;
import java.util.Map;

@zzme
public class zzij implements zzid {
    public void zza(zzqw com_google_android_gms_internal_zzqw, Map<String, String> map) {
        if (zzw.zzdl().zzjQ()) {
            int i = -1;
            try {
                i = Integer.parseInt((String) map.get("eventType"));
            } catch (Throwable e) {
                zzqf.zzb("Parse Scion log event type error", e);
            }
            String str = (String) map.get("eventId");
            switch (i) {
                case ConnectionResult.SUCCESS /*0*/:
                    zzw.zzdl().zzf(com_google_android_gms_internal_zzqw.getContext(), str);
                case ConnectionResult.SERVICE_MISSING /*1*/:
                    zzw.zzdl().zzg(com_google_android_gms_internal_zzqw.getContext(), str);
                case ConnectionResult.SERVICE_VERSION_UPDATE_REQUIRED /*2*/:
                    zzw.zzdl().zzi(com_google_android_gms_internal_zzqw.getContext(), str);
                default:
            }
        }
    }
}
