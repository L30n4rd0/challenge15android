package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.MainThread;
import android.support.annotation.WorkerThread;
import com.google.android.gms.common.util.zze;

public class zzaun extends zzauh {
    private Handler mHandler;
    protected long zzbwa;
    private final zzatk zzbwb;
    private final zzatk zzbwc;

    /* renamed from: com.google.android.gms.internal.zzaun.3 */
    class C02883 implements Runnable {
        final /* synthetic */ long zzbqs;
        final /* synthetic */ zzaun zzbwd;

        C02883(zzaun com_google_android_gms_internal_zzaun, long j) {
            this.zzbwd = com_google_android_gms_internal_zzaun;
            this.zzbqs = j;
        }

        public void run() {
            this.zzbwd.zzas(this.zzbqs);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzaun.4 */
    class C02894 implements Runnable {
        final /* synthetic */ long zzbqs;
        final /* synthetic */ zzaun zzbwd;

        C02894(zzaun com_google_android_gms_internal_zzaun, long j) {
            this.zzbwd = com_google_android_gms_internal_zzaun;
            this.zzbqs = j;
        }

        public void run() {
            this.zzbwd.zzat(this.zzbqs);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzaun.1 */
    class C05691 extends zzatk {
        final /* synthetic */ zzaun zzbwd;

        C05691(zzaun com_google_android_gms_internal_zzaun, zzaue com_google_android_gms_internal_zzaue) {
            this.zzbwd = com_google_android_gms_internal_zzaun;
            super(com_google_android_gms_internal_zzaue);
        }

        @WorkerThread
        public void run() {
            this.zzbwd.zzNe();
        }
    }

    /* renamed from: com.google.android.gms.internal.zzaun.2 */
    class C05702 extends zzatk {
        final /* synthetic */ zzaun zzbwd;

        C05702(zzaun com_google_android_gms_internal_zzaun, zzaue com_google_android_gms_internal_zzaue) {
            this.zzbwd = com_google_android_gms_internal_zzaun;
            super(com_google_android_gms_internal_zzaue);
        }

        @WorkerThread
        public void run() {
            this.zzbwd.zzNf();
        }
    }

    zzaun(zzaue com_google_android_gms_internal_zzaue) {
        super(com_google_android_gms_internal_zzaue);
        this.zzbwb = new C05691(this, this.zzbqg);
        this.zzbwc = new C05702(this, this.zzbqg);
    }

    private void zzNc() {
        synchronized (this) {
            if (this.mHandler == null) {
                this.mHandler = new Handler(Looper.getMainLooper());
            }
        }
    }

    @WorkerThread
    private void zzNf() {
        zzmR();
        zzaO(false);
        zzJX().zzW(zznR().elapsedRealtime());
    }

    @WorkerThread
    private void zzas(long j) {
        zzmR();
        zzNc();
        this.zzbwb.cancel();
        this.zzbwc.cancel();
        zzKk().zzMd().zzj("Activity resumed, time", Long.valueOf(j));
        this.zzbwa = j;
        if (zznR().currentTimeMillis() - zzKl().zzbtq.get() > zzKl().zzbts.get()) {
            zzKl().zzbtr.set(true);
            zzKl().zzbtt.set(0);
        }
        if (zzKl().zzbtr.get()) {
            this.zzbwb.zzy(Math.max(0, zzKl().zzbtp.get() - zzKl().zzbtt.get()));
        } else {
            this.zzbwc.zzy(Math.max(0, 3600000 - zzKl().zzbtt.get()));
        }
    }

    @WorkerThread
    private void zzat(long j) {
        zzmR();
        zzNc();
        this.zzbwb.cancel();
        this.zzbwc.cancel();
        zzKk().zzMd().zzj("Activity paused, time", Long.valueOf(j));
        if (this.zzbwa != 0) {
            zzKl().zzbtt.set(zzKl().zzbtt.get() + (j - this.zzbwa));
        }
        zzKl().zzbts.set(zznR().currentTimeMillis());
    }

    public /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    public /* bridge */ /* synthetic */ void zzJU() {
        super.zzJU();
    }

    public /* bridge */ /* synthetic */ void zzJV() {
        super.zzJV();
    }

    public /* bridge */ /* synthetic */ void zzJW() {
        super.zzJW();
    }

    public /* bridge */ /* synthetic */ zzatb zzJX() {
        return super.zzJX();
    }

    public /* bridge */ /* synthetic */ zzatf zzJY() {
        return super.zzJY();
    }

    public /* bridge */ /* synthetic */ zzauj zzJZ() {
        return super.zzJZ();
    }

    public /* bridge */ /* synthetic */ zzatu zzKa() {
        return super.zzKa();
    }

    public /* bridge */ /* synthetic */ zzatl zzKb() {
        return super.zzKb();
    }

    public /* bridge */ /* synthetic */ zzaul zzKc() {
        return super.zzKc();
    }

    public /* bridge */ /* synthetic */ zzauk zzKd() {
        return super.zzKd();
    }

    public /* bridge */ /* synthetic */ zzatv zzKe() {
        return super.zzKe();
    }

    public /* bridge */ /* synthetic */ zzatj zzKf() {
        return super.zzKf();
    }

    public /* bridge */ /* synthetic */ zzaut zzKg() {
        return super.zzKg();
    }

    public /* bridge */ /* synthetic */ zzauc zzKh() {
        return super.zzKh();
    }

    public /* bridge */ /* synthetic */ zzaun zzKi() {
        return super.zzKi();
    }

    public /* bridge */ /* synthetic */ zzaud zzKj() {
        return super.zzKj();
    }

    public /* bridge */ /* synthetic */ zzatx zzKk() {
        return super.zzKk();
    }

    public /* bridge */ /* synthetic */ zzaua zzKl() {
        return super.zzKl();
    }

    public /* bridge */ /* synthetic */ zzati zzKm() {
        return super.zzKm();
    }

    @MainThread
    protected void zzNb() {
        zzKj().zzm(new C02883(this, zznR().elapsedRealtime()));
    }

    @MainThread
    protected void zzNd() {
        zzKj().zzm(new C02894(this, zznR().elapsedRealtime()));
    }

    @WorkerThread
    protected void zzNe() {
        zzmR();
        zzKk().zzMd().zzj("Session started, time", Long.valueOf(zznR().elapsedRealtime()));
        zzKl().zzbtr.set(false);
        zzJZ().zze("auto", "_s", new Bundle());
    }

    @WorkerThread
    public boolean zzaO(boolean z) {
        zzmR();
        zzob();
        long elapsedRealtime = zznR().elapsedRealtime();
        if (this.zzbwa == 0) {
            this.zzbwa = elapsedRealtime - 3600000;
        }
        long j = elapsedRealtime - this.zzbwa;
        if (z || j >= 1000) {
            zzKl().zzbtt.set(j);
            zzKk().zzMd().zzj("Recording user engagement, ms", Long.valueOf(j));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j);
            zzauk.zza(zzKd().zzMT(), bundle);
            zzJZ().zze("auto", "_e", bundle);
            this.zzbwa = elapsedRealtime;
            this.zzbwc.cancel();
            this.zzbwc.zzy(Math.max(0, 3600000 - zzKl().zzbtt.get()));
            return true;
        }
        zzKk().zzMd().zzj("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j));
        return false;
    }

    public /* bridge */ /* synthetic */ void zzmR() {
        super.zzmR();
    }

    protected void zzmS() {
    }

    public /* bridge */ /* synthetic */ zze zznR() {
        return super.zznR();
    }
}
