package com.google.android.gms.internal;

import android.os.Binder;
import android.support.annotation.BinderThread;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.util.zzy;
import com.google.android.gms.common.zzg;
import com.google.android.gms.common.zzh;
import com.google.android.gms.internal.zzatt.zza;
import com.google.android.gms.measurement.AppMeasurement.zzf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public class zzauf extends zza {
    private final zzaue zzbqg;
    private Boolean zzbuN;
    @Nullable
    private String zzbuO;

    /* renamed from: com.google.android.gms.internal.zzauf.10 */
    class AnonymousClass10 implements Runnable {
        final /* synthetic */ zzatd zzbuP;
        final /* synthetic */ zzauf zzbuQ;
        final /* synthetic */ zzatq zzbuU;

        AnonymousClass10(zzauf com_google_android_gms_internal_zzauf, zzatq com_google_android_gms_internal_zzatq, zzatd com_google_android_gms_internal_zzatd) {
            this.zzbuQ = com_google_android_gms_internal_zzauf;
            this.zzbuU = com_google_android_gms_internal_zzatq;
            this.zzbuP = com_google_android_gms_internal_zzatd;
        }

        public void run() {
            this.zzbuQ.zzbqg.zzMK();
            this.zzbuQ.zzbqg.zzb(this.zzbuU, this.zzbuP);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzauf.11 */
    class AnonymousClass11 implements Runnable {
        final /* synthetic */ String zzbla;
        final /* synthetic */ zzauf zzbuQ;
        final /* synthetic */ zzatq zzbuU;

        AnonymousClass11(zzauf com_google_android_gms_internal_zzauf, zzatq com_google_android_gms_internal_zzatq, String str) {
            this.zzbuQ = com_google_android_gms_internal_zzauf;
            this.zzbuU = com_google_android_gms_internal_zzatq;
            this.zzbla = str;
        }

        public void run() {
            this.zzbuQ.zzbqg.zzMK();
            this.zzbuQ.zzbqg.zzb(this.zzbuU, this.zzbla);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzauf.12 */
    class AnonymousClass12 implements Callable<byte[]> {
        final /* synthetic */ String zzbla;
        final /* synthetic */ zzauf zzbuQ;
        final /* synthetic */ zzatq zzbuU;

        AnonymousClass12(zzauf com_google_android_gms_internal_zzauf, zzatq com_google_android_gms_internal_zzatq, String str) {
            this.zzbuQ = com_google_android_gms_internal_zzauf;
            this.zzbuU = com_google_android_gms_internal_zzatq;
            this.zzbla = str;
        }

        public /* synthetic */ Object call() throws Exception {
            return zzMN();
        }

        public byte[] zzMN() throws Exception {
            this.zzbuQ.zzbqg.zzMK();
            return this.zzbuQ.zzbqg.zza(this.zzbuU, this.zzbla);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzauf.13 */
    class AnonymousClass13 implements Runnable {
        final /* synthetic */ zzatd zzbuP;
        final /* synthetic */ zzauf zzbuQ;
        final /* synthetic */ zzauq zzbuV;

        AnonymousClass13(zzauf com_google_android_gms_internal_zzauf, zzauq com_google_android_gms_internal_zzauq, zzatd com_google_android_gms_internal_zzatd) {
            this.zzbuQ = com_google_android_gms_internal_zzauf;
            this.zzbuV = com_google_android_gms_internal_zzauq;
            this.zzbuP = com_google_android_gms_internal_zzatd;
        }

        public void run() {
            this.zzbuQ.zzbqg.zzMK();
            this.zzbuQ.zzbqg.zzc(this.zzbuV, this.zzbuP);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzauf.14 */
    class AnonymousClass14 implements Runnable {
        final /* synthetic */ zzatd zzbuP;
        final /* synthetic */ zzauf zzbuQ;
        final /* synthetic */ zzauq zzbuV;

        AnonymousClass14(zzauf com_google_android_gms_internal_zzauf, zzauq com_google_android_gms_internal_zzauq, zzatd com_google_android_gms_internal_zzatd) {
            this.zzbuQ = com_google_android_gms_internal_zzauf;
            this.zzbuV = com_google_android_gms_internal_zzauq;
            this.zzbuP = com_google_android_gms_internal_zzatd;
        }

        public void run() {
            this.zzbuQ.zzbqg.zzMK();
            this.zzbuQ.zzbqg.zzb(this.zzbuV, this.zzbuP);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzauf.15 */
    class AnonymousClass15 implements Callable<List<zzaus>> {
        final /* synthetic */ zzatd zzbuP;
        final /* synthetic */ zzauf zzbuQ;

        AnonymousClass15(zzauf com_google_android_gms_internal_zzauf, zzatd com_google_android_gms_internal_zzatd) {
            this.zzbuQ = com_google_android_gms_internal_zzauf;
            this.zzbuP = com_google_android_gms_internal_zzatd;
        }

        public /* synthetic */ Object call() throws Exception {
            return zzMM();
        }

        public List<zzaus> zzMM() throws Exception {
            this.zzbuQ.zzbqg.zzMK();
            return this.zzbuQ.zzbqg.zzKf().zzft(this.zzbuP.packageName);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzauf.16 */
    class AnonymousClass16 implements Runnable {
        final /* synthetic */ zzatd zzbuP;
        final /* synthetic */ zzauf zzbuQ;

        AnonymousClass16(zzauf com_google_android_gms_internal_zzauf, zzatd com_google_android_gms_internal_zzatd) {
            this.zzbuQ = com_google_android_gms_internal_zzauf;
            this.zzbuP = com_google_android_gms_internal_zzatd;
        }

        public void run() {
            this.zzbuQ.zzbqg.zzMK();
            this.zzbuQ.zzbqg.zze(this.zzbuP);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzauf.17 */
    class AnonymousClass17 implements Runnable {
        final /* synthetic */ String zzbla;
        final /* synthetic */ zzauf zzbuQ;
        final /* synthetic */ String zzbuW;
        final /* synthetic */ String zzbuX;
        final /* synthetic */ long zzbuY;

        AnonymousClass17(zzauf com_google_android_gms_internal_zzauf, String str, String str2, String str3, long j) {
            this.zzbuQ = com_google_android_gms_internal_zzauf;
            this.zzbuW = str;
            this.zzbla = str2;
            this.zzbuX = str3;
            this.zzbuY = j;
        }

        public void run() {
            if (this.zzbuW == null) {
                this.zzbuQ.zzbqg.zzKd().zza(this.zzbla, null);
                return;
            }
            zzf com_google_android_gms_measurement_AppMeasurement_zzf = new zzf();
            com_google_android_gms_measurement_AppMeasurement_zzf.zzbqj = this.zzbuX;
            com_google_android_gms_measurement_AppMeasurement_zzf.zzbqk = this.zzbuW;
            com_google_android_gms_measurement_AppMeasurement_zzf.zzbql = this.zzbuY;
            this.zzbuQ.zzbqg.zzKd().zza(this.zzbla, com_google_android_gms_measurement_AppMeasurement_zzf);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzauf.1 */
    class C02551 implements Runnable {
        final /* synthetic */ zzatd zzbuP;
        final /* synthetic */ zzauf zzbuQ;

        C02551(zzauf com_google_android_gms_internal_zzauf, zzatd com_google_android_gms_internal_zzatd) {
            this.zzbuQ = com_google_android_gms_internal_zzauf;
            this.zzbuP = com_google_android_gms_internal_zzatd;
        }

        public void run() {
            this.zzbuQ.zzbqg.zzMK();
            this.zzbuQ.zzbqg.zzd(this.zzbuP);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzauf.2 */
    class C02562 implements Runnable {
        final /* synthetic */ zzatd zzbuP;
        final /* synthetic */ zzauf zzbuQ;
        final /* synthetic */ zzatg zzbuR;

        C02562(zzauf com_google_android_gms_internal_zzauf, zzatg com_google_android_gms_internal_zzatg, zzatd com_google_android_gms_internal_zzatd) {
            this.zzbuQ = com_google_android_gms_internal_zzauf;
            this.zzbuR = com_google_android_gms_internal_zzatg;
            this.zzbuP = com_google_android_gms_internal_zzatd;
        }

        public void run() {
            this.zzbuQ.zzbqg.zzMK();
            this.zzbuQ.zzbqg.zzc(this.zzbuR, this.zzbuP);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzauf.3 */
    class C02573 implements Runnable {
        final /* synthetic */ zzatd zzbuP;
        final /* synthetic */ zzauf zzbuQ;
        final /* synthetic */ zzatg zzbuR;

        C02573(zzauf com_google_android_gms_internal_zzauf, zzatg com_google_android_gms_internal_zzatg, zzatd com_google_android_gms_internal_zzatd) {
            this.zzbuQ = com_google_android_gms_internal_zzauf;
            this.zzbuR = com_google_android_gms_internal_zzatg;
            this.zzbuP = com_google_android_gms_internal_zzatd;
        }

        public void run() {
            this.zzbuQ.zzbqg.zzMK();
            this.zzbuQ.zzbqg.zzb(this.zzbuR, this.zzbuP);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzauf.4 */
    class C02584 implements Runnable {
        final /* synthetic */ zzauf zzbuQ;
        final /* synthetic */ zzatg zzbuR;

        C02584(zzauf com_google_android_gms_internal_zzauf, zzatg com_google_android_gms_internal_zzatg) {
            this.zzbuQ = com_google_android_gms_internal_zzauf;
            this.zzbuR = com_google_android_gms_internal_zzatg;
        }

        public void run() {
            this.zzbuQ.zzbqg.zzMK();
            this.zzbuQ.zzbqg.zze(this.zzbuR);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzauf.5 */
    class C02595 implements Runnable {
        final /* synthetic */ zzauf zzbuQ;
        final /* synthetic */ zzatg zzbuR;

        C02595(zzauf com_google_android_gms_internal_zzauf, zzatg com_google_android_gms_internal_zzatg) {
            this.zzbuQ = com_google_android_gms_internal_zzauf;
            this.zzbuR = com_google_android_gms_internal_zzatg;
        }

        public void run() {
            this.zzbuQ.zzbqg.zzMK();
            this.zzbuQ.zzbqg.zzd(this.zzbuR);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzauf.6 */
    class C02606 implements Callable<List<zzaus>> {
        final /* synthetic */ zzatd zzbuP;
        final /* synthetic */ zzauf zzbuQ;
        final /* synthetic */ String zzbuS;
        final /* synthetic */ String zzbuT;

        C02606(zzauf com_google_android_gms_internal_zzauf, zzatd com_google_android_gms_internal_zzatd, String str, String str2) {
            this.zzbuQ = com_google_android_gms_internal_zzauf;
            this.zzbuP = com_google_android_gms_internal_zzatd;
            this.zzbuS = str;
            this.zzbuT = str2;
        }

        public /* synthetic */ Object call() throws Exception {
            return zzMM();
        }

        public List<zzaus> zzMM() throws Exception {
            this.zzbuQ.zzbqg.zzMK();
            return this.zzbuQ.zzbqg.zzKf().zzk(this.zzbuP.packageName, this.zzbuS, this.zzbuT);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzauf.7 */
    class C02617 implements Callable<List<zzaus>> {
        final /* synthetic */ String zzbla;
        final /* synthetic */ zzauf zzbuQ;
        final /* synthetic */ String zzbuS;
        final /* synthetic */ String zzbuT;

        C02617(zzauf com_google_android_gms_internal_zzauf, String str, String str2, String str3) {
            this.zzbuQ = com_google_android_gms_internal_zzauf;
            this.zzbla = str;
            this.zzbuS = str2;
            this.zzbuT = str3;
        }

        public /* synthetic */ Object call() throws Exception {
            return zzMM();
        }

        public List<zzaus> zzMM() throws Exception {
            this.zzbuQ.zzbqg.zzMK();
            return this.zzbuQ.zzbqg.zzKf().zzk(this.zzbla, this.zzbuS, this.zzbuT);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzauf.8 */
    class C02628 implements Callable<List<zzatg>> {
        final /* synthetic */ zzatd zzbuP;
        final /* synthetic */ zzauf zzbuQ;
        final /* synthetic */ String zzbuS;
        final /* synthetic */ String zzbuT;

        C02628(zzauf com_google_android_gms_internal_zzauf, zzatd com_google_android_gms_internal_zzatd, String str, String str2) {
            this.zzbuQ = com_google_android_gms_internal_zzauf;
            this.zzbuP = com_google_android_gms_internal_zzatd;
            this.zzbuS = str;
            this.zzbuT = str2;
        }

        public /* synthetic */ Object call() throws Exception {
            return zzMM();
        }

        public List<zzatg> zzMM() throws Exception {
            this.zzbuQ.zzbqg.zzMK();
            return this.zzbuQ.zzbqg.zzKf().zzl(this.zzbuP.packageName, this.zzbuS, this.zzbuT);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzauf.9 */
    class C02639 implements Callable<List<zzatg>> {
        final /* synthetic */ String zzbla;
        final /* synthetic */ zzauf zzbuQ;
        final /* synthetic */ String zzbuS;
        final /* synthetic */ String zzbuT;

        C02639(zzauf com_google_android_gms_internal_zzauf, String str, String str2, String str3) {
            this.zzbuQ = com_google_android_gms_internal_zzauf;
            this.zzbla = str;
            this.zzbuS = str2;
            this.zzbuT = str3;
        }

        public /* synthetic */ Object call() throws Exception {
            return zzMM();
        }

        public List<zzatg> zzMM() throws Exception {
            this.zzbuQ.zzbqg.zzMK();
            return this.zzbuQ.zzbqg.zzKf().zzl(this.zzbla, this.zzbuS, this.zzbuT);
        }
    }

    public zzauf(zzaue com_google_android_gms_internal_zzaue) {
        this(com_google_android_gms_internal_zzaue, null);
    }

    public zzauf(zzaue com_google_android_gms_internal_zzaue, @Nullable String str) {
        zzac.zzw(com_google_android_gms_internal_zzaue);
        this.zzbqg = com_google_android_gms_internal_zzaue;
        this.zzbuO = str;
    }

    @BinderThread
    private void zzb(zzatd com_google_android_gms_internal_zzatd, boolean z) {
        zzac.zzw(com_google_android_gms_internal_zzatd);
        zzm(com_google_android_gms_internal_zzatd.packageName, z);
        this.zzbqg.zzKg().zzga(com_google_android_gms_internal_zzatd.zzbqP);
    }

    @BinderThread
    private void zzm(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            this.zzbqg.zzKk().zzLX().log("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        try {
            zzn(str, z);
        } catch (SecurityException e) {
            this.zzbqg.zzKk().zzLX().zzj("Measurement Service called with invalid calling package. appId", zzatx.zzfE(str));
            throw e;
        }
    }

    @BinderThread
    public List<zzauq> zza(zzatd com_google_android_gms_internal_zzatd, boolean z) {
        Object e;
        zzb(com_google_android_gms_internal_zzatd, false);
        try {
            List<zzaus> list = (List) this.zzbqg.zzKj().zzd(new AnonymousClass15(this, com_google_android_gms_internal_zzatd)).get();
            List<zzauq> arrayList = new ArrayList(list.size());
            for (zzaus com_google_android_gms_internal_zzaus : list) {
                if (z || !zzaut.zzgd(com_google_android_gms_internal_zzaus.mName)) {
                    arrayList.add(new zzauq(com_google_android_gms_internal_zzaus));
                }
            }
            return arrayList;
        } catch (InterruptedException e2) {
            e = e2;
            this.zzbqg.zzKk().zzLX().zze("Failed to get user attributes. appId", zzatx.zzfE(com_google_android_gms_internal_zzatd.packageName), e);
            return null;
        } catch (ExecutionException e3) {
            e = e3;
            this.zzbqg.zzKk().zzLX().zze("Failed to get user attributes. appId", zzatx.zzfE(com_google_android_gms_internal_zzatd.packageName), e);
            return null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.BinderThread
    public java.util.List<com.google.android.gms.internal.zzatg> zza(java.lang.String r4, java.lang.String r5, com.google.android.gms.internal.zzatd r6) {
        /*
        r3 = this;
        r0 = 0;
        r3.zzb(r6, r0);
        r0 = r3.zzbqg;
        r0 = r0.zzKj();
        r1 = new com.google.android.gms.internal.zzauf$8;
        r1.<init>(r3, r6, r4, r5);
        r0 = r0.zzd(r1);
        r0 = r0.get();	 Catch:{ InterruptedException -> 0x001a, ExecutionException -> 0x002f }
        r0 = (java.util.List) r0;	 Catch:{ InterruptedException -> 0x001a, ExecutionException -> 0x002f }
    L_0x0019:
        return r0;
    L_0x001a:
        r0 = move-exception;
    L_0x001b:
        r1 = r3.zzbqg;
        r1 = r1.zzKk();
        r1 = r1.zzLX();
        r2 = "Failed to get conditional user properties";
        r1.zzj(r2, r0);
        r0 = java.util.Collections.emptyList();
        goto L_0x0019;
    L_0x002f:
        r0 = move-exception;
        goto L_0x001b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzauf.zza(java.lang.String, java.lang.String, com.google.android.gms.internal.zzatd):java.util.List<com.google.android.gms.internal.zzatg>");
    }

    @BinderThread
    public List<zzauq> zza(String str, String str2, String str3, boolean z) {
        Object e;
        zzm(str, true);
        try {
            List<zzaus> list = (List) this.zzbqg.zzKj().zzd(new C02617(this, str, str2, str3)).get();
            List<zzauq> arrayList = new ArrayList(list.size());
            for (zzaus com_google_android_gms_internal_zzaus : list) {
                if (z || !zzaut.zzgd(com_google_android_gms_internal_zzaus.mName)) {
                    arrayList.add(new zzauq(com_google_android_gms_internal_zzaus));
                }
            }
            return arrayList;
        } catch (InterruptedException e2) {
            e = e2;
            this.zzbqg.zzKk().zzLX().zze("Failed to get user attributes. appId", zzatx.zzfE(str), e);
            return Collections.emptyList();
        } catch (ExecutionException e3) {
            e = e3;
            this.zzbqg.zzKk().zzLX().zze("Failed to get user attributes. appId", zzatx.zzfE(str), e);
            return Collections.emptyList();
        }
    }

    @BinderThread
    public List<zzauq> zza(String str, String str2, boolean z, zzatd com_google_android_gms_internal_zzatd) {
        Object e;
        zzb(com_google_android_gms_internal_zzatd, false);
        try {
            List<zzaus> list = (List) this.zzbqg.zzKj().zzd(new C02606(this, com_google_android_gms_internal_zzatd, str, str2)).get();
            List<zzauq> arrayList = new ArrayList(list.size());
            for (zzaus com_google_android_gms_internal_zzaus : list) {
                if (z || !zzaut.zzgd(com_google_android_gms_internal_zzaus.mName)) {
                    arrayList.add(new zzauq(com_google_android_gms_internal_zzaus));
                }
            }
            return arrayList;
        } catch (InterruptedException e2) {
            e = e2;
            this.zzbqg.zzKk().zzLX().zze("Failed to get user attributes. appId", zzatx.zzfE(com_google_android_gms_internal_zzatd.packageName), e);
            return Collections.emptyList();
        } catch (ExecutionException e3) {
            e = e3;
            this.zzbqg.zzKk().zzLX().zze("Failed to get user attributes. appId", zzatx.zzfE(com_google_android_gms_internal_zzatd.packageName), e);
            return Collections.emptyList();
        }
    }

    @BinderThread
    public void zza(long j, String str, String str2, String str3) {
        this.zzbqg.zzKj().zzm(new AnonymousClass17(this, str2, str3, str, j));
    }

    @BinderThread
    public void zza(zzatd com_google_android_gms_internal_zzatd) {
        zzb(com_google_android_gms_internal_zzatd, false);
        this.zzbqg.zzKj().zzm(new AnonymousClass16(this, com_google_android_gms_internal_zzatd));
    }

    @BinderThread
    public void zza(zzatg com_google_android_gms_internal_zzatg, zzatd com_google_android_gms_internal_zzatd) {
        zzac.zzw(com_google_android_gms_internal_zzatg);
        zzac.zzw(com_google_android_gms_internal_zzatg.zzbra);
        zzb(com_google_android_gms_internal_zzatd, false);
        zzatg com_google_android_gms_internal_zzatg2 = new zzatg(com_google_android_gms_internal_zzatg);
        com_google_android_gms_internal_zzatg2.packageName = com_google_android_gms_internal_zzatd.packageName;
        if (com_google_android_gms_internal_zzatg.zzbra.getValue() == null) {
            this.zzbqg.zzKj().zzm(new C02562(this, com_google_android_gms_internal_zzatg2, com_google_android_gms_internal_zzatd));
        } else {
            this.zzbqg.zzKj().zzm(new C02573(this, com_google_android_gms_internal_zzatg2, com_google_android_gms_internal_zzatd));
        }
    }

    @BinderThread
    public void zza(zzatq com_google_android_gms_internal_zzatq, zzatd com_google_android_gms_internal_zzatd) {
        zzac.zzw(com_google_android_gms_internal_zzatq);
        zzb(com_google_android_gms_internal_zzatd, false);
        this.zzbqg.zzKj().zzm(new AnonymousClass10(this, com_google_android_gms_internal_zzatq, com_google_android_gms_internal_zzatd));
    }

    @BinderThread
    public void zza(zzatq com_google_android_gms_internal_zzatq, String str, String str2) {
        zzac.zzw(com_google_android_gms_internal_zzatq);
        zzac.zzdr(str);
        zzm(str, true);
        this.zzbqg.zzKj().zzm(new AnonymousClass11(this, com_google_android_gms_internal_zzatq, str));
    }

    @BinderThread
    public void zza(zzauq com_google_android_gms_internal_zzauq, zzatd com_google_android_gms_internal_zzatd) {
        zzac.zzw(com_google_android_gms_internal_zzauq);
        zzb(com_google_android_gms_internal_zzatd, false);
        if (com_google_android_gms_internal_zzauq.getValue() == null) {
            this.zzbqg.zzKj().zzm(new AnonymousClass13(this, com_google_android_gms_internal_zzauq, com_google_android_gms_internal_zzatd));
        } else {
            this.zzbqg.zzKj().zzm(new AnonymousClass14(this, com_google_android_gms_internal_zzauq, com_google_android_gms_internal_zzatd));
        }
    }

    @BinderThread
    public byte[] zza(zzatq com_google_android_gms_internal_zzatq, String str) {
        Object e;
        zzac.zzdr(str);
        zzac.zzw(com_google_android_gms_internal_zzatq);
        zzm(str, true);
        this.zzbqg.zzKk().zzMc().zzj("Log and bundle. event", com_google_android_gms_internal_zzatq.name);
        long nanoTime = this.zzbqg.zznR().nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) this.zzbqg.zzKj().zze(new AnonymousClass12(this, com_google_android_gms_internal_zzatq, str)).get();
            if (bArr == null) {
                this.zzbqg.zzKk().zzLX().zzj("Log and bundle returned null. appId", zzatx.zzfE(str));
                bArr = new byte[0];
            }
            this.zzbqg.zzKk().zzMc().zzd("Log and bundle processed. event, size, time_ms", com_google_android_gms_internal_zzatq.name, Integer.valueOf(bArr.length), Long.valueOf((this.zzbqg.zznR().nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException e2) {
            e = e2;
            this.zzbqg.zzKk().zzLX().zzd("Failed to log and bundle. appId, event, error", zzatx.zzfE(str), com_google_android_gms_internal_zzatq.name, e);
            return null;
        } catch (ExecutionException e3) {
            e = e3;
            this.zzbqg.zzKk().zzLX().zzd("Failed to log and bundle. appId, event, error", zzatx.zzfE(str), com_google_android_gms_internal_zzatq.name, e);
            return null;
        }
    }

    @BinderThread
    public void zzb(zzatd com_google_android_gms_internal_zzatd) {
        zzb(com_google_android_gms_internal_zzatd, false);
        this.zzbqg.zzKj().zzm(new C02551(this, com_google_android_gms_internal_zzatd));
    }

    @BinderThread
    public void zzb(zzatg com_google_android_gms_internal_zzatg) {
        zzac.zzw(com_google_android_gms_internal_zzatg);
        zzac.zzw(com_google_android_gms_internal_zzatg.zzbra);
        zzm(com_google_android_gms_internal_zzatg.packageName, true);
        zzatg com_google_android_gms_internal_zzatg2 = new zzatg(com_google_android_gms_internal_zzatg);
        if (com_google_android_gms_internal_zzatg.zzbra.getValue() == null) {
            this.zzbqg.zzKj().zzm(new C02584(this, com_google_android_gms_internal_zzatg2));
        } else {
            this.zzbqg.zzKj().zzm(new C02595(this, com_google_android_gms_internal_zzatg2));
        }
    }

    @BinderThread
    public String zzc(zzatd com_google_android_gms_internal_zzatd) {
        zzb(com_google_android_gms_internal_zzatd, false);
        return this.zzbqg.zzfP(com_google_android_gms_internal_zzatd.packageName);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.BinderThread
    public java.util.List<com.google.android.gms.internal.zzatg> zzn(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
        /*
        r3 = this;
        r0 = 1;
        r3.zzm(r4, r0);
        r0 = r3.zzbqg;
        r0 = r0.zzKj();
        r1 = new com.google.android.gms.internal.zzauf$9;
        r1.<init>(r3, r4, r5, r6);
        r0 = r0.zzd(r1);
        r0 = r0.get();	 Catch:{ InterruptedException -> 0x001a, ExecutionException -> 0x002f }
        r0 = (java.util.List) r0;	 Catch:{ InterruptedException -> 0x001a, ExecutionException -> 0x002f }
    L_0x0019:
        return r0;
    L_0x001a:
        r0 = move-exception;
    L_0x001b:
        r1 = r3.zzbqg;
        r1 = r1.zzKk();
        r1 = r1.zzLX();
        r2 = "Failed to get conditional user properties";
        r1.zzj(r2, r0);
        r0 = java.util.Collections.emptyList();
        goto L_0x0019;
    L_0x002f:
        r0 = move-exception;
        goto L_0x001b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzauf.zzn(java.lang.String, java.lang.String, java.lang.String):java.util.List<com.google.android.gms.internal.zzatg>");
    }

    protected void zzn(String str, boolean z) throws SecurityException {
        if (z) {
            if (this.zzbuN == null) {
                boolean z2 = GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_PACKAGE.equals(this.zzbuO) || zzy.zzf(this.zzbqg.getContext(), Binder.getCallingUid()) || zzh.zzaN(this.zzbqg.getContext()).zza(this.zzbqg.getContext().getPackageManager(), Binder.getCallingUid());
                this.zzbuN = Boolean.valueOf(z2);
            }
            if (this.zzbuN.booleanValue()) {
                return;
            }
        }
        if (this.zzbuO == null && zzg.zzc(this.zzbqg.getContext(), Binder.getCallingUid(), str)) {
            this.zzbuO = str;
        }
        if (!str.equals(this.zzbuO)) {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
        }
    }
}
