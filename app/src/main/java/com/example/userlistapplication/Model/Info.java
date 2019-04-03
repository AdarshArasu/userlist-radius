package com.example.userlistapplication.Model;

import java.io.Serializable;

public class Info implements Serializable {
    private String seed;

    private String page;

    private String results;

    private String version;

    public String getSeed() {
        return seed;
    }

    public void setSeed(String seed) {
        this.seed = seed;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "ClassPojo [seed = " + seed + ", page = " + page + ", results = " + results + ", version = " + version + "]";
    }
}

