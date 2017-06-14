package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface zzeu extends IInterface {

    public static abstract class zza extends Binder implements zzeu {

        private static class zza implements zzeu {
            private IBinder zzrk;

            zza(IBinder iBinder) {
                this.zzrk = iBinder;
            }

            public IBinder asBinder() {
                return this.zzrk;
            }

            public IBinder zza(IObjectWrapper iObjectWrapper, zzeg com_google_android_gms_internal_zzeg, String str, zzka com_google_android_gms_internal_zzka, int i) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    obtain.writeStrongBinder(iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
                    if (com_google_android_gms_internal_zzeg != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_internal_zzeg.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (com_google_android_gms_internal_zzka != null) {
                        iBinder = com_google_android_gms_internal_zzka.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    this.zzrk.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    iBinder = obtain2.readStrongBinder();
                    return iBinder;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder zza(IObjectWrapper iObjectWrapper, zzeg com_google_android_gms_internal_zzeg, String str, zzka com_google_android_gms_internal_zzka, int i, int i2) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    obtain.writeStrongBinder(iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
                    if (com_google_android_gms_internal_zzeg != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_internal_zzeg.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (com_google_android_gms_internal_zzka != null) {
                        iBinder = com_google_android_gms_internal_zzka.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.zzrk.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    iBinder = obtain2.readStrongBinder();
                    return iBinder;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static zzeu zzr(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof zzeu)) ? new zza(iBinder) : (zzeu) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            zzeg com_google_android_gms_internal_zzeg = null;
            IObjectWrapper zzcd;
            IBinder zza;
            switch (i) {
                case ConnectionResult.SERVICE_MISSING /*1*/:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    zzcd = com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        com_google_android_gms_internal_zzeg = (zzeg) zzeg.CREATOR.createFromParcel(parcel);
                    }
                    zza = zza(zzcd, com_google_android_gms_internal_zzeg, parcel.readString(), com.google.android.gms.internal.zzka.zza.zzM(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(zza);
                    return true;
                case ConnectionResult.SERVICE_VERSION_UPDATE_REQUIRED /*2*/:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    zzcd = com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        com_google_android_gms_internal_zzeg = (zzeg) zzeg.CREATOR.createFromParcel(parcel);
                    }
                    zza = zza(zzcd, com_google_android_gms_internal_zzeg, parcel.readString(), com.google.android.gms.internal.zzka.zza.zzM(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(zza);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    IBinder zza(IObjectWrapper iObjectWrapper, zzeg com_google_android_gms_internal_zzeg, String str, zzka com_google_android_gms_internal_zzka, int i) throws RemoteException;

    IBinder zza(IObjectWrapper iObjectWrapper, zzeg com_google_android_gms_internal_zzeg, String str, zzka com_google_android_gms_internal_zzka, int i, int i2) throws RemoteException;
}
