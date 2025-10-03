package decoratorPattern.notificationSystem.notifierDecorator;

import decoratorPattern.notificationSystem.notifier.Notifier;

public class SlackNotifier extends NotifierDecorator{

    private final Notifier notifier;
    
    public SlackNotifier(Notifier notifier){
        this.notifier=notifier;
    }

    @Override
    public String sendNotification(String msg) {
        return notifier.sendNotification(msg) + " Slack";
    }
    
}
