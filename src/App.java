import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Cargar el archivo FXML
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));

        // Asignar la clase controladora al archivo FXML
        // FXMLLoader loader = new FXMLLoader(getClass().getResource("main_scene.fxml"));
        // loader.setController(new MainScene());

        // Configurar la escena
        Scene scene = new Scene(root, 650, 500);

        // Configurar el escenario principal y mostrarlo
        primaryStage.setScene(scene);
        primaryStage.setTitle("Task Manager");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    
}