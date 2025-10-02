package observerPattern.stockMarketMonitoring.stockObserver;

import observerPattern.stockMarketMonitoring.stockMarketObservable.StockMarketObservable;

public class Investor implements StockObserver{
    private final StockMarketObservable stockMarketObservable;
    private String emailId;
    public Investor(StockMarketObservable stockMarketObservable,String emailId){
        this.stockMarketObservable=stockMarketObservable;
        this.emailId=emailId;

    }

    @Override
    public void update() {
        sendNotification(emailId,"Now stock price is "+stockMarketObservable.getprice());
    }

    private void sendNotification(String emailId,String msg){
        System.out.println("sent stock price notification to: "+emailId);
        System.out.println(msg);
    }
    
}
