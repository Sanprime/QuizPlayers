package com.example.sanjeev.quizplayers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private static String nameUser;
private static int option;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startButton = (Button) findViewById(R.id.startButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InputMethodManager inputManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
                startButtonOnClick(v);
            }
        });
    }
    public void startButtonOnClick(View view){
        EditText nameText = (EditText) findViewById(R.id.editText1);
        nameUser = nameText.getText().toString();
        Intent intentNew = new Intent(this, QustionsActivity.class);
        startActivity(intentNew);
    }
    public static String getNameOfUser(){
        return nameUser;
    }

    public static int getOption(){
        return option;
    }

    public static void setOption( int optionNumber){
        option = optionNumber;
    }

}
