package decoratorPattern.coffeeShop.addOns;

import decoratorPattern.coffeeShop.coffee.Coffee;

public class Milk extends CoffeeAddOns{

    private final Coffee coffee;
    public Milk(Coffee coffee){
        this.coffee=coffee;
    }

    @Override
    public double cost() {
        return coffee.cost()+50;
    }
    
}
