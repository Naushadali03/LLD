package decoratorPattern.notificationSystem;

import decoratorPattern.notificationSystem.notifier.BaseNotifier;
import decoratorPattern.notificationSystem.notifier.Notifier;
import decoratorPattern.notificationSystem.notifierDecorator.EmailNotifier;
import decoratorPattern.notificationSystem.notifierDecorator.SlackNotifier;

public class Main {
    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier(new BaseNotifier());
        System.out.println(notifier.sendNotification("Hi, how r u"));
        notifier = new SlackNotifier(new BaseNotifier());
        System.out.println(notifier.sendNotification("Hello..."));
    }
}
