package americo.main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main00 extends Application {

	//ATTRIBUTES
    Stage window;
    Button button;

    //MAIN
    public static void main(String[] args) {
        launch(args);
    }

    //START
    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Americo - JavaFX");
        button = new Button("Click me");

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);

        window.setScene(scene);
        window.show();
    }


}