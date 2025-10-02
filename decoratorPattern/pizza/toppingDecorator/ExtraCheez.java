package decoratorPattern.pizza.toppingDecorator;

import decoratorPattern.pizza.basePizza.BasePizza;

public class ExtraCheez extends PizzaTopping{

    private final BasePizza basePizza;

    public ExtraCheez(BasePizza basePizza){
        this.basePizza=basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+10;
    }
    
}
