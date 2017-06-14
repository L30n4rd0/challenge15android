package com.google.android.gms.internal;

public abstract class zzaca<T> {
    private static String READ_PERMISSION;
    private static zza zzaDC;
    private static int zzaDD;
    private static final Object zztX;
    protected final String zzAX;
    protected final T zzAY;
    private T zzaDE;

    private interface zza {
    }

    /* renamed from: com.google.android.gms.internal.zzaca.1 */
    class C05601 extends zzaca<Boolean> {
        C05601(String str, Boolean bool) {
            super(str, bool);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzaca.2 */
    class C05612 extends zzaca<Long> {
        C05612(String str, Long l) {
            super(str, l);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzaca.3 */
    class C05623 extends zzaca<Integer> {
        C05623(String str, Integer num) {
            super(str, num);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzaca.4 */
    class C05634 extends zzaca<Float> {
        C05634(String str, Float f) {
            super(str, f);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzaca.5 */
    class C05645 extends zzaca<String> {
        C05645(String str, String str2) {
            super(str, str2);
        }
    }

    static {
        zztX = new Object();
        zzaDC = null;
        zzaDD = 0;
        READ_PERMISSION = "com.google.android.providers.gsf.permission.READ_GSERVICES";
    }

    protected zzaca(String str, T t) {
        this.zzaDE = null;
        this.zzAX = str;
        this.zzAY = t;
    }

    public static zzaca<String> zzB(String str, String str2) {
        return new C05645(str, str2);
    }

    public static zzaca<Float> zza(String str, Float f) {
        return new C05634(str, f);
    }

    public static zzaca<Integer> zza(String str, Integer num) {
        return new C05623(str, num);
    }

    public static zzaca<Long> zza(String str, Long l) {
        return new C05612(str, l);
    }

    public static zzaca<Boolean> zzj(String str, boolean z) {
        return new C05601(str, Boolean.valueOf(z));
    }
}
