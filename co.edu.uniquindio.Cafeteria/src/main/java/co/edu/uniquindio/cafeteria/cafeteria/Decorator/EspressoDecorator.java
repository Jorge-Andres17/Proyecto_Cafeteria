package co.edu.uniquindio.cafeteria.cafeteria.Decorator;

import co.edu.uniquindio.cafeteria.cafeteria.Service.ICoffe;

public class EspressoDecorator extends CoffeDecorator {

    public EspressoDecorator(ICoffe coffe) {
        super(coffe);
    }

    @Override
    public String getDescripcion() {
        return decoratedCoffee.getDescripcion() + ", Espresso";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 1.6;
    }
}
