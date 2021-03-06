package com.inmobi.re.controller;

import android.content.Intent;
import android.graphics.Bitmap;
import com.inmobi.re.container.IMWebView;
import com.inmobi.re.controller.util.ImageProcessing;
import com.inmobi.re.controller.util.StartActivityForResultCallback;

class JSUtilityController$a
  implements StartActivityForResultCallback
{
  JSUtilityController$a(JSUtilityController paramJSUtilityController) {}
  
  public void onActivityResult(int paramInt, Intent paramIntent)
  {
    if (paramInt == -1)
    {
      paramIntent = ImageProcessing.getCompressedBitmap(ImageProcessing.convertMediaUriToPath(paramIntent.getData(), a.mContext), a.mContext);
      paramInt = paramIntent.getWidth();
      int i = paramIntent.getHeight();
      paramIntent = ImageProcessing.getBase64EncodedImage(paramIntent, a.mContext);
      a.imWebView.raiseGalleryImageSelectedEvent(paramIntent, paramInt, i);
      return;
    }
    a.imWebView.raiseError("User did not select a picture", "getGalleryImage");
  }
}

/* Location:
 * Qualified Name:     com.inmobi.re.controller.JSUtilityController.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */