package com.google.android.gms.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.zza;

public class zzbar extends zza {
    public static final Creator<zzbar> CREATOR;
    private final Account zzahh;
    final int zzaiI;
    private final String zzajw;
    private final Scope[] zzbEv;

    static {
        CREATOR = new zzbas();
    }

    zzbar(int i, Account account, Scope[] scopeArr, String str) {
        this.zzaiI = i;
        this.zzahh = account;
        this.zzbEv = scopeArr;
        this.zzajw = str;
    }

    public Account getAccount() {
        return this.zzahh;
    }

    public String getServerClientId() {
        return this.zzajw;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzbas.zza(this, parcel, i);
    }

    public Scope[] zzPQ() {
        return this.zzbEv;
    }
}
