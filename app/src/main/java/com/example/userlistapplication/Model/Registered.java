package com.example.userlistapplication.Model;

public class Registered {
    private String date;

    private String age;

    public String getDate ()
    {
        return date;
    }

    public void setDate (String date)
    {
        this.date = date;
    }

    public String getAge ()
    {
        return age;
    }

    public void setAge (String age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [date = "+date+", age = "+age+"]";
    }
}

