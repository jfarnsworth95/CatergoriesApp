package com.anull.network_module;

import java.io.IOException;
import java.net.URI;

import javax.websocket.ContainerProvider;
import javax.websocket.DeploymentException;
import javax.websocket.Session;
import javax.websocket.WebSocketContainer;
import javax.ws.rs.client.Client;

/**
 * Created by zhaoy on 8/29/2017.
 */

public class ConnectionEstablisher {
    private static String uri = "";


    public static Session establishGeneralConnection(){
        WebSocketContainer container = null;
        Session session = null;

        try {

            container = ContainerProvider.getWebSocketContainer();
            session = container.connectToServer(ClientEndPoint.class, URI.create(ConnectionEstablisher.uri));
        } catch (DeploymentException e) {
            // Noting connection issue.
        } catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }




}
