package com.anull.catergoriesgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by Jackson on 4/18/2017.
 */
public class VotePage  extends AppCompatActivity {

    ArrayList<String> acceptedAnswers = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vote_page);
        //pull vote list from server
        //generate vote list layout in tableLayout
            //make all list elements buttons that change color when pressed
        //start timer for voting
        //harvest t/f response for each element
        //send completed vote list to server
        //move to score page
    }

    public void goTo_ScorePage(View view) {
        //Move to score page after sending vote list
    }

    public void onPress(){

    }

}
