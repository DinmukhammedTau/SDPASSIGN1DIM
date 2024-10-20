package Assignment4.Observer;

public interface NewsPublisher {
    void registerSubscriber(Observer observer);
    void unregisterSubscriber(Observer observer);
    void informSubscribers(String topic, String article);
}
