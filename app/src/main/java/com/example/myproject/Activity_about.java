package com.example.myproject;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class Activity_about extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_layout);
    }
}
