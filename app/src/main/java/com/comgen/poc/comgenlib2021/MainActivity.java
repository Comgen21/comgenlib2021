package com.comgen.poc.comgenlib2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.comgen.poc.comgen2021.Toasty.ComgenToaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ComgenToaster.comgenToasty(this,"Hey am from you library");
    }
}