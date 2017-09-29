package com.example.nick263.imagetests;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

public class ImageAdapter extends BaseAdapter {

    Context context;
    Integer[] GalleryImagesList;

    public ImageAdapter(Context context, Integer[] a)
    {
        this.context = context;
        GalleryImagesList = a;
    }
    @Override
    public int getCount()
    {
        return GalleryImagesList.length;
    }

    @Override
    public Object getItem(int position)
    {
        return GalleryImagesList[position];
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        ImageView imageView = new ImageView(this.context);
        imageView.setImageResource(GalleryImagesList[position]);
        imageView.setLayoutParams(new Gallery.LayoutParams(150, 200));
        imageView.setScaleType(ScaleType.FIT_XY);

        return imageView;
    }}
