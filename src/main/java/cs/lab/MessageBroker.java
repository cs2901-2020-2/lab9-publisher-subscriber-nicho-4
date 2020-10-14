package cs.lab;

import java.util.List;

public class MessageBroker {
    Publisher publisher;
    public List<Subscriber> subscriberList;


    public void registerSubscriber(Subscriber s, String channel){};
    public void removeSubscriber(Subscriber s, String channel){};
    public void notifySubscribers(String channel){
        
    };

}
