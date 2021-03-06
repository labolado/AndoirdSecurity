package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.multiplayer.Multiplayer;

public final class ht implements SafeParcelable {
    public static final hu CREATOR;
    public static final ht LH;
    public static final ht LI;
    public static final ht LJ;
    public static final ht LK;
    public static final ht LL;
    public static final ht LM;
    public static final ht LN;
    public static final ht LO;
    public static final ht LP;
    public static final ht LQ;
    public static final ht LR;
    public static final ht LS;
    public static final ht LT;
    public static final ht LU;
    public static final ht LV;
    public static final ht LW;
    public static final ht LX;
    public static final ht LY;
    public static final ht LZ;
    public static final ht MA;
    public static final ht MB;
    public static final ht MC;
    public static final ht MD;
    public static final ht ME;
    public static final ht MF;
    public static final ht MG;
    public static final ht MH;
    public static final ht MI;
    public static final ht MJ;
    public static final ht MK;
    public static final ht ML;
    public static final ht MM;
    public static final ht MN;
    public static final ht MO;
    public static final ht MP;
    public static final ht MQ;
    public static final ht MR;
    public static final ht MS;
    public static final ht MT;
    public static final ht MU;
    public static final ht MV;
    public static final ht MW;
    public static final ht MX;
    public static final ht MY;
    public static final ht MZ;
    public static final ht Ma;
    public static final ht Mb;
    public static final ht Mc;
    public static final ht Md;
    public static final ht Me;
    public static final ht Mf;
    public static final ht Mg;
    public static final ht Mh;
    public static final ht Mi;
    public static final ht Mj;
    public static final ht Mk;
    public static final ht Ml;
    public static final ht Mm;
    public static final ht Mn;
    public static final ht Mo;
    public static final ht Mp;
    public static final ht Mq;
    public static final ht Mr;
    public static final ht Ms;
    public static final ht Mt;
    public static final ht Mu;
    public static final ht Mv;
    public static final ht Mw;
    public static final ht Mx;
    public static final ht My;
    public static final ht Mz;
    public static final ht NA;
    public static final ht NB;
    public static final ht NC;
    public static final ht ND;
    public static final ht NE;
    public static final ht NF;
    public static final ht NG;
    public static final ht NH;
    public static final ht NI;
    public static final ht NJ;
    public static final ht NK;
    public static final ht NL;
    public static final ht NM;
    public static final ht NN;
    public static final ht NO;
    public static final ht NP;
    public static final ht NQ;
    public static final ht NR;
    public static final ht NS;
    public static final ht NT;
    public static final ht NU;
    public static final ht NV;
    public static final ht NW;
    public static final ht NX;
    public static final ht NY;
    public static final ht NZ;
    public static final ht Na;
    public static final ht Nb;
    public static final ht Nc;
    public static final ht Nd;
    public static final ht Ne;
    public static final ht Nf;
    public static final ht Ng;
    public static final ht Nh;
    public static final ht Ni;
    public static final ht Nj;
    public static final ht Nk;
    public static final ht Nl;
    public static final ht Nm;
    public static final ht Nn;
    public static final ht No;
    public static final ht Np;
    public static final ht Nq;
    public static final ht Nr;
    public static final ht Ns;
    public static final ht Nt;
    public static final ht Nu;
    public static final ht Nv;
    public static final ht Nw;
    public static final ht Nx;
    public static final ht Ny;
    public static final ht Nz;
    public static final ht Oa;
    public static final ht Ob;
    final String Oc;
    final int wj;

    static {
        LH = aI("accounting");
        LI = aI("airport");
        LJ = aI("amusement_park");
        LK = aI("aquarium");
        LL = aI("art_gallery");
        LM = aI("atm");
        LN = aI("bakery");
        LO = aI("bank");
        LP = aI("bar");
        LQ = aI("beauty_salon");
        LR = aI("bicycle_store");
        LS = aI("book_store");
        LT = aI("bowling_alley");
        LU = aI("bus_station");
        LV = aI("cafe");
        LW = aI("campground");
        LX = aI("car_dealer");
        LY = aI("car_rental");
        LZ = aI("car_repair");
        Ma = aI("car_wash");
        Mb = aI("casino");
        Mc = aI("cemetary");
        Md = aI("church");
        Me = aI("city_hall");
        Mf = aI("clothing_store");
        Mg = aI("convenience_store");
        Mh = aI("courthouse");
        Mi = aI("dentist");
        Mj = aI("department_store");
        Mk = aI("doctor");
        Ml = aI("electrician");
        Mm = aI("electronics_store");
        Mn = aI("embassy");
        Mo = aI("establishment");
        Mp = aI("finance");
        Mq = aI("fire_station");
        Mr = aI("florist");
        Ms = aI("food");
        Mt = aI("funeral_home");
        Mu = aI("furniture_store");
        Mv = aI("gas_station");
        Mw = aI("general_contractor");
        Mx = aI("grocery_or_supermarket");
        My = aI("gym");
        Mz = aI("hair_care");
        MA = aI("hardware_store");
        MB = aI("health");
        MC = aI("hindu_temple");
        MD = aI("home_goods_store");
        ME = aI("hospital");
        MF = aI("insurance_agency");
        MG = aI("jewelry_store");
        MH = aI("laundry");
        MI = aI("lawyer");
        MJ = aI("library");
        MK = aI("liquor_store");
        ML = aI("local_government_office");
        MM = aI("locksmith");
        MN = aI("lodging");
        MO = aI("meal_delivery");
        MP = aI("meal_takeaway");
        MQ = aI("mosque");
        MR = aI("movie_rental");
        MS = aI("movie_theater");
        MT = aI("moving_company");
        MU = aI("museum");
        MV = aI("night_club");
        MW = aI("painter");
        MX = aI("park");
        MY = aI("parking");
        MZ = aI("pet_store");
        Na = aI("pharmacy");
        Nb = aI("physiotherapist");
        Nc = aI("place_of_worship");
        Nd = aI("plumber");
        Ne = aI("police");
        Nf = aI("post_office");
        Ng = aI("real_estate_agency");
        Nh = aI("restaurant");
        Ni = aI("roofing_contractor");
        Nj = aI("rv_park");
        Nk = aI("school");
        Nl = aI("shoe_store");
        Nm = aI("shopping_mall");
        Nn = aI("spa");
        No = aI("stadium");
        Np = aI("storage");
        Nq = aI("store");
        Nr = aI("subway_station");
        Ns = aI("synagogue");
        Nt = aI("taxi_stand");
        Nu = aI("train_station");
        Nv = aI("travel_agency");
        Nw = aI("university");
        Nx = aI("veterinary_care");
        Ny = aI("zoo");
        Nz = aI("administrative_area_level_1");
        NA = aI("administrative_area_level_2");
        NB = aI("administrative_area_level_3");
        NC = aI("colloquial_area");
        ND = aI("country");
        NE = aI("floor");
        NF = aI("geocode");
        NG = aI("intersection");
        NH = aI("locality");
        NI = aI("natural_feature");
        NJ = aI("neighborhood");
        NK = aI("political");
        NL = aI("point_of_interest");
        NM = aI("post_box");
        NN = aI("postal_code");
        NO = aI("postal_code_prefix");
        NP = aI("postal_town");
        NQ = aI("premise");
        NR = aI(Multiplayer.EXTRA_ROOM);
        NS = aI("route");
        NT = aI("street_address");
        NU = aI("sublocality");
        NV = aI("sublocality_level_1");
        NW = aI("sublocality_level_2");
        NX = aI("sublocality_level_3");
        NY = aI("sublocality_level_4");
        NZ = aI("sublocality_level_5");
        Oa = aI("subpremise");
        Ob = aI("transit_station");
        CREATOR = new hu();
    }

    ht(int i, String str) {
        er.aj(str);
        this.wj = i;
        this.Oc = str;
    }

    public static ht aI(String str) {
        return new ht(0, str);
    }

    public int describeContents() {
        hu huVar = CREATOR;
        return 0;
    }

    public boolean equals(Object obj) {
        return obj instanceof ht && this.Oc.equals(((ht) obj).Oc);
    }

    public int hashCode() {
        return this.Oc.hashCode();
    }

    public String toString() {
        return this.Oc;
    }

    public void writeToParcel(Parcel parcel, int i) {
        hu huVar = CREATOR;
        hu.a(this, parcel, i);
    }
}