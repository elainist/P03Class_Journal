package com.myapplicationdev.android.problemstatement;

import java.io.Serializable;

public class Grades implements Serializable {
    private String name;

    public Grades(String name) {
        this.name = name;

    }
    public String getName() {
        return name;
    }

}


