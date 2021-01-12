package com.muneeb_dev.mvvmapplication.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User_List_Login {
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("access_token")
    @Expose
    private String accessToken;
    @SerializedName("consumer")
    @Expose
    private User_Data_Model user_data_model;

    @SerializedName("professional")
    @Expose
    private User_Data_Model user_data_model_perfessional;
    @SerializedName("notificationsCount")
    @Expose
    private String  notificationsCount;

    public User_List_Login(String status, String message, String accessToken, User_Data_Model user_data_model, User_Data_Model user_data_model_perfessional, String notificationsCount) {
        this.status = status;
        this.message = message;
        this.accessToken = accessToken;
        this.user_data_model = user_data_model;
        this.user_data_model_perfessional = user_data_model_perfessional;
        this.notificationsCount = notificationsCount;
    }

    public String getNotificationsCount() {
        return notificationsCount;
    }

    public void setNotificationsCount(String notificationsCount) {
        this.notificationsCount = notificationsCount;
    }

    public User_Data_Model getUser_data_model_perfessional() {
        return user_data_model_perfessional;
    }

    public void setUser_data_model_perfessional(User_Data_Model user_data_model_perfessional) {
        this.user_data_model_perfessional = user_data_model_perfessional;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public User_Data_Model getUser_data_model() {
        return user_data_model;
    }

    public void setUser_data_model(User_Data_Model user_data_model) {
        this.user_data_model = user_data_model;
    }
}
