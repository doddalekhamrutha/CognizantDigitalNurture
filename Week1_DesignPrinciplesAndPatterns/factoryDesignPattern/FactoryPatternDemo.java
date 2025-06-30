package factoryDesignPattern;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        Notification notification1 = factory.createNotification("EMAIL");
        notification1.notifyUser();

        Notification notification2 = factory.createNotification("SMS");
        notification2.notifyUser();

        Notification notification3 = factory.createNotification("PUSH");
        notification3.notifyUser();
    }
}

