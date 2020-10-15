package cs.lab;

import java.util.Hashtable;
import java.util.Vector;

public class MessageBroker {
    private Hashtable<String, Vector<Subscriber>> subscriberList;

    private static MessageBroker serverInstance;

    private MessageBroker(){this.subscriberList = new Hashtable<>();}

    public static MessageBroker getInstance() {
        if (serverInstance == null) {
            serverInstance = new MessageBroker();
        }
        return serverInstance;
    }

    public void registerSubscriber(Subscriber S, String topic){
        if(this.subscriberList.get(topic)==null){
            Vector<Subscriber> newlist = new Vector<Subscriber>();
            newlist.add(S);
            this.subscriberList.put(topic,newlist);
        }else {
            subscriberList.get(topic).add(S);
        }
    };

    public void removeSubscriber(Subscriber s, String topic){
        subscriberList.get(topic).remove(s);
    }
    
    public void notifySubscribers(String topic){
        Vector<Subscriber> Subscriberstopic=subscriberList.get(topic);
        for (Subscriber i:Subscriberstopic){
            i.newmessage();
        }
    };
    public int sizeHashtable(String topic){
        return this.subscriberList.get(topic).size();
    }
}
