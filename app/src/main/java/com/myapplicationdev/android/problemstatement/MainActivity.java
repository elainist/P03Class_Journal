package com.myapplicationdev.android.problemstatement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvModule;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvModule = findViewById(R.id.textViewModule);

        tvModule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Grades dg = new Grades("DG");
                Intent i = new Intent(MainActivity.this,info.class);
                i.putExtra("grade",dg);
                startActivity(i);

            }
        });


    }
}


