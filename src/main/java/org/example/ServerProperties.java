package org.example;

/**
 * User: HP
 * Date: 3/11/2021
 * Time: 11:29 AM
 */
import java.util.HashMap;

public class ServerProperties {

    static ServerProperties ServerPropertiesObject = null;

    static HashMap<String, Integer> processId = new HashMap<>();
    static String[] servers = {"glados.cs.rit.edu", "yes.cs.rit.edu", "rhea.cs.rit.edu"};
    static final int numberOfProcesses = servers.length;
    static String suffix = ".cs.rit.edu";

    private ServerProperties(){
        int number = 0;
        for(String serverName : servers){
            processId.put(serverName, number++);
        }
    }

    static ServerProperties getServerPropertiesObject(){
        if(ServerPropertiesObject == null){
            new ServerProperties();
        }
        return ServerPropertiesObject;
    }

}