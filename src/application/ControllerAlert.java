package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class ControllerAlert implements Initializable {

    @FXML
    private Button botaoConfirmacao;

    @FXML
    private Button botaoError;

    @FXML
    private Button botaoInformacao;

    @FXML
    private Button botaoWarning;

    @FXML
    void AcaoBotaoError(ActionEvent event) {
    	Alert alert = new Alert(Alert.AlertType.ERROR);
    	alert.setTitle("Exemplo botao ERROR");
    	alert.setHeaderText("Testando o alerta ERROR");
    	alert.setContentText("Conteudo do alerta ERROR");
    	alert.show();
    }

    @FXML
    void acaoBotaoConfirmacao(ActionEvent event) {
    	Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
    	alert.setTitle("Exemplo CONFIRMATION");
    	alert.setHeaderText("Testando o alerta CONFIRMATION");
    	alert.setContentText("Conteudo do alerta CONFIRMATION");
    	alert.show();
    }

    @FXML
    void acaoBotaoInformacao(ActionEvent event) {
    	Alert alert = new Alert(Alert.AlertType.INFORMATION);
    	alert.setTitle("Exemplo INFORMATION");
    	alert.setHeaderText("Testando o alerta INFORMATION");
    	alert.setContentText("Conteudo do alerta INFORMATION");
    	alert.show();
    }

    @FXML
    void acaoBotaoWarning(ActionEvent event) {
    	Alert alert = new Alert(Alert.AlertType.WARNING);
    	alert.setTitle("Exemplo");
    	alert.setHeaderText("Testando o alerta");
    	alert.setContentText("Conteudo do alerta");
    	alert.show();
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
