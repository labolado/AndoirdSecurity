package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.cast.Cast;
import com.zeptolab.ctr.billing.google.utils.IabHelper;
import com.zeptolab.ctr.scorer.GoogleScorer;
import java.net.HttpURLConnection;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class cv {
    private static final Object op;
    private static boolean pO;
    private static String pP;
    private static boolean pQ;

    final class AnonymousClass_1 implements Runnable {
        final /* synthetic */ Context os;

        AnonymousClass_1(Context context) {
            this.os = context;
        }

        public void run() {
            synchronized (op) {
                pP = cv.j(this.os);
                op.notifyAll();
            }
        }
    }

    private static final class a extends BroadcastReceiver {
        private a() {
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                pO = true;
            } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                pO = false;
            }
        }
    }

    static {
        op = new Object();
        pO = true;
        pQ = false;
    }

    public static String a(Readable readable) {
        StringBuilder stringBuilder = new StringBuilder();
        CharSequence allocate = CharBuffer.allocate(AccessibilityNodeInfoCompat.ACTION_PREVIOUS_HTML_ELEMENT);
        while (true) {
            int read = readable.read(allocate);
            if (read == -1) {
                return stringBuilder.toString();
            }
            allocate.flip();
            stringBuilder.append(allocate, 0, read);
        }
    }

    private static JSONArray a(Collection collection) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            a(jSONArray, it.next());
        }
        return jSONArray;
    }

    static JSONArray a(Object[] objArr) {
        JSONArray jSONArray = new JSONArray();
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            a(jSONArray, objArr[i]);
            i++;
        }
        return jSONArray;
    }

    private static JSONObject a(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        Iterator it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            a(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public static void a(Context context, String str, WebSettings webSettings) {
        webSettings.setUserAgentString(b(context, str));
    }

    public static void a(Context context, String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            new cy(context, str, (String) it.next()).start();
        }
    }

    public static void a(Context context, String str, boolean z, HttpURLConnection httpURLConnection) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(z);
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setRequestProperty("User-Agent", b(context, str));
        httpURLConnection.setUseCaches(false);
    }

    public static void a(WebView webView) {
        if (VERSION.SDK_INT >= 11) {
            cw.a(webView);
        }
    }

    private static void a(JSONArray jSONArray, Object obj) {
        if (obj instanceof Bundle) {
            jSONArray.put(a((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONArray.put(m((Map) obj));
        } else if (obj instanceof Collection) {
            jSONArray.put(a((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONArray.put(a((Object[]) obj));
        } else {
            jSONArray.put(obj);
        }
    }

    private static void a(JSONObject jSONObject, String str, Object obj) {
        if (obj instanceof Bundle) {
            jSONObject.put(str, a((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONObject.put(str, m((Map) obj));
        } else if (obj instanceof Collection) {
            if (str == null) {
                str = "null";
            }
            jSONObject.put(str, a((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONObject.put(str, a(Arrays.asList((Object[]) obj)));
        } else {
            jSONObject.put(str, obj);
        }
    }

    public static boolean a(PackageManager packageManager, String str, String str2) {
        return packageManager.checkPermission(str2, str) == 0;
    }

    public static boolean a(ClassLoader classLoader, Class cls, String str) {
        try {
            return cls.isAssignableFrom(Class.forName(str, false, classLoader));
        } catch (Throwable th) {
            return false;
        }
    }

    public static boolean aS() {
        return pO;
    }

    public static int aT() {
        return VERSION.SDK_INT >= 9 ? IabHelper.BILLING_RESPONSE_RESULT_ERROR : 0;
    }

    public static int aU() {
        return VERSION.SDK_INT >= 9 ? GoogleScorer.CLIENT_ALL : 1;
    }

    private static String b(Context context, String str) {
        String str2;
        synchronized (op) {
            if (pP != null) {
                str2 = pP;
            } else {
                if (VERSION.SDK_INT >= 17) {
                    pP = cx.getDefaultUserAgent(context);
                } else if (cz.aX()) {
                    pP = j(context);
                } else {
                    cz.pT.post(new AnonymousClass_1(context));
                    while (pP == null) {
                        try {
                            op.wait();
                        } catch (InterruptedException e) {
                            str2 = pP;
                        }
                    }
                }
                pP += " (Mobile; " + str + ")";
                str2 = pP;
            }
        }
        return str2;
    }

    public static void b(WebView webView) {
        if (VERSION.SDK_INT >= 11) {
            cw.b(webView);
        }
    }

    public static boolean h(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, AdActivity.CLASS_NAME);
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, Cast.MAX_MESSAGE_LENGTH);
        if (resolveActivity == null || resolveActivity.activityInfo == null) {
            da.w("Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.");
            return false;
        } else {
            boolean z;
            String str = "com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".";
            if ((resolveActivity.activityInfo.configChanges & 16) == 0) {
                da.w(String.format(str, new Object[]{"keyboard"}));
                z = false;
            } else {
                z = true;
            }
            if ((resolveActivity.activityInfo.configChanges & 32) == 0) {
                da.w(String.format(str, new Object[]{"keyboardHidden"}));
                z = false;
            }
            if ((resolveActivity.activityInfo.configChanges & 128) == 0) {
                da.w(String.format(str, new Object[]{"orientation"}));
                z = false;
            }
            if ((resolveActivity.activityInfo.configChanges & 256) == 0) {
                da.w(String.format(str, new Object[]{"screenLayout"}));
                z = false;
            }
            if ((resolveActivity.activityInfo.configChanges & 512) == 0) {
                da.w(String.format(str, new Object[]{"uiMode"}));
                z = false;
            }
            if ((resolveActivity.activityInfo.configChanges & 1024) == 0) {
                da.w(String.format(str, new Object[]{"screenSize"}));
                z = false;
            }
            if ((resolveActivity.activityInfo.configChanges & 2048) != 0) {
                return z;
            }
            da.w(String.format(str, new Object[]{"smallestScreenSize"}));
            return false;
        }
    }

    public static void i(Context context) {
        if (!pQ) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            context.getApplicationContext().registerReceiver(new a(), intentFilter);
            pQ = true;
        }
    }

    private static String j(Context context) {
        return new WebView(context).getSettings().getUserAgentString();
    }

    public static JSONObject m(Map map) {
        try {
            JSONObject jSONObject = new JSONObject();
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                a(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e) {
            throw new JSONException("Could not convert map to JSON: " + e.getMessage());
        }
    }

    public static String p(String str) {
        return Uri.parse(str).buildUpon().query(null).build().toString();
    }
}