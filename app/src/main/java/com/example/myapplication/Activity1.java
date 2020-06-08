package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Activity1 extends AppCompatActivity
{
    TextView next;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);

        next=findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(Activity1.this,Activity2.class));
            }
        });

        Toast.makeText(this, "Oncreate of 1st", Toast.LENGTH_SHORT).show();
        Log.d("lifecycle1", "onCreate invoked");

    }
    @Override
    protected void onStart()
    {
        super.onStart();
        Toast.makeText(this, "onStart of 1st", Toast.LENGTH_SHORT).show();
        Log.d("lifecycle1", "onStart invoked");
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Toast.makeText(this, "onResume of 1st", Toast.LENGTH_SHORT).show();
        Log.d("lifecycle1", "onResume invoked");

    }

    @Override
    protected void onPause()
    {
        super.onPause();//invisible
        Toast.makeText(this, "onPause of 1st", Toast.LENGTH_SHORT).show();
        Log.d("lifecycle1", "onPause invoked");
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Toast.makeText(this, "onStop of 1st", Toast.LENGTH_SHORT).show();
        Log.d("lifecycle1", "onStop invoked");
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Toast.makeText(this, "onRestart of 1st", Toast.LENGTH_SHORT).show();
        Log.d("lifecycle1", "onRestart invoked");
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Toast.makeText(this, "onDestroy of 1st", Toast.LENGTH_SHORT).show();
        Log.d("lifecycle1", "onDestroy invoked");
    }
}