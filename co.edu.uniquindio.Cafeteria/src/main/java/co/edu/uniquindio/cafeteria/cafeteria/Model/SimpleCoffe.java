package co.edu.uniquindio.cafeteria.cafeteria.Model;

import co.edu.uniquindio.cafeteria.cafeteria.Service.ICoffe;

public class SimpleCoffe implements ICoffe {

    @Override
    public String getDescripcion() {
        return "Simple Coffe";
    }

    @Override
    public double getCost() {
        return 2.0;
    }
}
