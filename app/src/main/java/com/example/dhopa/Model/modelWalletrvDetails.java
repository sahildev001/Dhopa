package com.example.dhopa.Model;

public class modelWalletrvDetails {
    String name,amount,time;
    int profile_pic;

    public modelWalletrvDetails(String name, String amount, String time, int profile_pic) {
        this.name = name;
        this.amount = amount;
        this.time = time;
        this.profile_pic = profile_pic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getProfile_pic() {
        return profile_pic;
    }

    public void setProfile_pic(int profile_pic) {
        this.profile_pic = profile_pic;
    }
}
