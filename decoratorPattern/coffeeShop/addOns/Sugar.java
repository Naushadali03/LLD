package decoratorPattern.coffeeShop.addOns;

import decoratorPattern.coffeeShop.coffee.Coffee;

public class Sugar extends CoffeeAddOns{

    private final Coffee coffee;
    public Sugar(Coffee coffee){
        this.coffee=coffee;
    }

    @Override
    public double cost() {
       return coffee.cost()+30;
    }
    
}
