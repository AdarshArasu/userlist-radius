package com.example.userlistapplication.Model;

public class Name {
    private String last;

    private String title;

    private String first;

    public String getLast ()
    {
        return last;
    }

    public void setLast (String last)
    {
        this.last = last;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getFirst ()
    {
        return first;
    }

    public void setFirst (String first)
    {
        this.first = first;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [last = "+last+", title = "+title+", first = "+first+"]";
    }
}

