package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Iterator;

public class zzato extends zza implements Iterable<String> {
    public static final Creator<zzato> CREATOR;
    private final Bundle zzbrH;

    /* renamed from: com.google.android.gms.internal.zzato.1 */
    class C02471 implements Iterator<String> {
        Iterator<String> zzbrI;
        final /* synthetic */ zzato zzbrJ;

        C02471(zzato com_google_android_gms_internal_zzato) {
            this.zzbrJ = com_google_android_gms_internal_zzato;
            this.zzbrI = this.zzbrJ.zzbrH.keySet().iterator();
        }

        public boolean hasNext() {
            return this.zzbrI.hasNext();
        }

        public String next() {
            return (String) this.zzbrI.next();
        }

        public void remove() {
            throw new UnsupportedOperationException("Remove not supported");
        }
    }

    static {
        CREATOR = new zzatp();
    }

    zzato(Bundle bundle) {
        this.zzbrH = bundle;
    }

    Object get(String str) {
        return this.zzbrH.get(str);
    }

    public Iterator<String> iterator() {
        return new C02471(this);
    }

    public int size() {
        return this.zzbrH.size();
    }

    public String toString() {
        return this.zzbrH.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzatp.zza(this, parcel, i);
    }

    public Bundle zzLV() {
        return new Bundle(this.zzbrH);
    }
}
