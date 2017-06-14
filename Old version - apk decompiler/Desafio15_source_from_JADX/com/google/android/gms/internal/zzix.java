package com.google.android.gms.internal;

import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzm;
import java.util.LinkedList;
import java.util.List;

@zzme
class zzix {
    private final List<zza> zzth;

    /* renamed from: com.google.android.gms.internal.zzix.7 */
    class C03237 implements Runnable {
        final /* synthetic */ zza zzIT;
        final /* synthetic */ zziy zzIU;

        C03237(zzix com_google_android_gms_internal_zzix, zza com_google_android_gms_internal_zzix_zza, zziy com_google_android_gms_internal_zziy) {
            this.zzIT = com_google_android_gms_internal_zzix_zza;
            this.zzIU = com_google_android_gms_internal_zziy;
        }

        public void run() {
            try {
                this.zzIT.zzb(this.zzIU);
            } catch (Throwable e) {
                zzqf.zzc("Could not propagate interstitial ad event.", e);
            }
        }
    }

    interface zza {
        void zzb(zziy com_google_android_gms_internal_zziy) throws RemoteException;
    }

    /* renamed from: com.google.android.gms.internal.zzix.1 */
    class C07041 extends com.google.android.gms.internal.zzep.zza {
        final /* synthetic */ zzix zzIN;

        /* renamed from: com.google.android.gms.internal.zzix.1.1 */
        class C06291 implements zza {
            C06291(C07041 c07041) {
            }

            public void zzb(zziy com_google_android_gms_internal_zziy) throws RemoteException {
                if (com_google_android_gms_internal_zziy.zztk != null) {
                    com_google_android_gms_internal_zziy.zztk.onAdClosed();
                }
            }
        }

        /* renamed from: com.google.android.gms.internal.zzix.1.2 */
        class C06302 implements zza {
            final /* synthetic */ int zzIO;

            C06302(C07041 c07041, int i) {
                this.zzIO = i;
            }

            public void zzb(zziy com_google_android_gms_internal_zziy) throws RemoteException {
                if (com_google_android_gms_internal_zziy.zztk != null) {
                    com_google_android_gms_internal_zziy.zztk.onAdFailedToLoad(this.zzIO);
                }
            }
        }

        /* renamed from: com.google.android.gms.internal.zzix.1.3 */
        class C06313 implements zza {
            C06313(C07041 c07041) {
            }

            public void zzb(zziy com_google_android_gms_internal_zziy) throws RemoteException {
                if (com_google_android_gms_internal_zziy.zztk != null) {
                    com_google_android_gms_internal_zziy.zztk.onAdLeftApplication();
                }
            }
        }

        /* renamed from: com.google.android.gms.internal.zzix.1.4 */
        class C06324 implements zza {
            C06324(C07041 c07041) {
            }

            public void zzb(zziy com_google_android_gms_internal_zziy) throws RemoteException {
                if (com_google_android_gms_internal_zziy.zztk != null) {
                    com_google_android_gms_internal_zziy.zztk.onAdLoaded();
                }
            }
        }

        /* renamed from: com.google.android.gms.internal.zzix.1.5 */
        class C06335 implements zza {
            C06335(C07041 c07041) {
            }

            public void zzb(zziy com_google_android_gms_internal_zziy) throws RemoteException {
                if (com_google_android_gms_internal_zziy.zztk != null) {
                    com_google_android_gms_internal_zziy.zztk.onAdOpened();
                }
            }
        }

        C07041(zzix com_google_android_gms_internal_zzix) {
            this.zzIN = com_google_android_gms_internal_zzix;
        }

        public void onAdClosed() throws RemoteException {
            this.zzIN.zzth.add(new C06291(this));
        }

        public void onAdFailedToLoad(int i) throws RemoteException {
            this.zzIN.zzth.add(new C06302(this, i));
            zzpk.m13v("Pooled interstitial failed to load.");
        }

        public void onAdLeftApplication() throws RemoteException {
            this.zzIN.zzth.add(new C06313(this));
        }

        public void onAdLoaded() throws RemoteException {
            this.zzIN.zzth.add(new C06324(this));
            zzpk.m13v("Pooled interstitial loaded.");
        }

        public void onAdOpened() throws RemoteException {
            this.zzIN.zzth.add(new C06335(this));
        }
    }

    /* renamed from: com.google.android.gms.internal.zzix.2 */
    class C07052 extends com.google.android.gms.internal.zzev.zza {
        final /* synthetic */ zzix zzIN;

        /* renamed from: com.google.android.gms.internal.zzix.2.1 */
        class C06341 implements zza {
            final /* synthetic */ String val$name;
            final /* synthetic */ String zzIP;

            C06341(C07052 c07052, String str, String str2) {
                this.val$name = str;
                this.zzIP = str2;
            }

            public void zzb(zziy com_google_android_gms_internal_zziy) throws RemoteException {
                if (com_google_android_gms_internal_zziy.zzIV != null) {
                    com_google_android_gms_internal_zziy.zzIV.onAppEvent(this.val$name, this.zzIP);
                }
            }
        }

        C07052(zzix com_google_android_gms_internal_zzix) {
            this.zzIN = com_google_android_gms_internal_zzix;
        }

        public void onAppEvent(String str, String str2) throws RemoteException {
            this.zzIN.zzth.add(new C06341(this, str, str2));
        }
    }

    /* renamed from: com.google.android.gms.internal.zzix.3 */
    class C07063 extends com.google.android.gms.internal.zzle.zza {
        final /* synthetic */ zzix zzIN;

        /* renamed from: com.google.android.gms.internal.zzix.3.1 */
        class C06351 implements zza {
            final /* synthetic */ zzld zzIQ;

            C06351(C07063 c07063, zzld com_google_android_gms_internal_zzld) {
                this.zzIQ = com_google_android_gms_internal_zzld;
            }

            public void zzb(zziy com_google_android_gms_internal_zziy) throws RemoteException {
                if (com_google_android_gms_internal_zziy.zzIW != null) {
                    com_google_android_gms_internal_zziy.zzIW.zza(this.zzIQ);
                }
            }
        }

        C07063(zzix com_google_android_gms_internal_zzix) {
            this.zzIN = com_google_android_gms_internal_zzix;
        }

        public void zza(zzld com_google_android_gms_internal_zzld) throws RemoteException {
            this.zzIN.zzth.add(new C06351(this, com_google_android_gms_internal_zzld));
        }
    }

    /* renamed from: com.google.android.gms.internal.zzix.4 */
    class C07074 extends com.google.android.gms.internal.zzgp.zza {
        final /* synthetic */ zzix zzIN;

        /* renamed from: com.google.android.gms.internal.zzix.4.1 */
        class C06361 implements zza {
            final /* synthetic */ zzgo zzIR;

            C06361(C07074 c07074, zzgo com_google_android_gms_internal_zzgo) {
                this.zzIR = com_google_android_gms_internal_zzgo;
            }

            public void zzb(zziy com_google_android_gms_internal_zziy) throws RemoteException {
                if (com_google_android_gms_internal_zziy.zzIX != null) {
                    com_google_android_gms_internal_zziy.zzIX.zza(this.zzIR);
                }
            }
        }

        C07074(zzix com_google_android_gms_internal_zzix) {
            this.zzIN = com_google_android_gms_internal_zzix;
        }

        public void zza(zzgo com_google_android_gms_internal_zzgo) throws RemoteException {
            this.zzIN.zzth.add(new C06361(this, com_google_android_gms_internal_zzgo));
        }
    }

    /* renamed from: com.google.android.gms.internal.zzix.5 */
    class C07085 extends com.google.android.gms.internal.zzeo.zza {
        final /* synthetic */ zzix zzIN;

        /* renamed from: com.google.android.gms.internal.zzix.5.1 */
        class C06371 implements zza {
            C06371(C07085 c07085) {
            }

            public void zzb(zziy com_google_android_gms_internal_zziy) throws RemoteException {
                if (com_google_android_gms_internal_zziy.zzIY != null) {
                    com_google_android_gms_internal_zziy.zzIY.onAdClicked();
                }
            }
        }

        C07085(zzix com_google_android_gms_internal_zzix) {
            this.zzIN = com_google_android_gms_internal_zzix;
        }

        public void onAdClicked() throws RemoteException {
            this.zzIN.zzth.add(new C06371(this));
        }
    }

    /* renamed from: com.google.android.gms.internal.zzix.6 */
    class C07096 extends com.google.android.gms.internal.zznw.zza {
        final /* synthetic */ zzix zzIN;

        /* renamed from: com.google.android.gms.internal.zzix.6.1 */
        class C06381 implements zza {
            C06381(C07096 c07096) {
            }

            public void zzb(zziy com_google_android_gms_internal_zziy) throws RemoteException {
                if (com_google_android_gms_internal_zziy.zzIZ != null) {
                    com_google_android_gms_internal_zziy.zzIZ.onRewardedVideoAdLoaded();
                }
            }
        }

        /* renamed from: com.google.android.gms.internal.zzix.6.2 */
        class C06392 implements zza {
            C06392(C07096 c07096) {
            }

            public void zzb(zziy com_google_android_gms_internal_zziy) throws RemoteException {
                if (com_google_android_gms_internal_zziy.zzIZ != null) {
                    com_google_android_gms_internal_zziy.zzIZ.onRewardedVideoAdOpened();
                }
            }
        }

        /* renamed from: com.google.android.gms.internal.zzix.6.3 */
        class C06403 implements zza {
            C06403(C07096 c07096) {
            }

            public void zzb(zziy com_google_android_gms_internal_zziy) throws RemoteException {
                if (com_google_android_gms_internal_zziy.zzIZ != null) {
                    com_google_android_gms_internal_zziy.zzIZ.onRewardedVideoStarted();
                }
            }
        }

        /* renamed from: com.google.android.gms.internal.zzix.6.4 */
        class C06414 implements zza {
            C06414(C07096 c07096) {
            }

            public void zzb(zziy com_google_android_gms_internal_zziy) throws RemoteException {
                if (com_google_android_gms_internal_zziy.zzIZ != null) {
                    com_google_android_gms_internal_zziy.zzIZ.onRewardedVideoAdClosed();
                }
            }
        }

        /* renamed from: com.google.android.gms.internal.zzix.6.5 */
        class C06425 implements zza {
            final /* synthetic */ zznt zzIS;

            C06425(C07096 c07096, zznt com_google_android_gms_internal_zznt) {
                this.zzIS = com_google_android_gms_internal_zznt;
            }

            public void zzb(zziy com_google_android_gms_internal_zziy) throws RemoteException {
                if (com_google_android_gms_internal_zziy.zzIZ != null) {
                    com_google_android_gms_internal_zziy.zzIZ.zza(this.zzIS);
                }
            }
        }

        /* renamed from: com.google.android.gms.internal.zzix.6.6 */
        class C06436 implements zza {
            C06436(C07096 c07096) {
            }

            public void zzb(zziy com_google_android_gms_internal_zziy) throws RemoteException {
                if (com_google_android_gms_internal_zziy.zzIZ != null) {
                    com_google_android_gms_internal_zziy.zzIZ.onRewardedVideoAdLeftApplication();
                }
            }
        }

        /* renamed from: com.google.android.gms.internal.zzix.6.7 */
        class C06447 implements zza {
            final /* synthetic */ int zzIO;

            C06447(C07096 c07096, int i) {
                this.zzIO = i;
            }

            public void zzb(zziy com_google_android_gms_internal_zziy) throws RemoteException {
                if (com_google_android_gms_internal_zziy.zzIZ != null) {
                    com_google_android_gms_internal_zziy.zzIZ.onRewardedVideoAdFailedToLoad(this.zzIO);
                }
            }
        }

        C07096(zzix com_google_android_gms_internal_zzix) {
            this.zzIN = com_google_android_gms_internal_zzix;
        }

        public void onRewardedVideoAdClosed() throws RemoteException {
            this.zzIN.zzth.add(new C06414(this));
        }

        public void onRewardedVideoAdFailedToLoad(int i) throws RemoteException {
            this.zzIN.zzth.add(new C06447(this, i));
        }

        public void onRewardedVideoAdLeftApplication() throws RemoteException {
            this.zzIN.zzth.add(new C06436(this));
        }

        public void onRewardedVideoAdLoaded() throws RemoteException {
            this.zzIN.zzth.add(new C06381(this));
        }

        public void onRewardedVideoAdOpened() throws RemoteException {
            this.zzIN.zzth.add(new C06392(this));
        }

        public void onRewardedVideoStarted() throws RemoteException {
            this.zzIN.zzth.add(new C06403(this));
        }

        public void zza(zznt com_google_android_gms_internal_zznt) throws RemoteException {
            this.zzIN.zzth.add(new C06425(this, com_google_android_gms_internal_zznt));
        }
    }

    zzix() {
        this.zzth = new LinkedList();
    }

    void zza(zziy com_google_android_gms_internal_zziy) {
        Handler handler = zzpo.zzXC;
        for (zza c03237 : this.zzth) {
            handler.post(new C03237(this, c03237, com_google_android_gms_internal_zziy));
        }
        this.zzth.clear();
    }

    void zzc(zzm com_google_android_gms_ads_internal_zzm) {
        com_google_android_gms_ads_internal_zzm.zza(new C07041(this));
        com_google_android_gms_ads_internal_zzm.zza(new C07052(this));
        com_google_android_gms_ads_internal_zzm.zza(new C07063(this));
        com_google_android_gms_ads_internal_zzm.zza(new C07074(this));
        com_google_android_gms_ads_internal_zzm.zza(new C07085(this));
        com_google_android_gms_ads_internal_zzm.zza(new C07096(this));
    }
}
