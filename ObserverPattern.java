import java.util.ArrayList;
import java.util.List;

// Subject (Publisher)
class NewspaperPublisher {
    private List<Subscriber> subscribers = new ArrayList<>();

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers(String news) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(news);
        }
    }
}

// Observer (Subscriber)
interface Subscriber {
    void update(String news);
}

// Concrete Observer 1
class Subscriber1 implements Subscriber {
    @Override
    public void update(String news) {
        System.out.println("Subscriber 1 received news: " + news);
    }
}

// Concrete Observer 2
class Subscriber2 implements Subscriber {
    @Override
    public void update(String news) {
        System.out.println("Subscriber 2 received news: " + news);
    }
}

// Main class for testing
public class ObserverPattern {
    public static void main(String[] args) {
        NewspaperPublisher publisher = new NewspaperPublisher();  // Subject

        Subscriber subscriber1 = new Subscriber1();  // Observer 1
        Subscriber subscriber2 = new Subscriber2();  // Observer 2

        publisher.addSubscriber(subscriber1);
        publisher.addSubscriber(subscriber2);

        publisher.notifySubscribers("New article published!");  // Subject notifies observers
    }
}
