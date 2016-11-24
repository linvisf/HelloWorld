package com.linvisf.api;

import com.linvisf.data.GanData;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by linhong on 2016/11/22.
 * <p>
 * 描述：
 */

public interface Api {

    //http://gank.io/api/data/瞎推荐/10/page
    // all | Android | iOS | 休息视频 | 福利 | 拓展资源 | 前端 | 瞎推荐 | App
    @GET("/api/data/all/" + ApiService.DEFAULT_COUNT + "/{page}")
    Observable<GanData> getAllData(@Path("page") int page);

    @GET("/api/data/Android/" + ApiService.DEFAULT_COUNT + "/{page}")
    Observable<GanData> getAndroidData(@Path("page") int page);

    @GET("/api/data/iOS/" + ApiService.DEFAULT_COUNT + "/{page}")
    Observable<GanData> getIOSData(@Path("page") int page);

    @GET("/api/data/休息视频/" + ApiService.DEFAULT_COUNT + "/{page}")
    Observable<GanData> getVedioData(@Path("page") int page);

    @GET("/api/data/福利/" + ApiService.DEFAULT_COUNT + "/{page}")
    Observable<GanData> getFuliData(@Path("page") int page);

    @GET("/api/data/拓展资源/" + ApiService.DEFAULT_COUNT + "/{page}")
    Observable<GanData> getSourceData(@Path("page") int page);

    @GET("/api/data/前端/" + ApiService.DEFAULT_COUNT + "/{page}")
    Observable<GanData> getWebData(@Path("page") int page);

    @GET("/api/data/瞎推荐/" + ApiService.DEFAULT_COUNT + "/{page}")
    Observable<GanData> getRecommendData(@Path("page") int page);

    @GET("/api/data/App/" + ApiService.DEFAULT_COUNT + "/{page}")
    Observable<GanData> getAppData(@Path("page") int page);


}
