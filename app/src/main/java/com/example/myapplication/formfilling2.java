package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class formfilling2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formfilling2);
    }
    public void tocontinue2(View view){
        Intent intent59= new Intent(this,setpass2.class);
        startActivity(intent59);
    }
}