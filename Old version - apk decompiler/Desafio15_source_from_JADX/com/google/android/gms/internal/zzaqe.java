package com.google.android.gms.internal;

public final class zzaqe {
    private static zzaqe zzaXl;
    private final zzaqb zzaXm;
    private final zzaqc zzaXn;

    static {
        zza(new zzaqe());
    }

    private zzaqe() {
        this.zzaXm = new zzaqb();
        this.zzaXn = new zzaqc();
    }

    private static zzaqe zzDC() {
        zzaqe com_google_android_gms_internal_zzaqe;
        synchronized (zzaqe.class) {
            com_google_android_gms_internal_zzaqe = zzaXl;
        }
        return com_google_android_gms_internal_zzaqe;
    }

    public static zzaqb zzDD() {
        return zzDC().zzaXm;
    }

    public static zzaqc zzDE() {
        return zzDC().zzaXn;
    }

    protected static void zza(zzaqe com_google_android_gms_internal_zzaqe) {
        synchronized (zzaqe.class) {
            zzaXl = com_google_android_gms_internal_zzaqe;
        }
    }
}
