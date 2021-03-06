package javaFx._8_javaFx_newWithTitle;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MainFX extends Application
{

    @Override
    public void start(Stage stage)
    {

        StackPane root = new StackPane();
        Scene scene = new Scene(root, 300, 250);

        // set icon
        stage.getIcons().add(new Image("javaFx/media/morphisICON.jpg"));

        // set title
        stage.setTitle("Wow!! Stackoverflow Icon");
        stage.setScene(scene); 	
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        launch(args);
    }
}