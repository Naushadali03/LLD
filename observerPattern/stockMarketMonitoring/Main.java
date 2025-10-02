package observerPattern.stockMarketMonitoring;

import observerPattern.stockMarketMonitoring.stockMarketObservable.StockMarketObservable;
import observerPattern.stockMarketMonitoring.stockMarketObservable.StockMarketObservableImpl;
import observerPattern.stockMarketMonitoring.stockObserver.Investor;
import observerPattern.stockMarketMonitoring.stockObserver.StockObserver;

public class Main {
    public static void main(String[] args) {
        StockMarketObservable stockMarketObservable = new StockMarketObservableImpl();
        StockObserver investor1 = new Investor(stockMarketObservable, "xyz@gmail.com");
        StockObserver investor2 = new Investor(stockMarketObservable, "abc@gmail.com");
        StockObserver investor3 = new Investor(stockMarketObservable, "aere@gmail.com");
        stockMarketObservable.add(investor1);
        stockMarketObservable.add(investor2);
        stockMarketObservable.add(investor3);
        stockMarketObservable.setPrice(120.0);

    }
}
