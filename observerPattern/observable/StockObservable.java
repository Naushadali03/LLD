package observerPattern.observable;

import observerPattern.observer.NotificationObserver;

public interface StockObservable {
    public void add(NotificationObserver notificationObserver);
    public void remove(NotificationObserver notificationObserver);
    public void notifyMe();
    public int setData(int stockCount);
    public int getData();
}
