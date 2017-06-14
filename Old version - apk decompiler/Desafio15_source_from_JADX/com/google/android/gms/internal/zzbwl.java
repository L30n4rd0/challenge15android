package com.google.android.gms.internal;

import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;

public class zzbwl {
    private final byte[] zzcsH;
    private int zzcsI;
    private int zzcsJ;

    public zzbwl(byte[] bArr) {
        int i;
        this.zzcsH = new byte[AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY];
        for (i = 0; i < AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY; i++) {
            this.zzcsH[i] = (byte) i;
        }
        i = 0;
        for (int i2 = 0; i2 < AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY; i2++) {
            i = ((i + this.zzcsH[i2]) + bArr[i2 % bArr.length]) & MotionEventCompat.ACTION_MASK;
            byte b = this.zzcsH[i2];
            this.zzcsH[i2] = this.zzcsH[i];
            this.zzcsH[i] = b;
        }
        this.zzcsI = 0;
        this.zzcsJ = 0;
    }

    public void zzaa(byte[] bArr) {
        int i = this.zzcsI;
        int i2 = this.zzcsJ;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) & MotionEventCompat.ACTION_MASK;
            i2 = (i2 + this.zzcsH[i]) & MotionEventCompat.ACTION_MASK;
            byte b = this.zzcsH[i];
            this.zzcsH[i] = this.zzcsH[i2];
            this.zzcsH[i2] = b;
            bArr[i3] = (byte) (bArr[i3] ^ this.zzcsH[(this.zzcsH[i] + this.zzcsH[i2]) & MotionEventCompat.ACTION_MASK]);
        }
        this.zzcsI = i;
        this.zzcsJ = i2;
    }
}
