package com.google.android.gms.internal;

import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;

@zzme
public final class zzkn<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> implements MediationBannerListener, MediationInterstitialListener {
    private final zzkc zzLE;

    /* renamed from: com.google.android.gms.internal.zzkn.10 */
    class AnonymousClass10 implements Runnable {
        final /* synthetic */ zzkn zzLK;
        final /* synthetic */ ErrorCode zzLL;

        AnonymousClass10(zzkn com_google_android_gms_internal_zzkn, ErrorCode errorCode) {
            this.zzLK = com_google_android_gms_internal_zzkn;
            this.zzLL = errorCode;
        }

        public void run() {
            try {
                this.zzLK.zzLE.onAdFailedToLoad(zzko.zza(this.zzLL));
            } catch (Throwable e) {
                zzqf.zzc("Could not call onAdFailedToLoad.", e);
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.zzkn.1 */
    class C03411 implements Runnable {
        final /* synthetic */ zzkn zzLK;

        C03411(zzkn com_google_android_gms_internal_zzkn) {
            this.zzLK = com_google_android_gms_internal_zzkn;
        }

        public void run() {
            try {
                this.zzLK.zzLE.onAdClicked();
            } catch (Throwable e) {
                zzqf.zzc("Could not call onAdClicked.", e);
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.zzkn.2 */
    class C03422 implements Runnable {
        final /* synthetic */ zzkn zzLK;

        C03422(zzkn com_google_android_gms_internal_zzkn) {
            this.zzLK = com_google_android_gms_internal_zzkn;
        }

        public void run() {
            try {
                this.zzLK.zzLE.onAdOpened();
            } catch (Throwable e) {
                zzqf.zzc("Could not call onAdOpened.", e);
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.zzkn.3 */
    class C03433 implements Runnable {
        final /* synthetic */ zzkn zzLK;

        C03433(zzkn com_google_android_gms_internal_zzkn) {
            this.zzLK = com_google_android_gms_internal_zzkn;
        }

        public void run() {
            try {
                this.zzLK.zzLE.onAdLoaded();
            } catch (Throwable e) {
                zzqf.zzc("Could not call onAdLoaded.", e);
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.zzkn.4 */
    class C03444 implements Runnable {
        final /* synthetic */ zzkn zzLK;

        C03444(zzkn com_google_android_gms_internal_zzkn) {
            this.zzLK = com_google_android_gms_internal_zzkn;
        }

        public void run() {
            try {
                this.zzLK.zzLE.onAdClosed();
            } catch (Throwable e) {
                zzqf.zzc("Could not call onAdClosed.", e);
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.zzkn.5 */
    class C03455 implements Runnable {
        final /* synthetic */ zzkn zzLK;
        final /* synthetic */ ErrorCode zzLL;

        C03455(zzkn com_google_android_gms_internal_zzkn, ErrorCode errorCode) {
            this.zzLK = com_google_android_gms_internal_zzkn;
            this.zzLL = errorCode;
        }

        public void run() {
            try {
                this.zzLK.zzLE.onAdFailedToLoad(zzko.zza(this.zzLL));
            } catch (Throwable e) {
                zzqf.zzc("Could not call onAdFailedToLoad.", e);
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.zzkn.6 */
    class C03466 implements Runnable {
        final /* synthetic */ zzkn zzLK;

        C03466(zzkn com_google_android_gms_internal_zzkn) {
            this.zzLK = com_google_android_gms_internal_zzkn;
        }

        public void run() {
            try {
                this.zzLK.zzLE.onAdLeftApplication();
            } catch (Throwable e) {
                zzqf.zzc("Could not call onAdLeftApplication.", e);
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.zzkn.7 */
    class C03477 implements Runnable {
        final /* synthetic */ zzkn zzLK;

        C03477(zzkn com_google_android_gms_internal_zzkn) {
            this.zzLK = com_google_android_gms_internal_zzkn;
        }

        public void run() {
            try {
                this.zzLK.zzLE.onAdOpened();
            } catch (Throwable e) {
                zzqf.zzc("Could not call onAdOpened.", e);
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.zzkn.8 */
    class C03488 implements Runnable {
        final /* synthetic */ zzkn zzLK;

        C03488(zzkn com_google_android_gms_internal_zzkn) {
            this.zzLK = com_google_android_gms_internal_zzkn;
        }

        public void run() {
            try {
                this.zzLK.zzLE.onAdLoaded();
            } catch (Throwable e) {
                zzqf.zzc("Could not call onAdLoaded.", e);
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.zzkn.9 */
    class C03499 implements Runnable {
        final /* synthetic */ zzkn zzLK;

        C03499(zzkn com_google_android_gms_internal_zzkn) {
            this.zzLK = com_google_android_gms_internal_zzkn;
        }

        public void run() {
            try {
                this.zzLK.zzLE.onAdClosed();
            } catch (Throwable e) {
                zzqf.zzc("Could not call onAdClosed.", e);
            }
        }
    }

    public zzkn(zzkc com_google_android_gms_internal_zzkc) {
        this.zzLE = com_google_android_gms_internal_zzkc;
    }

    public void onClick(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzqf.zzbf("Adapter called onClick.");
        if (zzel.zzeT().zzlj()) {
            try {
                this.zzLE.onAdClicked();
                return;
            } catch (Throwable e) {
                zzqf.zzc("Could not call onAdClicked.", e);
                return;
            }
        }
        zzqf.zzbh("onClick must be called on the main UI thread.");
        zzqe.zzYP.post(new C03411(this));
    }

    public void onDismissScreen(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzqf.zzbf("Adapter called onDismissScreen.");
        if (zzel.zzeT().zzlj()) {
            try {
                this.zzLE.onAdClosed();
                return;
            } catch (Throwable e) {
                zzqf.zzc("Could not call onAdClosed.", e);
                return;
            }
        }
        zzqf.zzbh("onDismissScreen must be called on the main UI thread.");
        zzqe.zzYP.post(new C03444(this));
    }

    public void onDismissScreen(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        zzqf.zzbf("Adapter called onDismissScreen.");
        if (zzel.zzeT().zzlj()) {
            try {
                this.zzLE.onAdClosed();
                return;
            } catch (Throwable e) {
                zzqf.zzc("Could not call onAdClosed.", e);
                return;
            }
        }
        zzqf.zzbh("onDismissScreen must be called on the main UI thread.");
        zzqe.zzYP.post(new C03499(this));
    }

    public void onFailedToReceiveAd(MediationBannerAdapter<?, ?> mediationBannerAdapter, ErrorCode errorCode) {
        String valueOf = String.valueOf(errorCode);
        zzqf.zzbf(new StringBuilder(String.valueOf(valueOf).length() + 47).append("Adapter called onFailedToReceiveAd with error. ").append(valueOf).toString());
        if (zzel.zzeT().zzlj()) {
            try {
                this.zzLE.onAdFailedToLoad(zzko.zza(errorCode));
                return;
            } catch (Throwable e) {
                zzqf.zzc("Could not call onAdFailedToLoad.", e);
                return;
            }
        }
        zzqf.zzbh("onFailedToReceiveAd must be called on the main UI thread.");
        zzqe.zzYP.post(new C03455(this, errorCode));
    }

    public void onFailedToReceiveAd(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter, ErrorCode errorCode) {
        String valueOf = String.valueOf(errorCode);
        zzqf.zzbf(new StringBuilder(String.valueOf(valueOf).length() + 47).append("Adapter called onFailedToReceiveAd with error ").append(valueOf).append(".").toString());
        if (zzel.zzeT().zzlj()) {
            try {
                this.zzLE.onAdFailedToLoad(zzko.zza(errorCode));
                return;
            } catch (Throwable e) {
                zzqf.zzc("Could not call onAdFailedToLoad.", e);
                return;
            }
        }
        zzqf.zzbh("onFailedToReceiveAd must be called on the main UI thread.");
        zzqe.zzYP.post(new AnonymousClass10(this, errorCode));
    }

    public void onLeaveApplication(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzqf.zzbf("Adapter called onLeaveApplication.");
        if (zzel.zzeT().zzlj()) {
            try {
                this.zzLE.onAdLeftApplication();
                return;
            } catch (Throwable e) {
                zzqf.zzc("Could not call onAdLeftApplication.", e);
                return;
            }
        }
        zzqf.zzbh("onLeaveApplication must be called on the main UI thread.");
        zzqe.zzYP.post(new C03466(this));
    }

    public void onLeaveApplication(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        zzqf.zzbf("Adapter called onLeaveApplication.");
        if (zzel.zzeT().zzlj()) {
            try {
                this.zzLE.onAdLeftApplication();
                return;
            } catch (Throwable e) {
                zzqf.zzc("Could not call onAdLeftApplication.", e);
                return;
            }
        }
        zzqf.zzbh("onLeaveApplication must be called on the main UI thread.");
        zzqe.zzYP.post(new Runnable() {
            final /* synthetic */ zzkn zzLK;

            {
                this.zzLK = r1;
            }

            public void run() {
                try {
                    this.zzLK.zzLE.onAdLeftApplication();
                } catch (Throwable e) {
                    zzqf.zzc("Could not call onAdLeftApplication.", e);
                }
            }
        });
    }

    public void onPresentScreen(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzqf.zzbf("Adapter called onPresentScreen.");
        if (zzel.zzeT().zzlj()) {
            try {
                this.zzLE.onAdOpened();
                return;
            } catch (Throwable e) {
                zzqf.zzc("Could not call onAdOpened.", e);
                return;
            }
        }
        zzqf.zzbh("onPresentScreen must be called on the main UI thread.");
        zzqe.zzYP.post(new C03477(this));
    }

    public void onPresentScreen(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        zzqf.zzbf("Adapter called onPresentScreen.");
        if (zzel.zzeT().zzlj()) {
            try {
                this.zzLE.onAdOpened();
                return;
            } catch (Throwable e) {
                zzqf.zzc("Could not call onAdOpened.", e);
                return;
            }
        }
        zzqf.zzbh("onPresentScreen must be called on the main UI thread.");
        zzqe.zzYP.post(new C03422(this));
    }

    public void onReceivedAd(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzqf.zzbf("Adapter called onReceivedAd.");
        if (zzel.zzeT().zzlj()) {
            try {
                this.zzLE.onAdLoaded();
                return;
            } catch (Throwable e) {
                zzqf.zzc("Could not call onAdLoaded.", e);
                return;
            }
        }
        zzqf.zzbh("onReceivedAd must be called on the main UI thread.");
        zzqe.zzYP.post(new C03488(this));
    }

    public void onReceivedAd(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        zzqf.zzbf("Adapter called onReceivedAd.");
        if (zzel.zzeT().zzlj()) {
            try {
                this.zzLE.onAdLoaded();
                return;
            } catch (Throwable e) {
                zzqf.zzc("Could not call onAdLoaded.", e);
                return;
            }
        }
        zzqf.zzbh("onReceivedAd must be called on the main UI thread.");
        zzqe.zzYP.post(new C03433(this));
    }
}
