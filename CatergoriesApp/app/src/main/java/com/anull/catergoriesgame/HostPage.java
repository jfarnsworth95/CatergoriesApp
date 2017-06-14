package com.anull.catergoriesgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.TelephonyManager;
import android.view.View;

/**
 * Created by Jackson on 4/10/2017.
 */
public class HostPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //get server generated unique IDs
        //If no connection to server, go back to start page with error msg for user
        //add to users to resources @lists/users, refresh every few seconds
        setContentView(R.layout.activity_host_page);
    }

    public void goTo_GamePage(View view){
        //modify @ints/totalPlayers to match total number of players
        //Make call to server to start game
    }
}
