package com.muneeb_dev.mvvmapplication.ViewModel;

import android.app.Activity;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.muneeb_dev.mvvmapplication.Models.User_List_Login;
import com.muneeb_dev.mvvmapplication.Repository.ApiRepo;
import com.muneeb_dev.mvvmapplication.Models.User_DataList;

import java.util.List;

public class User_ViewModel extends ViewModel {

    ApiRepo apiRepo;

    MutableLiveData<List<User_DataList>> getuser;
    MutableLiveData<User_List_Login> userLogin;

    public User_ViewModel()
     {
         apiRepo = new ApiRepo();
     }


     public LiveData<List<User_DataList>> getUserData(){

        if(getuser == null)
        {
            getuser = apiRepo.getUserData();
        }

        return getuser;
     }

    public LiveData<User_List_Login> userLogin(Activity activity,String Email , String Password, String deviceid){

        if(userLogin == null)
        {
            userLogin = apiRepo.getUserLogin(Email ,Password ,deviceid);
        }

        return userLogin;
    }

}
