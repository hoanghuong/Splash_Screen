package com.example.hoang.lesson4splashsreen;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class RecycelerViewAdapter extends RecyclerView.Adapter<RecycelerViewAdapter.ViewHolder> {
    private List<File> mListFile;
    private Context mContext;

    public RecycelerViewAdapter(List<File> mListFile, Context mMontext) {
        this.mListFile = mListFile;
        this.mContext = mMontext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View v = layoutInflater.inflate(R.layout.item, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Picasso.with(mContext)
                .load(mListFile.get(i))
                .into(viewHolder.mImageView);
    }

    @Override
    public int getItemCount() {
        return mListFile.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView mImageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.image_avata);
        }
    }
}

