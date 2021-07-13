package com.example.dhopa.Model;

public class ModelNotification {
    String order, summary, time;
    int image;

    public ModelNotification(String order, String summary, String time, int image) {
        this.order = order;
        this.summary = summary;
        this.time = time;
        this.image = image;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
