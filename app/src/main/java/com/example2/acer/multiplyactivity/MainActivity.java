package com.example2.acer.multiplyactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView=(ListView)findViewById(R.id.listView);
        final ArrayList<String> frinds=new ArrayList<>();
        frinds.add("Monica");
        frinds.add("Chaled");
        frinds.add("Joey");
        frinds.add("Recal");

        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,frinds);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                Intent i=new Intent(getApplicationContext(),SecondActivity.class);
                i.putExtra("name",frinds.get(position));
                startActivity(i);
            }
        });
    }
}
