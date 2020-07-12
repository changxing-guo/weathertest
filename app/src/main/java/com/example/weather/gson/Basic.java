package com.example.weather.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {

    /**
     * city表示城市名，id表示城市对应的天气，update中的loc表示天气的更新时间
     */

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public  String updateTime;
    }
}
