package org.example;

public class Publisher {
    private String name;
    private String address;

    public Publisher(final String name, final String address)
    {
        this.name = name;
        this.address = address;
    }

    public String getName()
    {
        return this.name;
    }

    public String getAddress()
    {
        return this.address;
    }

    public void setName(final String name)
    {
        this.name = name;
    }

    public void setAddress(final String address)
    {
        this.address = address;
    }

}
