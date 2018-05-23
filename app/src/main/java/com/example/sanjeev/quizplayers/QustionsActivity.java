package com.example.sanjeev.quizplayers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class QustionsActivity extends AppCompatActivity {
    private String nameUserMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qustions);
        TextView textViewName = (TextView) findViewById(R.id.textName);
        nameUserMain = MainActivity.getNameOfUser();
        textViewName.setText("Hey " + nameUserMain + " !");
    }
}
