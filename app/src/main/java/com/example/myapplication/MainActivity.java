package com.example.myapplication;


import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    private String titles[] = {
            "1. ",
            "2. ",
            "3. ",
            "4. ",
            "5. ",
            "6. ",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        listView.setAdapter(
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, titles));
        listView.setTextFilterEnabled(true);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, DetailActivity.class);

                intent.putExtra("title", position);


                startActivity(intent);
            }
        });
    }

}