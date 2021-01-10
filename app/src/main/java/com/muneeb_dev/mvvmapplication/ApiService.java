package com.muneeb_dev.mvvmapplication;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    ///////////    Function that contain url of Api     /////////////////////

    @GET("posts")
    Call<List<User_DataList>>getUser();

}
