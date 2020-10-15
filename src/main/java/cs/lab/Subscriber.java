package cs.lab;

public class Subscriber {
    criber subcriscriber;
    private boolean received = false;

    public void subscribe(String channel){
        MessageBroker.getInstance().registerSubscriber(subscriber, channel);
    }

    public void receivedNotification(){
        received = true;
    }
}
