package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.MainThread;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.util.zze;
import com.google.android.gms.common.util.zzf;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty;
import com.google.android.gms.measurement.AppMeasurement.zzb;
import com.google.android.gms.measurement.AppMeasurement.zzc;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

public class zzauj extends zzauh {
    protected zza zzbuZ;
    private zzb zzbva;
    private final Set<zzc> zzbvb;
    private boolean zzbvc;
    private String zzbvd;
    private String zzbve;

    /* renamed from: com.google.android.gms.internal.zzauj.10 */
    class AnonymousClass10 implements Runnable {
        final /* synthetic */ zzauj zzbvf;
        final /* synthetic */ AtomicReference zzbvh;
        final /* synthetic */ boolean zzbvi;

        AnonymousClass10(zzauj com_google_android_gms_internal_zzauj, AtomicReference atomicReference, boolean z) {
            this.zzbvf = com_google_android_gms_internal_zzauj;
            this.zzbvh = atomicReference;
            this.zzbvi = z;
        }

        public void run() {
            this.zzbvf.zzKc().zza(this.zzbvh, this.zzbvi);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzauj.12 */
    class AnonymousClass12 implements Runnable {
        final /* synthetic */ zzauj zzbvf;
        final /* synthetic */ AtomicReference zzbvh;

        AnonymousClass12(zzauj com_google_android_gms_internal_zzauj, AtomicReference atomicReference) {
            this.zzbvf = com_google_android_gms_internal_zzauj;
            this.zzbvh = atomicReference;
        }

        public void run() {
            this.zzbvf.zzKc().zza(this.zzbvh);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzauj.1 */
    class C02641 implements Runnable {
        final /* synthetic */ boolean zzaiP;
        final /* synthetic */ zzauj zzbvf;

        C02641(zzauj com_google_android_gms_internal_zzauj, boolean z) {
            this.zzbvf = com_google_android_gms_internal_zzauj;
            this.zzaiP = z;
        }

        public void run() {
            this.zzbvf.zzaM(this.zzaiP);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzauj.2 */
    class C02652 implements Runnable {
        final /* synthetic */ zzauj zzbvf;
        final /* synthetic */ ConditionalUserProperty zzbvg;

        C02652(zzauj com_google_android_gms_internal_zzauj, ConditionalUserProperty conditionalUserProperty) {
            this.zzbvf = com_google_android_gms_internal_zzauj;
            this.zzbvg = conditionalUserProperty;
        }

        public void run() {
            this.zzbvf.zzb(this.zzbvg);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzauj.3 */
    class C02663 implements Runnable {
        final /* synthetic */ zzauj zzbvf;
        final /* synthetic */ ConditionalUserProperty zzbvg;

        C02663(zzauj com_google_android_gms_internal_zzauj, ConditionalUserProperty conditionalUserProperty) {
            this.zzbvf = com_google_android_gms_internal_zzauj;
            this.zzbvg = conditionalUserProperty;
        }

        public void run() {
            this.zzbvf.zzc(this.zzbvg);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzauj.4 */
    class C02674 implements Runnable {
        final /* synthetic */ String zzbla;
        final /* synthetic */ String zzbuS;
        final /* synthetic */ String zzbuT;
        final /* synthetic */ zzauj zzbvf;
        final /* synthetic */ AtomicReference zzbvh;

        C02674(zzauj com_google_android_gms_internal_zzauj, AtomicReference atomicReference, String str, String str2, String str3) {
            this.zzbvf = com_google_android_gms_internal_zzauj;
            this.zzbvh = atomicReference;
            this.zzbla = str;
            this.zzbuS = str2;
            this.zzbuT = str3;
        }

        public void run() {
            this.zzbvf.zzbqg.zzKc().zza(this.zzbvh, this.zzbla, this.zzbuS, this.zzbuT);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzauj.5 */
    class C02685 implements Runnable {
        final /* synthetic */ String zzbla;
        final /* synthetic */ String zzbuS;
        final /* synthetic */ String zzbuT;
        final /* synthetic */ zzauj zzbvf;
        final /* synthetic */ AtomicReference zzbvh;
        final /* synthetic */ boolean zzbvi;

        C02685(zzauj com_google_android_gms_internal_zzauj, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
            this.zzbvf = com_google_android_gms_internal_zzauj;
            this.zzbvh = atomicReference;
            this.zzbla = str;
            this.zzbuS = str2;
            this.zzbuT = str3;
            this.zzbvi = z;
        }

        public void run() {
            this.zzbvf.zzbqg.zzKc().zza(this.zzbvh, this.zzbla, this.zzbuS, this.zzbuT, this.zzbvi);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzauj.6 */
    class C02696 implements Runnable {
        final /* synthetic */ zzauj zzbvf;
        final /* synthetic */ long zzbvj;

        C02696(zzauj com_google_android_gms_internal_zzauj, long j) {
            this.zzbvf = com_google_android_gms_internal_zzauj;
            this.zzbvj = j;
        }

        public void run() {
            this.zzbvf.zzKl().zzbtp.set(this.zzbvj);
            this.zzbvf.zzKk().zzMc().zzj("Minimum session duration set", Long.valueOf(this.zzbvj));
        }
    }

    /* renamed from: com.google.android.gms.internal.zzauj.7 */
    class C02707 implements Runnable {
        final /* synthetic */ zzauj zzbvf;
        final /* synthetic */ long zzbvj;

        C02707(zzauj com_google_android_gms_internal_zzauj, long j) {
            this.zzbvf = com_google_android_gms_internal_zzauj;
            this.zzbvj = j;
        }

        public void run() {
            this.zzbvf.zzKl().zzbtq.set(this.zzbvj);
            this.zzbvf.zzKk().zzMc().zzj("Session timeout duration set", Long.valueOf(this.zzbvj));
        }
    }

    /* renamed from: com.google.android.gms.internal.zzauj.8 */
    class C02718 implements Runnable {
        final /* synthetic */ String val$name;
        final /* synthetic */ String zzbla;
        final /* synthetic */ String zzbuS;
        final /* synthetic */ zzauj zzbvf;
        final /* synthetic */ long zzbvk;
        final /* synthetic */ Bundle zzbvl;
        final /* synthetic */ boolean zzbvm;
        final /* synthetic */ boolean zzbvn;
        final /* synthetic */ boolean zzbvo;

        C02718(zzauj com_google_android_gms_internal_zzauj, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
            this.zzbvf = com_google_android_gms_internal_zzauj;
            this.zzbuS = str;
            this.val$name = str2;
            this.zzbvk = j;
            this.zzbvl = bundle;
            this.zzbvm = z;
            this.zzbvn = z2;
            this.zzbvo = z3;
            this.zzbla = str3;
        }

        public void run() {
            this.zzbvf.zzb(this.zzbuS, this.val$name, this.zzbvk, this.zzbvl, this.zzbvm, this.zzbvn, this.zzbvo, this.zzbla);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzauj.9 */
    class C02729 implements Runnable {
        final /* synthetic */ String val$name;
        final /* synthetic */ String zzbuS;
        final /* synthetic */ zzauj zzbvf;
        final /* synthetic */ long zzbvk;
        final /* synthetic */ Object zzbvp;

        C02729(zzauj com_google_android_gms_internal_zzauj, String str, String str2, Object obj, long j) {
            this.zzbvf = com_google_android_gms_internal_zzauj;
            this.zzbuS = str;
            this.val$name = str2;
            this.zzbvp = obj;
            this.zzbvk = j;
        }

        public void run() {
            this.zzbvf.zza(this.zzbuS, this.val$name, this.zzbvp, this.zzbvk);
        }
    }

    @MainThread
    @TargetApi(14)
    private class zza implements ActivityLifecycleCallbacks {
        final /* synthetic */ zzauj zzbvf;

        private zza(zzauj com_google_android_gms_internal_zzauj) {
            this.zzbvf = com_google_android_gms_internal_zzauj;
        }

        private boolean zzfR(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            this.zzbvf.zzd("auto", "_ldl", str);
            return true;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            try {
                this.zzbvf.zzKk().zzMd().log("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent != null) {
                    Uri data = intent.getData();
                    if (data != null && data.isHierarchical()) {
                        if (bundle == null) {
                            Bundle zzu = this.zzbvf.zzKg().zzu(data);
                            String str = this.zzbvf.zzKg().zzD(intent) ? "gs" : "auto";
                            if (zzu != null) {
                                this.zzbvf.zze(str, "_cmp", zzu);
                            }
                        }
                        String queryParameter = data.getQueryParameter("referrer");
                        if (!TextUtils.isEmpty(queryParameter)) {
                            Object obj = (queryParameter.contains("gclid") && (queryParameter.contains("utm_campaign") || queryParameter.contains("utm_source") || queryParameter.contains("utm_medium") || queryParameter.contains("utm_term") || queryParameter.contains("utm_content"))) ? 1 : null;
                            if (obj == null) {
                                this.zzbvf.zzKk().zzMc().log("Activity created with data 'referrer' param without gclid and at least one utm field");
                                return;
                            } else {
                                this.zzbvf.zzKk().zzMc().zzj("Activity created with referrer", queryParameter);
                                zzfR(queryParameter);
                            }
                        } else {
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                this.zzbvf.zzKk().zzLX().zzj("Throwable caught in onActivityCreated", th);
            }
            this.zzbvf.zzKd().onActivityCreated(activity, bundle);
        }

        public void onActivityDestroyed(Activity activity) {
            this.zzbvf.zzKd().onActivityDestroyed(activity);
        }

        @MainThread
        public void onActivityPaused(Activity activity) {
            this.zzbvf.zzKd().onActivityPaused(activity);
            this.zzbvf.zzKi().zzNd();
        }

        @MainThread
        public void onActivityResumed(Activity activity) {
            this.zzbvf.zzKd().onActivityResumed(activity);
            this.zzbvf.zzKi().zzNb();
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            this.zzbvf.zzKd().onActivitySaveInstanceState(activity, bundle);
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    protected zzauj(zzaue com_google_android_gms_internal_zzaue) {
        super(com_google_android_gms_internal_zzaue);
        this.zzbvb = new CopyOnWriteArraySet();
        this.zzbvd = null;
        this.zzbve = null;
    }

    @WorkerThread
    private void zzMR() {
        try {
            zzf(Class.forName(zzMS()));
        } catch (ClassNotFoundException e) {
            zzKk().zzMb().log("Tag Manager is not found and thus will not be used");
        }
    }

    private String zzMS() {
        return "com.google.android.gms.tagmanager.TagManagerService";
    }

    private void zza(ConditionalUserProperty conditionalUserProperty) {
        long currentTimeMillis = zznR().currentTimeMillis();
        zzac.zzw(conditionalUserProperty);
        zzac.zzdr(conditionalUserProperty.mName);
        zzac.zzdr(conditionalUserProperty.mOrigin);
        zzac.zzw(conditionalUserProperty.mValue);
        conditionalUserProperty.mCreationTimestamp = currentTimeMillis;
        String str = conditionalUserProperty.mName;
        Object obj = conditionalUserProperty.mValue;
        if (zzKg().zzfX(str) != 0) {
            zzKk().zzLX().zzj("Invalid conditional user property name", str);
        } else if (zzKg().zzm(str, obj) != 0) {
            zzKk().zzLX().zze("Invalid conditional user property value", str, obj);
        } else {
            Object zzn = zzKg().zzn(str, obj);
            if (zzn == null) {
                zzKk().zzLX().zze("Unable to normalize conditional user property value", str, obj);
                return;
            }
            conditionalUserProperty.mValue = zzn;
            long j = conditionalUserProperty.mTriggerTimeout;
            if (j > zzKm().zzKZ() || j < 1) {
                zzKk().zzLX().zze("Invalid conditional user property timeout", str, Long.valueOf(j));
                return;
            }
            j = conditionalUserProperty.mTimeToLive;
            if (j > zzKm().zzLa() || j < 1) {
                zzKk().zzLX().zze("Invalid conditional user property time to live", str, Long.valueOf(j));
            } else {
                zzKj().zzm(new C02652(this, conditionalUserProperty));
            }
        }
    }

    private void zza(String str, String str2, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        zza(str, str2, zznR().currentTimeMillis(), bundle, z, z2, z3, str3);
    }

    @WorkerThread
    private void zza(String str, String str2, Object obj, long j) {
        zzac.zzdr(str);
        zzac.zzdr(str2);
        zzmR();
        zzJV();
        zzob();
        if (!this.zzbqg.isEnabled()) {
            zzKk().zzMc().log("User property not set since app measurement is disabled");
        } else if (this.zzbqg.zzMs()) {
            zzKk().zzMc().zze("Setting user property (FE)", str2, obj);
            zzKc().zzb(new zzauq(str2, j, obj, str));
        }
    }

    private void zza(String str, String str2, String str3, Bundle bundle) {
        long currentTimeMillis = zznR().currentTimeMillis();
        zzac.zzdr(str2);
        ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
        conditionalUserProperty.mAppId = str;
        conditionalUserProperty.mName = str2;
        conditionalUserProperty.mCreationTimestamp = currentTimeMillis;
        if (str3 != null) {
            conditionalUserProperty.mExpiredEventName = str3;
            conditionalUserProperty.mExpiredEventParams = bundle;
        }
        zzKj().zzm(new C02663(this, conditionalUserProperty));
    }

    @WorkerThread
    private void zzaM(boolean z) {
        zzmR();
        zzJV();
        zzob();
        zzKk().zzMc().zzj("Setting app measurement enabled (FE)", Boolean.valueOf(z));
        zzKl().setMeasurementEnabled(z);
        zzKc().zzMV();
    }

    private Map<String, Object> zzb(String str, String str2, String str3, boolean z) {
        AtomicReference atomicReference = new AtomicReference();
        synchronized (atomicReference) {
            this.zzbqg.zzKj().zzm(new C02685(this, atomicReference, str, str2, str3, z));
            try {
                atomicReference.wait(5000);
            } catch (InterruptedException e) {
                zzKk().zzLZ().zzj("Interrupted waiting for get user properties", e);
            }
        }
        List<zzauq> list = (List) atomicReference.get();
        if (list == null) {
            zzKk().zzLZ().log("Timed out waiting for get user properties");
            return Collections.emptyMap();
        }
        Map<String, Object> arrayMap = new ArrayMap(list.size());
        for (zzauq com_google_android_gms_internal_zzauq : list) {
            arrayMap.put(com_google_android_gms_internal_zzauq.name, com_google_android_gms_internal_zzauq.getValue());
        }
        return arrayMap;
    }

    @WorkerThread
    private void zzb(ConditionalUserProperty conditionalUserProperty) {
        zzmR();
        zzob();
        zzac.zzw(conditionalUserProperty);
        zzac.zzdr(conditionalUserProperty.mName);
        zzac.zzdr(conditionalUserProperty.mOrigin);
        zzac.zzw(conditionalUserProperty.mValue);
        if (this.zzbqg.isEnabled()) {
            zzauq com_google_android_gms_internal_zzauq = new zzauq(conditionalUserProperty.mName, conditionalUserProperty.mTriggeredTimestamp, conditionalUserProperty.mValue, conditionalUserProperty.mOrigin);
            try {
                zzatq zza = zzKg().zza(conditionalUserProperty.mTriggeredEventName, conditionalUserProperty.mTriggeredEventParams, conditionalUserProperty.mOrigin, 0, true, false);
                zzatq zza2 = zzKg().zza(conditionalUserProperty.mTimedOutEventName, conditionalUserProperty.mTimedOutEventParams, conditionalUserProperty.mOrigin, 0, true, false);
                zzatq zza3 = zzKg().zza(conditionalUserProperty.mExpiredEventName, conditionalUserProperty.mExpiredEventParams, conditionalUserProperty.mOrigin, 0, true, false);
                zzauq com_google_android_gms_internal_zzauq2 = com_google_android_gms_internal_zzauq;
                zzKc().zzf(new zzatg(conditionalUserProperty.mAppId, conditionalUserProperty.mOrigin, com_google_android_gms_internal_zzauq2, conditionalUserProperty.mCreationTimestamp, false, conditionalUserProperty.mTriggerEventName, zza2, conditionalUserProperty.mTriggerTimeout, zza, conditionalUserProperty.mTimeToLive, zza3));
                return;
            } catch (IllegalArgumentException e) {
                return;
            }
        }
        zzKk().zzMc().log("Conditional property not sent since Firebase Analytics is disabled");
    }

    @WorkerThread
    private void zzb(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        zzac.zzdr(str);
        zzac.zzdr(str2);
        zzac.zzw(bundle);
        zzmR();
        zzob();
        if (this.zzbqg.isEnabled()) {
            if (!this.zzbvc) {
                this.zzbvc = true;
                zzMR();
            }
            boolean equals = "am".equals(str);
            boolean zzgd = zzaut.zzgd(str2);
            if (z && this.zzbva != null && !zzgd && !equals) {
                zzKk().zzMc().zze("Passing event to registered event handler (FE)", str2, bundle);
                this.zzbva.zzb(str, str2, bundle, j);
                return;
            } else if (this.zzbqg.zzMs()) {
                int zzfV = zzKg().zzfV(str2);
                if (zzfV != 0) {
                    this.zzbqg.zzKg().zza(zzfV, "_ev", zzKg().zza(str2, zzKm().zzKL(), true), str2 != null ? str2.length() : 0);
                    return;
                }
                bundle.putString("_o", str);
                Bundle zza = zzKg().zza(str2, bundle, zzf.zzx("_o"), z3);
                if (!bundle.containsKey("_sc")) {
                    zzKm().zzLf();
                    AppMeasurement.zzf zzMT = zzKd().zzMT();
                    if (zzMT != null) {
                        zzMT.zzbvD = true;
                    }
                    zzauk.zza(zzMT, zza);
                }
                Bundle zzN = z2 ? zzKg().zzN(zza) : zza;
                zzKk().zzMc().zze("Logging event (FE)", str2, zzN);
                zzKc().zzc(new zzatq(str2, new zzato(zzN), str, j), str3);
                if (!equals) {
                    for (zzc zzc : this.zzbvb) {
                        zzc.zzc(str, str2, new Bundle(zzN), j);
                    }
                    return;
                }
                return;
            } else {
                return;
            }
        }
        zzKk().zzMc().log("Event not sent since app measurement is disabled");
    }

    @WorkerThread
    private void zzc(ConditionalUserProperty conditionalUserProperty) {
        zzmR();
        zzob();
        zzac.zzw(conditionalUserProperty);
        zzac.zzdr(conditionalUserProperty.mName);
        if (this.zzbqg.isEnabled()) {
            zzauq com_google_android_gms_internal_zzauq = new zzauq(conditionalUserProperty.mName, 0, null, null);
            try {
                zzatq zza = zzKg().zza(conditionalUserProperty.mExpiredEventName, conditionalUserProperty.mExpiredEventParams, conditionalUserProperty.mOrigin, conditionalUserProperty.mCreationTimestamp, true, false);
                zzauq com_google_android_gms_internal_zzauq2 = com_google_android_gms_internal_zzauq;
                zzKc().zzf(new zzatg(conditionalUserProperty.mAppId, conditionalUserProperty.mOrigin, com_google_android_gms_internal_zzauq2, conditionalUserProperty.mCreationTimestamp, conditionalUserProperty.mActive, conditionalUserProperty.mTriggerEventName, null, conditionalUserProperty.mTriggerTimeout, null, conditionalUserProperty.mTimeToLive, zza));
                return;
            } catch (IllegalArgumentException e) {
                return;
            }
        }
        zzKk().zzMc().log("Conditional property not cleared since Firebase Analytics is disabled");
    }

    private List<ConditionalUserProperty> zzo(String str, String str2, String str3) {
        AtomicReference atomicReference = new AtomicReference();
        synchronized (atomicReference) {
            this.zzbqg.zzKj().zzm(new C02674(this, atomicReference, str, str2, str3));
            try {
                atomicReference.wait(5000);
            } catch (InterruptedException e) {
                zzKk().zzLZ().zze("Interrupted waiting for get conditional user properties", str, e);
            }
        }
        List<zzatg> list = (List) atomicReference.get();
        if (list == null) {
            zzKk().zzLZ().zzj("Timed out waiting for get conditional user properties", str);
            return Collections.emptyList();
        }
        List<ConditionalUserProperty> arrayList = new ArrayList(list.size());
        for (zzatg com_google_android_gms_internal_zzatg : list) {
            ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
            conditionalUserProperty.mAppId = str;
            conditionalUserProperty.mOrigin = str2;
            conditionalUserProperty.mCreationTimestamp = com_google_android_gms_internal_zzatg.zzbrb;
            conditionalUserProperty.mName = com_google_android_gms_internal_zzatg.zzbra.name;
            conditionalUserProperty.mValue = com_google_android_gms_internal_zzatg.zzbra.getValue();
            conditionalUserProperty.mActive = com_google_android_gms_internal_zzatg.zzbrc;
            conditionalUserProperty.mTriggerEventName = com_google_android_gms_internal_zzatg.zzbrd;
            if (com_google_android_gms_internal_zzatg.zzbre != null) {
                conditionalUserProperty.mTimedOutEventName = com_google_android_gms_internal_zzatg.zzbre.name;
                if (com_google_android_gms_internal_zzatg.zzbre.zzbrK != null) {
                    conditionalUserProperty.mTimedOutEventParams = com_google_android_gms_internal_zzatg.zzbre.zzbrK.zzLV();
                }
            }
            conditionalUserProperty.mTriggerTimeout = com_google_android_gms_internal_zzatg.zzbrf;
            if (com_google_android_gms_internal_zzatg.zzbrg != null) {
                conditionalUserProperty.mTriggeredEventName = com_google_android_gms_internal_zzatg.zzbrg.name;
                if (com_google_android_gms_internal_zzatg.zzbrg.zzbrK != null) {
                    conditionalUserProperty.mTriggeredEventParams = com_google_android_gms_internal_zzatg.zzbrg.zzbrK.zzLV();
                }
            }
            conditionalUserProperty.mTriggeredTimestamp = com_google_android_gms_internal_zzatg.zzbra.zzbwg;
            conditionalUserProperty.mTimeToLive = com_google_android_gms_internal_zzatg.zzbrh;
            if (com_google_android_gms_internal_zzatg.zzbri != null) {
                conditionalUserProperty.mExpiredEventName = com_google_android_gms_internal_zzatg.zzbri.name;
                if (com_google_android_gms_internal_zzatg.zzbri.zzbrK != null) {
                    conditionalUserProperty.mExpiredEventParams = com_google_android_gms_internal_zzatg.zzbri.zzbrK.zzLV();
                }
            }
            arrayList.add(conditionalUserProperty);
        }
        return arrayList;
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        zzJV();
        zza(null, str, str2, bundle);
    }

    public void clearConditionalUserPropertyAs(String str, String str2, String str3, Bundle bundle) {
        zzac.zzdr(str);
        zzJU();
        zza(str, str2, str3, bundle);
    }

    public Task<String> getAppInstanceId() {
        try {
            String zzMk = zzKl().zzMk();
            return zzMk != null ? Tasks.forResult(zzMk) : Tasks.call(zzKj().zzMq(), new Callable<String>() {
                final /* synthetic */ zzauj zzbvf;

                {
                    this.zzbvf = r1;
                }

                public /* synthetic */ Object call() throws Exception {
                    return zzbY();
                }

                public String zzbY() throws Exception {
                    String zzMk = this.zzbvf.zzKl().zzMk();
                    if (zzMk == null) {
                        zzMk = this.zzbvf.zzJZ().zzar(120000);
                        if (zzMk == null) {
                            throw new TimeoutException();
                        }
                        this.zzbvf.zzKl().zzfJ(zzMk);
                    }
                    return zzMk;
                }
            });
        } catch (Exception e) {
            zzKk().zzLZ().log("Failed to schedule task for getAppInstanceId");
            return Tasks.forException(e);
        }
    }

    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        zzJV();
        return zzo(null, str, str2);
    }

    public List<ConditionalUserProperty> getConditionalUserPropertiesAs(String str, String str2, String str3) {
        zzac.zzdr(str);
        zzJU();
        return zzo(str, str2, str3);
    }

    public /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    public int getMaxUserProperties(String str) {
        zzac.zzdr(str);
        return zzKm().zzKX();
    }

    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        zzJV();
        return zzb(null, str, str2, z);
    }

    public Map<String, Object> getUserPropertiesAs(String str, String str2, String str3, boolean z) {
        zzac.zzdr(str);
        zzJU();
        return zzb(str, str2, str3, z);
    }

    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        zzac.zzw(conditionalUserProperty);
        zzJV();
        ConditionalUserProperty conditionalUserProperty2 = new ConditionalUserProperty(conditionalUserProperty);
        if (!TextUtils.isEmpty(conditionalUserProperty2.mAppId)) {
            zzKk().zzLZ().log("Package name should be null when calling setConditionalUserProperty");
        }
        conditionalUserProperty2.mAppId = null;
        zza(conditionalUserProperty2);
    }

    public void setConditionalUserPropertyAs(ConditionalUserProperty conditionalUserProperty) {
        zzac.zzw(conditionalUserProperty);
        zzac.zzdr(conditionalUserProperty.mAppId);
        zzJU();
        zza(new ConditionalUserProperty(conditionalUserProperty));
    }

    public void setMeasurementEnabled(boolean z) {
        zzob();
        zzJV();
        zzKj().zzm(new C02641(this, z));
    }

    public void setMinimumSessionDuration(long j) {
        zzJV();
        zzKj().zzm(new C02696(this, j));
    }

    public void setSessionTimeoutDuration(long j) {
        zzJV();
        zzKj().zzm(new C02707(this, j));
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

    @TargetApi(14)
    public void zzMP() {
        if (getContext().getApplicationContext() instanceof Application) {
            Application application = (Application) getContext().getApplicationContext();
            if (this.zzbuZ == null) {
                this.zzbuZ = new zza();
            }
            application.unregisterActivityLifecycleCallbacks(this.zzbuZ);
            application.registerActivityLifecycleCallbacks(this.zzbuZ);
            zzKk().zzMd().log("Registered activity lifecycle callback");
        }
    }

    @WorkerThread
    public void zzMQ() {
        zzmR();
        zzJV();
        zzob();
        if (this.zzbqg.zzMs()) {
            zzKc().zzMQ();
            String zzMn = zzKl().zzMn();
            if (!TextUtils.isEmpty(zzMn) && !zzMn.equals(zzKb().zzLR())) {
                Bundle bundle = new Bundle();
                bundle.putString("_po", zzMn);
                zze("auto", "_ou", bundle);
            }
        }
    }

    @WorkerThread
    public void zza(zzb com_google_android_gms_measurement_AppMeasurement_zzb) {
        zzmR();
        zzJV();
        zzob();
        if (!(com_google_android_gms_measurement_AppMeasurement_zzb == null || com_google_android_gms_measurement_AppMeasurement_zzb == this.zzbva)) {
            zzac.zza(this.zzbva == null, (Object) "EventInterceptor already set.");
        }
        this.zzbva = com_google_android_gms_measurement_AppMeasurement_zzb;
    }

    public void zza(zzc com_google_android_gms_measurement_AppMeasurement_zzc) {
        zzJV();
        zzob();
        zzac.zzw(com_google_android_gms_measurement_AppMeasurement_zzc);
        if (!this.zzbvb.add(com_google_android_gms_measurement_AppMeasurement_zzc)) {
            zzKk().zzLZ().log("OnEventListener already registered");
        }
    }

    protected void zza(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        zzKj().zzm(new C02718(this, str, str2, j, bundle != null ? new Bundle(bundle) : new Bundle(), z, z2, z3, str3));
    }

    void zza(String str, String str2, long j, Object obj) {
        zzKj().zzm(new C02729(this, str, str2, obj, j));
    }

    public void zza(String str, String str2, Bundle bundle, boolean z) {
        zzJV();
        boolean z2 = this.zzbva == null || zzaut.zzgd(str2);
        zza(str, str2, bundle, true, z2, z, null);
    }

    public List<zzauq> zzaN(boolean z) {
        zzJV();
        zzob();
        zzKk().zzMc().log("Fetching user attributes (FE)");
        AtomicReference atomicReference = new AtomicReference();
        synchronized (atomicReference) {
            this.zzbqg.zzKj().zzm(new AnonymousClass10(this, atomicReference, z));
            try {
                atomicReference.wait(5000);
            } catch (InterruptedException e) {
                zzKk().zzLZ().zzj("Interrupted waiting for get user properties", e);
            }
        }
        List<zzauq> list = (List) atomicReference.get();
        if (list != null) {
            return list;
        }
        zzKk().zzLZ().log("Timed out waiting for get user properties");
        return Collections.emptyList();
    }

    @Nullable
    public String zzar(long j) {
        if (zzKj().zzMp()) {
            zzKk().zzLX().log("Cannot retrieve app instance id from analytics worker thread");
            return null;
        } else if (zzKj().zzbc()) {
            zzKk().zzLX().log("Cannot retrieve app instance id from main thread");
            return null;
        } else {
            AtomicReference atomicReference = new AtomicReference();
            synchronized (atomicReference) {
                zzKj().zzm(new AnonymousClass12(this, atomicReference));
                try {
                    atomicReference.wait(j);
                } catch (InterruptedException e) {
                    zzKk().zzLZ().log("Interrupted waiting for app instance id");
                    return null;
                }
            }
            return (String) atomicReference.get();
        }
    }

    public void zzd(String str, String str2, Bundle bundle, long j) {
        zzJV();
        zza(str, str2, j, bundle, false, true, true, null);
    }

    public void zzd(String str, String str2, Object obj) {
        int i = 0;
        zzac.zzdr(str);
        long currentTimeMillis = zznR().currentTimeMillis();
        int zzfX = zzKg().zzfX(str2);
        String zza;
        if (zzfX != 0) {
            zza = zzKg().zza(str2, zzKm().zzKM(), true);
            if (str2 != null) {
                i = str2.length();
            }
            this.zzbqg.zzKg().zza(zzfX, "_ev", zza, i);
        } else if (obj != null) {
            zzfX = zzKg().zzm(str2, obj);
            if (zzfX != 0) {
                zza = zzKg().zza(str2, zzKm().zzKM(), true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i = String.valueOf(obj).length();
                }
                this.zzbqg.zzKg().zza(zzfX, "_ev", zza, i);
                return;
            }
            Object zzn = zzKg().zzn(str2, obj);
            if (zzn != null) {
                zza(str, str2, currentTimeMillis, zzn);
            }
        } else {
            zza(str, str2, currentTimeMillis, null);
        }
    }

    public void zze(String str, String str2, Bundle bundle) {
        zzJV();
        boolean z = this.zzbva == null || zzaut.zzgd(str2);
        zza(str, str2, bundle, true, z, false, null);
    }

    @WorkerThread
    public void zzf(Class<?> cls) {
        try {
            cls.getDeclaredMethod("initialize", new Class[]{Context.class}).invoke(null, new Object[]{getContext()});
        } catch (Exception e) {
            zzKk().zzLZ().zzj("Failed to invoke Tag Manager's initialize() method", e);
        }
    }

    @Nullable
    @WorkerThread
    public synchronized String zzfQ(String str) {
        String zzar;
        zzob();
        zzJV();
        if (str == null || !str.equals(this.zzbve)) {
            zzar = zzar(30000);
            if (zzar == null) {
                zzar = null;
            } else {
                this.zzbve = str;
                this.zzbvd = zzar;
                zzar = this.zzbvd;
            }
        } else {
            zzar = this.zzbvd;
        }
        return zzar;
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
