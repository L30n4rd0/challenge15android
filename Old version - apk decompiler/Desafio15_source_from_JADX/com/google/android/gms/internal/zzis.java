package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Releasable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

@zzme
public abstract class zzis implements Releasable {
    protected Context mContext;
    protected String zzIA;
    protected WeakReference<zzqw> zzIB;

    /* renamed from: com.google.android.gms.internal.zzis.1 */
    class C03201 implements Runnable {
        final /* synthetic */ String zzIC;
        final /* synthetic */ int zzID;
        final /* synthetic */ int zzIE;
        final /* synthetic */ boolean zzIF;
        final /* synthetic */ zzis zzIG;
        final /* synthetic */ String zzsg;

        C03201(zzis com_google_android_gms_internal_zzis, String str, String str2, int i, int i2, boolean z) {
            this.zzIG = com_google_android_gms_internal_zzis;
            this.zzsg = str;
            this.zzIC = str2;
            this.zzID = i;
            this.zzIE = i2;
            this.zzIF = z;
        }

        public void run() {
            Map hashMap = new HashMap();
            hashMap.put(NotificationCompatApi24.CATEGORY_EVENT, "precacheProgress");
            hashMap.put("src", this.zzsg);
            hashMap.put("cachedSrc", this.zzIC);
            hashMap.put("bytesLoaded", Integer.toString(this.zzID));
            hashMap.put("totalBytes", Integer.toString(this.zzIE));
            hashMap.put("cacheReady", this.zzIF ? "1" : "0");
            this.zzIG.zza("onPrecacheEvent", hashMap);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzis.2 */
    class C03212 implements Runnable {
        final /* synthetic */ String zzIC;
        final /* synthetic */ int zzIE;
        final /* synthetic */ zzis zzIG;
        final /* synthetic */ String zzsg;

        C03212(zzis com_google_android_gms_internal_zzis, String str, String str2, int i) {
            this.zzIG = com_google_android_gms_internal_zzis;
            this.zzsg = str;
            this.zzIC = str2;
            this.zzIE = i;
        }

        public void run() {
            Map hashMap = new HashMap();
            hashMap.put(NotificationCompatApi24.CATEGORY_EVENT, "precacheComplete");
            hashMap.put("src", this.zzsg);
            hashMap.put("cachedSrc", this.zzIC);
            hashMap.put("totalBytes", Integer.toString(this.zzIE));
            this.zzIG.zza("onPrecacheEvent", hashMap);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzis.3 */
    class C03223 implements Runnable {
        final /* synthetic */ String zzIC;
        final /* synthetic */ zzis zzIG;
        final /* synthetic */ String zzIH;
        final /* synthetic */ String zzII;
        final /* synthetic */ String zzsg;

        C03223(zzis com_google_android_gms_internal_zzis, String str, String str2, String str3, String str4) {
            this.zzIG = com_google_android_gms_internal_zzis;
            this.zzsg = str;
            this.zzIC = str2;
            this.zzIH = str3;
            this.zzII = str4;
        }

        public void run() {
            Map hashMap = new HashMap();
            hashMap.put(NotificationCompatApi24.CATEGORY_EVENT, "precacheCanceled");
            hashMap.put("src", this.zzsg);
            if (!TextUtils.isEmpty(this.zzIC)) {
                hashMap.put("cachedSrc", this.zzIC);
            }
            hashMap.put("type", this.zzIG.zzaf(this.zzIH));
            hashMap.put("reason", this.zzIH);
            if (!TextUtils.isEmpty(this.zzII)) {
                hashMap.put("message", this.zzII);
            }
            this.zzIG.zza("onPrecacheEvent", hashMap);
        }
    }

    public zzis(zzqw com_google_android_gms_internal_zzqw) {
        this.mContext = com_google_android_gms_internal_zzqw.getContext();
        this.zzIA = zzw.zzcM().zzu(this.mContext, com_google_android_gms_internal_zzqw.zzly().zzba);
        this.zzIB = new WeakReference(com_google_android_gms_internal_zzqw);
    }

    private void zza(String str, Map<String, String> map) {
        zzqw com_google_android_gms_internal_zzqw = (zzqw) this.zzIB.get();
        if (com_google_android_gms_internal_zzqw != null) {
            com_google_android_gms_internal_zzqw.zza(str, (Map) map);
        }
    }

    private String zzaf(String str) {
        String str2 = "internal";
        Object obj = -1;
        switch (str.hashCode()) {
            case -1396664534:
                if (str.equals("badUrl")) {
                    obj = 6;
                    break;
                }
                break;
            case -1347010958:
                if (str.equals("inProgress")) {
                    obj = 2;
                    break;
                }
                break;
            case -918817863:
                if (str.equals("downloadTimeout")) {
                    obj = 7;
                    break;
                }
                break;
            case -659376217:
                if (str.equals("contentLengthMissing")) {
                    obj = 3;
                    break;
                }
                break;
            case -642208130:
                if (str.equals("playerFailed")) {
                    obj = 1;
                    break;
                }
                break;
            case -354048396:
                if (str.equals("sizeExceeded")) {
                    obj = 8;
                    break;
                }
                break;
            case -32082395:
                if (str.equals("externalAbort")) {
                    obj = 9;
                    break;
                }
                break;
            case 96784904:
                if (str.equals("error")) {
                    obj = null;
                    break;
                }
                break;
            case 580119100:
                if (str.equals("expireFailed")) {
                    obj = 5;
                    break;
                }
                break;
            case 725497484:
                if (str.equals("noCacheDir")) {
                    obj = 4;
                    break;
                }
                break;
        }
        switch (obj) {
            case ConnectionResult.SUCCESS /*0*/:
            case ConnectionResult.SERVICE_MISSING /*1*/:
            case ConnectionResult.SERVICE_VERSION_UPDATE_REQUIRED /*2*/:
            case ConnectionResult.SERVICE_DISABLED /*3*/:
                return "internal";
            case ConnectionResult.SIGN_IN_REQUIRED /*4*/:
            case ConnectionResult.INVALID_ACCOUNT /*5*/:
                return "io";
            case ConnectionResult.RESOLUTION_REQUIRED /*6*/:
            case ConnectionResult.NETWORK_ERROR /*7*/:
                return "network";
            case ConnectionResult.INTERNAL_ERROR /*8*/:
            case ConnectionResult.SERVICE_INVALID /*9*/:
                return "policy";
            default:
                return str2;
        }
    }

    public abstract void abort();

    public void release() {
    }

    protected void zza(String str, String str2, int i) {
        zzqe.zzYP.post(new C03212(this, str, str2, i));
    }

    protected void zza(String str, String str2, int i, int i2, boolean z) {
        zzqe.zzYP.post(new C03201(this, str, str2, i, i2, z));
    }

    public void zza(String str, String str2, String str3, @Nullable String str4) {
        zzqe.zzYP.post(new C03223(this, str, str2, str3, str4));
    }

    public abstract boolean zzad(String str);

    protected String zzae(String str) {
        return zzel.zzeT().zzbe(str);
    }
}
