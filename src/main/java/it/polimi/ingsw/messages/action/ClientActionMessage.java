package it.polimi.ingsw.messages.action;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import it.polimi.ingsw.messages.Message;

public class ClientActionMessage extends Message {

    private String player;
    private Action action;

    public ClientActionMessage() {
        super();
        super.setStatus("ACTION");
    }

    public static ClientActionMessage getMessageFromJSON(String json) throws JsonSyntaxException {
        Gson gson = new Gson();
        return gson.fromJson(json, new TypeToken<ClientActionMessage>() {
        }.getType());
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }
}