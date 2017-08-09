package com.anull.game_module;

import org.json.JSONObject;

/**
 * Created by zhaoy on 8/6/2017.
 */

public interface GamePartyInterface {

    public void receiveConfirmInit(JSONObject json);

    public void receiveConfirmJoin(JSONObject json);

    public void receiveNParseJson();

    public JSONObject fabricateInitiatePartyJson();

    public JSONObject fabricateJoinPartyJson();

    public JSONObject fabricateStartPartyJson();

    public JSONObject fabricateSendAnswerJson();

    public JSONObject fabricateSendCompletedVoteListJson();

    public JSONObject fabricateInitiateRestartJson();

    public JSONObject fabricateTerminatePartyJson();

}
