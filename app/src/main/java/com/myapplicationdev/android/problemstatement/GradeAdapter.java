package com.myapplicationdev.android.problemstatement;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GradeAdapter extends ArrayAdapter<Grades> {
    private ArrayList<Grades> grade;
    private Context context;
    private TextView  tvG;
    private ImageView ivInfo;


    public GradeAdapter(Context context, int resource, ArrayList<Grades> objects) {
        super(context, resource, objects);
        // Store the food that is passed to this adapter
        grade = objects;
        // Store Context object as we would need to use it later
        this.context = context;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.rows, parent, false);

        // Get the TextView object
        tvG = rowView.findViewById(R.id.textViewG);
        // Get the ImageView object
        ivInfo = rowView.findViewById(R.id.imageViewInfo);


        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        Grades currentGrade = grade.get(position);
        // Set the TextView to show the food

        tvG.setText(currentGrade.getName());
        ivInfo.setImageResource(R.drawable.dg);

        return rowView;


    }

}




