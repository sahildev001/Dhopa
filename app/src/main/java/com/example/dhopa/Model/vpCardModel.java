package com.example.dhopa.Model;
public class vpCardModel {
    String card_number,name,date;

    public vpCardModel(String card_number, String name, String date) {
        this.card_number = card_number;
        this.name = name;
        this.date = date;
    }

    public String getCard_number() {
        return card_number;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
