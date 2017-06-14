package com.google.android.gms.internal;

import java.util.concurrent.Future;

@zzme
public abstract class zzpj implements zzpq<Future> {
    private volatile Thread zzXh;
    private boolean zzXi;
    private final Runnable zzw;

    /* renamed from: com.google.android.gms.internal.zzpj.1 */
    class C03901 implements Runnable {
        final /* synthetic */ zzpj zzXj;

        C03901(zzpj com_google_android_gms_internal_zzpj) {
            this.zzXj = com_google_android_gms_internal_zzpj;
        }

        public final void run() {
            this.zzXj.zzXh = Thread.currentThread();
            this.zzXj.zzco();
        }
    }

    public zzpj() {
        this.zzw = new C03901(this);
        this.zzXi = false;
    }

    public zzpj(boolean z) {
        this.zzw = new C03901(this);
        this.zzXi = z;
    }

    public final void cancel() {
        onStop();
        if (this.zzXh != null) {
            this.zzXh.interrupt();
        }
    }

    public abstract void onStop();

    public abstract void zzco();

    public /* synthetic */ Object zziP() {
        return zzkG();
    }

    public final Future zzkG() {
        return this.zzXi ? zzpn.zza(1, this.zzw) : zzpn.zza(this.zzw);
    }
}
