package logger.subscribers;

public class ConsoleLogger implements SubscriberI{
    @Override
    public void update(String message) {
        System.out.println("console: " + message);
    }
}
