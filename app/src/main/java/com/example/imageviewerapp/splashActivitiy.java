package com.example.imageviewerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class splashActivitiy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activitiy);
    }


    public void move(View v) {
        // 화면 클릭 하면 전환하기
        // 1) Intent 메시지 객체 생성
        Intent thirdINT = new Intent(splashActivitiy.this, MainActivity.class);

        // 2) INTENT 전송 ==> startActivitiy()
        startActivity(thirdINT);
    }
}