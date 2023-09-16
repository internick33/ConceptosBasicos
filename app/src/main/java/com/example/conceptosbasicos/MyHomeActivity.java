package com.example.conceptosbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MyHomeActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView lista;
    List<String> androidVersionList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_home);

        lista = findViewById(R.id.myListView);

        androidVersionList = new ArrayList<>();
        androidVersionList.add("Apple Pie");
        androidVersionList.add("Banana Bread");
        androidVersionList.add("Cupcake");
        androidVersionList.add("Donut");
        androidVersionList.add("Froyo");
        androidVersionList.add("Eclair");
        androidVersionList.add("Gingerbread");
        androidVersionList.add("Honeycomb");

        ArrayAdapter adaptadorVersionesAndroid =  new ArrayAdapter(
                this, android.R.layout.simple_list_item_1, androidVersionList
        );

        lista.setAdapter(adaptadorVersionesAndroid);

        lista.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String androidVerison = androidVersionList.get(position);

        Toast.makeText(this, "" + androidVerison, Toast.LENGTH_SHORT).show();
    }
}