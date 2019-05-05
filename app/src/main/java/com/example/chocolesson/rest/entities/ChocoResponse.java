package com.example.chocolesson.rest.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ChocoResponse {
    @Expose
    @SerializedName("code")
    private int code;

    @Expose
    @SerializedName("message")
    private String message;

    @Expose
    @SerializedName("result")
    private List<Deal> allDeals;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public List<Deal> getAllDeals() {
        return allDeals;
    }
}
