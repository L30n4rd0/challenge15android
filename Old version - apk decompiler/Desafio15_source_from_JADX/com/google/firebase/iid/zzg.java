package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.support.annotation.VisibleForTesting;
import android.support.v4.content.WakefulBroadcastReceiver;
import android.support.v4.util.SimpleArrayMap;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.LinkedList;
import java.util.Queue;

public class zzg {
    private static zzg zzcls;
    private final SimpleArrayMap<String, String> zzclt;
    private Boolean zzclu;
    @VisibleForTesting
    final Queue<Intent> zzclv;
    @VisibleForTesting
    final Queue<Intent> zzclw;

    private zzg() {
        this.zzclt = new SimpleArrayMap();
        this.zzclu = null;
        this.zzclv = new LinkedList();
        this.zzclw = new LinkedList();
    }

    public static PendingIntent zza(Context context, int i, Intent intent, int i2) {
        return zza(context, i, "com.google.firebase.INSTANCE_ID_EVENT", intent, i2);
    }

    private static PendingIntent zza(Context context, int i, String str, Intent intent, int i2) {
        Intent intent2 = new Intent(context, FirebaseInstanceIdInternalReceiver.class);
        intent2.setAction(str);
        intent2.putExtra("wrapped_intent", intent);
        return PendingIntent.getBroadcast(context, i, intent2, i2);
    }

    public static synchronized zzg zzabT() {
        zzg com_google_firebase_iid_zzg;
        synchronized (zzg.class) {
            if (zzcls == null) {
                zzcls = new zzg();
            }
            com_google_firebase_iid_zzg = zzcls;
        }
        return com_google_firebase_iid_zzg;
    }

    public static PendingIntent zzb(Context context, int i, Intent intent, int i2) {
        return zza(context, i, "com.google.firebase.MESSAGING_EVENT", intent, i2);
    }

    private boolean zzcw(Context context) {
        if (this.zzclu == null) {
            this.zzclu = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        return this.zzclu.booleanValue();
    }

    private void zze(Context context, Intent intent) {
        String str;
        synchronized (this.zzclt) {
            str = (String) this.zzclt.get(intent.getAction());
        }
        if (str == null) {
            ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveService == null || resolveService.serviceInfo == null) {
                Log.e("FirebaseInstanceId", "Failed to resolve target intent service, skipping classname enforcement");
                return;
            }
            ServiceInfo serviceInfo = resolveService.serviceInfo;
            if (!context.getPackageName().equals(serviceInfo.packageName) || serviceInfo.name == null) {
                String valueOf = String.valueOf(serviceInfo.packageName);
                str = String.valueOf(serviceInfo.name);
                Log.e("FirebaseInstanceId", new StringBuilder((String.valueOf(valueOf).length() + 94) + String.valueOf(str).length()).append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ").append(valueOf).append("/").append(str).toString());
                return;
            }
            str = serviceInfo.name;
            if (str.startsWith(".")) {
                String valueOf2 = String.valueOf(context.getPackageName());
                str = String.valueOf(str);
                str = str.length() != 0 ? valueOf2.concat(str) : new String(valueOf2);
            }
            synchronized (this.zzclt) {
                this.zzclt.put(intent.getAction(), str);
            }
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            valueOf = "FirebaseInstanceId";
            String str2 = "Restricting intent to a specific service: ";
            valueOf2 = String.valueOf(str);
            Log.d(valueOf, valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2));
        }
        intent.setClassName(context.getPackageName(), str);
    }

    private int zzg(Context context, Intent intent) {
        zze(context, intent);
        try {
            ComponentName startWakefulService;
            if (zzcw(context)) {
                startWakefulService = WakefulBroadcastReceiver.startWakefulService(context, intent);
            } else {
                startWakefulService = context.startService(intent);
                Log.d("FirebaseInstanceId", "Missing wake lock permission, service start may be delayed");
            }
            if (startWakefulService != null) {
                return -1;
            }
            Log.e("FirebaseInstanceId", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (Throwable e) {
            Log.e("FirebaseInstanceId", "Error while delivering the message to the serviceIntent", e);
            return 401;
        }
    }

    public Intent zzabU() {
        return (Intent) this.zzclv.poll();
    }

    public Intent zzabV() {
        return (Intent) this.zzclw.poll();
    }

    public int zzb(Context context, String str, Intent intent) {
        Object obj = -1;
        switch (str.hashCode()) {
            case -842411455:
                if (str.equals("com.google.firebase.INSTANCE_ID_EVENT")) {
                    obj = null;
                    break;
                }
                break;
            case 41532704:
                if (str.equals("com.google.firebase.MESSAGING_EVENT")) {
                    obj = 1;
                    break;
                }
                break;
        }
        switch (obj) {
            case ConnectionResult.SUCCESS /*0*/:
                this.zzclv.offer(intent);
                break;
            case ConnectionResult.SERVICE_MISSING /*1*/:
                this.zzclw.offer(intent);
                break;
            default:
                String str2 = "FirebaseInstanceId";
                String str3 = "Unknown service action: ";
                String valueOf = String.valueOf(str);
                Log.w(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                return 500;
        }
        Intent intent2 = new Intent(str);
        intent2.setPackage(context.getPackageName());
        return zzg(context, intent2);
    }

    public void zzf(Context context, Intent intent) {
        zzb(context, "com.google.firebase.INSTANCE_ID_EVENT", intent);
    }
}