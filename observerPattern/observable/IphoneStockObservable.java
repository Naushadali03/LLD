package observerPattern.observable;

import java.util.ArrayList;
import java.util.List;

import observerPattern.observer.NotificationObserver;

public class IphoneStockObservable implements StockObservable {

    List<NotificationObserver> notifications = new ArrayList<>();

    int stockCount;

    @Override
    public void add(NotificationObserver notificationObserver) {
        notifications.add(notificationObserver);
    }

    @Override
    public void remove(NotificationObserver notificationObserver) {
        notifications.remove(notificationObserver);
    }

    @Override
    public void notifyMe() {
        for(NotificationObserver notificationObserver : notifications){
            notificationObserver.update();
        }
    }

    @Override
    public int setData(int newStockCount) {
       if(stockCount==0){
            notifyMe();
       }
       stockCount+=newStockCount;
       return stockCount;
    }

    @Override
    public int getData() {
        return stockCount;
    }
    
}
