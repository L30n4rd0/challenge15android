package com.google.android.gms.internal;

import java.io.IOException;

public final class zzbxw {
    static final int zzcuK;
    static final int zzcuL;
    static final int zzcuM;
    static final int zzcuN;
    public static final int[] zzcuO;
    public static final long[] zzcuP;
    public static final float[] zzcuQ;
    public static final double[] zzcuR;
    public static final boolean[] zzcuS;
    public static final String[] zzcuT;
    public static final byte[][] zzcuU;
    public static final byte[] zzcuV;

    static {
        zzcuK = zzO(1, 3);
        zzcuL = zzO(1, 4);
        zzcuM = zzO(2, 0);
        zzcuN = zzO(3, 2);
        zzcuO = new int[0];
        zzcuP = new long[0];
        zzcuQ = new float[0];
        zzcuR = new double[0];
        zzcuS = new boolean[0];
        zzcuT = new String[0];
        zzcuU = new byte[0][];
        zzcuV = new byte[0];
    }

    public static int zzO(int i, int i2) {
        return (i << 3) | i2;
    }

    public static final int zzb(zzbxl com_google_android_gms_internal_zzbxl, int i) throws IOException {
        int i2 = 1;
        int position = com_google_android_gms_internal_zzbxl.getPosition();
        com_google_android_gms_internal_zzbxl.zzqX(i);
        while (com_google_android_gms_internal_zzbxl.zzaen() == i) {
            com_google_android_gms_internal_zzbxl.zzqX(i);
            i2++;
        }
        com_google_android_gms_internal_zzbxl.zzrb(position);
        return i2;
    }

    static int zzrq(int i) {
        return i & 7;
    }

    public static int zzrr(int i) {
        return i >>> 3;
    }
}
