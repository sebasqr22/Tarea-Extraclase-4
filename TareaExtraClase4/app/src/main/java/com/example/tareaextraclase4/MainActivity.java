package com.example.tareaextraclase4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button insertBtn = (Button) findViewById(R.id.Insertbutton);
        insertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText numtext = (EditText) findViewById(R.id.numedit);
                TextView result = (TextView) findViewById(R.id.ResultTextView);

                System.out.println("Todo bien antes del num");

                int num =  Integer.parseInt(numtext.getText().toString());

                System.out.println("Todo bien despues del num");

                result.setText(num + "");

                System.out.println("todo bien en el set");
            }
        });
    }
}