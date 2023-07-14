package com.app.hardik.motionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.app.hardik.motionapp.databinding.ActivityDetailBinding;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.net.URL;

public class DetailActivity extends AppCompatActivity {
    ActivityDetailBinding binding;
    String image_thumb_url,news_source,news_title,news_desc,image_source_logo_url,news_category,tv_news_date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        image_thumb_url = getIntent().getExtras().getString("image_thumb_url");

        news_source = getIntent().getExtras().getString("news_source");
        news_title = getIntent().getExtras().getString("news_title");
        news_desc = getIntent().getExtras().getString("news_desc");

        image_source_logo_url = getIntent().getExtras().getString("image_source_logo_url");

        news_category = getIntent().getExtras().getString("news_category");
        tv_news_date = getIntent().getExtras().getString("tv_news_date");

        RequestOptions options = new RequestOptions().centerCrop().placeholder(R.mipmap.ic_launcher_round).error(R.mipmap.ic_launcher_round);

        Log.d("image_thumb_url", image_thumb_url+"");
        Glide.with(DetailActivity.this).load(image_thumb_url).apply(options).into(binding.imgThumb);

        binding.tvNewsSource.setText(news_source+"");
        binding.tvNewsTitle.setText(news_title+"");
        binding.tvNewsDesc.setText(news_desc+"");

        Log.d("image_source_logo_url", image_source_logo_url+"");
        Glide.with(DetailActivity.this).load(image_source_logo_url).apply(options).into(binding.imgNewsSourceLogo);

        binding.tvNewsCategory.setText(news_category+"");
        binding.tvNewsDate.setText(tv_news_date+"");

    }
}