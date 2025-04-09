package co.edu.uniquindio.cafeteria.cafeteria.Decorator;

import co.edu.uniquindio.cafeteria.cafeteria.Service.ICoffe;

public class V60Decorator extends CoffeDecorator{

    public V60Decorator(ICoffe coffe) {
        super(coffe);
    }

    @Override
    public String getDescripcion() {
        return decoratedCoffee.getDescripcion() + ", V60";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 1.9;
    }
}
