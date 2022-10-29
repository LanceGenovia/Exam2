package com.demo1.exam2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MangoShake extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mango_shake);

        ImageView imageView = (ImageView) findViewById(R.id.image);
        imageView.setImageResource(R.drawable.mango);
    }
}