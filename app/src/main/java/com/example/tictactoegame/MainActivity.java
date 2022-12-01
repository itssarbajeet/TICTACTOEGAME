package com.example.tictactoegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    EditText input1,input2;
    Button play;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input1=findViewById(R.id.input1);
        input2=findViewById(R.id.input2);
        play=findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i1=input1.getText().toString();
                String i2= input2.getText().toString();
                Intent intent=new Intent(MainActivity.this ,mainpage.class);
                intent.putExtra("input1",i1);
                intent.putExtra("input2",i2);
                startActivity(intent);

            }
        });

    }
}