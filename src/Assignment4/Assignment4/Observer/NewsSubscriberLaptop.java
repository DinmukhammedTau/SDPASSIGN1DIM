package Assignment4.Observer;

public class NewsSubscriberLaptop implements Observer {
    @Override
    public void receiveUpdate(String topic, String article) {
        if ("Science".equals(topic)) {
            System.out.println("Laptop received science update: " + article);
        }
    }
}

