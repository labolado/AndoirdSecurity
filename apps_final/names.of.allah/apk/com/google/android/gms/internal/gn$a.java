package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.ApplicationMetadata;

public abstract class gn$a
  extends Binder
  implements gn
{
  public gn$a()
  {
    attachInterface(this, "com.google.android.gms.cast.internal.ICastDeviceControllerListener");
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool2 = false;
    boolean bool1 = false;
    String str2 = null;
    Object localObject = null;
    String str1 = null;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      T(paramParcel1.readInt());
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      paramParcel2 = str1;
      if (paramParcel1.readInt() != 0) {
        paramParcel2 = (ApplicationMetadata)ApplicationMetadata.CREATOR.createFromParcel(paramParcel1);
      }
      str1 = paramParcel1.readString();
      str2 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {
        bool1 = true;
      }
      a(paramParcel2, str1, str2, bool1);
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      U(paramParcel1.readInt());
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      paramParcel2 = paramParcel1.readString();
      double d = paramParcel1.readDouble();
      bool1 = bool2;
      if (paramParcel1.readInt() != 0) {
        bool1 = true;
      }
      a(paramParcel2, d, bool1);
      return true;
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      g(paramParcel1.readString(), paramParcel1.readString());
      return true;
    case 6: 
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      b(paramParcel1.readString(), paramParcel1.createByteArray());
      return true;
    case 7: 
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      W(paramParcel1.readInt());
      return true;
    case 8: 
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      V(paramParcel1.readInt());
      return true;
    case 9: 
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      onApplicationDisconnected(paramParcel1.readInt());
      return true;
    case 10: 
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      a(paramParcel1.readString(), paramParcel1.readLong(), paramParcel1.readInt());
      return true;
    case 11: 
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      a(paramParcel1.readString(), paramParcel1.readLong());
      return true;
    case 12: 
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      paramParcel2 = str2;
      if (paramParcel1.readInt() != 0) {
        paramParcel2 = (gf)gf.CREATOR.createFromParcel(paramParcel1);
      }
      b(paramParcel2);
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
    paramParcel2 = (Parcel)localObject;
    if (paramParcel1.readInt() != 0) {
      paramParcel2 = (gk)gk.CREATOR.createFromParcel(paramParcel1);
    }
    b(paramParcel2);
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.gn.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */