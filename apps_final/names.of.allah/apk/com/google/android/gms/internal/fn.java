package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class fn
  implements SafeParcelable
{
  public static final fo CREATOR = new fo();
  public final int id;
  final int xJ;
  final Bundle xV;
  
  fn(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    xJ = paramInt1;
    id = paramInt2;
    xV = paramBundle;
  }
  
  public int describeContents()
  {
    fo localfo = CREATOR;
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    fo localfo = CREATOR;
    fo.a(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */