package javaFx._10_javaFx_newWindowChat;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainFX extends Application {

	 @Override
	    public void start(final Stage stage) throws Exception {
		 try {
				//BorderPane root = new BorderPane();
				//Scene scene = new Scene(root,400,400);
				
			 	stage.initStyle(StageStyle.TRANSPARENT); // here it is

		        Group rg = new Group();
		        Scene scene = new Scene(rg, 320, 240, Color.TRANSPARENT);
				scene.getStylesheets().add("javaFx/_10_javaFx_newWindowChat/myStyle.css");

		        stage.setScene(scene);
		        stage.show();

		        Rectangle r = new Rectangle(5, 5, stage.getWidth() - 10, stage.getHeight() - 10);
		        r.setFill(Color.STEELBLUE);
		        r.setEffect(new DropShadow());
		        rg.getChildren().add(r);
			} catch(Exception e) {
				e.printStackTrace();
			}
		 
		 

	    }

	    public static void main(String[] args) {
	        launch();
	    }
}