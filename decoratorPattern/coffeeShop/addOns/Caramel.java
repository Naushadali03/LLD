package decoratorPattern.coffeeShop.addOns;

import decoratorPattern.coffeeShop.coffee.Coffee;

public class Caramel extends CoffeeAddOns{

    private final Coffee coffee;
    public Caramel(Coffee coffee){
        this.coffee=coffee;
    }

    @Override
    public double cost() {
        return coffee.cost()+40;
    }
    
}
