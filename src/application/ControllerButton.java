package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ControllerButton implements Initializable {

	@FXML
	private Label labelOlaMundo;
	@FXML
	private TextField txtNome;
	

	@FXML
	private void acaoDoBotao(ActionEvent event) {
		System.out.println("Vc clicou");
		labelOlaMundo.setText("Ola mundo: " + txtNome.getText());
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

}
