package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract.Events;
import android.text.TextUtils;
import com.google.android.gms.C0156R;
import com.google.android.gms.ads.internal.zzw;
import com.google.firebase.analytics.FirebaseAnalytics.Param;
import com.leonardo.desafio15.BuildConfig;
import java.util.Map;

@zzme
public class zzkq extends zzkw {
    private final Context mContext;
    private final Map<String, String> zzFP;
    private String zzLS;
    private long zzLT;
    private long zzLU;
    private String zzLV;
    private String zzLW;

    /* renamed from: com.google.android.gms.internal.zzkq.1 */
    class C03521 implements OnClickListener {
        final /* synthetic */ zzkq zzLX;

        C03521(zzkq com_google_android_gms_internal_zzkq) {
            this.zzLX = com_google_android_gms_internal_zzkq;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            zzw.zzcM().zzb(this.zzLX.mContext, this.zzLX.createIntent());
        }
    }

    /* renamed from: com.google.android.gms.internal.zzkq.2 */
    class C03532 implements OnClickListener {
        final /* synthetic */ zzkq zzLX;

        C03532(zzkq com_google_android_gms_internal_zzkq) {
            this.zzLX = com_google_android_gms_internal_zzkq;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.zzLX.zzaz("Operation denied by user.");
        }
    }

    public zzkq(zzqw com_google_android_gms_internal_zzqw, Map<String, String> map) {
        super(com_google_android_gms_internal_zzqw, "createCalendarEvent");
        this.zzFP = map;
        this.mContext = com_google_android_gms_internal_zzqw.zzlr();
        zzhj();
    }

    private String zzaw(String str) {
        return TextUtils.isEmpty((CharSequence) this.zzFP.get(str)) ? BuildConfig.FLAVOR : (String) this.zzFP.get(str);
    }

    private long zzax(String str) {
        String str2 = (String) this.zzFP.get(str);
        if (str2 == null) {
            return -1;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private void zzhj() {
        this.zzLS = zzaw("description");
        this.zzLV = zzaw("summary");
        this.zzLT = zzax("start_ticks");
        this.zzLU = zzax("end_ticks");
        this.zzLW = zzaw(Param.LOCATION);
    }

    @TargetApi(14)
    Intent createIntent() {
        Intent data = new Intent("android.intent.action.EDIT").setData(Events.CONTENT_URI);
        data.putExtra("title", this.zzLS);
        data.putExtra("eventLocation", this.zzLW);
        data.putExtra("description", this.zzLV);
        if (this.zzLT > -1) {
            data.putExtra("beginTime", this.zzLT);
        }
        if (this.zzLU > -1) {
            data.putExtra("endTime", this.zzLU);
        }
        data.setFlags(268435456);
        return data;
    }

    public void execute() {
        if (this.mContext == null) {
            zzaz("Activity context is not available.");
        } else if (zzw.zzcM().zzN(this.mContext).zzfp()) {
            Builder zzM = zzw.zzcM().zzM(this.mContext);
            Resources resources = zzw.zzcQ().getResources();
            zzM.setTitle(resources != null ? resources.getString(C0156R.string.create_calendar_title) : "Create calendar event");
            zzM.setMessage(resources != null ? resources.getString(C0156R.string.create_calendar_message) : "Allow Ad to create a calendar event?");
            zzM.setPositiveButton(resources != null ? resources.getString(C0156R.string.accept) : "Accept", new C03521(this));
            zzM.setNegativeButton(resources != null ? resources.getString(C0156R.string.decline) : "Decline", new C03532(this));
            zzM.create().show();
        } else {
            zzaz("This feature is not available on the device.");
        }
    }
}
