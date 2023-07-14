package com.app.hardik.motionapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.hardik.motionapp.databinding.EntityPersonBinding;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.net.URL;
import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    ArrayList<POJOPerson> pojoPersonArrayList;
    Context context;

    public CustomAdapter(ArrayList<POJOPerson> pojoPersonArrayList, Context context) {
        this.pojoPersonArrayList = pojoPersonArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater li = LayoutInflater.from(parent.getContext());
        return new MyViewHolder(EntityPersonBinding.inflate(li));
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.binding.tvName.setText(pojoPersonArrayList.get(position).getName()+"");
        try{

            URL image_url = new URL(pojoPersonArrayList.get(position).getPhoto()+"");
            Log.d("image_url", "onBindViewHolder: "+image_url);
            RequestOptions options = new RequestOptions().centerCrop().placeholder(R.drawable.baseline_person_24).error(R.mipmap.ic_launcher);
//            RequestOptions options = new RequestOptions().placeholder(R.drawable.baseline_person_24).error(R.mipmap.ic_launcher);
            Glide.with(context).load(image_url).apply(options).into(holder.binding.imgThumb);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public int getItemCount() {
        return pojoPersonArrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        EntityPersonBinding binding;

        MyViewHolder(EntityPersonBinding b) {
            super(b.getRoot());
            binding = b;
        }
    }
}
