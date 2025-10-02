package decoratorPattern.pizza.toppingDecorator;

import decoratorPattern.pizza.basePizza.BasePizza;

public abstract class PizzaTopping  extends BasePizza{
    public abstract int cost();
}
