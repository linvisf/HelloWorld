package com.linvisf.api;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by linhong on 2016/11/22.
 * <p>
 * 描述：
 */

public class ApiService {

    public static final String BASE_URL = "http://gank.io";
    public static final int DEFAULT_COUNT = 10;
    public static final int DEFAULT_TIMEOUT = 10;

    private static ApiService mInstance;
    public Api mApi;

    public static ApiService getInstance() {
        if (mInstance == null) {
            synchronized (ApiService.class) {
                if (mInstance == null) {
                    mInstance = new ApiService();
                }
            }
        }
        return mInstance;
    }

    private OkHttpClient mClient = new OkHttpClient.Builder()
            .connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
            .writeTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
            .readTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
            .build();

    public Api getApiService() {
        mApi = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(mClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(Api.class);

        return mApi;
    }
}
