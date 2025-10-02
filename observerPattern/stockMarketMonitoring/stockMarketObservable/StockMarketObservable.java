package observerPattern.stockMarketMonitoring.stockMarketObservable;

import observerPattern.stockMarketMonitoring.stockObserver.StockObserver;

public interface StockMarketObservable {
    public void add(StockObserver stockObserver);
    public void remove(StockObserver stockObserver);
    public void notifyStockPrice();
    public double setPrice(double price);
    public double getprice();

}
