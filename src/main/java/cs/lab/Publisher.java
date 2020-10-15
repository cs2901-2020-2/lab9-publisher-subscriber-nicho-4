package cs.lab;

public class Publisher {
    String topic;
    public Publisher(String topic){this.topic=topic;}

    public void publish(){
        MessageBroker.getInstance().notifySubscribers(this.topic);
    }
}
