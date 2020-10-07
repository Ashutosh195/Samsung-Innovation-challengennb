package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void submit1(View view){
        Intent intent12= new Intent(this, requests.class);
        startActivity(intent12);
    }
    public void submit2(View view){
        Intent intent54= new Intent(this, requests2.class);
        startActivity(intent54);
    }
}