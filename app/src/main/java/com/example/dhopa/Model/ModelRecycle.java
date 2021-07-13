package com.example.dhopa.Model;

public class ModelRecycle {

    String title,descreption,rating;
    int image;

    public ModelRecycle(String title, String descreption, String rating, int image) {
        this.title = title;
        this.descreption = descreption;
        this.rating = rating;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescreption() {
        return descreption;
    }

    public void setDescreption(String descreption) {
        this.descreption = descreption;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
