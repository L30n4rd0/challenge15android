package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.leonardo.desafio15.C0453R;
import java.util.List;

public class zza implements Creator<GoogleSignInAccount> {
    static void zza(GoogleSignInAccount googleSignInAccount, Parcel parcel, int i) {
        int zzaZ = zzc.zzaZ(parcel);
        zzc.zzc(parcel, 1, googleSignInAccount.versionCode);
        zzc.zza(parcel, 2, googleSignInAccount.getId(), false);
        zzc.zza(parcel, 3, googleSignInAccount.getIdToken(), false);
        zzc.zza(parcel, 4, googleSignInAccount.getEmail(), false);
        zzc.zza(parcel, 5, googleSignInAccount.getDisplayName(), false);
        zzc.zza(parcel, 6, googleSignInAccount.getPhotoUrl(), i, false);
        zzc.zza(parcel, 7, googleSignInAccount.getServerAuthCode(), false);
        zzc.zza(parcel, 8, googleSignInAccount.zzre());
        zzc.zza(parcel, 9, googleSignInAccount.zzrf(), false);
        zzc.zzc(parcel, 10, googleSignInAccount.zzaiN, false);
        zzc.zza(parcel, 11, googleSignInAccount.getGivenName(), false);
        zzc.zza(parcel, 12, googleSignInAccount.getFamilyName(), false);
        zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzW(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzbl(i);
    }

    public GoogleSignInAccount zzW(Parcel parcel) {
        int zzaY = zzb.zzaY(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        long j = 0;
        String str6 = null;
        List list = null;
        String str7 = null;
        String str8 = null;
        while (parcel.dataPosition() < zzaY) {
            int zzaX = zzb.zzaX(parcel);
            switch (zzb.zzdc(zzaX)) {
                case ConnectionResult.SERVICE_MISSING /*1*/:
                    i = zzb.zzg(parcel, zzaX);
                    break;
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
                    uri = (Uri) zzb.zza(parcel, zzaX, Uri.CREATOR);
                    break;
                case ConnectionResult.NETWORK_ERROR /*7*/:
                    str5 = zzb.zzq(parcel, zzaX);
                    break;
                case ConnectionResult.INTERNAL_ERROR /*8*/:
                    j = zzb.zzi(parcel, zzaX);
                    break;
                case ConnectionResult.SERVICE_INVALID /*9*/:
                    str6 = zzb.zzq(parcel, zzaX);
                    break;
                case ConnectionResult.DEVELOPER_ERROR /*10*/:
                    list = zzb.zzc(parcel, zzaX, Scope.CREATOR);
                    break;
                case ConnectionResult.LICENSE_CHECK_FAILED /*11*/:
                    str7 = zzb.zzq(parcel, zzaX);
                    break;
                case C0453R.styleable.Toolbar_titleTextAppearance /*12*/:
                    str8 = zzb.zzq(parcel, zzaX);
                    break;
                default:
                    zzb.zzb(parcel, zzaX);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaY) {
            return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, list, str7, str8);
        }
        throw new com.google.android.gms.common.internal.safeparcel.zzb.zza("Overread allowed size end=" + zzaY, parcel);
    }

    public GoogleSignInAccount[] zzbl(int i) {
        return new GoogleSignInAccount[i];
    }
}
