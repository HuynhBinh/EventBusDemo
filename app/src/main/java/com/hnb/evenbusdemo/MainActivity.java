package com.hnb.evenbusdemo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import de.greenrobot.event.EventBus;


public class MainActivity extends ActionBarActivity
{

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                postExampleEvent();
            }
        });

    }

    private void postExampleEvent()
    {
        EventBus.getDefault().post(new ExampleEvent(1, "Main", 20.00));
    }


}
