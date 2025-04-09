package co.edu.uniquindio.cafeteria.cafeteria.Decorator;

import co.edu.uniquindio.cafeteria.cafeteria.Service.ICoffe;

public class AzucarDecorator extends CoffeDecorator{

    public AzucarDecorator(ICoffe coffe) {
        super(coffe);
    }

    @Override
    public String getDescripcion() {
        return decoratedCoffee.getDescripcion() + ", Azucar";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 0.3;
    }
}
