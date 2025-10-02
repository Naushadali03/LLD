package decoratorPattern.pizza.toppingDecorator;

import decoratorPattern.pizza.basePizza.BasePizza;

public class Jelpiino extends PizzaTopping {

    private final BasePizza basePizza;

    public Jelpiino(BasePizza basePizza){
        this.basePizza=basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+15;
    }
    
}
