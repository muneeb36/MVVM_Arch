package com.muneeb_dev.mvvmapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    User_ViewModel user_viewModel = new User_ViewModel();


    RecyclerView recyclerView;
    Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activity = MainActivity.this;

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(activity,LinearLayoutManager.VERTICAL,false));





        runOnUiThread(new Runnable() {
            @Override
            public void run() {

                user_viewModel.getUserData().observe(MainActivity.this, new Observer<List<User_DataList>>() {
                    @Override
                    public void onChanged(List<User_DataList> user_dataLists) {



                        recyclerView.setAdapter(new RV_Adapter(user_dataLists , activity));


//                        for(int p = 0 ; p<user_dataLists.size() ; p++)
//                        {
//                            Log.e("Users_Data = " , user_dataLists.get(p).getBody());
//                            Log.e("Users_Data = " , user_dataLists.get(p).getTitle());
//                        }

                    }
                });

//                user_viewModel.getuser().observe(MainActivity.this, new Observer<List<User_DataList>>() {
//                    @Override
//                    public void onChanged(List<User_DataList> user_dataModels) {
//
//                        for(int p = 0 ; p<user_dataModels.size() ; p++)
//                        {
//                            Log.e("Users Data = " , user_dataModels.get(p).getTitle());
//                            Log.e("Users Data = " , user_dataModels.get(p).getTitle());
//                        }
//
//                    }
//                });
//
            }
        });




    }
}