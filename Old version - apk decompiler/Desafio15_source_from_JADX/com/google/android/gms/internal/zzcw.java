package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.internal.zzji.zzc;
import com.google.android.gms.internal.zzqp.zza;
import com.google.android.gms.internal.zzqp.zzb;
import java.util.Map;
import org.json.JSONObject;

@zzme
public class zzcw implements zzcx {
    private final zzct zzwG;
    private final zzid zzwI;
    private final zzid zzwJ;
    private final zzid zzwK;
    private zzc zzwM;
    private boolean zzwN;
    private final zzid zzwO;

    /* renamed from: com.google.android.gms.internal.zzcw.1 */
    class C05751 implements zzqp.zzc<zzjj> {
        final /* synthetic */ zzcw zzwP;

        C05751(zzcw com_google_android_gms_internal_zzcw) {
            this.zzwP = com_google_android_gms_internal_zzcw;
        }

        public void zzb(zzjj com_google_android_gms_internal_zzjj) {
            this.zzwP.zzwN = true;
            this.zzwP.zzc(com_google_android_gms_internal_zzjj);
        }

        public /* synthetic */ void zzd(Object obj) {
            zzb((zzjj) obj);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzcw.2 */
    class C05762 implements zza {
        final /* synthetic */ zzcw zzwP;

        C05762(zzcw com_google_android_gms_internal_zzcw) {
            this.zzwP = com_google_android_gms_internal_zzcw;
        }

        public void run() {
            this.zzwP.zzwG.zzb(this.zzwP);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzcw.3 */
    class C05773 implements zzqp.zzc<zzjj> {
        final /* synthetic */ JSONObject zzwQ;

        C05773(zzcw com_google_android_gms_internal_zzcw, JSONObject jSONObject) {
            this.zzwQ = jSONObject;
        }

        public void zzb(zzjj com_google_android_gms_internal_zzjj) {
            com_google_android_gms_internal_zzjj.zza("AFMA_updateActiveView", this.zzwQ);
        }

        public /* synthetic */ void zzd(Object obj) {
            zzb((zzjj) obj);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzcw.4 */
    class C05784 implements zzqp.zzc<zzjj> {
        final /* synthetic */ zzcw zzwP;

        C05784(zzcw com_google_android_gms_internal_zzcw) {
            this.zzwP = com_google_android_gms_internal_zzcw;
        }

        public void zzb(zzjj com_google_android_gms_internal_zzjj) {
            this.zzwP.zzd(com_google_android_gms_internal_zzjj);
        }

        public /* synthetic */ void zzd(Object obj) {
            zzb((zzjj) obj);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzcw.5 */
    class C05795 implements zzid {
        final /* synthetic */ zzcw zzwP;

        C05795(zzcw com_google_android_gms_internal_zzcw) {
            this.zzwP = com_google_android_gms_internal_zzcw;
        }

        public void zza(zzqw com_google_android_gms_internal_zzqw, Map<String, String> map) {
            if (this.zzwP.zzwG.zzb((Map) map)) {
                this.zzwP.zzwG.zzb(com_google_android_gms_internal_zzqw, (Map) map);
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.zzcw.6 */
    class C05806 implements zzid {
        final /* synthetic */ zzcw zzwP;

        C05806(zzcw com_google_android_gms_internal_zzcw) {
            this.zzwP = com_google_android_gms_internal_zzcw;
        }

        public void zza(zzqw com_google_android_gms_internal_zzqw, Map<String, String> map) {
            if (this.zzwP.zzwG.zzb((Map) map)) {
                this.zzwP.zzwG.zza(this.zzwP, (Map) map);
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.zzcw.7 */
    class C05817 implements zzid {
        final /* synthetic */ zzcw zzwP;

        C05817(zzcw com_google_android_gms_internal_zzcw) {
            this.zzwP = com_google_android_gms_internal_zzcw;
        }

        public void zza(zzqw com_google_android_gms_internal_zzqw, Map<String, String> map) {
            if (this.zzwP.zzwG.zzb((Map) map)) {
                this.zzwP.zzwG.zzc(map);
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.zzcw.8 */
    class C05828 implements zzid {
        final /* synthetic */ zzcw zzwP;

        C05828(zzcw com_google_android_gms_internal_zzcw) {
            this.zzwP = com_google_android_gms_internal_zzcw;
        }

        public void zza(zzqw com_google_android_gms_internal_zzqw, Map<String, String> map) {
            if (this.zzwP.zzwG.zzb((Map) map)) {
                zzic.zzHS.zza(com_google_android_gms_internal_zzqw, map);
            }
        }
    }

    public zzcw(zzct com_google_android_gms_internal_zzct, zzji com_google_android_gms_internal_zzji) {
        this.zzwI = new C05795(this);
        this.zzwJ = new C05806(this);
        this.zzwK = new C05817(this);
        this.zzwO = new C05828(this);
        this.zzwG = com_google_android_gms_internal_zzct;
        this.zzwM = com_google_android_gms_internal_zzji.zzgO();
        this.zzwM.zza(new C05751(this), new C05762(this));
        String str = "Core JS tracking ad unit: ";
        String valueOf = String.valueOf(this.zzwG.zzdR().zzdC());
        zzqf.zzbf(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    void zzc(zzjj com_google_android_gms_internal_zzjj) {
        com_google_android_gms_internal_zzjj.zza("/updateActiveView", this.zzwI);
        com_google_android_gms_internal_zzjj.zza("/untrackActiveViewUnit", this.zzwJ);
        com_google_android_gms_internal_zzjj.zza("/visibilityChanged", this.zzwK);
        if (zzw.zzdl().zzjQ()) {
            com_google_android_gms_internal_zzjj.zza("/logScionEvent", this.zzwO);
        }
    }

    public void zzc(JSONObject jSONObject, boolean z) {
        this.zzwM.zza(new C05773(this, jSONObject), new zzb());
    }

    void zzd(zzjj com_google_android_gms_internal_zzjj) {
        com_google_android_gms_internal_zzjj.zzb("/visibilityChanged", this.zzwK);
        com_google_android_gms_internal_zzjj.zzb("/untrackActiveViewUnit", this.zzwJ);
        com_google_android_gms_internal_zzjj.zzb("/updateActiveView", this.zzwI);
        if (zzw.zzdl().zzjQ()) {
            com_google_android_gms_internal_zzjj.zzb("/logScionEvent", this.zzwO);
        }
    }

    public boolean zzdV() {
        return this.zzwN;
    }

    public void zzdW() {
        this.zzwM.zza(new C05784(this), new zzb());
        this.zzwM.release();
    }
}
