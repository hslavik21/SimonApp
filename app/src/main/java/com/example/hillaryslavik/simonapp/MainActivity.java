package com.example.hillaryslavik.simonapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Squares
        final Button redSquare = (Button) findViewById(R.id.redSquare);
        Button greenSquare = (Button) findViewById(R.id.greenSquare);
        Button blueSquare = (Button) findViewById(R.id.blueSquare);
        Button yellowSquare = (Button) findViewById(R.id.yellowSquare);


        Button startButton = (Button) findViewById(R.id.gameButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        redSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redSquare.setBackgroundColor(Color.BLACK);
            }
        });
    }
    public void startGame()
    {

    }

    public void getPattern()
    {

    }

    public void checkPattern()
    {

    }

}
