package observerPattern.stockMarketMonitoring.stockMarketObservable;

import java.util.ArrayList;
import java.util.List;

import observerPattern.stockMarketMonitoring.stockObserver.StockObserver;

public class StockMarketObservableImpl implements StockMarketObservable{

    private List<StockObserver> stockObservers = new ArrayList<>();

     private double price=80.6;

    @Override
    public void add(StockObserver stockObserver) {
        stockObservers.add(stockObserver);
    }

    @Override
    public void remove(StockObserver stockObserver) {
       stockObservers.remove(stockObserver);
    }

    @Override
    public void notifyStockPrice() {
        for(StockObserver stockObserver : stockObservers){
            stockObserver.update();
        }
    }

    @Override
    public double setPrice(double newPrice) {
        if(price!=newPrice){
            this.price=newPrice;
            notifyStockPrice();
        }
        return price;
    }

    @Override
    public double getprice() {
       return this.price;
    }
    
}
