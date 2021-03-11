package com.example.imageviewerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    //이미지
    private int[] imageIDs = new int[] {
            R.drawable.view01,
            R.drawable.view02,
            R.drawable.view03,
            R.drawable.view04,
            R.drawable.view05,
            R.drawable.view06,
            R.drawable.view07,
            R.drawable.view08,
            R.drawable.view09,
            R.drawable.view10
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // gridview
        GridView gridViewImages = (GridView)findViewById(R.id.gridViewImages);
        ImageGridAdapter imageGridAdapter = new ImageGridAdapter(this, imageIDs);
        gridViewImages.setAdapter(imageGridAdapter);

    }

}