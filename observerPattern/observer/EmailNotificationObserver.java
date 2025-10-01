package observerPattern.observer;

import observerPattern.observable.StockObservable;

public class EmailNotificationObserver implements NotificationObserver{

    private final StockObservable stockObservable;
    private String emailId;

    public EmailNotificationObserver(String emailId,StockObservable stockObservable){
        this.stockObservable=stockObservable;
        this.emailId=emailId;
    }

    @Override
    public void update() {
        sendEmail(emailId,"Product is in stock hurry up!");
    }

    private void sendEmail(String emailId,String msg){
        System.out.println("Email sent to "+emailId);
    }
    
}
