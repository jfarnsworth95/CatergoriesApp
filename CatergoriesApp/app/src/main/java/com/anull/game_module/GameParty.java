package com.anull.game_module;

import com.anull.network_module.APIKeys;
import com.anull.network_module.ConnectionEstablisher;

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

    private String theLetter;
    private String[] categories;

    private Player host;
    private Player[] players;            // Array holding pointers to all the players.
    private int playerCount;


    /**
     * Constructor method that instantiates.
     * Session is imperative for the function, so it stands.
     *
     * @param session
     */
    public GameParty(Session session) {
        this.serverSession = session;
    }



    /**
     * Singleton get method that returns the explicit instance of this class
     *
     * @return
     */
    public static GameParty getInstance() {
        return singletonInstance;
    }


    public static void initHostInstance() {
        Session s = ConnectionEstablisher.establishGeneralConnection();
        GameParty.singletonInstance = new GameParty(s);

        GameParty.singletonInstance.isHost = true;

        GameParty.singletonInstance.sendMsgToServer(
                                GameParty.singletonInstance.fabricateInitiatePartyJson());


    }

    public static void initGuestInstance(int partyID) {
        Session s = ConnectionEstablisher.establishGeneralConnection();
        GameParty.singletonInstance = new GameParty(s);

        GameParty.singletonInstance.isHost = false;

        GameParty.singletonInstance.sendMsgToServer(
                GameParty.singletonInstance.fabricateJoinPartyJson());

    }


    /**
     * General handling method, its responsibility is to pass the incoming json to
     * properly-dutied method for the actual parsing
     *
     * @param json
     * @throws JSONException
     */
    public void receiveNParseJson(JSONObject json) throws JSONException {
        String jsonType = (String) json.get(APIKeys.KEY_TYPE);

        switch (jsonType) {
            case APIKeys.TYPE_CONFIRM_INIT:
                this.receiveConfirmInit(json);
            case APIKeys.TYPE_CONFIRM_JOIN:
                this.receiveConfirmJoin(json);
            case APIKeys.TYPE_SEND_UPDATED_PLAYER_LIST:
                this.receiveUpdatedPlayerList(json);
            case APIKeys.TYPE_SEND_LETTER_N_CATEGORY_LIST:
                this.receiveLetterNCategoryList(json);
            case APIKeys.TYPE_SEND_VOTE_LIST:
                this.receiveVoteList(json);
            case APIKeys.TYPE_SEND_RESULT_LIST:
                this.receiveResultList(json);
            case APIKeys.TYPE_CONFIRM_RESTART:
                this.receiveConfirmRestart(json);
            case APIKeys.TYPE_CONFIRM_TERMINATE:
                this.receiveConfirmTerminate(json);
            case APIKeys.TYPE_EXCEPTION:
                this.receiveException(json);
        }
    }

    public void receiveConfirmInit(JSONObject json) throws JSONException {
        this.partyID = (Integer) json.get(APIKeys.KEY_PARTY_ID);
    }
    // END FUNC

    public void receiveConfirmJoin(JSONObject json) {

    }
    // END FUNC

    /**
     * This method extracts the info of player form incoming json
     * and initialize new blank player objects.
     *
     * @param json
     * @throws JSONException
     */
    public void receiveUpdatedPlayerList(JSONObject json) throws JSONException {

        JSONArray nameList = (JSONArray) json.get("nameList");
        JSONArray idList = (JSONArray) json.get("idList");

        for (int i = 0; i < nameList.length(); i++) {
            String name = nameList.getString(i);
            String deviceID = idList.getString(i);

            Player p = new Player(name, deviceID);
            this.players[i] = p;
        }

    }

    public void receiveLetterNCategoryList(JSONObject json) throws JSONException{
        this.theLetter = json.getString("letter");

        // Init local category list and migrate all contents from json to it.
        JSONArray catArray = json.getJSONArray("categoryList");
        this.categories = new String[catArray.length()];
        for (int i = 0; i < catArray.length(); i++) {
            this.categories[i] = catArray.getString(i);
        }
    }


    /**
     *
     * @param json
     */
    public void receiveVoteList(JSONObject json) throws JSONException{
        JSONArray idArray = json.getJSONArray(APIKeys.KEY_ID_LIST);
        for (int i = 0; i < idArray.length(); i++){
            Player curPlayer = this.getPlayerSpecifiedByID(idArray.getString(i));

            if (curPlayer != null){
                curPlayer.parseAnswersFromJson(json);
            } else {
                // Some weird shizzle happened, handles it!
            }
        }

    }


    /**
     *
     * @param json
     */
    public void receiveResultList(JSONObject json) {

    }

    public void receiveConfirmRestart(JSONObject json) {

    }

    public void receiveConfirmTerminate(JSONObject json) {

    }

    public void receiveException(JSONObject json) {

    }


    public JSONObject fabricateInitiatePartyJson() {
        return null;
    }

    public JSONObject fabricateJoinPartyJson() {
        return null;
    }

    public JSONObject fabricateStartPartyJson() {
        return null;
    }

    public JSONObject fabricateSendAnswerJson() {
        return null;
    }

    public JSONObject fabricateSendCompletedVoteListJson() {
        return null;
    }

    public JSONObject fabricateInitiateRestartJson() {
        return null;
    }

    public JSONObject fabricateTerminatePartyJson() {
        return null;
    }


    /**
     * This method sends the Json object to server asynchronously in its String form
     * @param json
     */
    public void sendMsgToServer(JSONObject json){
        this.serverSession.getAsyncRemote().sendText(json.toString());
    }


    private Player getPlayerSpecifiedByID(String id){
        for (int i = 0; i < this.players.length; i++){
            if (this.players[i].deviceID.equals(id)){
                return this.players[i];
            }
        }

        return null;
    }

}
