package co.edu.uniquindio.cafeteria.cafeteria.Decorator;

import co.edu.uniquindio.cafeteria.cafeteria.Service.ICoffe;

public class FrenchPressDecorator extends CoffeDecorator{

    public FrenchPressDecorator(ICoffe coffe) {
        super(coffe);
    }

    @Override
    public String getDescripcion() {
        return decoratedCoffee.getDescripcion() + ", French Press";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 2.0;
    }
}
