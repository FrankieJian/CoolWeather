package com.example.g572_528r.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by g572-528r on 2017/6/12.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
