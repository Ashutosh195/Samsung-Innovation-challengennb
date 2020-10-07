package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class choice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
        Intent intent = getIntent();
    }

        public void individual(View view){
            Intent intent3;
            intent3 = new Intent(this,formfilling2.class);
            startActivity(intent3);
        }
    public void hospital(View view){
        Intent intent2= new Intent(this,formfilling1.class);
        startActivity(intent2);
    }
}