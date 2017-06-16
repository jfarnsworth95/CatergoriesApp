package com.anull.catergoriesgame;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartPage extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.anull.catergoriesgame.MESSAGE";
    public String androidId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);

        //http://developer.samsung.com/technical-doc/view.do?v=T000000103
        androidId = Settings.Secure.getString(getContentResolver(), Settings.Secure.ANDROID_ID);
    }

    public void goTo_HostPage(View view) {
        //Notifiy server of new game session
        //Make call to server

        //Move to host page with necessary data
        Intent intent = new Intent(this, HostPage.class);
        intent.putExtra(EXTRA_MESSAGE, androidId);
        startActivity(intent);
    }

    public void goTo_JoinPage(View view) {
        //Move to join page
        Intent intent = new Intent(this, JoinPage.class);
        intent.putExtra(EXTRA_MESSAGE, androidId);
        startActivity(intent);
    }
}
