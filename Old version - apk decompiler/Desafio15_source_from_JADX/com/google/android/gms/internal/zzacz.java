package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.util.zzc;
import com.google.android.gms.common.util.zzq;
import com.google.android.gms.common.util.zzr;
import com.google.android.gms.internal.zzacs.zza;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class zzacz extends zzact {
    public static final Creator<zzacz> CREATOR;
    private final String mClassName;
    private final zzacw zzaHf;
    private final Parcel zzaHm;
    private final int zzaHn;
    private int zzaHo;
    private int zzaHp;
    private final int zzaiI;

    static {
        CREATOR = new zzada();
    }

    zzacz(int i, Parcel parcel, zzacw com_google_android_gms_internal_zzacw) {
        this.zzaiI = i;
        this.zzaHm = (Parcel) zzac.zzw(parcel);
        this.zzaHn = 2;
        this.zzaHf = com_google_android_gms_internal_zzacw;
        if (this.zzaHf == null) {
            this.mClassName = null;
        } else {
            this.mClassName = this.zzaHf.zzyF();
        }
        this.zzaHo = 2;
    }

    private static SparseArray<Entry<String, zza<?, ?>>> zzY(Map<String, zza<?, ?>> map) {
        SparseArray<Entry<String, zza<?, ?>>> sparseArray = new SparseArray();
        for (Entry entry : map.entrySet()) {
            sparseArray.put(((zza) entry.getValue()).zzyx(), entry);
        }
        return sparseArray;
    }

    private void zza(StringBuilder stringBuilder, int i, Object obj) {
        switch (i) {
            case ConnectionResult.SUCCESS /*0*/:
            case ConnectionResult.SERVICE_MISSING /*1*/:
            case ConnectionResult.SERVICE_VERSION_UPDATE_REQUIRED /*2*/:
            case ConnectionResult.SERVICE_DISABLED /*3*/:
            case ConnectionResult.SIGN_IN_REQUIRED /*4*/:
            case ConnectionResult.INVALID_ACCOUNT /*5*/:
            case ConnectionResult.RESOLUTION_REQUIRED /*6*/:
                stringBuilder.append(obj);
            case ConnectionResult.NETWORK_ERROR /*7*/:
                stringBuilder.append("\"").append(zzq.zzdy(obj.toString())).append("\"");
            case ConnectionResult.INTERNAL_ERROR /*8*/:
                stringBuilder.append("\"").append(zzc.zzq((byte[]) obj)).append("\"");
            case ConnectionResult.SERVICE_INVALID /*9*/:
                stringBuilder.append("\"").append(zzc.zzr((byte[]) obj));
                stringBuilder.append("\"");
            case ConnectionResult.DEVELOPER_ERROR /*10*/:
                zzr.zza(stringBuilder, (HashMap) obj);
            case ConnectionResult.LICENSE_CHECK_FAILED /*11*/:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException("Unknown type = " + i);
        }
    }

    private void zza(StringBuilder stringBuilder, zza<?, ?> com_google_android_gms_internal_zzacs_zza___, Parcel parcel, int i) {
        switch (com_google_android_gms_internal_zzacs_zza___.zzyu()) {
            case ConnectionResult.SUCCESS /*0*/:
                zzb(stringBuilder, (zza) com_google_android_gms_internal_zzacs_zza___, zza(com_google_android_gms_internal_zzacs_zza___, Integer.valueOf(zzb.zzg(parcel, i))));
            case ConnectionResult.SERVICE_MISSING /*1*/:
                zzb(stringBuilder, (zza) com_google_android_gms_internal_zzacs_zza___, zza(com_google_android_gms_internal_zzacs_zza___, zzb.zzk(parcel, i)));
            case ConnectionResult.SERVICE_VERSION_UPDATE_REQUIRED /*2*/:
                zzb(stringBuilder, (zza) com_google_android_gms_internal_zzacs_zza___, zza(com_google_android_gms_internal_zzacs_zza___, Long.valueOf(zzb.zzi(parcel, i))));
            case ConnectionResult.SERVICE_DISABLED /*3*/:
                zzb(stringBuilder, (zza) com_google_android_gms_internal_zzacs_zza___, zza(com_google_android_gms_internal_zzacs_zza___, Float.valueOf(zzb.zzl(parcel, i))));
            case ConnectionResult.SIGN_IN_REQUIRED /*4*/:
                zzb(stringBuilder, (zza) com_google_android_gms_internal_zzacs_zza___, zza(com_google_android_gms_internal_zzacs_zza___, Double.valueOf(zzb.zzn(parcel, i))));
            case ConnectionResult.INVALID_ACCOUNT /*5*/:
                zzb(stringBuilder, (zza) com_google_android_gms_internal_zzacs_zza___, zza(com_google_android_gms_internal_zzacs_zza___, zzb.zzp(parcel, i)));
            case ConnectionResult.RESOLUTION_REQUIRED /*6*/:
                zzb(stringBuilder, (zza) com_google_android_gms_internal_zzacs_zza___, zza(com_google_android_gms_internal_zzacs_zza___, Boolean.valueOf(zzb.zzc(parcel, i))));
            case ConnectionResult.NETWORK_ERROR /*7*/:
                zzb(stringBuilder, (zza) com_google_android_gms_internal_zzacs_zza___, zza(com_google_android_gms_internal_zzacs_zza___, zzb.zzq(parcel, i)));
            case ConnectionResult.INTERNAL_ERROR /*8*/:
            case ConnectionResult.SERVICE_INVALID /*9*/:
                zzb(stringBuilder, (zza) com_google_android_gms_internal_zzacs_zza___, zza(com_google_android_gms_internal_zzacs_zza___, zzb.zzt(parcel, i)));
            case ConnectionResult.DEVELOPER_ERROR /*10*/:
                zzb(stringBuilder, (zza) com_google_android_gms_internal_zzacs_zza___, zza(com_google_android_gms_internal_zzacs_zza___, zzr(zzb.zzs(parcel, i))));
            case ConnectionResult.LICENSE_CHECK_FAILED /*11*/:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException("Unknown field out type = " + com_google_android_gms_internal_zzacs_zza___.zzyu());
        }
    }

    private void zza(StringBuilder stringBuilder, String str, zza<?, ?> com_google_android_gms_internal_zzacs_zza___, Parcel parcel, int i) {
        stringBuilder.append("\"").append(str).append("\":");
        if (com_google_android_gms_internal_zzacs_zza___.zzyA()) {
            zza(stringBuilder, com_google_android_gms_internal_zzacs_zza___, parcel, i);
        } else {
            zzb(stringBuilder, com_google_android_gms_internal_zzacs_zza___, parcel, i);
        }
    }

    private void zza(StringBuilder stringBuilder, Map<String, zza<?, ?>> map, Parcel parcel) {
        SparseArray zzY = zzY(map);
        stringBuilder.append('{');
        int zzaY = zzb.zzaY(parcel);
        Object obj = null;
        while (parcel.dataPosition() < zzaY) {
            int zzaX = zzb.zzaX(parcel);
            Entry entry = (Entry) zzY.get(zzb.zzdc(zzaX));
            if (entry != null) {
                if (obj != null) {
                    stringBuilder.append(",");
                }
                zza(stringBuilder, (String) entry.getKey(), (zza) entry.getValue(), parcel, zzaX);
                obj = 1;
            }
        }
        if (parcel.dataPosition() != zzaY) {
            throw new zzb.zza("Overread allowed size end=" + zzaY, parcel);
        }
        stringBuilder.append('}');
    }

    private void zzb(StringBuilder stringBuilder, zza<?, ?> com_google_android_gms_internal_zzacs_zza___, Parcel parcel, int i) {
        if (com_google_android_gms_internal_zzacs_zza___.zzyv()) {
            stringBuilder.append("[");
            switch (com_google_android_gms_internal_zzacs_zza___.zzyu()) {
                case ConnectionResult.SUCCESS /*0*/:
                    com.google.android.gms.common.util.zzb.zza(stringBuilder, zzb.zzw(parcel, i));
                    break;
                case ConnectionResult.SERVICE_MISSING /*1*/:
                    com.google.android.gms.common.util.zzb.zza(stringBuilder, zzb.zzy(parcel, i));
                    break;
                case ConnectionResult.SERVICE_VERSION_UPDATE_REQUIRED /*2*/:
                    com.google.android.gms.common.util.zzb.zza(stringBuilder, zzb.zzx(parcel, i));
                    break;
                case ConnectionResult.SERVICE_DISABLED /*3*/:
                    com.google.android.gms.common.util.zzb.zza(stringBuilder, zzb.zzz(parcel, i));
                    break;
                case ConnectionResult.SIGN_IN_REQUIRED /*4*/:
                    com.google.android.gms.common.util.zzb.zza(stringBuilder, zzb.zzA(parcel, i));
                    break;
                case ConnectionResult.INVALID_ACCOUNT /*5*/:
                    com.google.android.gms.common.util.zzb.zza(stringBuilder, zzb.zzB(parcel, i));
                    break;
                case ConnectionResult.RESOLUTION_REQUIRED /*6*/:
                    com.google.android.gms.common.util.zzb.zza(stringBuilder, zzb.zzv(parcel, i));
                    break;
                case ConnectionResult.NETWORK_ERROR /*7*/:
                    com.google.android.gms.common.util.zzb.zza(stringBuilder, zzb.zzC(parcel, i));
                    break;
                case ConnectionResult.INTERNAL_ERROR /*8*/:
                case ConnectionResult.SERVICE_INVALID /*9*/:
                case ConnectionResult.DEVELOPER_ERROR /*10*/:
                    throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                case ConnectionResult.LICENSE_CHECK_FAILED /*11*/:
                    Parcel[] zzG = zzb.zzG(parcel, i);
                    int length = zzG.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (i2 > 0) {
                            stringBuilder.append(",");
                        }
                        zzG[i2].setDataPosition(0);
                        zza(stringBuilder, com_google_android_gms_internal_zzacs_zza___.zzyC(), zzG[i2]);
                    }
                    break;
                default:
                    throw new IllegalStateException("Unknown field type out.");
            }
            stringBuilder.append("]");
            return;
        }
        switch (com_google_android_gms_internal_zzacs_zza___.zzyu()) {
            case ConnectionResult.SUCCESS /*0*/:
                stringBuilder.append(zzb.zzg(parcel, i));
            case ConnectionResult.SERVICE_MISSING /*1*/:
                stringBuilder.append(zzb.zzk(parcel, i));
            case ConnectionResult.SERVICE_VERSION_UPDATE_REQUIRED /*2*/:
                stringBuilder.append(zzb.zzi(parcel, i));
            case ConnectionResult.SERVICE_DISABLED /*3*/:
                stringBuilder.append(zzb.zzl(parcel, i));
            case ConnectionResult.SIGN_IN_REQUIRED /*4*/:
                stringBuilder.append(zzb.zzn(parcel, i));
            case ConnectionResult.INVALID_ACCOUNT /*5*/:
                stringBuilder.append(zzb.zzp(parcel, i));
            case ConnectionResult.RESOLUTION_REQUIRED /*6*/:
                stringBuilder.append(zzb.zzc(parcel, i));
            case ConnectionResult.NETWORK_ERROR /*7*/:
                stringBuilder.append("\"").append(zzq.zzdy(zzb.zzq(parcel, i))).append("\"");
            case ConnectionResult.INTERNAL_ERROR /*8*/:
                stringBuilder.append("\"").append(zzc.zzq(zzb.zzt(parcel, i))).append("\"");
            case ConnectionResult.SERVICE_INVALID /*9*/:
                stringBuilder.append("\"").append(zzc.zzr(zzb.zzt(parcel, i)));
                stringBuilder.append("\"");
            case ConnectionResult.DEVELOPER_ERROR /*10*/:
                Bundle zzs = zzb.zzs(parcel, i);
                Set<String> keySet = zzs.keySet();
                keySet.size();
                stringBuilder.append("{");
                int i3 = 1;
                for (String str : keySet) {
                    if (i3 == 0) {
                        stringBuilder.append(",");
                    }
                    stringBuilder.append("\"").append(str).append("\"");
                    stringBuilder.append(":");
                    stringBuilder.append("\"").append(zzq.zzdy(zzs.getString(str))).append("\"");
                    i3 = 0;
                }
                stringBuilder.append("}");
            case ConnectionResult.LICENSE_CHECK_FAILED /*11*/:
                Parcel zzF = zzb.zzF(parcel, i);
                zzF.setDataPosition(0);
                zza(stringBuilder, com_google_android_gms_internal_zzacs_zza___.zzyC(), zzF);
            default:
                throw new IllegalStateException("Unknown field type out");
        }
    }

    private void zzb(StringBuilder stringBuilder, zza<?, ?> com_google_android_gms_internal_zzacs_zza___, Object obj) {
        if (com_google_android_gms_internal_zzacs_zza___.zzyt()) {
            zzb(stringBuilder, (zza) com_google_android_gms_internal_zzacs_zza___, (ArrayList) obj);
        } else {
            zza(stringBuilder, com_google_android_gms_internal_zzacs_zza___.zzys(), obj);
        }
    }

    private void zzb(StringBuilder stringBuilder, zza<?, ?> com_google_android_gms_internal_zzacs_zza___, ArrayList<?> arrayList) {
        stringBuilder.append("[");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                stringBuilder.append(",");
            }
            zza(stringBuilder, com_google_android_gms_internal_zzacs_zza___.zzys(), arrayList.get(i));
        }
        stringBuilder.append("]");
    }

    public static HashMap<String, String> zzr(Bundle bundle) {
        HashMap<String, String> hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            hashMap.put(str, bundle.getString(str));
        }
        return hashMap;
    }

    public int getVersionCode() {
        return this.zzaiI;
    }

    public String toString() {
        zzac.zzb(this.zzaHf, (Object) "Cannot convert to JSON on client side.");
        Parcel zzyH = zzyH();
        zzyH.setDataPosition(0);
        StringBuilder stringBuilder = new StringBuilder(100);
        zza(stringBuilder, this.zzaHf.zzdw(this.mClassName), zzyH);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzada.zza(this, parcel, i);
    }

    public Object zzds(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public boolean zzdt(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public Parcel zzyH() {
        switch (this.zzaHo) {
            case ConnectionResult.SUCCESS /*0*/:
                this.zzaHp = com.google.android.gms.common.internal.safeparcel.zzc.zzaZ(this.zzaHm);
                com.google.android.gms.common.internal.safeparcel.zzc.zzJ(this.zzaHm, this.zzaHp);
                this.zzaHo = 2;
                break;
            case ConnectionResult.SERVICE_MISSING /*1*/:
                com.google.android.gms.common.internal.safeparcel.zzc.zzJ(this.zzaHm, this.zzaHp);
                this.zzaHo = 2;
                break;
        }
        return this.zzaHm;
    }

    zzacw zzyI() {
        switch (this.zzaHn) {
            case ConnectionResult.SUCCESS /*0*/:
                return null;
            case ConnectionResult.SERVICE_MISSING /*1*/:
                return this.zzaHf;
            case ConnectionResult.SERVICE_VERSION_UPDATE_REQUIRED /*2*/:
                return this.zzaHf;
            default:
                throw new IllegalStateException("Invalid creation type: " + this.zzaHn);
        }
    }

    public Map<String, zza<?, ?>> zzyr() {
        return this.zzaHf == null ? null : this.zzaHf.zzdw(this.mClassName);
    }
}
