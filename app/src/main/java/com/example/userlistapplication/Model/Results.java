package com.example.userlistapplication.Model;

public class Results {
    private String nat;

    private String gender;

    private String phone;

    private Dob dob;

    private Name name;

    private Registered registered;

    private Location location;

    private Id id;

    private Login login;

    private String cell;

    private String email;

    private Picture picture;

    public String getNat ()
    {
        return nat;
    }

    public void setNat (String nat)
    {
        this.nat = nat;
    }

    public String getGender ()
    {
        return gender;
    }

    public void setGender (String gender)
    {
        this.gender = gender;
    }

    public String getPhone ()
    {
        return phone;
    }

    public void setPhone (String phone)
    {
        this.phone = phone;
    }

    public Dob getDob ()
    {
        return dob;
    }

    public void setDob (Dob dob)
    {
        this.dob = dob;
    }

    public Name getName ()
    {
        return name;
    }

    public void setName (Name name)
    {
        this.name = name;
    }

    public Registered getRegistered ()
    {
        return registered;
    }

    public void setRegistered (Registered registered)
    {
        this.registered = registered;
    }

    public Location getLocation ()
    {
        return location;
    }

    public void setLocation (Location location)
    {
        this.location = location;
    }

    public Id getId ()
    {
        return id;
    }

    public void setId (Id id)
    {
        this.id = id;
    }

    public Login getLogin ()
    {
        return login;
    }

    public void setLogin (Login login)
    {
        this.login = login;
    }

    public String getCell ()
    {
        return cell;
    }

    public void setCell (String cell)
    {
        this.cell = cell;
    }

    public String getEmail ()
    {
        return email;
    }

    public void setEmail (String email)
    {
        this.email = email;
    }

    public Picture getPicture ()
    {
        return picture;
    }

    public void setPicture (Picture picture)
    {
        this.picture = picture;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [nat = "+nat+", gender = "+gender+", phone = "+phone+", dob = "+dob+", name = "+name+", registered = "+registered+", location = "+location+", id = "+id+", login = "+login+", cell = "+cell+", email = "+email+", picture = "+picture+"]";
    }
}

