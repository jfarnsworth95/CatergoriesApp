package com.anull.game_module;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;

import javax.websocket.*;

import javax.websocket.Session;

/**
 * This class is an encapulation of all the info & functions that the local game party needs
 *
 * Utilizes singleton design pattern.
 *
 * Created by zhaoy on 8/13/2017.
 */

public class GameParty implements GamePartyInterface {
    private static GameParty singletonInstance;


    Session serverSession;
    private boolean isHost;
    private int partyID;

    private  String[] categories;

    private Player host;
    private Player[] players;			// Array holding pointers to all the players.
    private int playerCount;


    /**
     * Constructor method that instantiates.
     * Session is imperative for the function, so it stands.
     * @param session
     */
    public GameParty(Session session){
        this.serverSession = session;
    }

    /**
     * Singleton get method that returns the explicit instance of this class
     * @return
     */
    public static GameParty getInstance(){
        return singletonInstance;
    }


    public static void initHostInstance(){
        // networking stuff here
    }

    public static void initGuestInstance(int partyID){
        // networking stuff here

    }



    /**
     * General handling method, its responsibility is to pass the incoming json to
     * properly-dutied method for the actual parsing
     * @param json
     * @throws JSONException
     */
    public void receiveNParseJson(JSONObject json) throws JSONException{
        String jsonType = (String) json.get("type");

        switch (jsonType) {
            case "ConfirmInit":         this.receiveConfirmInit(json);
            case "ConfirmJoin":         this.receiveConfirmJoin(json);
            case "UpdatedPlayerList":   this.receiveUpdatedPlayerList(json);
            case "LetterNCategoryList": this.receiveLetterNCategoryList(json);
            case "VoteList":            this.receiveVoteList(json);
            case "ResultList":          this.receiveResultList(json);
            case "ConfirmRestart":      this.receiveConfirmRestart(json);
            case "ConfirmTerminate":    this.receiveConfirmTerminate(json);
            case "Exception":           this.receiveException(json);
        }
    }

    public void receiveConfirmInit(JSONObject json) throws JSONException{
        this.partyID = (Integer) json.get("partyID");
    }
    // END FUNC

    public void receiveConfirmJoin(JSONObject json){

    }
    // END FUNC

    /**
     * This method extracts the info of player form incoming json
     * and initialize new blank player objects.
     * @param json
     * @throws JSONException
     */
    public void receiveUpdatedPlayerList(JSONObject json) throws JSONException{

        JSONArray nameList = (JSONArray)json.get("nameList");
        JSONArray idList = (JSONArray) json.get("idL    ist");

        for (int i = 0; i < nameList.length(); i++) {
            String name = nameList.getString(i);
            String deviceID = idList.getString(i);

            Player p = new Player(name, deviceID);
            this.players[i] = p;
        }

    }

    public void receiveLetterNCategoryList(JSONObject json){

    }

    public void receiveVoteList(JSONObject json){

    }

    public void receiveResultList(JSONObject json){

    }

    public void receiveConfirmRestart(JSONObject json){

    }

    public void receiveConfirmTerminate(JSONObject json){

    }

    public void receiveException(JSONObject json){

    }





    public JSONObject fabricateInitiatePartyJson(){
        return null;
    }

    public JSONObject fabricateJoinPartyJson(){
        return null;
    }

    public JSONObject fabricateStartPartyJson(){
        return null;
    }

    public JSONObject fabricateSendAnswerJson(){
        return null;
    }

    public JSONObject fabricateSendCompletedVoteListJson(){
        return null;
    }

    public JSONObject fabricateInitiateRestartJson(){
        return null;
    }

    public JSONObject fabricateTerminatePartyJson(){
        return null;
    }

}
