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

    //Global variables.
    private static String nameUser; // save user name.
    private static int option1 = 0; // users answer to q1.
    private static int option2 = 0; // users answer to q2.
    //End of Global variables

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // what happens on app start up.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // initialize button.
        // remember to type cast findViewById which finds the widget by id to a button.
        Button startButton = (Button) findViewById(R.id.startButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //To lower the keyboard input after pressing the button.
                InputMethodManager inputManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
                startButtonOnClick(v);
            }
        });
    }
    // Function that defines what the button does after being clicked.
    // Remember to add onClick property to the xml file of the related activity(.i.e page) to link the function to the button.
    public void startButtonOnClick(View view){
        EditText nameText = (EditText) findViewById(R.id.editText1);
        nameUser = nameText.getText().toString();
        Intent intentNew;
        intentNew = new Intent(this, QuestionsActivity.class);
        // Opens the new activity.
        startActivity(intentNew);
    }

    public static String getNameOfUser(){
        return nameUser;
    }

    public static int getOption1(){
        return option1;
    }

    public static void setOption1( int optionNumber){
        option1 = optionNumber;
    }

}
