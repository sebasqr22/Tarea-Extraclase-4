package com.example.tarea4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void AddToList(View view){ // add a number to the AA Tree
        Toast.makeText(this, "The number will be added to tree", Toast.LENGTH_SHORT).show();
    }
}