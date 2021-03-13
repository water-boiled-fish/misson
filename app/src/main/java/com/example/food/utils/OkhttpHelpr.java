package com.example.food.utils;



import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class OkhttpHelpr {
    public static void getRequest(String url, Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();
        client.newCall(request).enqueue(callback);

    }

}