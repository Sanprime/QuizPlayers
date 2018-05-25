package com.example.sanjeev.quizplayers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QustionsActivity extends AppCompatActivity {
    private String nameUserMain;
    private static int option;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qustions);
        TextView textViewName = (TextView) findViewById(R.id.textName);
        nameUserMain = MainActivity.getNameOfUser();
        textViewName.setText("Hey " + nameUserMain + " !");
    }

    public void redButtonOnClick(View v){
        Button blueButton  = (Button) findViewById(R.id.blueButton);
        Button redButton   = (Button) findViewById(R.id.redButton);
        Button whiteButton = (Button) findViewById(R.id.whiteButton);
        Button greenButton = (Button) findViewById(R.id.greenButton);
        TextView textName  = (TextView) findViewById(R.id.textName);
        TextView textQ1    = (TextView) findViewById(R.id.textQ1);
        MainActivity.setOption(1);
    }

    public void blueButtonOnClick(View v){
        Button blueButton  = (Button) findViewById(R.id.blueButton);
        Button redButton   = (Button) findViewById(R.id.redButton);
        Button whiteButton = (Button) findViewById(R.id.whiteButton);
        Button greenButton = (Button) findViewById(R.id.greenButton);
        TextView textName  = (TextView) findViewById(R.id.textName);
        TextView textQ1    = (TextView) findViewById(R.id.textQ1);
        MainActivity.setOption(2);
    }

    public void whiteButtonOnClick(View v){
        Button blueButton  = (Button) findViewById(R.id.blueButton);
        Button redButton   = (Button) findViewById(R.id.redButton);
        Button whiteButton = (Button) findViewById(R.id.whiteButton);
        Button greenButton = (Button) findViewById(R.id.greenButton);
        TextView textName  = (TextView) findViewById(R.id.textName);
        TextView textQ1    = (TextView) findViewById(R.id.textQ1);
        MainActivity.setOption(3);
    }

    public void greenButtonOnClick(View v){
        Button blueButton  = (Button) findViewById(R.id.blueButton);
        Button redButton   = (Button) findViewById(R.id.redButton);
        Button whiteButton = (Button) findViewById(R.id.whiteButton);
        Button greenButton = (Button) findViewById(R.id.greenButton);
        TextView textName  = (TextView) findViewById(R.id.textName);
        TextView textQ1    = (TextView) findViewById(R.id.textQ1);
        MainActivity.setOption(4);
    }


}
