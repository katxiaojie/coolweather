package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Now {
    @SerializedName("tmp")
    public String temperature;
    public String cloud;
    public String cond_code;
    public String cond_txt;
    public String fl;
    public String hum;
    public String pcpn;
    public String pres;
    public String vis;
    public String wind_deg;
    public String wind_dir;
    public String wind_sc;
    public String wind_spd;
    public Cond cond;
    public class Cond{
        public String txt;
        public String code;
    }
}
