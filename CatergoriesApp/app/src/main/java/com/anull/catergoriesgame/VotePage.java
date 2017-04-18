package com.anull.catergoriesgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Jackson on 4/18/2017.
 */
public class VotePage  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vote_page);
        //pull vote list from server
        //start timer for voting
        //harvest t/f response for each element
        //send completed vote list to server
        //move to score page
    }

    public void goTo_ScorePage(View view) {
        //Move to score page after sending vote list
    }

}
