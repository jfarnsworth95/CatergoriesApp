package com.anull.catergoriesgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);
    }

    public void startGame(View view) {
        //start game session
        //Make call to server
        //Move to host page
    }

    public void joinGame(View view) {
        //move to join page
    }
}
