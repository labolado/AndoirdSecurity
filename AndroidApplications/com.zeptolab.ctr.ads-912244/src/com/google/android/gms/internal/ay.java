package com.google.android.gms.internal;

import com.zeptolab.ctr.scorer.GoogleScorer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class ay {
    public final List mr;
    public final long ms;
    public final List mt;
    public final List mu;
    public final List mv;
    public final String mw;
    public final long mx;
    public int my;
    public int mz;

    public ay(String str) {
        JSONObject jSONObject = new JSONObject(str);
        if (da.n(GoogleScorer.CLIENT_PLUS)) {
            da.v("Mediation Response JSON: " + jSONObject.toString(GoogleScorer.CLIENT_PLUS));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        List arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        int i2 = 0;
        while (i2 < jSONArray.length()) {
            ax axVar = new ax(jSONArray.getJSONObject(i2));
            arrayList.add(axVar);
            if (i < 0 && a(axVar)) {
                i = i2;
            }
            i2++;
        }
        this.my = i;
        this.mz = jSONArray.length();
        this.mr = Collections.unmodifiableList(arrayList);
        this.mw = jSONObject.getString("qdata");
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            this.ms = optJSONObject.optLong("ad_network_timeout_millis", -1);
            this.mt = bd.a(optJSONObject, "click_urls");
            this.mu = bd.a(optJSONObject, "imp_urls");
            this.mv = bd.a(optJSONObject, "nofill_urls");
            long optLong = optJSONObject.optLong("refresh", -1);
            this.mx = optLong > 0 ? optLong * 1000 : -1;
        } else {
            this.ms = -1;
            this.mt = null;
            this.mu = null;
            this.mv = null;
            this.mx = -1;
        }
    }

    private boolean a(ax axVar) {
        Iterator it = axVar.mn.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                return true;
            }
        }
        return false;
    }
}