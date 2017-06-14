package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.util.Log;
import com.google.android.gms.internal.zzabf;

public abstract class zzi implements OnClickListener {

    /* renamed from: com.google.android.gms.common.internal.zzi.1 */
    class C05281 extends zzi {
        final /* synthetic */ Activity val$activity;
        final /* synthetic */ Intent val$intent;
        final /* synthetic */ int val$requestCode;

        C05281(Intent intent, Activity activity, int i) {
            this.val$intent = intent;
            this.val$activity = activity;
            this.val$requestCode = i;
        }

        public void zzxT() {
            if (this.val$intent != null) {
                this.val$activity.startActivityForResult(this.val$intent, this.val$requestCode);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.zzi.2 */
    class C05292 extends zzi {
        final /* synthetic */ Fragment val$fragment;
        final /* synthetic */ Intent val$intent;
        final /* synthetic */ int val$requestCode;

        C05292(Intent intent, Fragment fragment, int i) {
            this.val$intent = intent;
            this.val$fragment = fragment;
            this.val$requestCode = i;
        }

        public void zzxT() {
            if (this.val$intent != null) {
                this.val$fragment.startActivityForResult(this.val$intent, this.val$requestCode);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.zzi.3 */
    class C05303 extends zzi {
        final /* synthetic */ Intent val$intent;
        final /* synthetic */ int val$requestCode;
        final /* synthetic */ zzabf zzaFF;

        C05303(Intent intent, zzabf com_google_android_gms_internal_zzabf, int i) {
            this.val$intent = intent;
            this.zzaFF = com_google_android_gms_internal_zzabf;
            this.val$requestCode = i;
        }

        public void zzxT() {
            if (this.val$intent != null) {
                this.zzaFF.startActivityForResult(this.val$intent, this.val$requestCode);
            }
        }
    }

    public static zzi zza(Activity activity, Intent intent, int i) {
        return new C05281(intent, activity, i);
    }

    public static zzi zza(@NonNull Fragment fragment, Intent intent, int i) {
        return new C05292(intent, fragment, i);
    }

    public static zzi zza(@NonNull zzabf com_google_android_gms_internal_zzabf, Intent intent, int i) {
        return new C05303(intent, com_google_android_gms_internal_zzabf, i);
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            zzxT();
        } catch (Throwable e) {
            Log.e("DialogRedirect", "Failed to start resolution intent", e);
        } finally {
            dialogInterface.dismiss();
        }
    }

    protected abstract void zzxT();
}
