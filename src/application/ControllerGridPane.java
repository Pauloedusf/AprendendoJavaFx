package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ControllerGridPane implements Initializable {
	@FXML
	private TextField seuNome;

	@FXML
	private TextField seuSobrenome;
	@FXML

	private Label resultado;

    @FXML
    void acaoDoBotao(ActionEvent event) {
    	System.out.println(seuNome.getText() + " " + seuSobrenome.getText());
    	resultado.setText("Olá: " + seuNome.getText() + " " + seuSobrenome.getText());
    }
	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

}
