package decoratorPattern.notificationSystem.notifierDecorator;

import decoratorPattern.notificationSystem.notifier.Notifier;

public abstract class NotifierDecorator extends Notifier{

    @Override
    public abstract String sendNotification(String msg);
}
