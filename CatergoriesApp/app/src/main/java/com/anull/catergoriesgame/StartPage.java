package com.anull.catergoriesgame;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartPage extends AppCompatActivity {


    //http://developer.samsung.com/technical-doc/view.do?v=T000000103
    public String androidId = Settings.Secure.getString(getContentResolver(), Settings.Secure.ANDROID_ID);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);
    }

    public void goTo_HostPage(View view) {
        //Start game session
        //Make call to server
        //Move to host page
    }

    public void goTo_JoinPage(View view) {
        //Move to join page
    }
}
