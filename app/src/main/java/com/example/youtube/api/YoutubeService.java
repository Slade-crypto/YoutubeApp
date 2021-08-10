package com.example.youtube.api;

import com.example.youtube.model.Resultado;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface YoutubeService {
/*
https://www.googleapis.com/youtube/v3/
search
?part=snippet
&order=date
&maxResults=20
&key=AIzaSyCMxY79sFccH_t87xs4z5Rrzj4lFH8F8Rs
&channelId=UCAjbAPiBK_LIHoh1OlrXrPg

https://www.googleapis.com/youtube/v3/search?part=snippet&order=date&maxResults=20&key=AIzaSyCMxY79sFccH_t87xs4z5Rrzj4lFH8F8Rs&channelId=UCAjbAPiBK_LIHoh1OlrXrPg
 */

    @GET("search")
    Call<Resultado> recuperarVideos(
            @Query("part") String part,
            @Query("order") String order,
            @Query("maxResults") String maxResults,
            @Query("key") String key,
            @Query("channelId") String channelId,
            @Query("q") String q
    );

}
