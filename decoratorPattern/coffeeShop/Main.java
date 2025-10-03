package decoratorPattern.coffeeShop;

import decoratorPattern.coffeeShop.addOns.Caramel;
import decoratorPattern.coffeeShop.addOns.Milk;
import decoratorPattern.coffeeShop.addOns.Sugar;
import decoratorPattern.coffeeShop.coffee.Coffee;
import decoratorPattern.coffeeShop.coffee.Laate;

public class Main {
    public static void main(String[] args) {
        Coffee laate = new Milk(new Sugar(new Laate()));
        System.out.println(laate.cost());
        laate = new Milk(new Caramel(new Laate()));
        System.out.println(laate.cost());
    }
}
