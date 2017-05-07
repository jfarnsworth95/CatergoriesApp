package com.anull.catergoriesgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

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
        createTableView();
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

    /**
     * Dynamically creates table for vote page based on total players, and assumes there are
     * 10 categories, can be changed in the "i" based for loop.
     */
    public void createTableView(){
        TableLayout tl = (TableLayout) findViewById(R.id.voteTable);

        for(int i = 0; i < 10; i ++){
            TableRow row = new TableRow(this);

            for(int e = 0; e < totalPlayers; e ++){  //TODO insert totalPlayers variable

                CheckBox checkBox = new CheckBox(this);
                checkBox.setText(acceptedAnswers.get(e));
                row.addView(checkBox);
            }

            tl.addView(row);
        }

}
