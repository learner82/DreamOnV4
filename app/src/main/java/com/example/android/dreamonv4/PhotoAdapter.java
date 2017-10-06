package com.example.android.dreamonv4;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.ButterKnife;

/**
 * Created by learner on 1/10/2017.
 */

public class PhotoAdapter extends ArrayAdapter<Photograph> {

    PhotoAdapter(@NonNull Activity context, ArrayList<Photograph> Photos){
        super (context, 0 , Photos);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View listItemView = convertView;

        if (listItemView == null){
            listItemView =
                    LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Photograph photo_item = getItem(position);

        TextView coupleNameTextView = ButterKnife.findById(listItemView, R.id.name);
        TextView dateTextView = ButterKnife.findById(listItemView, R.id.date);
        TextView locationTextView = ButterKnife.findById(listItemView, R.id.location);
        ImageView mImageView = ButterKnife.findById(listItemView, R.id.imageView);

        assert photo_item != null;

        coupleNameTextView.setText(photo_item.getCoupleName());
        dateTextView.setText(photo_item.getDate());
        locationTextView.setText(photo_item.getLocation());
        mImageView.setImageResource(photo_item.getImageResourceId());

        return listItemView;
    }
}
