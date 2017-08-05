package com.anull.catergoriesgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by Jackson on 5/7/2017.
 */
public class ScorePage extends AppCompatActivity {

    ArrayList<String> userScores = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vote_page);
        //pull scoreList from server
        //generate vote list layout in Listlayout
        //move to score page or back to start page
    }

    //TODO check to see where user is navigated to if they choose to play again.
    public void goTo_ScorePage(View view) {
        //Move to score page after sending vote list
    }

    public void goTo_StartPage(View view){
        //Move to start page (HOME) after choosing not to continue.
    }

}
