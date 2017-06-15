package com.example.g572_528r.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by g572-528r on 2017/6/6.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
