package start;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("../fxml/main.fxml"));
		primaryStage.setTitle("SeaBattle");
		primaryStage.setMinHeight(450);
		primaryStage.setMinWidth(700);
		Scene scene = new Scene(root, 700, 450);
		scene.getStylesheets().add(0, "/css/MainWindow.css");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {

		launch(args);
	}

}
