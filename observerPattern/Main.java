package observerPattern;

import observerPattern.observable.IphoneStockObservable;
import observerPattern.observable.StockObservable;
import observerPattern.observer.EmailNotificationObserver;
import observerPattern.observer.MobileNotificationObserver;
import observerPattern.observer.NotificationObserver;

public class Main {
    public static void main(String[] args) {
        StockObservable iphonObservable = new IphoneStockObservable();
        NotificationObserver observer1 = new EmailNotificationObserver("xyz@gmail.com", iphonObservable);
        NotificationObserver observer2 = new EmailNotificationObserver("abc@gmail.com", iphonObservable);
        NotificationObserver observer3 = new MobileNotificationObserver("Wolf",iphonObservable);

        iphonObservable.add(observer1);
        iphonObservable.add(observer2);
        iphonObservable.add(observer3);

        iphonObservable.setData(10);
        iphonObservable.setData(100);
    }
}
