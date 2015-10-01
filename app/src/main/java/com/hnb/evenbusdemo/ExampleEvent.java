package com.hnb.evenbusdemo;

/**
 * Created by HuynhBinh on 10/1/15.
 */
public class ExampleEvent
{
    public int id;
    public String name;
    public double price;

    public ExampleEvent(int id, String name, double price)
    {
        this.id = id;
        this.name = name;
        this.price = price;

    }

    @Override
    public String toString()
    {
        return this.id + "-" + this.name + "-" + this.price;
    }
}
