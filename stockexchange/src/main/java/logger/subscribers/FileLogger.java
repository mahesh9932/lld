package logger.subscribers;

public class FileLogger implements SubscriberI{
    @Override
    public void update(String message) {
        System.out.println("File: " + message);
    }
}
