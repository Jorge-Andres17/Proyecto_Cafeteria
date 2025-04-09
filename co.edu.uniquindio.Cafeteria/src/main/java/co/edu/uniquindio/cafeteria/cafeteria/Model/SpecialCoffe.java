package co.edu.uniquindio.cafeteria.cafeteria.Model;

public class SpecialCoffe extends SimpleCoffe{

    @Override
    public String getDescripcion() {
        return "Cafe especial";
    }

    @Override
    public double getCost() {
        return 2.5;
    }
}
