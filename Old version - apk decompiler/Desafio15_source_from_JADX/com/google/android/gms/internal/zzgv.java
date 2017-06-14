package com.google.android.gms.internal;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.internal.zzha.zzb;
import com.google.android.gms.internal.zzhj.zza;
import com.leonardo.desafio15.BuildConfig;
import java.util.List;

@zzme
public class zzgv extends zza implements zzb {
    private Bundle mExtras;
    private zzha zzGA;
    private String zzGp;
    private List<zzgu> zzGq;
    private String zzGr;
    private zzhf zzGs;
    private String zzGt;
    private double zzGu;
    private String zzGv;
    private String zzGw;
    @Nullable
    private zzgs zzGx;
    @Nullable
    private zzfa zzGy;
    @Nullable
    private View zzGz;
    private Object zzrJ;

    public zzgv(String str, List list, String str2, zzhf com_google_android_gms_internal_zzhf, String str3, double d, String str4, String str5, @Nullable zzgs com_google_android_gms_internal_zzgs, Bundle bundle, zzfa com_google_android_gms_internal_zzfa, View view) {
        this.zzrJ = new Object();
        this.zzGp = str;
        this.zzGq = list;
        this.zzGr = str2;
        this.zzGs = com_google_android_gms_internal_zzhf;
        this.zzGt = str3;
        this.zzGu = d;
        this.zzGv = str4;
        this.zzGw = str5;
        this.zzGx = com_google_android_gms_internal_zzgs;
        this.mExtras = bundle;
        this.zzGy = com_google_android_gms_internal_zzfa;
        this.zzGz = view;
    }

    public void destroy() {
        this.zzGp = null;
        this.zzGq = null;
        this.zzGr = null;
        this.zzGs = null;
        this.zzGt = null;
        this.zzGu = 0.0d;
        this.zzGv = null;
        this.zzGw = null;
        this.zzGx = null;
        this.mExtras = null;
        this.zzrJ = null;
        this.zzGA = null;
        this.zzGy = null;
        this.zzGz = null;
    }

    public String getBody() {
        return this.zzGr;
    }

    public String getCallToAction() {
        return this.zzGt;
    }

    public String getCustomTemplateId() {
        return BuildConfig.FLAVOR;
    }

    public Bundle getExtras() {
        return this.mExtras;
    }

    public String getHeadline() {
        return this.zzGp;
    }

    public List getImages() {
        return this.zzGq;
    }

    public String getPrice() {
        return this.zzGw;
    }

    public double getStarRating() {
        return this.zzGu;
    }

    public String getStore() {
        return this.zzGv;
    }

    public void zzb(zzha com_google_android_gms_internal_zzha) {
        synchronized (this.zzrJ) {
            this.zzGA = com_google_android_gms_internal_zzha;
        }
    }

    public zzfa zzbF() {
        return this.zzGy;
    }

    public zzhf zzfQ() {
        return this.zzGs;
    }

    public IObjectWrapper zzfR() {
        return zzd.zzA(this.zzGA);
    }

    public String zzfS() {
        return "2";
    }

    public zzgs zzfT() {
        return this.zzGx;
    }

    public View zzfU() {
        return this.zzGz;
    }
}
