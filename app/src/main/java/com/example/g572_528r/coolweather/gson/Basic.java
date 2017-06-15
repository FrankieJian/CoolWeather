package com.example.g572_528r.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by g572-528r on 2017/6/12.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
