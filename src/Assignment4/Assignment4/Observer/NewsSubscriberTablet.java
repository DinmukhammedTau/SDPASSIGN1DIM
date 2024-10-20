package Assignment4.Observer;

public class NewsSubscriberTablet implements Observer {
    @Override
    public void receiveUpdate(String topic, String article) {
        System.out.println("Tablet received update: " + article);
    }
}
