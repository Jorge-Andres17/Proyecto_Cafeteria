package co.edu.uniquindio.cafeteria.cafeteria.ViewController;

import co.edu.uniquindio.cafeteria.cafeteria.Controller.CafeteriaController;
import co.edu.uniquindio.cafeteria.cafeteria.Decorator.CoffeDecorator;
import co.edu.uniquindio.cafeteria.cafeteria.Service.ICoffe;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class CafeteriaViewController {
    CafeteriaController cafeteriaController;

    @FXML
    private Button btnCalcular;

    @FXML
    private CheckBox chAzucar;

    @FXML
    private CheckBox chCanela;

    @FXML
    private CheckBox chLeche;

    @FXML
    private CheckBox chWhisky;

    @FXML
    private ComboBox<String> cmbMetodoPreparacion;

    @FXML
    private Label lbCosto;

    @FXML
    private Label lbIngredientes;

    @FXML
    private RadioButton rbEspecial;

    @FXML
    private RadioButton rbPasilla;

    @FXML
    void onCalcular(ActionEvent event) {
        calcular();
    }

    private void calcular() {
        ICoffe cafe = tipoCafeSeleccionado();
        cafe = ingredientesSeleccionados(cafe);
        cafe = metodosPreparacion(cafe);

        lbIngredientes.setText("Ingredientes: " + cafe.getDescripcion());
        lbCosto.setText("Costo total: $" + String.format("%.2f", cafe.getCost()));
    }

    private ICoffe ingredientesSeleccionados(ICoffe cafe) {
        if (chAzucar.isSelected()) {
            cafe = cafeteriaController.seleccionAzucar(cafe);
        }
        if (chCanela.isSelected()) {
            cafe = cafeteriaController.seleccionCanela(cafe);
        }
        if (chLeche.isSelected()) {
            cafe = cafeteriaController.seleccionLeche(cafe);
        }
        if (chWhisky.isSelected()) {
            cafe = cafeteriaController.seleccionWhisky(cafe);
        }

        return cafe;
    }

    private ICoffe tipoCafeSeleccionado() {
        ICoffe seleccionado = null;
        if(rbEspecial.isSelected()) {
            seleccionado = cafeteriaController.getSpecialCoffe();
        }else if(rbPasilla.isSelected()) {
            seleccionado = cafeteriaController.getPasillaCoffe();
        }else {
            seleccionado = cafeteriaController.getCoffeSimple();
        }
        return seleccionado;
    }

    private ICoffe metodosPreparacion(ICoffe cafe) {
        String metodo = cmbMetodoPreparacion.getValue();
        if (metodo != null) {
            cafe = metodoSeleccionado(metodo, cafe);
        }
        return cafe;
    }

    private ICoffe metodoSeleccionado(String metodo,ICoffe cafe) {
        if (metodo.equalsIgnoreCase("V60")) {
            cafe = cafeteriaController.seleccionV60(cafe);
        } else if (metodo.equalsIgnoreCase("Espresso")) {
            cafe = cafeteriaController.seleccionEspresso(cafe);
        } else if (metodo.equalsIgnoreCase("French Press")) {
            cafe = cafeteriaController.seleccionFrenchPress(cafe);
        } else if (metodo.equalsIgnoreCase("Cold Brew")) {
            cafe = cafeteriaController.seleccionColdBrew(cafe);
        }
        return cafe;
    }

    public void initialize() {
        cafeteriaController = new CafeteriaController();
        ToggleGroup grupoTipoCafe = new ToggleGroup();
        rbPasilla.setToggleGroup(grupoTipoCafe);
        rbEspecial.setToggleGroup(grupoTipoCafe);
        cmbMetodoPreparacion.getItems().addAll("V60",
                "Espresso",
                "French Press",
                "Cold Brew");
        cmbMetodoPreparacion.setPromptText("Metodos de Preparacion");
    }
}

