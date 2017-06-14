package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.internal.zzme;
import com.google.android.gms.internal.zzmp;
import com.google.android.gms.internal.zzpb.zza;
import com.google.android.gms.internal.zzqf;
import com.leonardo.desafio15.BuildConfig;

@zzme
public class zzf {
    private final Context mContext;
    private final zzmp zzsQ;
    private boolean zzsR;

    public zzf(Context context) {
        this(context, false);
    }

    public zzf(Context context, @Nullable zza com_google_android_gms_internal_zzpb_zza) {
        this.mContext = context;
        if (com_google_android_gms_internal_zzpb_zza == null || com_google_android_gms_internal_zzpb_zza.zzWm.zzSG == null) {
            this.zzsQ = new zzmp();
        } else {
            this.zzsQ = com_google_android_gms_internal_zzpb_zza.zzWm.zzSG;
        }
    }

    public zzf(Context context, boolean z) {
        this.mContext = context;
        this.zzsQ = new zzmp(z);
    }

    public void recordClick() {
        this.zzsR = true;
    }

    public boolean zzcd() {
        return !this.zzsQ.zzSL || this.zzsR;
    }

    public void zzx(@Nullable String str) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        zzqf.zzbg("Action was blocked because no touch was detected.");
        if (this.zzsQ.zzSL && this.zzsQ.zzSM != null) {
            for (String str2 : this.zzsQ.zzSM) {
                if (!TextUtils.isEmpty(str2)) {
                    zzw.zzcM().zzf(this.mContext, BuildConfig.FLAVOR, str2.replace("{NAVIGATION_URL}", Uri.encode(str)));
                }
            }
        }
    }
}
