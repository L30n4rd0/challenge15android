package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zzaad.zzb;

public final class zzach implements zzacg {

    private static class zza extends zzace {
        private final zzb<Status> zzaGN;

        public zza(zzb<Status> com_google_android_gms_internal_zzaad_zzb_com_google_android_gms_common_api_Status) {
            this.zzaGN = com_google_android_gms_internal_zzaad_zzb_com_google_android_gms_common_api_Status;
        }

        public void zzdd(int i) throws RemoteException {
            this.zzaGN.setResult(new Status(i));
        }
    }

    /* renamed from: com.google.android.gms.internal.zzach.1 */
    class C07251 extends zza {
        C07251(zzach com_google_android_gms_internal_zzach, GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        protected void zza(zzacj com_google_android_gms_internal_zzacj) throws RemoteException {
            ((zzacl) com_google_android_gms_internal_zzacj.zzxD()).zza(new zza(this));
        }
    }

    public PendingResult<Status> zzg(GoogleApiClient googleApiClient) {
        return googleApiClient.zzb(new C07251(this, googleApiClient));
    }
}
