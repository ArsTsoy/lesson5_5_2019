package com.example.chocolesson.recyclerView;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.chocolesson.R;
import com.example.chocolesson.rest.entities.Deal;

public class DealViewHolder extends RecyclerView.ViewHolder {

    private TextView tvShortTitle;
    private TextView tvRate;
    private TextView tvTitle;
    private TextView tvBought;
    private TextView tvPrice;

    private ImageView ivDeal;

    private String priceHolder;

    public DealViewHolder(@NonNull View itemView) {
        super(itemView);

        priceHolder = itemView.getResources().getString(R.string.price);

        tvShortTitle = itemView.findViewById(R.id.tvShortTitle);
        tvRate = itemView.findViewById(R.id.tvRate);
        tvTitle = itemView.findViewById(R.id.tvTitle);
        tvBought = itemView.findViewById(R.id.tvBought);
        tvPrice = itemView.findViewById(R.id.tvPrice);

        ivDeal = itemView.findViewById(R.id.ivDeal);
    }

    public void bind(Deal deal){
        tvShortTitle.setText(deal.getTitle_short());
        tvPrice.setText(String.format(priceHolder, deal.getPrice()));
        tvTitle.setText(deal.getTitle());
        tvBought.setText(String.valueOf(deal.getBought()));
        tvRate.setText(String.valueOf(deal.getReviews_rate()));

        Glide.with(itemView)
                .load(deal.getImage_url())
                .into(ivDeal);
    }
}
