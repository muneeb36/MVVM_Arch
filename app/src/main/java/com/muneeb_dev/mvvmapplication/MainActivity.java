package com.muneeb_dev.mvvmapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.muneeb_dev.mvvmapplication.Models.User_DataList;
import com.muneeb_dev.mvvmapplication.Models.User_List_Login;
import com.muneeb_dev.mvvmapplication.ViewModel.User_ViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    User_ViewModel user_viewModel = new User_ViewModel();


//    RecyclerView recyclerView;
    Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activity = MainActivity.this;

//        recyclerView = findViewById(R.id.recyclerView);
//        recyclerView.setLayoutManager(new LinearLayoutManager(activity,LinearLayoutManager.VERTICAL,false));

        Consumer_Login(activity,"aslambscs@gmail.com","123456","svasvfasvasdvSV");



//        runOnUiThread(new Runnable() {
//            @Override
//            public void run() {
//
//                user_viewModel.getUserData().observe(MainActivity.this, new Observer<List<User_DataList>>() {
//                    @Override
//                    public void onChanged(List<User_DataList> user_dataLists) {
//
//
//
//                        recyclerView.setAdapter(new RV_Adapter(user_dataLists , activity));
//
//
////                        for(int p = 0 ; p<user_dataLists.size() ; p++)
////                        {
////                            Log.e("Users_Data = " , user_dataLists.get(p).getBody());
////                            Log.e("Users_Data = " , user_dataLists.get(p).getTitle());
////                        }
//
//                    }
//                });
//
////                user_viewModel.getuser().observe(MainActivity.this, new Observer<List<User_DataList>>() {
////                    @Override
////                    public void onChanged(List<User_DataList> user_dataModels) {
////
////                        for(int p = 0 ; p<user_dataModels.size() ; p++)
////                        {
////                            Log.e("Users Data = " , user_dataModels.get(p).getTitle());
////                            Log.e("Users Data = " , user_dataModels.get(p).getTitle());
////                        }
////
////                    }
////                });
////
//            }
//        });






    }




    public void Consumer_Login(Activity activity , String email, String password,String device_id)
    {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {

                user_viewModel.userLogin(activity,email,password,device_id).observe(MainActivity.this, new Observer<List<User_List_Login>>() {
                    @Override
                    public void onChanged(List<User_List_Login> user_list_logins) {

//                        for(int i=0;i<user_list_logins.size();i++)
//                        {
//
//                        }
                        String status = user_list_logins.get(0).getStatus();

                        Log.e("Status = " , status);

                        if (status.equals("0")) {
                            activity.runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    Toast.makeText(activity, "Invalid Email or Password", Toast.LENGTH_SHORT).show();
                                }
                            });

//                        Snackbar.make(getWindow().getDecorView().getRootView(), "", Snackbar.LENGTH_LONG).show();
                        }
                        else if (status.equals("4") ) {
                            activity.runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    Toast.makeText(activity, "Succesfully Hit Api 4 wala", Toast.LENGTH_SHORT).show();

                                }
                            });

                        }
                        else if (status.equals("5") ) {
                            activity.runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    Toast.makeText(activity, "Succesfully Hit Api 5 wala", Toast.LENGTH_SHORT).show();

                                }
                            });

                        }

                        else  {
                            activity.runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    Toast.makeText(activity, "Succesfully Hit Api Responce OK ELse Wala", Toast.LENGTH_SHORT).show();



                                }
                            });

                        }



                    }
                });

            }
        });

    }

}