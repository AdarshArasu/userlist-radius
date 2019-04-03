package com.example.userlistapplication.Model;

import java.io.Serializable;
import java.util.ArrayList;

public class Model implements Serializable {


    private ArrayList<Results> results;

    public ArrayList<Results> getResults() {
        return results;
    }

    public void setResults(ArrayList<Results> results) {
        this.results = results;
    }

    private Info info;


    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "ClassPojo [results = " + results + ", info = " + info + "]";
    }
}

