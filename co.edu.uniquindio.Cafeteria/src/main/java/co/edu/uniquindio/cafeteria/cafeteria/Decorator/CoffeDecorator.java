package co.edu.uniquindio.cafeteria.cafeteria.Decorator;

import co.edu.uniquindio.cafeteria.cafeteria.Service.ICoffe;

public class CoffeDecorator implements ICoffe {
    protected ICoffe decoratedCoffee;

    public CoffeDecorator(ICoffe coffe) {
        this.decoratedCoffee = coffe;
    }

    @Override
    public String getDescripcion() {
        return decoratedCoffee.getDescripcion();
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost();
    }
}
