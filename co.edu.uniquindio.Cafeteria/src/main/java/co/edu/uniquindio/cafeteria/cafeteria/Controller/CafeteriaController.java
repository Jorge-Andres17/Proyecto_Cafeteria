package co.edu.uniquindio.cafeteria.cafeteria.Controller;

import co.edu.uniquindio.cafeteria.cafeteria.Decorator.*;
import co.edu.uniquindio.cafeteria.cafeteria.Model.PasillaCoffe;
import co.edu.uniquindio.cafeteria.cafeteria.Model.SimpleCoffe;
import co.edu.uniquindio.cafeteria.cafeteria.Model.SpecialCoffe;
import co.edu.uniquindio.cafeteria.cafeteria.Service.ICoffe;

public class CafeteriaController {

    public CafeteriaController() {

    }

    public AzucarDecorator seleccionAzucar(ICoffe cafe) {
        return new AzucarDecorator(cafe);
    }

    public CanelaDecorator seleccionCanela(ICoffe cafe) {
        return new CanelaDecorator(cafe);
    }

    public SimpleCoffe getCoffeSimple() {
        return new SimpleCoffe();
    }

    public SpecialCoffe getSpecialCoffe() {
        return new SpecialCoffe();
    }

    public PasillaCoffe getPasillaCoffe() {
        return new PasillaCoffe();
    }

    public WhiskyDecorator seleccionWhisky(ICoffe cafe) {
        return new WhiskyDecorator(cafe);
    }

    public LecheDecorator seleccionLeche(ICoffe cafe) {
        return new LecheDecorator(cafe);
    }

    public V60Decorator seleccionV60(ICoffe cafe) {
        return new V60Decorator(cafe);
    }

    public EspressoDecorator seleccionEspresso(ICoffe cafe) {
        return new EspressoDecorator(cafe);
    }


    public FrenchPressDecorator seleccionFrenchPress(ICoffe cafe) {
        return new FrenchPressDecorator(cafe);
    }

    public ColdBrewDecorator seleccionColdBrew(ICoffe cafe) {
        return new ColdBrewDecorator(cafe);
    }
}
