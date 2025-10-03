package decoratorPattern.notificationSystem.notifierDecorator;

import decoratorPattern.notificationSystem.notifier.Notifier;

public class SMSNotifier extends NotifierDecorator{
    private final Notifier notifier;
    public SMSNotifier(Notifier notifier){
        this.notifier=notifier;
    }
    @Override
    public String sendNotification(String msg) {
      return notifier.sendNotification(msg)+" SMS";
    }
}
