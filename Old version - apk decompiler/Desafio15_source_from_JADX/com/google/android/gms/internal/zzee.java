package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzb.zza;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.leonardo.desafio15.C0453R;
import java.util.List;

public class zzee implements Creator<zzec> {
    static void zza(zzec com_google_android_gms_internal_zzec, Parcel parcel, int i) {
        int zzaZ = zzc.zzaZ(parcel);
        zzc.zzc(parcel, 1, com_google_android_gms_internal_zzec.versionCode);
        zzc.zza(parcel, 2, com_google_android_gms_internal_zzec.zzyT);
        zzc.zza(parcel, 3, com_google_android_gms_internal_zzec.extras, false);
        zzc.zzc(parcel, 4, com_google_android_gms_internal_zzec.zzyU);
        zzc.zzb(parcel, 5, com_google_android_gms_internal_zzec.zzyV, false);
        zzc.zza(parcel, 6, com_google_android_gms_internal_zzec.zzyW);
        zzc.zzc(parcel, 7, com_google_android_gms_internal_zzec.zzyX);
        zzc.zza(parcel, 8, com_google_android_gms_internal_zzec.zzyY);
        zzc.zza(parcel, 9, com_google_android_gms_internal_zzec.zzyZ, false);
        zzc.zza(parcel, 10, com_google_android_gms_internal_zzec.zzza, i, false);
        zzc.zza(parcel, 11, com_google_android_gms_internal_zzec.zzzb, i, false);
        zzc.zza(parcel, 12, com_google_android_gms_internal_zzec.zzzc, false);
        zzc.zza(parcel, 13, com_google_android_gms_internal_zzec.zzzd, false);
        zzc.zza(parcel, 14, com_google_android_gms_internal_zzec.zzze, false);
        zzc.zzb(parcel, 15, com_google_android_gms_internal_zzec.zzzf, false);
        zzc.zza(parcel, 16, com_google_android_gms_internal_zzec.zzzg, false);
        zzc.zza(parcel, 17, com_google_android_gms_internal_zzec.zzzh, false);
        zzc.zza(parcel, 18, com_google_android_gms_internal_zzec.zzzi);
        zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zze(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzv(i);
    }

    public zzec zze(Parcel parcel) {
        int zzaY = zzb.zzaY(parcel);
        int i = 0;
        long j = 0;
        Bundle bundle = null;
        int i2 = 0;
        List list = null;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        String str = null;
        zzfp com_google_android_gms_internal_zzfp = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        List list2 = null;
        String str3 = null;
        String str4 = null;
        boolean z3 = false;
        while (parcel.dataPosition() < zzaY) {
            int zzaX = zzb.zzaX(parcel);
            switch (zzb.zzdc(zzaX)) {
                case ConnectionResult.SERVICE_MISSING /*1*/:
                    i = zzb.zzg(parcel, zzaX);
                    break;
                case ConnectionResult.SERVICE_VERSION_UPDATE_REQUIRED /*2*/:
                    j = zzb.zzi(parcel, zzaX);
                    break;
                case ConnectionResult.SERVICE_DISABLED /*3*/:
                    bundle = zzb.zzs(parcel, zzaX);
                    break;
                case ConnectionResult.SIGN_IN_REQUIRED /*4*/:
                    i2 = zzb.zzg(parcel, zzaX);
                    break;
                case ConnectionResult.INVALID_ACCOUNT /*5*/:
                    list = zzb.zzE(parcel, zzaX);
                    break;
                case ConnectionResult.RESOLUTION_REQUIRED /*6*/:
                    z = zzb.zzc(parcel, zzaX);
                    break;
                case ConnectionResult.NETWORK_ERROR /*7*/:
                    i3 = zzb.zzg(parcel, zzaX);
                    break;
                case ConnectionResult.INTERNAL_ERROR /*8*/:
                    z2 = zzb.zzc(parcel, zzaX);
                    break;
                case ConnectionResult.SERVICE_INVALID /*9*/:
                    str = zzb.zzq(parcel, zzaX);
                    break;
                case ConnectionResult.DEVELOPER_ERROR /*10*/:
                    com_google_android_gms_internal_zzfp = (zzfp) zzb.zza(parcel, zzaX, zzfp.CREATOR);
                    break;
                case ConnectionResult.LICENSE_CHECK_FAILED /*11*/:
                    location = (Location) zzb.zza(parcel, zzaX, Location.CREATOR);
                    break;
                case C0453R.styleable.Toolbar_titleTextAppearance /*12*/:
                    str2 = zzb.zzq(parcel, zzaX);
                    break;
                case ConnectionResult.CANCELED /*13*/:
                    bundle2 = zzb.zzs(parcel, zzaX);
                    break;
                case ConnectionResult.TIMEOUT /*14*/:
                    bundle3 = zzb.zzs(parcel, zzaX);
                    break;
                case ConnectionResult.INTERRUPTED /*15*/:
                    list2 = zzb.zzE(parcel, zzaX);
                    break;
                case ConnectionResult.API_UNAVAILABLE /*16*/:
                    str3 = zzb.zzq(parcel, zzaX);
                    break;
                case ConnectionResult.SIGN_IN_FAILED /*17*/:
                    str4 = zzb.zzq(parcel, zzaX);
                    break;
                case ConnectionResult.SERVICE_UPDATING /*18*/:
                    z3 = zzb.zzc(parcel, zzaX);
                    break;
                default:
                    zzb.zzb(parcel, zzaX);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaY) {
            return new zzec(i, j, bundle, i2, list, z, i3, z2, str, com_google_android_gms_internal_zzfp, location, str2, bundle2, bundle3, list2, str3, str4, z3);
        }
        throw new zza("Overread allowed size end=" + zzaY, parcel);
    }

    public zzec[] zzv(int i) {
        return new zzec[i];
    }
}
