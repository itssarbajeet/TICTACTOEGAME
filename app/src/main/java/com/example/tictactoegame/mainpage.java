package com.example.tictactoegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.Toast;

public class mainpage extends AppCompatActivity {
    TextView player1,player2;
    TextView text2;
    TextView text3;
    TextView text4;
    String x="X";
    String o="O";
    GridLayout gridLayout;
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9 , playgame,newgame;
    int exchange = 0;
    int count=0;

    String b1,b2,b4,b3,b5,b6,b7,b8,b9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);
        player2=findViewById(R.id.player2);
        player1=findViewById(R.id.player1);
        text2=findViewById(R.id.text2);
        text3=findViewById(R.id.text3);
        text4=findViewById(R.id.text4);



        playgame=findViewById(R.id.playgame);
        newgame=findViewById(R.id.newgame);
        BUTTONSID();
        Intent intent = getIntent();
        String i1= intent.getStringExtra("input1");
        String i2= intent.getStringExtra("input2");
        text2.setText(i1+" turn");
        playgame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
            }
        });
        newgame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(mainpage.this,MainActivity.class);
                startActivity(intent1);
            }
        });


        player1.setText((i1+":"));
        player2.setText(i2+":");


    }

    private void BUTTONSID() {
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        button5=findViewById(R.id.button5);
        button6=findViewById(R.id.button6);
        button7=findViewById(R.id.button7);
        button8=findViewById(R.id.button8);
        button9=findViewById(R.id.button9);





    }



    public void BUTTONCALL(View view){
        String ab= player1.getText().toString();
        String ac= player2.getText().toString();
        int ab1=0 ,ab2=0;
        player1.setText((ab));
        player2.setText(ac);
        if(exchange==0){
            String a= player1.getText().toString();
            text2.setText(a+" TURN");
        }
        else if(exchange==1){
            String b= player2.getText().toString();
            text2.setText(b+" TURN");

        }

        Button clickedbutton=(Button) view;
        if(clickedbutton.getText().toString().equals("")) {
            count++;

            if (exchange == 0) {
                clickedbutton.setText(x);
                exchange = 1;

            } else if (exchange == 1) {
                clickedbutton.setText(o);
                exchange = 0;

            }
            if (count > 4) {
                b1 = button1.getText().toString();
                b2 = button2.getText().toString();
                b3 = button3.getText().toString();
                b4 = button4.getText().toString();
                b5 = button5.getText().toString();
                b6 = button6.getText().toString();
                b7 = button7.getText().toString();
                b8 = button8.getText().toString();
                b9 = button9.getText().toString();
                if (b1.equals(b2) && b1.equals(b3) && !b1.equals("")) {
                    if (b1.equals(x)){
                        ab1=ab1+1;
                        text3.setText(ab1);
                        Toast.makeText(this, "THE WINNER IS: " + ab, Toast.LENGTH_SHORT).show();
                        clear();
                    }
                    else if (b1.equals(o)){
                        ab2=ab2+1;
                        text4.setText(ab2);
                        Toast.makeText(this, "THE WINNER IS: " + b1, Toast.LENGTH_SHORT).show();
                        clear();
                    }



                } else if (b1.equals(b4) && b1.equals(b7) && !b1.equals("")) {
                    Toast.makeText(this, "THE WINNER IS: " + b1, Toast.LENGTH_SHORT).show();
                    clear();

                } else if (b1.equals(b5) && b1.equals(b9) && !b1.equals("")) {
                    Toast.makeText(this, "THE WINNER IS: " + b1, Toast.LENGTH_SHORT).show();
                    clear();


                } else if (b3.equals(b5) && b3.equals(b7) && !b3.equals("")) {
                    Toast.makeText(this, "THE WINNER IS: " + b3, Toast.LENGTH_SHORT).show();
                    clear();

                } else if (b2.equals(b5) && b2.equals(b8) && !b2.equals("")) {
                    Toast.makeText(this, "THE WINNER IS: " + b2, Toast.LENGTH_SHORT).show();
                    clear();

                } else if (b3.equals(b6) && b3.equals(b9) && !b3.equals("")) {
                    Toast.makeText(this, "THE WINNER IS: " + b3, Toast.LENGTH_SHORT).show();
                    clear();

                } else if (b4.equals(b5) && b4.equals(b6) && !b4.equals("")) {
                    Toast.makeText(this, "THE WINNER IS: " + b4, Toast.LENGTH_SHORT).show();
                    clear();

                } else if (b7.equals(b8) && b7.equals(b9) && !b7.equals("")) {
                    Toast.makeText(this, "THE WINNER IS: " + b7, Toast.LENGTH_SHORT).show();
                    clear();

                }
                else if (count==9){
                    Toast.makeText(this, "THE GAME IS DRAW: " , Toast.LENGTH_SHORT).show();
                    clear();
                }


            }
        }

}

    private void clear() {
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        count=0;
        exchange=0;

    }
    }
