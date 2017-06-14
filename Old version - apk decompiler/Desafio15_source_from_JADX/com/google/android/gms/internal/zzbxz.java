package com.google.android.gms.internal;

import com.google.android.gms.common.ConnectionResult;
import com.leonardo.desafio15.BuildConfig;
import com.leonardo.desafio15.C0453R;
import java.io.IOException;

public interface zzbxz {

    public static final class zza extends zzbxn<zza> {
        private static volatile zza[] zzcvG;
        public String zzcvH;

        public zza() {
            zzafi();
        }

        public static zza[] zzafh() {
            if (zzcvG == null) {
                synchronized (zzbxr.zzcuI) {
                    if (zzcvG == null) {
                        zzcvG = new zza[0];
                    }
                }
            }
            return zzcvG;
        }

        public void zza(zzbxm com_google_android_gms_internal_zzbxm) throws IOException {
            if (!(this.zzcvH == null || this.zzcvH.equals(BuildConfig.FLAVOR))) {
                com_google_android_gms_internal_zzbxm.zzq(1, this.zzcvH);
            }
            super.zza(com_google_android_gms_internal_zzbxm);
        }

        public zza zzaV(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            while (true) {
                int zzaen = com_google_android_gms_internal_zzbxl.zzaen();
                switch (zzaen) {
                    case ConnectionResult.SUCCESS /*0*/:
                        break;
                    case ConnectionResult.DEVELOPER_ERROR /*10*/:
                        this.zzcvH = com_google_android_gms_internal_zzbxl.readString();
                        continue;
                    default:
                        if (!super.zza(com_google_android_gms_internal_zzbxl, zzaen)) {
                            break;
                        }
                        continue;
                }
                return this;
            }
        }

        public zza zzafi() {
            this.zzcvH = BuildConfig.FLAVOR;
            this.zzcuA = null;
            this.zzcuJ = -1;
            return this;
        }

        public /* synthetic */ zzbxt zzb(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            return zzaV(com_google_android_gms_internal_zzbxl);
        }

        protected int zzu() {
            int zzu = super.zzu();
            return (this.zzcvH == null || this.zzcvH.equals(BuildConfig.FLAVOR)) ? zzu : zzu + zzbxm.zzr(1, this.zzcvH);
        }
    }

    public static final class zzb extends zzbxn<zzb> {
        public String zzcvH;
        public String zzcvI;
        public long zzcvJ;
        public String zzcvK;
        public int zzcvL;
        public int zzcvM;
        public String zzcvN;
        public String zzcvO;
        public String zzcvP;
        public String zzcvQ;
        public String zzcvR;
        public int zzcvS;
        public zza[] zzcvT;

        public zzb() {
            zzafj();
        }

        public static zzb zzak(byte[] bArr) throws zzbxs {
            return (zzb) zzbxt.zza(new zzb(), bArr);
        }

        public void zza(zzbxm com_google_android_gms_internal_zzbxm) throws IOException {
            if (!(this.zzcvH == null || this.zzcvH.equals(BuildConfig.FLAVOR))) {
                com_google_android_gms_internal_zzbxm.zzq(1, this.zzcvH);
            }
            if (!(this.zzcvI == null || this.zzcvI.equals(BuildConfig.FLAVOR))) {
                com_google_android_gms_internal_zzbxm.zzq(2, this.zzcvI);
            }
            if (this.zzcvJ != 0) {
                com_google_android_gms_internal_zzbxm.zzb(3, this.zzcvJ);
            }
            if (!(this.zzcvK == null || this.zzcvK.equals(BuildConfig.FLAVOR))) {
                com_google_android_gms_internal_zzbxm.zzq(4, this.zzcvK);
            }
            if (this.zzcvL != 0) {
                com_google_android_gms_internal_zzbxm.zzJ(5, this.zzcvL);
            }
            if (this.zzcvM != 0) {
                com_google_android_gms_internal_zzbxm.zzJ(6, this.zzcvM);
            }
            if (!(this.zzcvN == null || this.zzcvN.equals(BuildConfig.FLAVOR))) {
                com_google_android_gms_internal_zzbxm.zzq(7, this.zzcvN);
            }
            if (!(this.zzcvO == null || this.zzcvO.equals(BuildConfig.FLAVOR))) {
                com_google_android_gms_internal_zzbxm.zzq(8, this.zzcvO);
            }
            if (!(this.zzcvP == null || this.zzcvP.equals(BuildConfig.FLAVOR))) {
                com_google_android_gms_internal_zzbxm.zzq(9, this.zzcvP);
            }
            if (!(this.zzcvQ == null || this.zzcvQ.equals(BuildConfig.FLAVOR))) {
                com_google_android_gms_internal_zzbxm.zzq(10, this.zzcvQ);
            }
            if (!(this.zzcvR == null || this.zzcvR.equals(BuildConfig.FLAVOR))) {
                com_google_android_gms_internal_zzbxm.zzq(11, this.zzcvR);
            }
            if (this.zzcvS != 0) {
                com_google_android_gms_internal_zzbxm.zzJ(12, this.zzcvS);
            }
            if (this.zzcvT != null && this.zzcvT.length > 0) {
                for (zzbxt com_google_android_gms_internal_zzbxt : this.zzcvT) {
                    if (com_google_android_gms_internal_zzbxt != null) {
                        com_google_android_gms_internal_zzbxm.zza(13, com_google_android_gms_internal_zzbxt);
                    }
                }
            }
            super.zza(com_google_android_gms_internal_zzbxm);
        }

        public zzb zzaW(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            while (true) {
                int zzaen = com_google_android_gms_internal_zzbxl.zzaen();
                switch (zzaen) {
                    case ConnectionResult.SUCCESS /*0*/:
                        break;
                    case ConnectionResult.DEVELOPER_ERROR /*10*/:
                        this.zzcvH = com_google_android_gms_internal_zzbxl.readString();
                        continue;
                    case ConnectionResult.SERVICE_UPDATING /*18*/:
                        this.zzcvI = com_google_android_gms_internal_zzbxl.readString();
                        continue;
                    case C0453R.styleable.Toolbar_navigationIcon /*24*/:
                        this.zzcvJ = com_google_android_gms_internal_zzbxl.zzaeq();
                        continue;
                    case C0453R.styleable.AppCompatTheme_actionModePasteDrawable /*34*/:
                        this.zzcvK = com_google_android_gms_internal_zzbxl.readString();
                        continue;
                    case C0453R.styleable.AppCompatTheme_textAppearanceLargePopupMenu /*40*/:
                        this.zzcvL = com_google_android_gms_internal_zzbxl.zzaer();
                        continue;
                    case C0453R.styleable.AppCompatTheme_spinnerDropDownItemStyle /*48*/:
                        this.zzcvM = com_google_android_gms_internal_zzbxl.zzaer();
                        continue;
                    case C0453R.styleable.AppCompatTheme_activityChooserViewStyle /*58*/:
                        this.zzcvN = com_google_android_gms_internal_zzbxl.readString();
                        continue;
                    case C0453R.styleable.AppCompatTheme_textAppearanceSearchResultTitle /*66*/:
                        this.zzcvO = com_google_android_gms_internal_zzbxl.readString();
                        continue;
                    case C0453R.styleable.AppCompatTheme_listPreferredItemPaddingRight /*74*/:
                        this.zzcvP = com_google_android_gms_internal_zzbxl.readString();
                        continue;
                    case C0453R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /*82*/:
                        this.zzcvQ = com_google_android_gms_internal_zzbxl.readString();
                        continue;
                    case C0453R.styleable.AppCompatTheme_colorSwitchThumbNormal /*90*/:
                        this.zzcvR = com_google_android_gms_internal_zzbxl.readString();
                        continue;
                    case C0453R.styleable.AppCompatTheme_alertDialogTheme /*96*/:
                        zzaen = com_google_android_gms_internal_zzbxl.zzaer();
                        switch (zzaen) {
                            case ConnectionResult.SUCCESS /*0*/:
                            case ConnectionResult.SERVICE_MISSING /*1*/:
                            case ConnectionResult.SERVICE_VERSION_UPDATE_REQUIRED /*2*/:
                                this.zzcvS = zzaen;
                                break;
                            default:
                                continue;
                        }
                    case C0453R.styleable.AppCompatTheme_editTextStyle /*106*/:
                        int zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, C0453R.styleable.AppCompatTheme_editTextStyle);
                        zzaen = this.zzcvT == null ? 0 : this.zzcvT.length;
                        Object obj = new zza[(zzb + zzaen)];
                        if (zzaen != 0) {
                            System.arraycopy(this.zzcvT, 0, obj, 0, zzaen);
                        }
                        while (zzaen < obj.length - 1) {
                            obj[zzaen] = new zza();
                            com_google_android_gms_internal_zzbxl.zza(obj[zzaen]);
                            com_google_android_gms_internal_zzbxl.zzaen();
                            zzaen++;
                        }
                        obj[zzaen] = new zza();
                        com_google_android_gms_internal_zzbxl.zza(obj[zzaen]);
                        this.zzcvT = obj;
                        continue;
                    default:
                        if (!super.zza(com_google_android_gms_internal_zzbxl, zzaen)) {
                            break;
                        }
                        continue;
                }
                return this;
            }
        }

        public zzb zzafj() {
            this.zzcvH = BuildConfig.FLAVOR;
            this.zzcvI = BuildConfig.FLAVOR;
            this.zzcvJ = 0;
            this.zzcvK = BuildConfig.FLAVOR;
            this.zzcvL = 0;
            this.zzcvM = 0;
            this.zzcvN = BuildConfig.FLAVOR;
            this.zzcvO = BuildConfig.FLAVOR;
            this.zzcvP = BuildConfig.FLAVOR;
            this.zzcvQ = BuildConfig.FLAVOR;
            this.zzcvR = BuildConfig.FLAVOR;
            this.zzcvS = 0;
            this.zzcvT = zza.zzafh();
            this.zzcuA = null;
            this.zzcuJ = -1;
            return this;
        }

        public /* synthetic */ zzbxt zzb(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            return zzaW(com_google_android_gms_internal_zzbxl);
        }

        protected int zzu() {
            int zzu = super.zzu();
            if (!(this.zzcvH == null || this.zzcvH.equals(BuildConfig.FLAVOR))) {
                zzu += zzbxm.zzr(1, this.zzcvH);
            }
            if (!(this.zzcvI == null || this.zzcvI.equals(BuildConfig.FLAVOR))) {
                zzu += zzbxm.zzr(2, this.zzcvI);
            }
            if (this.zzcvJ != 0) {
                zzu += zzbxm.zzf(3, this.zzcvJ);
            }
            if (!(this.zzcvK == null || this.zzcvK.equals(BuildConfig.FLAVOR))) {
                zzu += zzbxm.zzr(4, this.zzcvK);
            }
            if (this.zzcvL != 0) {
                zzu += zzbxm.zzL(5, this.zzcvL);
            }
            if (this.zzcvM != 0) {
                zzu += zzbxm.zzL(6, this.zzcvM);
            }
            if (!(this.zzcvN == null || this.zzcvN.equals(BuildConfig.FLAVOR))) {
                zzu += zzbxm.zzr(7, this.zzcvN);
            }
            if (!(this.zzcvO == null || this.zzcvO.equals(BuildConfig.FLAVOR))) {
                zzu += zzbxm.zzr(8, this.zzcvO);
            }
            if (!(this.zzcvP == null || this.zzcvP.equals(BuildConfig.FLAVOR))) {
                zzu += zzbxm.zzr(9, this.zzcvP);
            }
            if (!(this.zzcvQ == null || this.zzcvQ.equals(BuildConfig.FLAVOR))) {
                zzu += zzbxm.zzr(10, this.zzcvQ);
            }
            if (!(this.zzcvR == null || this.zzcvR.equals(BuildConfig.FLAVOR))) {
                zzu += zzbxm.zzr(11, this.zzcvR);
            }
            if (this.zzcvS != 0) {
                zzu += zzbxm.zzL(12, this.zzcvS);
            }
            if (this.zzcvT == null || this.zzcvT.length <= 0) {
                return zzu;
            }
            int i = zzu;
            for (zzbxt com_google_android_gms_internal_zzbxt : this.zzcvT) {
                if (com_google_android_gms_internal_zzbxt != null) {
                    i += zzbxm.zzc(13, com_google_android_gms_internal_zzbxt);
                }
            }
            return i;
        }
    }
}
