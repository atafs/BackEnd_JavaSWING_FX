package gui.tests;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Gui_v1 extends Application {

    Stage window;
    private String pathCSS = "gui/styles/myStyle_v1.css";

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        primaryStage.setResizable(false);
        window.setTitle("Ellucian - Jira Issues");
        
        //GridPane with 10px padding around edge
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        //Sign up
        Button signUpButton = new Button("Sign Up1");
        GridPane.setConstraints(signUpButton, 0, 1);
        signUpButton.getStyleClass().add("button-blue");
        
        Button signUpButton2 = new Button("Sign Up2");
        GridPane.setConstraints(signUpButton2, 1, 1);
        signUpButton2.getStyleClass().add("button-red");
        
        Button signUpButton3 = new Button("Sign Up3");
        GridPane.setConstraints(signUpButton3, 2, 1);
        signUpButton3.getStyleClass().add("button-green");
        
        Button signUpButton4 = new Button("Sign Up4");
        GridPane.setConstraints(signUpButton4, 3, 1);
        signUpButton4.getStyleClass().add("button-purple");
        
        // simple displays ImageView the image as is
        Image image = new Image("media/morphis.jpg");
        ImageView iv1 = new ImageView();
        iv1.setImage(image);
        
        //Add everything to grid
        grid.getChildren().addAll(signUpButton, signUpButton2, signUpButton3, signUpButton4);

        Scene scene = new Scene(grid, 380, 400);
        scene.getStylesheets().add(pathCSS);
        window.setScene(scene);
        window.show();
    }


}