package co.edu.uniquindio.cafeteria.cafeteria.Decorator;

import co.edu.uniquindio.cafeteria.cafeteria.Service.ICoffe;

public class LecheDecorator extends CoffeDecorator{

    public LecheDecorator(ICoffe coffe) {
        super(coffe);
    }

    @Override
    public String getDescripcion() {
        return decoratedCoffee.getDescripcion() + ", Leche";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 0.5;
    }
}
