package com.example.chocolesson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.chocolesson.rest.ChocoApi;
import com.example.chocolesson.rest.NetworkService;
import com.example.chocolesson.rest.entities.ChocoResponse;
import com.example.chocolesson.rest.entities.Deal;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        NetworkService networkService = NetworkService.getInstance();
        ChocoApi chocoApi = networkService.getChocoApi();

        Call<ChocoResponse> responseCall = chocoApi.getAllDeals(1,1,1);
        responseCall.enqueue(new Callback<ChocoResponse>() {
            @Override
            public void onResponse(Call<ChocoResponse> call, Response<ChocoResponse> response) {
                ChocoResponse chocoResponse = response.body();
                ArrayList<Deal> allDeals = (ArrayList<Deal>) chocoResponse.getAllDeals();
                textView.setText(allDeals.get(0).getTitle_short());
            }

            @Override
            public void onFailure(Call<ChocoResponse> call, Throwable t) {

            }
        });
    }
}
