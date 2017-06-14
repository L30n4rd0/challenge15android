package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.internal.zzaqf;
import java.util.concurrent.Callable;

public class zzb {
    private static SharedPreferences zzaXu;

    /* renamed from: com.google.android.gms.flags.impl.zzb.1 */
    class C02221 implements Callable<SharedPreferences> {
        final /* synthetic */ Context zztf;

        C02221(Context context) {
            this.zztf = context;
        }

        public /* synthetic */ Object call() throws Exception {
            return zzDH();
        }

        public SharedPreferences zzDH() {
            return this.zztf.getSharedPreferences("google_sdk_flags", 1);
        }
    }

    static {
        zzaXu = null;
    }

    public static SharedPreferences zzn(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            if (zzaXu == null) {
                zzaXu = (SharedPreferences) zzaqf.zzb(new C02221(context));
            }
            sharedPreferences = zzaXu;
        }
        return sharedPreferences;
    }
}
