package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import model.Categoria;

public class ControllerComboBox implements Initializable {
	@FXML
	private ComboBox<Categoria> cdCategorias;

	private List<Categoria> categorias = new ArrayList<>();

	private ObservableList<Categoria> obsCategorias;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		carregarCategorias();
	}

	public void carregarCategorias() {
		Categoria categoria1 = new Categoria(1, "Bebidas");
		Categoria categoria2 = new Categoria(2, "Comidas");
		categorias.add(categoria1);
		categorias.add(categoria2);

		obsCategorias = FXCollections.observableArrayList(categorias);
		
		cdCategorias.setItems(obsCategorias);
	}

}
