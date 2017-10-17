package com.example2.acer.multiplyactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public void changeActivity(View view){
        Intent i = new Intent(getApplicationContext(),MainActivity.class);

        startActivity(i);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textView2=(TextView)findViewById(R.id.textView2);
        Intent i=getIntent();
        textView2.setText(i.getStringExtra("name"));


    }
}
