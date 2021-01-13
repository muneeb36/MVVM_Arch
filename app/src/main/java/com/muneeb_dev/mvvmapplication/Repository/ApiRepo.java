package com.muneeb_dev.mvvmapplication.Repository;

import android.app.Activity;
import android.util.Log;
import android.widget.Toast;

import androidx.lifecycle.MutableLiveData;

import com.google.android.material.snackbar.Snackbar;
import com.muneeb_dev.mvvmapplication.Models.User_DataList;
import com.muneeb_dev.mvvmapplication.Models.User_List_Login;
import com.muneeb_dev.mvvmapplication.Retrofit.ApiClient;
import com.muneeb_dev.mvvmapplication.Retrofit.ApiService;

import java.util.Collections;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;



public class ApiRepo {


    public MutableLiveData<List<User_DataList>> getUserData( ) {


        final MutableLiveData<List<User_DataList>> user_dataModelMutableLiveData = new MutableLiveData<>();

        ApiService apiService = ApiClient.getClient().create(ApiService.class);
//        Call<List<User_DataList>> call = apiService.getUser();

        apiService.getUser().enqueue(new Callback<List<User_DataList>>() {
            @Override
            public void onResponse(Call<List<User_DataList>> call, Response<List<User_DataList>> response) {

                user_dataModelMutableLiveData.setValue(response.body());

            }

            @Override
            public void onFailure(Call<List<User_DataList>> call, Throwable t) {

                Log.e("API Not Call= ", "Unable to submit post to API.");

            }
        });
//        call.enqueue(new Callback<List<User_DataList>>() {
//            @Override
//            public void onResponse(Call<List<User_DataList>> call, Response<List<User_DataList>> response) {
//
//                /////// Get Response From Server  ////////////
//                if (response != null && response.isSuccessful()) {
//
//
//                    ExecutorService service =  Executors.newSingleThreadExecutor();
//                    service.submit(new Runnable() {
//                        @Override
//                        public void run() {
//
//                            user_dataModelMutableLiveData.setValue(response.body());
//
//
//                        }
//                        });
//
//                    }
//
//                }
////                final User_DataList user_dataList = (User_DataList) response.body();
////                if (user_dataList != null) {
////                    String status = user_dataList.getstatus();
//
//                    ////////////////////////////////If Getting Error From Server   ///////////////////////////////////////////////////////////////
//
////                    if (status.contains("0")) {
//
////                       runOnUiThread(new Runnable() {
////                            @Override
////                            public void run() {
//////
////                                user_dataModelMutableLiveData.setValue(response.body());
//////
//////
////                            }
////                        });
//
//
////                    } ///if ends here
//
////                }
//
//
//
//            @Override
//            public void onFailure(Call<List<User_DataList>> call, Throwable t) {
//                   Log.e("API Not Call= ", "Unable to submit post to API.");
////                                        Toast.makeText(activity, "Network Issue \n Connecting....", Toast.LENGTH_SHORT).show();
//
////                activity.runOnUiThread(new
////                                               Runnable() {
////
////                    @Override
////                    public void run() {
////
////                        ////////////Progress Dismiss///////////
////
////
////                        Toast.makeText(activity, "Network Issue \n Connecting....", Toast.LENGTH_SHORT).show();
////
////                    }
////                });
//
//
//            }
//        });



        return user_dataModelMutableLiveData;
    }



    public MutableLiveData<User_List_Login> getUserLogin(String Email , String Password, String deviceid  ) {

        final MutableLiveData<User_List_Login> login_mutabledata = new MutableLiveData<>();

        ApiService apiService = ApiClient.getClient().create(ApiService.class);

        apiService.Consumer_Login(Email ,Password ,deviceid).enqueue(new Callback<User_List_Login>() {
            @Override
            public void onResponse(Call<User_List_Login> call, Response<User_List_Login> response) {


                login_mutabledata.setValue(response.body());


            }

            @Override
            public void onFailure(Call<User_List_Login> call, Throwable t) {

            }
        });



        return login_mutabledata;
    }


}
