package com.example.library;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.test.testy;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testy.simple(this,"hello kunal is here");
    }
}