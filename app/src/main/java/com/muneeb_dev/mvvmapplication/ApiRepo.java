package com.muneeb_dev.mvvmapplication;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

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

}
