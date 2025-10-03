package decoratorPattern.notificationSystem.notifierDecorator;

import decoratorPattern.notificationSystem.notifier.Notifier;

public class EmailNotifier extends NotifierDecorator{

    private final Notifier notifier;
    public EmailNotifier(Notifier notifier){
        this.notifier=notifier;
    }

    @Override
    public String sendNotification(String msg) {
       return notifier.sendNotification(msg) + " Email";
    }
    
}
