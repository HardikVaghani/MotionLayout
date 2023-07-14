package com.app.hardik.motionapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.app.hardik.motionapp.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<POJONews> pojoNewsArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        layoutManager = new LinearLayoutManager(this);
        binding.myRecyclerView.setLayoutManager(layoutManager);

        prepare_news();

    }

    public void prepare_news() {
        pojoNewsArrayList = new ArrayList<>();
        String desc = getResources().getString(R.string.desc);
        pojoNewsArrayList.add(new POJONews(
                "https://via.placeholder.com/150/24f355",
                "YouTube"
                , "Machine Learning Week Preview",
                ""+desc
                , "https://via.placeholder.com/600/24f355",
                "YouTube",
                "12 May,2019"
        ));
        pojoNewsArrayList.add(new POJONews(
                "https://via.placeholder.com/600/d32776",
                "Twitter"
                , "Machine Learning Week Preview",
                ""+desc
                , "https://via.placeholder.com/150/d32776",
                "Twitter Writer",
                "19 May,2019"
        ));
        pojoNewsArrayList.add(new POJONews(
                "https://via.placeholder.com/150/f66b97",
                "Facebook"
                , "Machine Learning Week Preview",
                ""+desc
                , "https://via.placeholder.com/600/f66b97",
                "Facebook User",
                "2 Fab,2020"
        ));
        pojoNewsArrayList.add(new POJONews(
                "https://via.placeholder.com/600/66b7d2",
                "YouTube"
                , "Machine Learning Week Preview",
                ""+desc
                , "https://via.placeholder.com/600/66b7d2",
                "YouTube",
                "12 Jun,2021"
        ));
        pojoNewsArrayList.add(new POJONews(
                "https://via.placeholder.com/600/61a65",
                "YouTube"
                , "Machine Learning Week Preview",
                ""+desc
                , "https://via.placeholder.com/600/61a65",
                "YouTube Bloger",
                "12 May,2021"
        ));
        pojoNewsArrayList.add(new POJONews(
                "https://via.placeholder.com/600/f9cee5",
                "Whatsapp"
                , "Machine Learning Week Preview",
                ""+desc
                , "https://via.placeholder.com/150/f9cee5",
                "Whatsapp Developer",
                "22 Dec,2022"
        ));
        pojoNewsArrayList.add(new POJONews(
                "https://via.placeholder.com/600/56acb2",
                "Instagram"
                , "Machine Learning Week Preview",
                ""+desc+desc
                , "https://via.placeholder.com/150/56acb2",
                "Instagram Jon",
                "1 Jan,2023"
        ));
        pojoNewsArrayList.add(new POJONews(
                "\"https://via.placeholder.com/150/5e3a73\"",
                "YouTube"
                , "Machine Learning Week Preview",
                ""+desc+desc
                , "\"https://via.placeholder.com/150/474645\"\n",
                "YouTube",
                "12 May,2023"
        ));
        pojoNewsArrayList.add(new POJONews(
                "https://via.placeholder.com/150/8f209a",
                "YouTube"
                , "Machine Learning Week Preview",
                ""
                , "https://via.placeholder.com/150/392537",
                "YouTube",
                "12 May,2023"
        ));
        pojoNewsArrayList.add(new POJONews(
                "https://via.placeholder.com/150/8985dc",
                "YouTube"
                , "Machine Learning Week Preview",
                ""+desc
                , "https://via.placeholder.com/150/5e12c6",
                "YouTube",
                "12 May,2023"
        ));
        pojoNewsArrayList.add(new POJONews(
                "https://via.placeholder.com/150/a7c272",
                "YouTube"
                , "Machine Learning Week Preview",
                ""+desc
                , "https://via.placeholder.com/150/c70a4d",
                "YouTube",
                "12 May,2023"
        ));

        CustomAdapter customAdapter = new CustomAdapter(pojoNewsArrayList,MainActivity.this);
        binding.myRecyclerView.setAdapter(customAdapter);

    }
}