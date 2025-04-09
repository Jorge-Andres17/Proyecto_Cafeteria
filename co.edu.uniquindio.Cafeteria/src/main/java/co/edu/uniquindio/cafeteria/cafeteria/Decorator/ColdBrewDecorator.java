package co.edu.uniquindio.cafeteria.cafeteria.Decorator;

import co.edu.uniquindio.cafeteria.cafeteria.Service.ICoffe;

public class ColdBrewDecorator extends CoffeDecorator{

    public ColdBrewDecorator(ICoffe coffe) {
        super(coffe);
    }

    @Override
    public String getDescripcion() {
        return decoratedCoffee.getDescripcion() +", Cold Brew";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 1.5;
    }
}
