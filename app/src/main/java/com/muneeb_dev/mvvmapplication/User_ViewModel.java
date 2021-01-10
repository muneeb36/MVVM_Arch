package com.muneeb_dev.mvvmapplication;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class User_ViewModel extends ViewModel {

    ApiRepo apiRepo;

    MutableLiveData<List<User_DataList>> getuser;

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


}
