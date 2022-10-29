package com.demo1.exam2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class BlueberryShake extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blueberry_shake);

        ImageView imageView = (ImageView) findViewById(R.id.image);
        imageView.setImageResource(R.drawable.blue);




    }


}