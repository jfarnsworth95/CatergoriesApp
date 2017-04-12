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
        setContentView(R.layout.activity_start_page);
    }

    public void goTo_HostPage(View view) {
        //Move to game page when prompted by server
    }
}
