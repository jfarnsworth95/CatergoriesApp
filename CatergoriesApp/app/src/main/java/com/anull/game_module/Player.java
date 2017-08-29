package com.anull.game_module;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONArray;


/**
 * Created by zhaoy on 8/27/2017.
 */

public class Player {

    String name;
    String deviceID;

    String[] answers;
    Integer[] rating;

    public Player(){

    }

    /**
     *
     */
    public Player(String name, String id){
        this.name = name;
        this.deviceID = id;
        this.answers = new String[10];
        this.rating = new Integer[10];
        for (int i = 0; i < this.rating.length; i++){
            this.rating[i] = 0;
        }
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public String[] getAnswers() {
        return answers;
    }

    public void setAnswers(String[] answers) {
        this.answers = answers;
    }

    public Integer[] getRating() {
        return rating;
    }

    public void setRating(Integer[] rating) {
        this.rating = rating;
    }






}