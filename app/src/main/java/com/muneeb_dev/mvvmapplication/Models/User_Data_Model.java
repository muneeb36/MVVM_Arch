package com.muneeb_dev.mvvmapplication.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class User_Data_Model {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("full_name")
    @Expose
    private String fullName;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("profile_image")
    @Expose
    private String profileImage;
    @SerializedName("company_name")
    @Expose
    private String company_name;
    @SerializedName("company_website")
    @Expose
    private String company_website;
    @SerializedName("company_address")
    @Expose
    private String company_address;
    @SerializedName("discount_allowed")
    @Expose
    private String discount_allowed;
    @SerializedName("min_order_value")
    @Expose
    private String min_order_value;
    @SerializedName("discount_value")
    @Expose
    private String discount_value;
    @SerializedName("addresses")
    @Expose
    private List<UserAddress> addresses = null;

    public User_Data_Model() {
    }

    public List<UserAddress> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<UserAddress> addresses) {
        this.addresses = addresses;
    }

    public User_Data_Model(String id, String fullName, String email, String phone, String profileImage, String company_name, String company_website, String company_address, String discount_allowed, String min_order_value, String discount_value, List<UserAddress> addresses) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.profileImage = profileImage;
        this.company_name = company_name;
        this.company_website = company_website;
        this.company_address = company_address;
        this.discount_allowed = discount_allowed;
        this.min_order_value = min_order_value;
        this.discount_value = discount_value;
        this.addresses = addresses;
    }

    public User_Data_Model(String id, String fullName, String email, String phone, String profileImage) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.profileImage = profileImage;
    }

    public User_Data_Model(String id, String fullName, String email, String phone, String profileImage, String company_name, String company_website, String company_address, String discount_allowed, String min_order_value, String discount_value) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.profileImage = profileImage;
        this.company_name = company_name;
        this.company_website = company_website;
        this.company_address = company_address;
        this.discount_allowed = discount_allowed;
        this.min_order_value = min_order_value;
        this.discount_value = discount_value;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getCompany_website() {
        return company_website;
    }

    public void setCompany_website(String company_website) {
        this.company_website = company_website;
    }

    public String getCompany_address() {
        return company_address;
    }

    public void setCompany_address(String company_address) {
        this.company_address = company_address;
    }

    public String getDiscount_allowed() {
        return discount_allowed;
    }

    public void setDiscount_allowed(String discount_allowed) {
        this.discount_allowed = discount_allowed;
    }

    public String getMin_order_value() {
        return min_order_value;
    }

    public void setMin_order_value(String min_order_value) {
        this.min_order_value = min_order_value;
    }

    public String getDiscount_value() {
        return discount_value;
    }

    public void setDiscount_value(String discount_value) {
        this.discount_value = discount_value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }
}
