package com.example.earthquakereport;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<QuakeData> list = new ArrayList<>();


        list.add(new QuakeData("7.2","newyork","12 feb 2021"));
        list.add(new QuakeData("7.2","newyork","12 feb 2021"));
        list.add(new QuakeData("7.2","newyork","12 feb 2021"));
        list.add(new QuakeData("7.2","newyork","12 feb 2021"));
        list.add(new QuakeData("7.2","newyork","12 feb 2021"));
        list.add(new QuakeData("7.2","newyork","12 feb 2021"));
        list.add(new QuakeData("7.2","newyork","12 feb 2021"));
        list.add(new QuakeData("7.2","newyork","12 feb 2021"));
        list.add(new QuakeData("7.2","newyork","12 feb 2021"));
        list.add(new QuakeData("7.2","newyork","12 feb 2021"));
        list.add(new QuakeData("7.2","newyork","12 feb 2021"));
        list.add(new QuakeData("7.2","newyork","12 feb 2021"));

      //  ArrayAdapter<String> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,city);

        QuakeAdapter adapter = new QuakeAdapter(this,R.layout.textview_for_listview,list);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
}