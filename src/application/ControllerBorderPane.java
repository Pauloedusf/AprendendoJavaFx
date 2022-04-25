package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ControllerBorderPane implements Initializable {

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

	@FXML
	private Button botaoCentral;
	@FXML
	private Button botaoDireito;
	@FXML
	private Label botaoEscolhido;
	@FXML
	private Button botaoEsquerda;

	@FXML
	void cliqueEsquerda(ActionEvent event) {
		System.out.println("Botão Esquerdo escolhido!");
		botaoEscolhido.setText("Botao escolhido foi o ESQUERDO");
	}

	@FXML
	void cliqueCentral(ActionEvent event) {
		System.out.println("Botão Central escolhido!");
		botaoEscolhido.setText("Botao escolhido foi o CENTRAL");
	}

	@FXML
	void cliqueDireita(ActionEvent event) {
		System.out.println("Botão Direito escolhido!");
		botaoEscolhido.setText("Botao escolhido foi o DIREITO");
	}

}
