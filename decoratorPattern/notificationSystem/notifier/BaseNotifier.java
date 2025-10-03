package decoratorPattern.notificationSystem.notifier;

public class BaseNotifier extends Notifier {

    @Override
    public String sendNotification(String msg) {
        return "sent notification on";
    }
    
}
