package com.example.android.justkava;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


/**
 * Created by shubhankitsingh on 06/12/19.
 */

public class cooking extends AppCompatActivity

{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cards);
    }
    public void car(View view)
    {

       startActivity(new Intent(cooking.this,lectures.class));

    }
}
