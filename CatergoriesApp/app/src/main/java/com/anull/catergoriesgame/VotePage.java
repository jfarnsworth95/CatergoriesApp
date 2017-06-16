package com.anull.catergoriesgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TableLayout;
import android.widget.TableRow;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Jackson on 4/18/2017.
 */
public class VotePage  extends AppCompatActivity {

    ArrayList<String> acceptedAnswers = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vote_page);

        //TODO pull vote list from server

        //TODO generate vote list layout in tableLayout
        createTableView();

        //start timer for voting
        Timer clock = new Timer();
        clock.schedule(new TimerTask() {
            @Override
            public void run() {
                //TODO harvest t/f response for each element

                //TODO send completed vote list to server

                //move to score page
                goTo_ScorePage(null);
            }
        }, 60*1000);


    }

    public void goTo_ScorePage(View view) {
        //Move to score page after sending vote list
    }

    /**
     * Dynamically creates table for vote page based on total players, and assumes there are
     * 10 categories, can be changed in the "i" based for loop.
     */
    public void createTableView() {
        //TODO make all list elements buttons that change color when pressed
        //TODO insert totalPlayers variable
        int totalPlayers = 0;

        TableLayout tl = (TableLayout) findViewById(R.id.voteTable);

        for (int i = 0; i < 10; i++) {
            TableRow row = new TableRow(this);

            for (int e = 0; e < totalPlayers; e++) {

                CheckBox checkBox = new CheckBox(this);
                checkBox.setText(acceptedAnswers.get(e));
                row.addView(checkBox);
            }

            tl.addView(row);
        }
    }
}
