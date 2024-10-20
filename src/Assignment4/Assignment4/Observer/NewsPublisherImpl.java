package Assignment4.Observer;

import java.util.ArrayList;
import java.util.List;

public class NewsPublisherImpl implements NewsPublisher {
    private List<Observer> subscriberList = new ArrayList<>();

    @Override
    public void registerSubscriber(Observer observer) {
        subscriberList.add(observer);
    }

    @Override
    public void unregisterSubscriber(Observer observer) {
        subscriberList.remove(observer);
    }

    @Override
    public void informSubscribers(String topic, String article) {
        for (Observer subscriber : subscriberList) {
            subscriber.receiveUpdate(topic, article);
        }
    }

    public void releaseNews(String topic, String article) {
        System.out.println("Releasing news in topic: " + topic + " - " + article);
        informSubscribers(topic, article);
    }
}
