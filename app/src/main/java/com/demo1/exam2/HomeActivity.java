package com.demo1.exam2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.Transliterator;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ListView listView = findViewById(R.id.listview);

        List<String> list = new ArrayList<>();
        list. add("Melon Shake");
        list. add("Blueberry Shake");
        list. add("Strawberry Shake");
        list. add("Mango Shake");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0) {
                    //clicked Melon Shake

                    startActivity(new Intent(HomeActivity.this,MelonShake.class));

                }else if (position==1){
                    //clicked Blueberry Shake

                    startActivity(new Intent(HomeActivity.this,BlueberryShake.class));
                } else if (position == 2) {
                    //clicked Strawberry Shake

                    startActivity(new Intent(HomeActivity.this,StrawberryShake.class));
                }else if (position==3){
                    //clicked Mango Shake

                    startActivity(new Intent(HomeActivity.this,MangoShake.class));
                }
            }
        });


    }
}