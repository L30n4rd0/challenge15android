package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface zznv extends IInterface {

    public static abstract class zza extends Binder implements zznv {

        private static class zza implements zznv {
            private IBinder zzrk;

            zza(IBinder iBinder) {
                this.zzrk = iBinder;
            }

            public IBinder asBinder() {
                return this.zzrk;
            }

            public IBinder zza(IObjectWrapper iObjectWrapper, zzka com_google_android_gms_internal_zzka, int i) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
                    obtain.writeStrongBinder(iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
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
        }

        public static zznv zzai(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof zznv)) ? new zza(iBinder) : (zznv) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case ConnectionResult.SERVICE_MISSING /*1*/:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
                    IBinder zza = zza(com.google.android.gms.dynamic.IObjectWrapper.zza.zzcd(parcel.readStrongBinder()), com.google.android.gms.internal.zzka.zza.zzM(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(zza);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    IBinder zza(IObjectWrapper iObjectWrapper, zzka com_google_android_gms_internal_zzka, int i) throws RemoteException;
}
