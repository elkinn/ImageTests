package com.example.nick263.imagetests;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView.ScaleType;

public class MainActivity extends AppCompatActivity {

    Gallery ImageGallery;
    Integer[] GalleryImagesList = {R.drawable.cat_one, R.drawable.cat_two, R.drawable.chubby_checker_i4v};
    ImageView imgGalleryImage;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgGalleryImage = (ImageView)findViewById(R.id.imgGalleryImage);
        imgGalleryImage.setImageResource(R.drawable.cat_one);

        ImageGallery = (Gallery)findViewById(R.id.gallery);
        ImageGallery.setAdapter(new ImageAdapter(this, GalleryImagesList));
        ImageGallery.setOnItemClickListener(new OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id)
            {
                imgGalleryImage.setImageResource(GalleryImagesList[position]);
            }
        });
    }

}
