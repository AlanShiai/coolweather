package com.example.ashi.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ashi on 6/30/18.
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
