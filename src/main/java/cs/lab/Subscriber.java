package cs.lab;

public class Subscriber {
    private boolean received = false;

    public Subscriber(String topic){
        MessageBroker.getInstance().registerSubscriber(this,topic);
    }
    public void newmessage(){
        this.received=Boolean.TRUE;
    };
    public boolean receivedNotification(){
        return received;
    }
}
