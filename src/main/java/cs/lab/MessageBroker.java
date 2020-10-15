package cs.lab;

import java.util.Hashtable;
import java.util.List;

public class MessageBroker {
    private Hashtable<String, List<Subscriber>> subscriberList;

    private static MessageBroker serverInstance;

    private MessageBroker(){
        this.subscriberList = new Hashtable<>();
    }

    public static MessageBroker getInstance() {
        if (serverInstance == null) {
            serverInstance = new MessageBroker();
        }
        return serverInstance;
    }

    public void registerSubscriber(Subscriber s, String channel){
        erList.get(channel).add(s);
    };

    public void removeSubscriber(Subscriber s, String channel){
        subscriberList.get(channel).remove(s);
    }
    
    public void notifySubscribers(String channel){
        List<Subscriber> subs = subscriberList.get(channel);
        for (Subscriber i : subs) {
            i.receivedNotification();
        }
    };

}
