package com.j256.ormlite.android.apptools;

import android.app.Service;
import android.content.Context;
import com.j256.ormlite.support.ConnectionSource;

public abstract class OrmLiteBaseService<H extends OrmLiteSqliteOpenHelper>
  extends Service
{
  private volatile boolean created = false;
  private volatile boolean destroyed = false;
  private volatile H helper;
  
  public ConnectionSource getConnectionSource()
  {
    return getHelper().getConnectionSource();
  }
  
  public H getHelper()
  {
    if (helper == null)
    {
      if (!created) {
        throw new IllegalStateException("A call has not been made to onCreate() yet so the helper is null");
      }
      if (destroyed) {
        throw new IllegalStateException("A call to onDestroy has already been made and the helper cannot be used after that point");
      }
      throw new IllegalStateException("Helper is null for some unknown reason");
    }
    return helper;
  }
  
  protected H getHelperInternal(Context paramContext)
  {
    return OpenHelperManager.getHelper(paramContext);
  }
  
  public void onCreate()
  {
    if (helper == null)
    {
      helper = getHelperInternal(this);
      created = true;
    }
    super.onCreate();
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    releaseHelper(helper);
    destroyed = true;
  }
  
  protected void releaseHelper(H paramH)
  {
    OpenHelperManager.releaseHelper();
    helper = null;
  }
}

/* Location:
 * Qualified Name:     com.j256.ormlite.android.apptools.OrmLiteBaseService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */