package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class BorderPaneMain extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane root = FXMLLoader.load(getClass().getResource("FxmlBorderPane.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
