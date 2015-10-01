package com.hnb.evenbusdemo;

/**
 * Created by HuynhBinh on 10/1/15.
 */
public class OtherEvent
{
    public String data;

    public OtherEvent(String data)
    {
        this.data = data;
    }

    @Override
    public String toString()
    {
        return this.data;
    }
}
