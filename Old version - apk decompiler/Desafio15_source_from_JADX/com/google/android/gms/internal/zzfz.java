package com.google.android.gms.internal;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.zzw;

@zzme
public abstract class zzfz<T> {
    private final int zzAW;
    private final String zzAX;
    private final T zzAY;

    /* renamed from: com.google.android.gms.internal.zzfz.1 */
    class C06021 extends zzfz<Boolean> {
        C06021(int i, String str, Boolean bool) {
            super(str, bool, null);
        }

        public /* synthetic */ Object zza(SharedPreferences sharedPreferences) {
            return zzb(sharedPreferences);
        }

        public Boolean zzb(SharedPreferences sharedPreferences) {
            return Boolean.valueOf(sharedPreferences.getBoolean(getKey(), ((Boolean) zzfr()).booleanValue()));
        }
    }

    /* renamed from: com.google.android.gms.internal.zzfz.2 */
    class C06032 extends zzfz<Integer> {
        C06032(int i, String str, Integer num) {
            super(str, num, null);
        }

        public /* synthetic */ Object zza(SharedPreferences sharedPreferences) {
            return zzc(sharedPreferences);
        }

        public Integer zzc(SharedPreferences sharedPreferences) {
            return Integer.valueOf(sharedPreferences.getInt(getKey(), ((Integer) zzfr()).intValue()));
        }
    }

    /* renamed from: com.google.android.gms.internal.zzfz.3 */
    class C06043 extends zzfz<Long> {
        C06043(int i, String str, Long l) {
            super(str, l, null);
        }

        public /* synthetic */ Object zza(SharedPreferences sharedPreferences) {
            return zzd(sharedPreferences);
        }

        public Long zzd(SharedPreferences sharedPreferences) {
            return Long.valueOf(sharedPreferences.getLong(getKey(), ((Long) zzfr()).longValue()));
        }
    }

    /* renamed from: com.google.android.gms.internal.zzfz.4 */
    class C06054 extends zzfz<Float> {
        C06054(int i, String str, Float f) {
            super(str, f, null);
        }

        public /* synthetic */ Object zza(SharedPreferences sharedPreferences) {
            return zze(sharedPreferences);
        }

        public Float zze(SharedPreferences sharedPreferences) {
            return Float.valueOf(sharedPreferences.getFloat(getKey(), ((Float) zzfr()).floatValue()));
        }
    }

    /* renamed from: com.google.android.gms.internal.zzfz.5 */
    class C06065 extends zzfz<String> {
        C06065(int i, String str, String str2) {
            super(str, str2, null);
        }

        public /* synthetic */ Object zza(SharedPreferences sharedPreferences) {
            return zzf(sharedPreferences);
        }

        public String zzf(SharedPreferences sharedPreferences) {
            return sharedPreferences.getString(getKey(), (String) zzfr());
        }
    }

    private zzfz(int i, String str, T t) {
        this.zzAW = i;
        this.zzAX = str;
        this.zzAY = t;
        zzw.zzcX().zza(this);
    }

    public static zzfz<String> zza(int i, String str) {
        zzfz<String> zza = zza(i, str, null);
        zzw.zzcX().zzb(zza);
        return zza;
    }

    public static zzfz<Float> zza(int i, String str, float f) {
        return new C06054(i, str, Float.valueOf(f));
    }

    public static zzfz<Integer> zza(int i, String str, int i2) {
        return new C06032(i, str, Integer.valueOf(i2));
    }

    public static zzfz<Long> zza(int i, String str, long j) {
        return new C06043(i, str, Long.valueOf(j));
    }

    public static zzfz<Boolean> zza(int i, String str, Boolean bool) {
        return new C06021(i, str, bool);
    }

    public static zzfz<String> zza(int i, String str, String str2) {
        return new C06065(i, str, str2);
    }

    public static zzfz<String> zzb(int i, String str) {
        zzfz<String> zza = zza(i, str, null);
        zzw.zzcX().zzc(zza);
        return zza;
    }

    public T get() {
        return zzw.zzcY().zzd(this);
    }

    public String getKey() {
        return this.zzAX;
    }

    protected abstract T zza(SharedPreferences sharedPreferences);

    public T zzfr() {
        return this.zzAY;
    }
}
