package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.leonardo.desafio15.BuildConfig;
import java.util.List;

@zzme
public class zzds extends zza {
    public static final Creator<zzds> CREATOR;
    @Nullable
    public final String url;
    public final long zzyL;
    public final String zzyM;
    public final String zzyN;
    public final String zzyO;
    public final Bundle zzyP;
    public final boolean zzyQ;

    static {
        CREATOR = new zzdt();
    }

    zzds(@Nullable String str, long j, String str2, String str3, String str4, Bundle bundle, boolean z) {
        this.url = str;
        this.zzyL = j;
        if (str2 == null) {
            str2 = BuildConfig.FLAVOR;
        }
        this.zzyM = str2;
        if (str3 == null) {
            str3 = BuildConfig.FLAVOR;
        }
        this.zzyN = str3;
        if (str4 == null) {
            str4 = BuildConfig.FLAVOR;
        }
        this.zzyO = str4;
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.zzyP = bundle;
        this.zzyQ = z;
    }

    @Nullable
    public static zzds zzJ(String str) {
        return zze(Uri.parse(str));
    }

    @Nullable
    public static zzds zze(Uri uri) {
        Throwable e;
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                zzqf.zzbh("Expected 2 path parts for namespace and id, found :" + pathSegments.size());
                return null;
            }
            String str = (String) pathSegments.get(0);
            String str2 = (String) pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean equals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long parseLong = queryParameter2 == null ? 0 : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String queryParameter22 : zzw.zzcO().zzh(uri)) {
                if (queryParameter22.startsWith("tag.")) {
                    bundle.putString(queryParameter22.substring("tag.".length()), uri.getQueryParameter(queryParameter22));
                }
            }
            return new zzds(queryParameter, parseLong, host, str, str2, bundle, equals);
        } catch (NullPointerException e2) {
            e = e2;
            zzqf.zzc("Unable to parse Uri into cache offering.", e);
            return null;
        } catch (NumberFormatException e3) {
            e = e3;
            zzqf.zzc("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzdt.zza(this, parcel, i);
    }
}
