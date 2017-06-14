package com.google.firebase.iid;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.VisibleForTesting;
import android.support.v4.content.WakefulBroadcastReceiver;
import android.util.Log;
import com.google.android.gms.iid.MessengerCompat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class zzb extends Service {
    private int zzbgm;
    private int zzbgn;
    MessengerCompat zzbhN;
    @VisibleForTesting
    final ExecutorService zzbtM;
    private final Object zzrJ;

    /* renamed from: com.google.firebase.iid.zzb.1 */
    class C04471 extends Handler {
        final /* synthetic */ zzb zzckY;

        C04471(zzb com_google_firebase_iid_zzb, Looper looper) {
            this.zzckY = com_google_firebase_iid_zzb;
            super(looper);
        }

        public void handleMessage(Message message) {
            int zzc = MessengerCompat.zzc(message);
            zzf.zzbA(this.zzckY);
            this.zzckY.getPackageManager();
            if (zzc == zzf.zzbhY || zzc == zzf.zzbhX) {
                this.zzckY.zzm((Intent) message.obj);
                return;
            }
            int i = zzf.zzbhX;
            Log.w("FirebaseInstanceId", "Message from unexpected caller " + zzc + " mine=" + i + " appid=" + zzf.zzbhY);
        }
    }

    /* renamed from: com.google.firebase.iid.zzb.2 */
    class C04482 implements Runnable {
        final /* synthetic */ Intent val$intent;
        final /* synthetic */ zzb zzckY;
        final /* synthetic */ Intent zzckZ;

        C04482(zzb com_google_firebase_iid_zzb, Intent intent, Intent intent2) {
            this.zzckY = com_google_firebase_iid_zzb;
            this.val$intent = intent;
            this.zzckZ = intent2;
        }

        public void run() {
            this.zzckY.zzm(this.val$intent);
            this.zzckY.zzG(this.zzckZ);
        }
    }

    public zzb() {
        this.zzbhN = new MessengerCompat(new C04471(this, Looper.getMainLooper()));
        this.zzbtM = Executors.newSingleThreadExecutor();
        this.zzrJ = new Object();
        this.zzbgn = 0;
    }

    private void zzG(Intent intent) {
        if (intent != null) {
            WakefulBroadcastReceiver.completeWakefulIntent(intent);
        }
        synchronized (this.zzrJ) {
            this.zzbgn--;
            if (this.zzbgn == 0) {
                zzjA(this.zzbgm);
            }
        }
    }

    public final IBinder onBind(Intent intent) {
        return (intent == null || !"com.google.firebase.INSTANCE_ID_EVENT".equals(intent.getAction())) ? null : this.zzbhN.getBinder();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.zzrJ) {
            this.zzbgm = i2;
            this.zzbgn++;
        }
        Intent zzF = zzF(intent);
        if (zzF == null) {
            zzG(intent);
            return 2;
        } else if (zzH(zzF)) {
            zzG(intent);
            return 2;
        } else {
            this.zzbtM.execute(new C04482(this, zzF, intent));
            return 3;
        }
    }

    protected abstract Intent zzF(Intent intent);

    public boolean zzH(Intent intent) {
        return false;
    }

    boolean zzjA(int i) {
        return stopSelfResult(i);
    }

    public abstract void zzm(Intent intent);
}
