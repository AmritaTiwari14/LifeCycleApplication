package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity
{
    TextView next;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        next=findViewById(R.id.next);

        Toast.makeText(this, "Oncreate of 2nd", Toast.LENGTH_SHORT).show();
        Log.d("lifecycle2", "onCreate invoked");

    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Toast.makeText(this, "onStart of 2nd", Toast.LENGTH_SHORT).show();
        Log.d("lifecycle2", "onStart invoked");
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Toast.makeText(this, "onResume of 2nd", Toast.LENGTH_SHORT).show();
        Log.d("lifecycle2", "onResume invoked");
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Toast.makeText(this, "onPause of 2nd", Toast.LENGTH_SHORT).show();
        Log.d("lifecycle2", "onPause invoked");
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Toast.makeText(this, "onStop of 2nd", Toast.LENGTH_SHORT).show();
        Log.d("lifecycle2", "onStop invoked");
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Toast.makeText(this, "onRestart of 2nd", Toast.LENGTH_SHORT).show();
        Log.d("lifecycle2", "onRestart invoked") ;
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Toast.makeText(this, "onDestroy of 2nd", Toast.LENGTH_SHORT).show();
        Log.d("lifecycle2", "onDestroy invoked");

    }
}