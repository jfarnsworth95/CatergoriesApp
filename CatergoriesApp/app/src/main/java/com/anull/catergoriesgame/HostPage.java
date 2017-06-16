package com.anull.catergoriesgame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.TelephonyManager;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by Jackson on 4/10/2017.
 */
public class HostPage extends AppCompatActivity {

    ArrayList<String> userList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //retrieve passed AndroidID
        Intent intent = getIntent();
        String selfID = intent.getStringExtra(StartPage.EXTRA_MESSAGE);


        //TODO get server generated unique IDs

        //TODO If no connection to server, go back to start page with error msg for user
        //if no connection, then error
        //else list serverName


        //TODO add to users to userList, refresh from server every few seconds

        setContentView(R.layout.activity_host_page);
    }

    public void goTo_GamePage(View view){
        //modify @ints/totalPlayers to match total number of players
        //Make call to server to start game
    }
}
