package application;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;

public class CheckBoxController {
	@FXML
    private CheckBox cbPhp;

    @FXML
    private CheckBox cbJava;

    @FXML
    void pegarValores() {
    	System.out.println(cbJava.selectedProperty().getValue());
    	System.out.println(cbPhp.selectedProperty().getValue());
    }

}
