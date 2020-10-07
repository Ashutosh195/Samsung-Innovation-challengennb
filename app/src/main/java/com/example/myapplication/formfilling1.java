package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class formfilling1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formfilling1);
    }
    public void tocontinue1(View view){
        Intent intent45= new Intent(this,setpass1.class);
        startActivity(intent45);
    }
}