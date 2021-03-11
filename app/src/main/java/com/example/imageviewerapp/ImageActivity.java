package com.example.imageviewerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ImageActivity extends AppCompatActivity {

    private  ImageView  imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        ImageView imageView = findViewById(R.id.imageView);
        setImage(imageView);
    }

    private void setImage(ImageView imageView){
        // get intent data
        Intent i = getIntent();

        // selected img id
        int imageID = (Integer)i.getExtras().get("image ID");
        imageView.setImageResource(imageID);
    }

    public void byeClick (View V) {
        // 현재 Activitiy 종료
        finish();
    };
}