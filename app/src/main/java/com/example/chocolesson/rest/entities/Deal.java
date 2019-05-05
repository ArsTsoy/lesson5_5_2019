package com.example.chocolesson.rest.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Deal {
    @Expose
    @SerializedName("discount")
    private int discount;

    @Expose
    @SerializedName("image_url")
    private String image_url;

    @Expose
    @SerializedName("price")
    private int price;

    @Expose
    @SerializedName("title_short")
    private String title_short;


    @Expose
    @SerializedName("title")
    private String title;

    @Expose
    @SerializedName("reviews_rate")
    private double reviews_rate;

    @Expose
    @SerializedName("bought")
    private int bought;

    public int getDiscount() {
        return discount;
    }

    public String getImage_url() {
        return image_url;
    }

    public int getPrice() {
        return price;
    }

    public String getTitle_short() {
        return title_short;
    }

    public String getTitle() {
        return title;
    }

    public double getReviews_rate() {
        return reviews_rate;
    }

    public int getBought() {
        return bought;
    }
}
