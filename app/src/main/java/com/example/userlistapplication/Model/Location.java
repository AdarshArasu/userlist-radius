package com.example.userlistapplication.Model;

public class Location {
    private String city;

    private String street;

    private Timezone timezone;

    private String postcode;

    private Coordinates coordinates;

    private String state;

    public String getCity ()
    {
        return city;
    }

    public void setCity (String city)
    {
        this.city = city;
    }

    public String getStreet ()
    {
        return street;
    }

    public void setStreet (String street)
    {
        this.street = street;
    }

    public Timezone getTimezone ()
    {
        return timezone;
    }

    public void setTimezone (Timezone timezone)
    {
        this.timezone = timezone;
    }

    public String getPostcode ()
    {
        return postcode;
    }

    public void setPostcode (String postcode)
    {
        this.postcode = postcode;
    }

    public Coordinates getCoordinates ()
    {
        return coordinates;
    }

    public void setCoordinates (Coordinates coordinates)
    {
        this.coordinates = coordinates;
    }

    public String getState ()
    {
        return state;
    }

    public void setState (String state)
    {
        this.state = state;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [city = "+city+", street = "+street+", timezone = "+timezone+", postcode = "+postcode+", coordinates = "+coordinates+", state = "+state+"]";
    }
}

