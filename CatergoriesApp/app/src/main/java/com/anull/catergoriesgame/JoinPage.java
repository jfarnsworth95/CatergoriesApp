package com.anull.catergoriesgame;

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
        setContentView(R.layout.activity_join_page);
    }

    public void goTo_WaitPage(View view){
        //Make call to server (check if uniqueID valid)
        //Move to wait page if vaild
    }
}
