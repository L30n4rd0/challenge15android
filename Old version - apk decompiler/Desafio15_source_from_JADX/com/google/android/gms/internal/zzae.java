package com.google.android.gms.internal;

import com.google.android.gms.common.ConnectionResult;
import com.leonardo.desafio15.C0453R;
import java.io.IOException;

public interface zzae {

    public static final class zza extends zzbxn<zza> {
        public zzb zzaK;
        public zzc zzaL;

        public zza() {
            this.zzcuJ = -1;
        }

        public static zza zzc(byte[] bArr) throws zzbxs {
            return (zza) zzbxt.zza(new zza(), bArr);
        }

        public zza zza(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            while (true) {
                int zzaen = com_google_android_gms_internal_zzbxl.zzaen();
                switch (zzaen) {
                    case ConnectionResult.SUCCESS /*0*/:
                        break;
                    case ConnectionResult.DEVELOPER_ERROR /*10*/:
                        if (this.zzaK == null) {
                            this.zzaK = new zzb();
                        }
                        com_google_android_gms_internal_zzbxl.zza(this.zzaK);
                        continue;
                    case ConnectionResult.SERVICE_UPDATING /*18*/:
                        if (this.zzaL == null) {
                            this.zzaL = new zzc();
                        }
                        com_google_android_gms_internal_zzbxl.zza(this.zzaL);
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

        public void zza(zzbxm com_google_android_gms_internal_zzbxm) throws IOException {
            if (this.zzaK != null) {
                com_google_android_gms_internal_zzbxm.zza(1, this.zzaK);
            }
            if (this.zzaL != null) {
                com_google_android_gms_internal_zzbxm.zza(2, this.zzaL);
            }
            super.zza(com_google_android_gms_internal_zzbxm);
        }

        public /* synthetic */ zzbxt zzb(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            return zza(com_google_android_gms_internal_zzbxl);
        }

        protected int zzu() {
            int zzu = super.zzu();
            if (this.zzaK != null) {
                zzu += zzbxm.zzc(1, this.zzaK);
            }
            return this.zzaL != null ? zzu + zzbxm.zzc(2, this.zzaL) : zzu;
        }
    }

    public static final class zzb extends zzbxn<zzb> {
        public Integer zzaM;

        public zzb() {
            this.zzaM = null;
            this.zzcuJ = -1;
        }

        public void zza(zzbxm com_google_android_gms_internal_zzbxm) throws IOException {
            if (this.zzaM != null) {
                com_google_android_gms_internal_zzbxm.zzJ(27, this.zzaM.intValue());
            }
            super.zza(com_google_android_gms_internal_zzbxm);
        }

        public /* synthetic */ zzbxt zzb(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            return zzc(com_google_android_gms_internal_zzbxl);
        }

        public zzb zzc(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            while (true) {
                int zzaen = com_google_android_gms_internal_zzbxl.zzaen();
                switch (zzaen) {
                    case ConnectionResult.SUCCESS /*0*/:
                        break;
                    case 216:
                        zzaen = com_google_android_gms_internal_zzbxl.zzaer();
                        switch (zzaen) {
                            case ConnectionResult.SUCCESS /*0*/:
                            case ConnectionResult.SERVICE_MISSING /*1*/:
                            case ConnectionResult.SERVICE_VERSION_UPDATE_REQUIRED /*2*/:
                            case ConnectionResult.SERVICE_DISABLED /*3*/:
                            case ConnectionResult.SIGN_IN_REQUIRED /*4*/:
                                this.zzaM = Integer.valueOf(zzaen);
                                break;
                            default:
                                continue;
                        }
                    default:
                        if (!super.zza(com_google_android_gms_internal_zzbxl, zzaen)) {
                            break;
                        }
                        continue;
                }
                return this;
            }
        }

        protected int zzu() {
            int zzu = super.zzu();
            return this.zzaM != null ? zzu + zzbxm.zzL(27, this.zzaM.intValue()) : zzu;
        }
    }

    public static final class zzc extends zzbxn<zzc> {
        public String zzaN;
        public String zzaO;
        public String zzaP;
        public String zzaQ;
        public String zzaR;

        public zzc() {
            this.zzaN = null;
            this.zzaO = null;
            this.zzaP = null;
            this.zzaQ = null;
            this.zzaR = null;
            this.zzcuJ = -1;
        }

        public void zza(zzbxm com_google_android_gms_internal_zzbxm) throws IOException {
            if (this.zzaN != null) {
                com_google_android_gms_internal_zzbxm.zzq(1, this.zzaN);
            }
            if (this.zzaO != null) {
                com_google_android_gms_internal_zzbxm.zzq(2, this.zzaO);
            }
            if (this.zzaP != null) {
                com_google_android_gms_internal_zzbxm.zzq(3, this.zzaP);
            }
            if (this.zzaQ != null) {
                com_google_android_gms_internal_zzbxm.zzq(4, this.zzaQ);
            }
            if (this.zzaR != null) {
                com_google_android_gms_internal_zzbxm.zzq(5, this.zzaR);
            }
            super.zza(com_google_android_gms_internal_zzbxm);
        }

        public /* synthetic */ zzbxt zzb(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            return zzd(com_google_android_gms_internal_zzbxl);
        }

        public zzc zzd(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            while (true) {
                int zzaen = com_google_android_gms_internal_zzbxl.zzaen();
                switch (zzaen) {
                    case ConnectionResult.SUCCESS /*0*/:
                        break;
                    case ConnectionResult.DEVELOPER_ERROR /*10*/:
                        this.zzaN = com_google_android_gms_internal_zzbxl.readString();
                        continue;
                    case ConnectionResult.SERVICE_UPDATING /*18*/:
                        this.zzaO = com_google_android_gms_internal_zzbxl.readString();
                        continue;
                    case C0453R.styleable.Toolbar_logoDescription /*26*/:
                        this.zzaP = com_google_android_gms_internal_zzbxl.readString();
                        continue;
                    case C0453R.styleable.AppCompatTheme_actionModePasteDrawable /*34*/:
                        this.zzaQ = com_google_android_gms_internal_zzbxl.readString();
                        continue;
                    case C0453R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /*42*/:
                        this.zzaR = com_google_android_gms_internal_zzbxl.readString();
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

        protected int zzu() {
            int zzu = super.zzu();
            if (this.zzaN != null) {
                zzu += zzbxm.zzr(1, this.zzaN);
            }
            if (this.zzaO != null) {
                zzu += zzbxm.zzr(2, this.zzaO);
            }
            if (this.zzaP != null) {
                zzu += zzbxm.zzr(3, this.zzaP);
            }
            if (this.zzaQ != null) {
                zzu += zzbxm.zzr(4, this.zzaQ);
            }
            return this.zzaR != null ? zzu + zzbxm.zzr(5, this.zzaR) : zzu;
        }
    }
}
