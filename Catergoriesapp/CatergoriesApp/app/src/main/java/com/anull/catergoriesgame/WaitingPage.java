package com.anull.catergoriesgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Jackson on 4/12/2017.
 */
public class WaitingPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //refresh list of other active users in lobby
        setContentView(R.layout.activity_waiting_page);
    }

    public void goTo_HostPage(View view) {
        //set @ints/totalPlayers to equal number of players in game
        //Move to game page when prompted by server
    }
}
