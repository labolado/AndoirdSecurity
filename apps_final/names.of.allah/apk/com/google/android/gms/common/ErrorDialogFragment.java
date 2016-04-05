package com.google.android.gms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import com.google.android.gms.internal.hn;

public class ErrorDialogFragment
  extends DialogFragment
{
  private DialogInterface.OnCancelListener CR = null;
  private Dialog mDialog = null;
  
  public static ErrorDialogFragment newInstance(Dialog paramDialog)
  {
    return newInstance(paramDialog, null);
  }
  
  public static ErrorDialogFragment newInstance(Dialog paramDialog, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    ErrorDialogFragment localErrorDialogFragment = new ErrorDialogFragment();
    paramDialog = (Dialog)hn.b(paramDialog, "Cannot display null dialog");
    paramDialog.setOnCancelListener(null);
    paramDialog.setOnDismissListener(null);
    mDialog = paramDialog;
    if (paramOnCancelListener != null) {
      CR = paramOnCancelListener;
    }
    return localErrorDialogFragment;
  }
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    if (CR != null) {
      CR.onCancel(paramDialogInterface);
    }
  }
  
  public Dialog onCreateDialog(Bundle paramBundle)
  {
    if (mDialog == null) {
      setShowsDialog(false);
    }
    return mDialog;
  }
  
  public void show(FragmentManager paramFragmentManager, String paramString)
  {
    super.show(paramFragmentManager, paramString);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.ErrorDialogFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */