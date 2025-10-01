package observerPattern.observer;

import observerPattern.observable.StockObservable;

public class MobileNotificationObserver implements NotificationObserver{

    private final StockObservable stockObservable;
    private String userName;
    public MobileNotificationObserver(String userName,StockObservable stockObservable){
        this.stockObservable=stockObservable;
        this.userName=userName;
    }

    @Override
    public void update() {
        sendMsg(userName,"Product is in stock hurry up!");
    }

    private void sendMsg(String userName,String msg){
        System.out.println("Message sent to username: "+userName);
    }
    
}
