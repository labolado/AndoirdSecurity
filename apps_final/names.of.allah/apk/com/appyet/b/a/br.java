package com.appyet.b.a;

import android.sax.EndTextElementListener;
import com.appyet.data.FeedItem;

final class br
  implements EndTextElementListener
{
  br(ay paramay, FeedItem paramFeedItem) {}
  
  public final void end(String paramString)
  {
    try
    {
      String str = a.getDescription();
      if ((str == null) || (str.trim() == "") || (paramString.length() > str.length())) {
        a.setDescription(paramString);
      }
      return;
    }
    catch (Exception paramString) {}
  }
}

/* Location:
 * Qualified Name:     com.appyet.b.a.br
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */