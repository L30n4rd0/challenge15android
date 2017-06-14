package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.support.v4.view.PointerIconCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.internal.zzf.zzb;
import com.google.android.gms.common.internal.zzf.zzc;
import com.google.android.gms.common.zze;
import com.google.android.gms.measurement.AppMeasurement.zzf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class zzaul extends zzauh {
    private final zza zzbvE;
    private zzatt zzbvF;
    private Boolean zzbvG;
    private final zzatk zzbvH;
    private final zzauo zzbvI;
    private final List<Runnable> zzbvJ;
    private final zzatk zzbvK;

    /* renamed from: com.google.android.gms.internal.zzaul.10 */
    class AnonymousClass10 implements Runnable {
        final /* synthetic */ String zzbla;
        final /* synthetic */ String zzbuS;
        final /* synthetic */ String zzbuT;
        final /* synthetic */ zzaul zzbvL;
        final /* synthetic */ AtomicReference zzbvM;
        final /* synthetic */ boolean zzbvi;

        AnonymousClass10(zzaul com_google_android_gms_internal_zzaul, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
            this.zzbvL = com_google_android_gms_internal_zzaul;
            this.zzbvM = atomicReference;
            this.zzbla = str;
            this.zzbuS = str2;
            this.zzbuT = str3;
            this.zzbvi = z;
        }

        public void run() {
            synchronized (this.zzbvM) {
                try {
                    zzatt zzc = this.zzbvL.zzbvF;
                    if (zzc == null) {
                        this.zzbvL.zzKk().zzLX().zzd("Failed to get user properties", zzatx.zzfE(this.zzbla), this.zzbuS, this.zzbuT);
                        this.zzbvM.set(Collections.emptyList());
                        return;
                    }
                    if (TextUtils.isEmpty(this.zzbla)) {
                        this.zzbvM.set(zzc.zza(this.zzbuS, this.zzbuT, this.zzbvi, this.zzbvL.zzKa().zzfD(this.zzbvL.zzKk().zzMe())));
                    } else {
                        this.zzbvM.set(zzc.zza(this.zzbla, this.zzbuS, this.zzbuT, this.zzbvi));
                    }
                    this.zzbvL.zzoo();
                    this.zzbvM.notify();
                } catch (RemoteException e) {
                    this.zzbvL.zzKk().zzLX().zzd("Failed to get user properties", zzatx.zzfE(this.zzbla), this.zzbuS, e);
                    this.zzbvM.set(Collections.emptyList());
                } finally {
                    this.zzbvM.notify();
                }
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.zzaul.11 */
    class AnonymousClass11 implements Runnable {
        final /* synthetic */ zzauq zzbuV;
        final /* synthetic */ zzaul zzbvL;
        final /* synthetic */ boolean zzbvP;

        AnonymousClass11(zzaul com_google_android_gms_internal_zzaul, boolean z, zzauq com_google_android_gms_internal_zzauq) {
            this.zzbvL = com_google_android_gms_internal_zzaul;
            this.zzbvP = z;
            this.zzbuV = com_google_android_gms_internal_zzauq;
        }

        public void run() {
            zzatt zzc = this.zzbvL.zzbvF;
            if (zzc == null) {
                this.zzbvL.zzKk().zzLX().log("Discarding data. Failed to set user attribute");
                return;
            }
            this.zzbvL.zza(zzc, this.zzbvP ? null : this.zzbuV);
            this.zzbvL.zzoo();
        }
    }

    /* renamed from: com.google.android.gms.internal.zzaul.12 */
    class AnonymousClass12 implements Runnable {
        final /* synthetic */ zzaul zzbvL;
        final /* synthetic */ AtomicReference zzbvM;
        final /* synthetic */ boolean zzbvi;

        AnonymousClass12(zzaul com_google_android_gms_internal_zzaul, AtomicReference atomicReference, boolean z) {
            this.zzbvL = com_google_android_gms_internal_zzaul;
            this.zzbvM = atomicReference;
            this.zzbvi = z;
        }

        public void run() {
            synchronized (this.zzbvM) {
                try {
                    zzatt zzc = this.zzbvL.zzbvF;
                    if (zzc == null) {
                        this.zzbvL.zzKk().zzLX().log("Failed to get user properties");
                        return;
                    }
                    this.zzbvM.set(zzc.zza(this.zzbvL.zzKa().zzfD(null), this.zzbvi));
                    this.zzbvL.zzoo();
                    this.zzbvM.notify();
                } catch (RemoteException e) {
                    this.zzbvL.zzKk().zzLX().zzj("Failed to get user properties", e);
                } finally {
                    this.zzbvM.notify();
                }
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.zzaul.2 */
    class C02752 implements Runnable {
        final /* synthetic */ zzaul zzbvL;
        final /* synthetic */ AtomicReference zzbvM;

        C02752(zzaul com_google_android_gms_internal_zzaul, AtomicReference atomicReference) {
            this.zzbvL = com_google_android_gms_internal_zzaul;
            this.zzbvM = atomicReference;
        }

        public void run() {
            synchronized (this.zzbvM) {
                try {
                    zzatt zzc = this.zzbvL.zzbvF;
                    if (zzc == null) {
                        this.zzbvL.zzKk().zzLX().log("Failed to get app instance id");
                        return;
                    }
                    this.zzbvM.set(zzc.zzc(this.zzbvL.zzKa().zzfD(null)));
                    this.zzbvL.zzoo();
                    this.zzbvM.notify();
                } catch (RemoteException e) {
                    this.zzbvL.zzKk().zzLX().zzj("Failed to get app instance id", e);
                } finally {
                    this.zzbvM.notify();
                }
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.zzaul.3 */
    class C02763 implements Runnable {
        final /* synthetic */ zzaul zzbvL;

        C02763(zzaul com_google_android_gms_internal_zzaul) {
            this.zzbvL = com_google_android_gms_internal_zzaul;
        }

        public void run() {
            zzatt zzc = this.zzbvL.zzbvF;
            if (zzc == null) {
                this.zzbvL.zzKk().zzLX().log("Discarding data. Failed to send app launch");
                return;
            }
            try {
                zzc.zza(this.zzbvL.zzKa().zzfD(this.zzbvL.zzKk().zzMe()));
                this.zzbvL.zza(zzc, null);
                this.zzbvL.zzoo();
            } catch (RemoteException e) {
                this.zzbvL.zzKk().zzLX().zzj("Failed to send app launch to the service", e);
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.zzaul.4 */
    class C02774 implements Runnable {
        final /* synthetic */ zzaul zzbvL;
        final /* synthetic */ zzf zzbvN;

        C02774(zzaul com_google_android_gms_internal_zzaul, zzf com_google_android_gms_measurement_AppMeasurement_zzf) {
            this.zzbvL = com_google_android_gms_internal_zzaul;
            this.zzbvN = com_google_android_gms_measurement_AppMeasurement_zzf;
        }

        public void run() {
            zzatt zzc = this.zzbvL.zzbvF;
            if (zzc == null) {
                this.zzbvL.zzKk().zzLX().log("Failed to send current screen to service");
                return;
            }
            try {
                if (this.zzbvN == null) {
                    zzc.zza(0, null, null, this.zzbvL.getContext().getPackageName());
                } else {
                    zzc.zza(this.zzbvN.zzbql, this.zzbvN.zzbqj, this.zzbvN.zzbqk, this.zzbvL.getContext().getPackageName());
                }
                this.zzbvL.zzoo();
            } catch (RemoteException e) {
                this.zzbvL.zzKk().zzLX().zzj("Failed to send current screen to the service", e);
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.zzaul.6 */
    class C02786 implements Runnable {
        final /* synthetic */ zzaul zzbvL;

        C02786(zzaul com_google_android_gms_internal_zzaul) {
            this.zzbvL = com_google_android_gms_internal_zzaul;
        }

        public void run() {
            zzatt zzc = this.zzbvL.zzbvF;
            if (zzc == null) {
                this.zzbvL.zzKk().zzLX().log("Failed to send measurementEnabled to service");
                return;
            }
            try {
                zzc.zzb(this.zzbvL.zzKa().zzfD(this.zzbvL.zzKk().zzMe()));
                this.zzbvL.zzoo();
            } catch (RemoteException e) {
                this.zzbvL.zzKk().zzLX().zzj("Failed to send measurementEnabled to the service", e);
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.zzaul.7 */
    class C02797 implements Runnable {
        final /* synthetic */ String zzbla;
        final /* synthetic */ zzatq zzbuU;
        final /* synthetic */ zzaul zzbvL;
        final /* synthetic */ boolean zzbvO;
        final /* synthetic */ boolean zzbvP;

        C02797(zzaul com_google_android_gms_internal_zzaul, boolean z, boolean z2, zzatq com_google_android_gms_internal_zzatq, String str) {
            this.zzbvL = com_google_android_gms_internal_zzaul;
            this.zzbvO = z;
            this.zzbvP = z2;
            this.zzbuU = com_google_android_gms_internal_zzatq;
            this.zzbla = str;
        }

        public void run() {
            zzatt zzc = this.zzbvL.zzbvF;
            if (zzc == null) {
                this.zzbvL.zzKk().zzLX().log("Discarding data. Failed to send event to service");
                return;
            }
            if (this.zzbvO) {
                this.zzbvL.zza(zzc, this.zzbvP ? null : this.zzbuU);
            } else {
                try {
                    if (TextUtils.isEmpty(this.zzbla)) {
                        zzc.zza(this.zzbuU, this.zzbvL.zzKa().zzfD(this.zzbvL.zzKk().zzMe()));
                    } else {
                        zzc.zza(this.zzbuU, this.zzbla, this.zzbvL.zzKk().zzMe());
                    }
                } catch (RemoteException e) {
                    this.zzbvL.zzKk().zzLX().zzj("Failed to send event to the service", e);
                }
            }
            this.zzbvL.zzoo();
        }
    }

    /* renamed from: com.google.android.gms.internal.zzaul.8 */
    class C02808 implements Runnable {
        final /* synthetic */ zzaul zzbvL;
        final /* synthetic */ boolean zzbvO;
        final /* synthetic */ boolean zzbvP;
        final /* synthetic */ zzatg zzbvQ;
        final /* synthetic */ zzatg zzbvR;

        C02808(zzaul com_google_android_gms_internal_zzaul, boolean z, boolean z2, zzatg com_google_android_gms_internal_zzatg, zzatg com_google_android_gms_internal_zzatg2) {
            this.zzbvL = com_google_android_gms_internal_zzaul;
            this.zzbvO = z;
            this.zzbvP = z2;
            this.zzbvQ = com_google_android_gms_internal_zzatg;
            this.zzbvR = com_google_android_gms_internal_zzatg2;
        }

        public void run() {
            zzatt zzc = this.zzbvL.zzbvF;
            if (zzc == null) {
                this.zzbvL.zzKk().zzLX().log("Discarding data. Failed to send conditional user property to service");
                return;
            }
            if (this.zzbvO) {
                this.zzbvL.zza(zzc, this.zzbvP ? null : this.zzbvQ);
            } else {
                try {
                    if (TextUtils.isEmpty(this.zzbvR.packageName)) {
                        zzc.zza(this.zzbvQ, this.zzbvL.zzKa().zzfD(this.zzbvL.zzKk().zzMe()));
                    } else {
                        zzc.zzb(this.zzbvQ);
                    }
                } catch (RemoteException e) {
                    this.zzbvL.zzKk().zzLX().zzj("Failed to send conditional user property to the service", e);
                }
            }
            this.zzbvL.zzoo();
        }
    }

    /* renamed from: com.google.android.gms.internal.zzaul.9 */
    class C02819 implements Runnable {
        final /* synthetic */ String zzbla;
        final /* synthetic */ String zzbuS;
        final /* synthetic */ String zzbuT;
        final /* synthetic */ zzaul zzbvL;
        final /* synthetic */ AtomicReference zzbvM;

        C02819(zzaul com_google_android_gms_internal_zzaul, AtomicReference atomicReference, String str, String str2, String str3) {
            this.zzbvL = com_google_android_gms_internal_zzaul;
            this.zzbvM = atomicReference;
            this.zzbla = str;
            this.zzbuS = str2;
            this.zzbuT = str3;
        }

        public void run() {
            synchronized (this.zzbvM) {
                try {
                    zzatt zzc = this.zzbvL.zzbvF;
                    if (zzc == null) {
                        this.zzbvL.zzKk().zzLX().zzd("Failed to get conditional properties", zzatx.zzfE(this.zzbla), this.zzbuS, this.zzbuT);
                        this.zzbvM.set(Collections.emptyList());
                        return;
                    }
                    if (TextUtils.isEmpty(this.zzbla)) {
                        this.zzbvM.set(zzc.zza(this.zzbuS, this.zzbuT, this.zzbvL.zzKa().zzfD(this.zzbvL.zzKk().zzMe())));
                    } else {
                        this.zzbvM.set(zzc.zzn(this.zzbla, this.zzbuS, this.zzbuT));
                    }
                    this.zzbvL.zzoo();
                    this.zzbvM.notify();
                } catch (RemoteException e) {
                    this.zzbvL.zzKk().zzLX().zzd("Failed to get conditional properties", zzatx.zzfE(this.zzbla), this.zzbuS, e);
                    this.zzbvM.set(Collections.emptyList());
                } finally {
                    this.zzbvM.notify();
                }
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.zzaul.1 */
    class C05671 extends zzatk {
        final /* synthetic */ zzaul zzbvL;

        C05671(zzaul com_google_android_gms_internal_zzaul, zzaue com_google_android_gms_internal_zzaue) {
            this.zzbvL = com_google_android_gms_internal_zzaul;
            super(com_google_android_gms_internal_zzaue);
        }

        public void run() {
            this.zzbvL.zzop();
        }
    }

    /* renamed from: com.google.android.gms.internal.zzaul.5 */
    class C05685 extends zzatk {
        final /* synthetic */ zzaul zzbvL;

        C05685(zzaul com_google_android_gms_internal_zzaul, zzaue com_google_android_gms_internal_zzaue) {
            this.zzbvL = com_google_android_gms_internal_zzaul;
            super(com_google_android_gms_internal_zzaue);
        }

        public void run() {
            this.zzbvL.zzKk().zzLZ().log("Tasks have been queued for a long time");
        }
    }

    protected class zza implements ServiceConnection, zzb, zzc {
        final /* synthetic */ zzaul zzbvL;
        private volatile boolean zzbvS;
        private volatile zzatw zzbvT;

        /* renamed from: com.google.android.gms.internal.zzaul.zza.1 */
        class C02821 implements Runnable {
            final /* synthetic */ zzatt zzbvU;
            final /* synthetic */ zza zzbvV;

            C02821(zza com_google_android_gms_internal_zzaul_zza, zzatt com_google_android_gms_internal_zzatt) {
                this.zzbvV = com_google_android_gms_internal_zzaul_zza;
                this.zzbvU = com_google_android_gms_internal_zzatt;
            }

            public void run() {
                synchronized (this.zzbvV) {
                    this.zzbvV.zzbvS = false;
                    if (!this.zzbvV.zzbvL.isConnected()) {
                        this.zzbvV.zzbvL.zzKk().zzMd().log("Connected to service");
                        this.zzbvV.zzbvL.zza(this.zzbvU);
                    }
                }
            }
        }

        /* renamed from: com.google.android.gms.internal.zzaul.zza.2 */
        class C02832 implements Runnable {
            final /* synthetic */ ComponentName val$name;
            final /* synthetic */ zza zzbvV;

            C02832(zza com_google_android_gms_internal_zzaul_zza, ComponentName componentName) {
                this.zzbvV = com_google_android_gms_internal_zzaul_zza;
                this.val$name = componentName;
            }

            public void run() {
                this.zzbvV.zzbvL.onServiceDisconnected(this.val$name);
            }
        }

        /* renamed from: com.google.android.gms.internal.zzaul.zza.3 */
        class C02843 implements Runnable {
            final /* synthetic */ zza zzbvV;
            final /* synthetic */ zzatt zzbvW;

            C02843(zza com_google_android_gms_internal_zzaul_zza, zzatt com_google_android_gms_internal_zzatt) {
                this.zzbvV = com_google_android_gms_internal_zzaul_zza;
                this.zzbvW = com_google_android_gms_internal_zzatt;
            }

            public void run() {
                synchronized (this.zzbvV) {
                    this.zzbvV.zzbvS = false;
                    if (!this.zzbvV.zzbvL.isConnected()) {
                        this.zzbvV.zzbvL.zzKk().zzMc().log("Connected to remote service");
                        this.zzbvV.zzbvL.zza(this.zzbvW);
                    }
                }
            }
        }

        /* renamed from: com.google.android.gms.internal.zzaul.zza.4 */
        class C02854 implements Runnable {
            final /* synthetic */ zza zzbvV;

            C02854(zza com_google_android_gms_internal_zzaul_zza) {
                this.zzbvV = com_google_android_gms_internal_zzaul_zza;
            }

            public void run() {
                zzaul com_google_android_gms_internal_zzaul = this.zzbvV.zzbvL;
                Context context = this.zzbvV.zzbvL.getContext();
                this.zzbvV.zzbvL.zzKm().zzLf();
                com_google_android_gms_internal_zzaul.onServiceDisconnected(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementService"));
            }
        }

        protected zza(zzaul com_google_android_gms_internal_zzaul) {
            this.zzbvL = com_google_android_gms_internal_zzaul;
        }

        @MainThread
        public void onConnected(@Nullable Bundle bundle) {
            zzac.zzdj("MeasurementServiceConnection.onConnected");
            synchronized (this) {
                try {
                    zzatt com_google_android_gms_internal_zzatt = (zzatt) this.zzbvT.zzxD();
                    this.zzbvT = null;
                    this.zzbvL.zzKj().zzm(new C02843(this, com_google_android_gms_internal_zzatt));
                } catch (DeadObjectException e) {
                    this.zzbvT = null;
                    this.zzbvS = false;
                } catch (IllegalStateException e2) {
                    this.zzbvT = null;
                    this.zzbvS = false;
                }
            }
        }

        @MainThread
        public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
            zzac.zzdj("MeasurementServiceConnection.onConnectionFailed");
            zzatx zzMt = this.zzbvL.zzbqg.zzMt();
            if (zzMt != null) {
                zzMt.zzLZ().zzj("Service connection failed", connectionResult);
            }
            synchronized (this) {
                this.zzbvS = false;
                this.zzbvT = null;
            }
        }

        @MainThread
        public void onConnectionSuspended(int i) {
            zzac.zzdj("MeasurementServiceConnection.onConnectionSuspended");
            this.zzbvL.zzKk().zzMc().log("Service connection suspended");
            this.zzbvL.zzKj().zzm(new C02854(this));
        }

        @MainThread
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            zzac.zzdj("MeasurementServiceConnection.onServiceConnected");
            synchronized (this) {
                if (iBinder == null) {
                    this.zzbvS = false;
                    this.zzbvL.zzKk().zzLX().log("Service connected with null binder");
                    return;
                }
                zzatt com_google_android_gms_internal_zzatt = null;
                try {
                    String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                    if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                        com_google_android_gms_internal_zzatt = com.google.android.gms.internal.zzatt.zza.zzes(iBinder);
                        this.zzbvL.zzKk().zzMd().log("Bound to IMeasurementService interface");
                    } else {
                        this.zzbvL.zzKk().zzLX().zzj("Got binder with a wrong descriptor", interfaceDescriptor);
                    }
                } catch (RemoteException e) {
                    this.zzbvL.zzKk().zzLX().log("Service connect failed to get IMeasurementService");
                }
                if (com_google_android_gms_internal_zzatt == null) {
                    this.zzbvS = false;
                    try {
                        com.google.android.gms.common.stats.zza.zzyJ().zza(this.zzbvL.getContext(), this.zzbvL.zzbvE);
                    } catch (IllegalArgumentException e2) {
                    }
                } else {
                    this.zzbvL.zzKj().zzm(new C02821(this, com_google_android_gms_internal_zzatt));
                }
                return;
            }
        }

        @MainThread
        public void onServiceDisconnected(ComponentName componentName) {
            zzac.zzdj("MeasurementServiceConnection.onServiceDisconnected");
            this.zzbvL.zzKk().zzMc().log("Service disconnected");
            this.zzbvL.zzKj().zzm(new C02832(this, componentName));
        }

        @WorkerThread
        public void zzC(Intent intent) {
            this.zzbvL.zzmR();
            Context context = this.zzbvL.getContext();
            com.google.android.gms.common.stats.zza zzyJ = com.google.android.gms.common.stats.zza.zzyJ();
            synchronized (this) {
                if (this.zzbvS) {
                    this.zzbvL.zzKk().zzMd().log("Connection attempt already in progress");
                    return;
                }
                this.zzbvS = true;
                zzyJ.zza(context, intent, this.zzbvL.zzbvE, 129);
            }
        }

        @WorkerThread
        public void zzNa() {
            this.zzbvL.zzmR();
            Context context = this.zzbvL.getContext();
            synchronized (this) {
                if (this.zzbvS) {
                    this.zzbvL.zzKk().zzMd().log("Connection attempt already in progress");
                } else if (this.zzbvT != null) {
                    this.zzbvL.zzKk().zzMd().log("Already awaiting connection attempt");
                } else {
                    this.zzbvT = new zzatw(context, Looper.getMainLooper(), this, this);
                    this.zzbvL.zzKk().zzMd().log("Connecting to remote service");
                    this.zzbvS = true;
                    this.zzbvT.zzxz();
                }
            }
        }
    }

    protected zzaul(zzaue com_google_android_gms_internal_zzaue) {
        super(com_google_android_gms_internal_zzaue);
        this.zzbvJ = new ArrayList();
        this.zzbvI = new zzauo(com_google_android_gms_internal_zzaue.zznR());
        this.zzbvE = new zza(this);
        this.zzbvH = new C05671(this, com_google_android_gms_internal_zzaue);
        this.zzbvK = new C05685(this, com_google_android_gms_internal_zzaue);
    }

    @WorkerThread
    private void onServiceDisconnected(ComponentName componentName) {
        zzmR();
        if (this.zzbvF != null) {
            this.zzbvF = null;
            zzKk().zzMd().zzj("Disconnected from device MeasurementService", componentName);
            zzMY();
        }
    }

    private boolean zzMW() {
        zzKm().zzLf();
        List queryIntentServices = getContext().getPackageManager().queryIntentServices(new Intent().setClassName(getContext(), "com.google.android.gms.measurement.AppMeasurementService"), AccessibilityNodeInfoCompat.ACTION_CUT);
        return queryIntentServices != null && queryIntentServices.size() > 0;
    }

    @WorkerThread
    private void zzMY() {
        zzmR();
        zzoD();
    }

    @WorkerThread
    private void zzMZ() {
        zzmR();
        zzKk().zzMd().zzj("Processing queued up service tasks", Integer.valueOf(this.zzbvJ.size()));
        for (Runnable zzm : this.zzbvJ) {
            zzKj().zzm(zzm);
        }
        this.zzbvJ.clear();
        this.zzbvK.cancel();
    }

    @WorkerThread
    private void zzo(Runnable runnable) throws IllegalStateException {
        zzmR();
        if (isConnected()) {
            runnable.run();
        } else if (((long) this.zzbvJ.size()) >= zzKm().zzLl()) {
            zzKk().zzLX().log("Discarding data. Max runnable queue size reached");
        } else {
            this.zzbvJ.add(runnable);
            this.zzbvK.zzy(60000);
            zzoD();
        }
    }

    @WorkerThread
    private void zzoo() {
        zzmR();
        this.zzbvI.start();
        this.zzbvH.zzy(zzKm().zzpq());
    }

    @WorkerThread
    private void zzop() {
        zzmR();
        if (isConnected()) {
            zzKk().zzMd().log("Inactivity, disconnecting from the service");
            disconnect();
        }
    }

    @WorkerThread
    public void disconnect() {
        zzmR();
        zzob();
        try {
            com.google.android.gms.common.stats.zza.zzyJ().zza(getContext(), this.zzbvE);
        } catch (IllegalStateException e) {
        } catch (IllegalArgumentException e2) {
        }
        this.zzbvF = null;
    }

    public /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    @WorkerThread
    public boolean isConnected() {
        zzmR();
        zzob();
        return this.zzbvF != null;
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

    @WorkerThread
    protected void zzMQ() {
        zzmR();
        zzob();
        zzo(new C02763(this));
    }

    @WorkerThread
    protected void zzMV() {
        zzmR();
        zzob();
        zzo(new C02786(this));
    }

    @WorkerThread
    protected boolean zzMX() {
        zzmR();
        zzob();
        zzKm().zzLf();
        zzKk().zzMd().log("Checking service availability");
        switch (zze.zzuY().isGooglePlayServicesAvailable(getContext())) {
            case ConnectionResult.SUCCESS /*0*/:
                zzKk().zzMd().log("Service available");
                return true;
            case ConnectionResult.SERVICE_MISSING /*1*/:
                zzKk().zzMd().log("Service missing");
                return false;
            case ConnectionResult.SERVICE_VERSION_UPDATE_REQUIRED /*2*/:
                zzKk().zzMc().log("Service container out of date");
                return true;
            case ConnectionResult.SERVICE_DISABLED /*3*/:
                zzKk().zzLZ().log("Service disabled");
                return false;
            case ConnectionResult.SERVICE_INVALID /*9*/:
                zzKk().zzLZ().log("Service invalid");
                return false;
            case ConnectionResult.SERVICE_UPDATING /*18*/:
                zzKk().zzLZ().log("Service updating");
                return true;
            default:
                return false;
        }
    }

    @WorkerThread
    protected void zza(zzatt com_google_android_gms_internal_zzatt) {
        zzmR();
        zzac.zzw(com_google_android_gms_internal_zzatt);
        this.zzbvF = com_google_android_gms_internal_zzatt;
        zzoo();
        zzMZ();
    }

    @WorkerThread
    void zza(zzatt com_google_android_gms_internal_zzatt, com.google.android.gms.common.internal.safeparcel.zza com_google_android_gms_common_internal_safeparcel_zza) {
        zzmR();
        zzJV();
        zzob();
        int i = VERSION.SDK_INT;
        zzKm().zzLf();
        List<com.google.android.gms.common.internal.safeparcel.zza> arrayList = new ArrayList();
        zzKm().zzLo();
        int i2 = 100;
        for (int i3 = 0; i3 < PointerIconCompat.TYPE_CONTEXT_MENU && r1 == 100; i3++) {
            Object zzlD = zzKe().zzlD(100);
            if (zzlD != null) {
                arrayList.addAll(zzlD);
                i2 = zzlD.size();
            } else {
                i2 = 0;
            }
            if (com_google_android_gms_common_internal_safeparcel_zza != null && r1 < 100) {
                arrayList.add(com_google_android_gms_common_internal_safeparcel_zza);
            }
            for (com.google.android.gms.common.internal.safeparcel.zza com_google_android_gms_common_internal_safeparcel_zza2 : arrayList) {
                if (com_google_android_gms_common_internal_safeparcel_zza2 instanceof zzatq) {
                    try {
                        com_google_android_gms_internal_zzatt.zza((zzatq) com_google_android_gms_common_internal_safeparcel_zza2, zzKa().zzfD(zzKk().zzMe()));
                    } catch (RemoteException e) {
                        zzKk().zzLX().zzj("Failed to send event to the service", e);
                    }
                } else if (com_google_android_gms_common_internal_safeparcel_zza2 instanceof zzauq) {
                    try {
                        com_google_android_gms_internal_zzatt.zza((zzauq) com_google_android_gms_common_internal_safeparcel_zza2, zzKa().zzfD(zzKk().zzMe()));
                    } catch (RemoteException e2) {
                        zzKk().zzLX().zzj("Failed to send attribute to the service", e2);
                    }
                } else if (com_google_android_gms_common_internal_safeparcel_zza2 instanceof zzatg) {
                    try {
                        com_google_android_gms_internal_zzatt.zza((zzatg) com_google_android_gms_common_internal_safeparcel_zza2, zzKa().zzfD(zzKk().zzMe()));
                    } catch (RemoteException e22) {
                        zzKk().zzLX().zzj("Failed to send conditional property to the service", e22);
                    }
                } else {
                    zzKk().zzLX().log("Discarding data. Unrecognized parcel type.");
                }
            }
        }
    }

    @WorkerThread
    protected void zza(zzf com_google_android_gms_measurement_AppMeasurement_zzf) {
        zzmR();
        zzob();
        zzo(new C02774(this, com_google_android_gms_measurement_AppMeasurement_zzf));
    }

    @WorkerThread
    public void zza(AtomicReference<String> atomicReference) {
        zzmR();
        zzob();
        zzo(new C02752(this, atomicReference));
    }

    @WorkerThread
    protected void zza(AtomicReference<List<zzatg>> atomicReference, String str, String str2, String str3) {
        zzmR();
        zzob();
        zzo(new C02819(this, atomicReference, str, str2, str3));
    }

    @WorkerThread
    protected void zza(AtomicReference<List<zzauq>> atomicReference, String str, String str2, String str3, boolean z) {
        zzmR();
        zzob();
        zzo(new AnonymousClass10(this, atomicReference, str, str2, str3, z));
    }

    @WorkerThread
    protected void zza(AtomicReference<List<zzauq>> atomicReference, boolean z) {
        zzmR();
        zzob();
        zzo(new AnonymousClass12(this, atomicReference, z));
    }

    @WorkerThread
    protected void zzb(zzauq com_google_android_gms_internal_zzauq) {
        zzmR();
        zzob();
        int i = VERSION.SDK_INT;
        zzKm().zzLf();
        zzo(new AnonymousClass11(this, zzKe().zza(com_google_android_gms_internal_zzauq), com_google_android_gms_internal_zzauq));
    }

    @WorkerThread
    protected void zzc(zzatq com_google_android_gms_internal_zzatq, String str) {
        zzac.zzw(com_google_android_gms_internal_zzatq);
        zzmR();
        zzob();
        int i = VERSION.SDK_INT;
        zzKm().zzLf();
        zzo(new C02797(this, true, zzKe().zza(com_google_android_gms_internal_zzatq), com_google_android_gms_internal_zzatq, str));
    }

    @WorkerThread
    protected void zzf(zzatg com_google_android_gms_internal_zzatg) {
        zzac.zzw(com_google_android_gms_internal_zzatg);
        zzmR();
        zzob();
        zzKm().zzLf();
        zzo(new C02808(this, true, zzKe().zzc(com_google_android_gms_internal_zzatg), new zzatg(com_google_android_gms_internal_zzatg), com_google_android_gms_internal_zzatg));
    }

    public /* bridge */ /* synthetic */ void zzmR() {
        super.zzmR();
    }

    protected void zzmS() {
    }

    public /* bridge */ /* synthetic */ com.google.android.gms.common.util.zze zznR() {
        return super.zznR();
    }

    @WorkerThread
    void zzoD() {
        zzmR();
        zzob();
        if (!isConnected()) {
            if (this.zzbvG == null) {
                this.zzbvG = zzKl().zzMl();
                if (this.zzbvG == null) {
                    zzKk().zzMd().log("State of service unknown");
                    this.zzbvG = Boolean.valueOf(zzMX());
                    zzKl().zzaK(this.zzbvG.booleanValue());
                }
            }
            if (this.zzbvG.booleanValue()) {
                zzKk().zzMd().log("Using measurement service");
                this.zzbvE.zzNa();
            } else if (zzMW()) {
                zzKk().zzMd().log("Using local app measurement service");
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                Context context = getContext();
                zzKm().zzLf();
                intent.setComponent(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementService"));
                this.zzbvE.zzC(intent);
            } else {
                zzKk().zzLX().log("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            }
        }
    }
}
