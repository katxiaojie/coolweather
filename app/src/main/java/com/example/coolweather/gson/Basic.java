package com.example.coolweather.gson;

import android.text.style.UpdateAppearance;

import com.google.gson.annotations.SerializedName;

public class Basic {
    @SerializedName("city")
    public String cityName;
    public String cid;
    public String location;
    public String parent_city;
    @SerializedName("id")
    public String weatherId;
    public String admin_area;
    public String cnty;
    public String lat;
    public String lon;
    public String tz;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
        public String utc;
    }

}
