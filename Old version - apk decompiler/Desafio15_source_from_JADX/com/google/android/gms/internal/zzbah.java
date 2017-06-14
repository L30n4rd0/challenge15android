package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.HasOptions;
import com.google.android.gms.common.api.Api.zzf;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzg;

public final class zzbah {
    public static final Api<zzbaj> API;
    public static final Api<zza> zzaKN;
    public static final zzf<zzbat> zzaid;
    public static final com.google.android.gms.common.api.Api.zza<zzbat, zzbaj> zzaie;
    public static final Scope zzakh;
    public static final Scope zzaki;
    public static final zzf<zzbat> zzbEj;
    static final com.google.android.gms.common.api.Api.zza<zzbat, zza> zzbEk;

    /* renamed from: com.google.android.gms.internal.zzbah.1 */
    class C07011 extends com.google.android.gms.common.api.Api.zza<zzbat, zzbaj> {
        C07011() {
        }

        public zzbat zza(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, zzbaj com_google_android_gms_internal_zzbaj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return new zzbat(context, looper, true, com_google_android_gms_common_internal_zzg, com_google_android_gms_internal_zzbaj == null ? zzbaj.zzbEm : com_google_android_gms_internal_zzbaj, connectionCallbacks, onConnectionFailedListener);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzbah.2 */
    class C07022 extends com.google.android.gms.common.api.Api.zza<zzbat, zza> {
        C07022() {
        }

        public zzbat zza(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, zza com_google_android_gms_internal_zzbah_zza, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return new zzbat(context, looper, false, com_google_android_gms_common_internal_zzg, com_google_android_gms_internal_zzbah_zza.zzPH(), connectionCallbacks, onConnectionFailedListener);
        }
    }

    public static class zza implements HasOptions {
        private final Bundle zzbEl;

        public Bundle zzPH() {
            return this.zzbEl;
        }
    }

    static {
        zzaid = new zzf();
        zzbEj = new zzf();
        zzaie = new C07011();
        zzbEk = new C07022();
        zzakh = new Scope(Scopes.PROFILE);
        zzaki = new Scope(Scopes.EMAIL);
        API = new Api("SignIn.API", zzaie, zzaid);
        zzaKN = new Api("SignIn.INTERNAL_API", zzbEk, zzbEj);
    }
}
