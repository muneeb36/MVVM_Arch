package com.muneeb_dev.mvvmapplication.Retrofit;


import com.muneeb_dev.mvvmapplication.Models.User_DataList;
import com.muneeb_dev.mvvmapplication.Models.User_List_Login;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiService {

    ///////////    Function that contain url of Api     /////////////////////

    @GET("posts")
    Call<List<User_DataList>>getUser();

    @FormUrlEncoded
    @POST("api/consumer/signIn")
    Call<User_List_Login> Consumer_Login(@Field("email") String email, @Field("password") String password, @Field("device_id") String device_id);



}
