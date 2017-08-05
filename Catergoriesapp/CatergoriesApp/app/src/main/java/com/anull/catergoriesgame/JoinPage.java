package com.anull.catergoriesgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Jackson on 4/10/2017.
 */
public class JoinPage extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //retrieve passed AndroidID
        Intent intent = getIntent();
        String selfID = intent.getStringExtra(StartPage.EXTRA_MESSAGE);

        setContentView(R.layout.activity_join_page);
    }

    public void goTo_WaitPage(View view){
        //TODO Make call to server (check if uniqueID valid)

        //TODO Move to wait page if vaild
    }
}
