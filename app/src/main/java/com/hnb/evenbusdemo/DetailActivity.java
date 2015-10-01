package com.hnb.evenbusdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import de.greenrobot.event.EventBus;

/**
 * Created by HuynhBinh on 10/1/15.
 */
public class DetailActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onStart()
    {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    public void onStop()
    {
        EventBus.getDefault().unregister(this);
        super.onStop();
    }

    // This method will be called when a MessageEvent is posted
    public void onEvent(ExampleEvent event)
    {
        Toast.makeText(this, event.toString(), Toast.LENGTH_SHORT).show();
    }

    // This method will be called when a SomeOtherEvent is posted
    public void onEvent(OtherEvent event)
    {
        Toast.makeText(this, event.toString(), Toast.LENGTH_SHORT).show();
    }


}
