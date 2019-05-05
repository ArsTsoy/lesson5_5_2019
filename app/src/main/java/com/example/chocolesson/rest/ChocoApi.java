package com.example.chocolesson.rest;

import com.example.chocolesson.rest.entities.ChocoResponse;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ChocoApi {

    @GET("v3_3/deals")
    retrofit2.Call<ChocoResponse> getAllDeals(
            @Query("town_id") int townId,
            @Query("category_id") int categoryId,
            @Query("page") int page
    );

}
