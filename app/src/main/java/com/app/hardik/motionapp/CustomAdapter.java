package com.app.hardik.motionapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.hardik.motionapp.databinding.EntityNewsBinding;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.net.URL;
import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder>{
    ArrayList<POJONews> pojoNewsArrayList;
    Context context;

    public CustomAdapter(ArrayList<POJONews> pojoNewsArrayList, Context context) {
        this.pojoNewsArrayList = pojoNewsArrayList;
        this.context = context;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        EntityNewsBinding binding;

        public MyViewHolder(EntityNewsBinding bind) {
            super(bind.getRoot());
            this.binding = bind;
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater li = LayoutInflater.from(parent.getContext());
//        return new MyViewHolder(EntityNewsBinding.inflate(li));
        return new MyViewHolder(EntityNewsBinding.inflate(li,parent,false));// padding deference mate
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, @SuppressLint("RecyclerView") int position) {
        try{
            RequestOptions options = new RequestOptions().centerCrop().placeholder(R.mipmap.ic_launcher_round).error(R.mipmap.ic_launcher_round);

            final URL image_thumb_url = new URL(pojoNewsArrayList.get(position).img_thumb+"");
            Log.d("image_thumb_url", image_thumb_url+"");
            Glide.with(context).load(image_thumb_url).apply(options).into(holder.binding.imgThumb);

            holder.binding.tvNewsSource.setText(pojoNewsArrayList.get(position).news_source+"");
            holder.binding.tvNewsTitle.setText(pojoNewsArrayList.get(position).news_title+"");
            holder.binding.tvNewsDesc.setText(pojoNewsArrayList.get(position).news_desc+"");

            final URL image_source_logo_url = new URL(pojoNewsArrayList.get(position).news_source_logo+"");
            Log.d("image_source_logo_url", image_source_logo_url+"");
            Glide.with(context).load(image_source_logo_url).apply(options).into(holder.binding.imgNewsSourceLogo);

            holder.binding.tvNewsCategory.setText(pojoNewsArrayList.get(position).news_category+"");
            holder.binding.tvNewsDate.setText(pojoNewsArrayList.get(position).tv_news_date+"");

            //=============== go to detail activity
            holder.binding.imgThumb.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context,DetailActivity.class);

                    intent.putExtra("image_thumb_url",image_thumb_url+"");

                    intent.putExtra("news_source",pojoNewsArrayList.get(position).news_source+"");
                    intent.putExtra("news_title",pojoNewsArrayList.get(position).news_title+"");
                    intent.putExtra("news_desc",pojoNewsArrayList.get(position).news_desc+"");

                    intent.putExtra("image_source_logo_url",image_source_logo_url+"");

                    intent.putExtra("news_category",pojoNewsArrayList.get(position).news_category+"");
                    intent.putExtra("tv_news_date",pojoNewsArrayList.get(position).tv_news_date+"");

                    intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    context.startActivity(intent);
                }
            });

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public int getItemCount() {
        return pojoNewsArrayList.size();
    }
}
