package com.example.tarea4;

import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.graphics.Canvas;


public class MainActivity extends AppCompatActivity {

    public XORlist lista = new XORlist();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }

    public void AddToList(View view){ // add a number to the AA Tree
        Toast.makeText(this, "The number will be added to tree", Toast.LENGTH_SHORT).show();

        TextView textnumber = (TextView) findViewById(R.id.editTextNumber);

        int num = Integer.parseInt(textnumber.getText().toString());

        lista.insertLast(num);

        DisplayList();
    }

    public void RemovefromList(View view){ // add a number to the AA Tree
        Toast.makeText(this, "The number will be added to tree", Toast.LENGTH_SHORT).show();

        TextView textnumber = (TextView) findViewById(R.id.editTextNumber2);

        int num = Integer.parseInt(textnumber.getText().toString());

        lista.delete(num);

        DisplayList();
    }

    public void DisplayList(){

        int[] array = lista.getArray();

        if (array[0]== 0){
            return;
        }
        else {
            TextView display = (TextView) findViewById(R.id.ListDisplay);
            String XOR = "";
            XOR = "<---|"+" "+array[0]+" "+"|<--";
            for (int i = 1; i < array.length; i++){
                if(i == array.length-1){
                    XOR += "->|"+" "+array[i]+" "+"|--->";
                }
                else{
                    XOR += "->|"+" "+array[i]+" "+"|<--";
                }

            }
            display.setText(XOR);
        }
    }


}