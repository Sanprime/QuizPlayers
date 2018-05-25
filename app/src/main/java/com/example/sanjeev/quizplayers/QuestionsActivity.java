package com.example.sanjeev.quizplayers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.net.Inet4Address;

public class QuestionsActivity extends AppCompatActivity {
    private String nameUserMain;
    private int option1Value;
    Button blueButton  ;
    Button redButton   ;
    Button whiteButton ;
    Button greenButton ;
    TextView textName  ;
    TextView textQ1    ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qustions);
        blueButton   = (Button) findViewById(R.id.blueButton);
        redButton    = (Button) findViewById(R.id.redButton);
        whiteButton  = (Button) findViewById(R.id.whiteButton);
        greenButton  = (Button) findViewById(R.id.greenButton);
        textName     = (TextView) findViewById(R.id.textName);
        textQ1       = (TextView) findViewById(R.id.textQ1);
        option1Value = MainActivity.getOption1();
        TextView textViewName = (TextView) findViewById(R.id.textName);
        nameUserMain = MainActivity.getNameOfUser();
        textViewName.setText("Hey " + nameUserMain + " !");
    }
    // redButton represents top most button.
    public void redButtonOnClick(View v){
        MainActivity.setOption1(1);
        Intent redIntent = new Intent(this, redActivity.class);
        startActivity(redIntent);
    }

    // blueButton represents second top most button.
    public void blueButtonOnClick(View v){
        MainActivity.setOption1(2);
        Intent blueIntent = new Intent(this, blueActivity.class);
        startActivity(blueIntent);
    }

    // whiteButton represents third top most button.
    public void whiteButtonOnClick(View v){
        MainActivity.setOption1(3);
        Intent whiteIntent = new Intent(this, whiteActivity.class);
        startActivity(whiteIntent);

    }

    // greenButton represents bottom button.
    public void greenButtonOnClick(View v){
        MainActivity.setOption1(4);
        Intent greenIntent = new Intent(this, greenActivity.class);
        startActivity(greenIntent);

    }
}
