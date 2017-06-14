package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzb.zza;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.leonardo.desafio15.C0453R;

public class zzate implements Creator<zzatd> {
    static void zza(zzatd com_google_android_gms_internal_zzatd, Parcel parcel, int i) {
        int zzaZ = zzc.zzaZ(parcel);
        zzc.zza(parcel, 2, com_google_android_gms_internal_zzatd.packageName, false);
        zzc.zza(parcel, 3, com_google_android_gms_internal_zzatd.zzbqP, false);
        zzc.zza(parcel, 4, com_google_android_gms_internal_zzatd.zzbhM, false);
        zzc.zza(parcel, 5, com_google_android_gms_internal_zzatd.zzbqQ, false);
        zzc.zza(parcel, 6, com_google_android_gms_internal_zzatd.zzbqR);
        zzc.zza(parcel, 7, com_google_android_gms_internal_zzatd.zzbqS);
        zzc.zza(parcel, 8, com_google_android_gms_internal_zzatd.zzbqT, false);
        zzc.zza(parcel, 9, com_google_android_gms_internal_zzatd.zzbqU);
        zzc.zza(parcel, 10, com_google_android_gms_internal_zzatd.zzbqV);
        zzc.zza(parcel, 11, com_google_android_gms_internal_zzatd.zzbqW);
        zzc.zza(parcel, 12, com_google_android_gms_internal_zzatd.zzbqX, false);
        zzc.zza(parcel, 13, com_google_android_gms_internal_zzatd.zzbqY);
        zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzhQ(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzlz(i);
    }

    public zzatd zzhQ(Parcel parcel) {
        int zzaY = zzb.zzaY(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        long j = 0;
        long j2 = 0;
        String str5 = null;
        boolean z = true;
        boolean z2 = false;
        long j3 = -2147483648L;
        String str6 = null;
        long j4 = 0;
        while (parcel.dataPosition() < zzaY) {
            int zzaX = zzb.zzaX(parcel);
            switch (zzb.zzdc(zzaX)) {
                case ConnectionResult.SERVICE_VERSION_UPDATE_REQUIRED /*2*/:
                    str = zzb.zzq(parcel, zzaX);
                    break;
                case ConnectionResult.SERVICE_DISABLED /*3*/:
                    str2 = zzb.zzq(parcel, zzaX);
                    break;
                case ConnectionResult.SIGN_IN_REQUIRED /*4*/:
                    str3 = zzb.zzq(parcel, zzaX);
                    break;
                case ConnectionResult.INVALID_ACCOUNT /*5*/:
                    str4 = zzb.zzq(parcel, zzaX);
                    break;
                case ConnectionResult.RESOLUTION_REQUIRED /*6*/:
                    j = zzb.zzi(parcel, zzaX);
                    break;
                case ConnectionResult.NETWORK_ERROR /*7*/:
                    j2 = zzb.zzi(parcel, zzaX);
                    break;
                case ConnectionResult.INTERNAL_ERROR /*8*/:
                    str5 = zzb.zzq(parcel, zzaX);
                    break;
                case ConnectionResult.SERVICE_INVALID /*9*/:
                    z = zzb.zzc(parcel, zzaX);
                    break;
                case ConnectionResult.DEVELOPER_ERROR /*10*/:
                    z2 = zzb.zzc(parcel, zzaX);
                    break;
                case ConnectionResult.LICENSE_CHECK_FAILED /*11*/:
                    j3 = zzb.zzi(parcel, zzaX);
                    break;
                case C0453R.styleable.Toolbar_titleTextAppearance /*12*/:
                    str6 = zzb.zzq(parcel, zzaX);
                    break;
                case ConnectionResult.CANCELED /*13*/:
                    j4 = zzb.zzi(parcel, zzaX);
                    break;
                default:
                    zzb.zzb(parcel, zzaX);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaY) {
            return new zzatd(str, str2, str3, str4, j, j2, str5, z, z2, j3, str6, j4);
        }
        throw new zza("Overread allowed size end=" + zzaY, parcel);
    }

    public zzatd[] zzlz(int i) {
        return new zzatd[i];
    }
}
