import cs.lab.MessageBroker;
import cs.lab.Publisher;
import cs.lab.Subscriber;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class MessageBrokerTest {

    @Test
    public void test1() {
        MessageBroker newMessageBroker=MessageBroker.getInstance();
        Publisher newpublisher=new Publisher("Example topic");
        Subscriber subscriber1=new Subscriber("Example topic");
        newMessageBroker.registerSubscriber(subscriber1,"Example topic");
        newpublisher.publish();
        newMessageBroker.notifySubscribers("Example topic");
        Assert.assertTrue(subscriber1.receivedNotification());
    }

    @Test
    public void test2() {
        MessageBroker newMessageBroker=MessageBroker.getInstance();
        Publisher newpublisher=new Publisher("Example topic");
        Subscriber subscriber1=new Subscriber("Example topic");
        newMessageBroker.registerSubscriber(subscriber1,"Example topic");
        newpublisher.publish();


    }
    @Test(invocationCount = 50, threadPoolSize = 50)
    public void test3() {
        MessageBroker newMessageBroker=MessageBroker.getInstance();
        Publisher newpublisher=new Publisher("Example topic");
        Subscriber subscriber1=new Subscriber("Example topic");
        Subscriber subscriber2=new Subscriber("Example topic");
        Subscriber subscriber3=new Subscriber("Example topic");
        Subscriber subscriber4=new Subscriber("Example topic");
        newMessageBroker.registerSubscriber(subscriber1,"Example topic");
        newMessageBroker.registerSubscriber(subscriber2,"Example topic");
        newMessageBroker.registerSubscriber(subscriber3,"Example topic");
        newMessageBroker.registerSubscriber(subscriber4,"Example topic");
        newMessageBroker.removeSubscriber(subscriber2,"Example topic");

    }
}
