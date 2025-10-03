package decoratorPattern.pizza;

import decoratorPattern.pizza.basePizza.BasePizza;
import decoratorPattern.pizza.basePizza.Margherita;
import decoratorPattern.pizza.basePizza.VegDelight;
import decoratorPattern.pizza.toppingDecorator.ExtraCheez;
import decoratorPattern.pizza.toppingDecorator.Jelpiino;

public class Main {
    public static void main(String[] args) {
        BasePizza basePizza = new ExtraCheez(new Margherita());
        System.out.println(basePizza.cost());
        basePizza = new Jelpiino(new ExtraCheez(new Margherita()));
        System.out.println(basePizza.cost());
        BasePizza basePizza2 = new ExtraCheez(new Jelpiino(new VegDelight()));
        System.out.println(basePizza2.cost());
    }
}
