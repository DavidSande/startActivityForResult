package com.activity.homework_android_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        Date date = new Date();

        setResult(RESULT_OK, (new Intent()).setAction(sdf.format(date).toString()));
        finish();
    }
}
