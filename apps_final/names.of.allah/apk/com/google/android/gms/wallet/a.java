package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class a
  implements Parcelable.Creator<Address>
{
  static void a(Address paramAddress, Parcel paramParcel, int paramInt)
  {
    paramInt = b.C(paramParcel);
    b.c(paramParcel, 1, paramAddress.getVersionCode());
    b.a(paramParcel, 2, name, false);
    b.a(paramParcel, 3, UE, false);
    b.a(paramParcel, 4, UF, false);
    b.a(paramParcel, 5, UG, false);
    b.a(paramParcel, 6, rc, false);
    b.a(paramParcel, 7, aiF, false);
    b.a(paramParcel, 8, aiG, false);
    b.a(paramParcel, 9, UL, false);
    b.a(paramParcel, 10, UN, false);
    b.a(paramParcel, 11, UO);
    b.a(paramParcel, 12, UP, false);
    b.G(paramParcel, paramInt);
  }
  
  public Address bQ(Parcel paramParcel)
  {
    int j = com.google.android.gms.common.internal.safeparcel.a.B(paramParcel);
    int i = 0;
    String str10 = null;
    String str9 = null;
    String str8 = null;
    String str7 = null;
    String str6 = null;
    String str5 = null;
    String str4 = null;
    String str3 = null;
    String str2 = null;
    boolean bool = false;
    String str1 = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = com.google.android.gms.common.internal.safeparcel.a.A(paramParcel);
      switch (com.google.android.gms.common.internal.safeparcel.a.ar(k))
      {
      default: 
        com.google.android.gms.common.internal.safeparcel.a.b(paramParcel, k);
        break;
      case 1: 
        i = com.google.android.gms.common.internal.safeparcel.a.g(paramParcel, k);
        break;
      case 2: 
        str10 = com.google.android.gms.common.internal.safeparcel.a.o(paramParcel, k);
        break;
      case 3: 
        str9 = com.google.android.gms.common.internal.safeparcel.a.o(paramParcel, k);
        break;
      case 4: 
        str8 = com.google.android.gms.common.internal.safeparcel.a.o(paramParcel, k);
        break;
      case 5: 
        str7 = com.google.android.gms.common.internal.safeparcel.a.o(paramParcel, k);
        break;
      case 6: 
        str6 = com.google.android.gms.common.internal.safeparcel.a.o(paramParcel, k);
        break;
      case 7: 
        str5 = com.google.android.gms.common.internal.safeparcel.a.o(paramParcel, k);
        break;
      case 8: 
        str4 = com.google.android.gms.common.internal.safeparcel.a.o(paramParcel, k);
        break;
      case 9: 
        str3 = com.google.android.gms.common.internal.safeparcel.a.o(paramParcel, k);
        break;
      case 10: 
        str2 = com.google.android.gms.common.internal.safeparcel.a.o(paramParcel, k);
        break;
      case 11: 
        bool = com.google.android.gms.common.internal.safeparcel.a.c(paramParcel, k);
        break;
      case 12: 
        str1 = com.google.android.gms.common.internal.safeparcel.a.o(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    }
    return new Address(i, str10, str9, str8, str7, str6, str5, str4, str3, str2, bool, str1);
  }
  
  public Address[] dw(int paramInt)
  {
    return new Address[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */