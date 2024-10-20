package Assignment4.Observer;

public class NewsSubscriberSmartphone implements Observer {
    @Override
    public void receiveUpdate(String topic, String article) {
        if ("Sports".equals(topic)) {
            System.out.println("Smartphone received sports update: " + article);
        }
    }
}
