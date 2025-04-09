package co.edu.uniquindio.cafeteria.cafeteria.Decorator;

import co.edu.uniquindio.cafeteria.cafeteria.Service.ICoffe;

public class CanelaDecorator extends CoffeDecorator{

    public CanelaDecorator(ICoffe coffe) {
        super(coffe);
    }

    @Override
    public String getDescripcion() {
        return decoratedCoffee.getDescripcion() + ", Canela";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 0.5;
    }
}
