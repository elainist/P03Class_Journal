package com.myapplicationdev.android.problemstatement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class info extends AppCompatActivity {

    ListView lv;
    TextView tvmodule;
    ArrayAdapter adapter;
    ArrayList<Grades> grade;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        lv = this.findViewById(R.id.listViewGrades);
        tvmodule = this.findViewById(R.id.textViewModule);

        Intent i = getIntent();

        adapter = new GradeAdapter(this, R.layout.rows, grade);
        lv.setAdapter(adapter);


    }
}
