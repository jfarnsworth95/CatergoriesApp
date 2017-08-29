package com.anull.game_module;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by zhaoy on 8/6/2017.
 */

public interface GamePartyInterface {



    public void receiveNParseJson(JSONObject json) throws JSONException;

    public void receiveConfirmInit(JSONObject json) throws JSONException;

    public void receiveConfirmJoin(JSONObject json) throws JSONException;

    public void receiveUpdatedPlayerList(JSONObject json) throws JSONException;

    public void receiveLetterNCategoryList(JSONObject json) throws JSONException;

    public void receiveVoteList(JSONObject json) throws JSONException;

    public void receiveResultList(JSONObject json) throws JSONException;

    public void receiveConfirmRestart(JSONObject json) throws JSONException;

    public void receiveConfirmTerminate(JSONObject json) throws JSONException;

    public void receiveException(JSONObject json) throws JSONException;


    public JSONObject fabricateInitiatePartyJson();

    public JSONObject fabricateJoinPartyJson();

    public JSONObject fabricateStartPartyJson();

    public JSONObject fabricateSendAnswerJson();

    public JSONObject fabricateSendCompletedVoteListJson();

    public JSONObject fabricateInitiateRestartJson();

    public JSONObject fabricateTerminatePartyJson();

}
