package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class ControllerRadioButton implements Initializable {
	@FXML
	private ToggleGroup grupo;

	@FXML
	    void enviarSelecionado() {
	    	RadioButton radio =(RadioButton) grupo.getSelectedToggle();
	    	System.out.println("Você escolheu " + radio.getText());
	    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

}
