package americo.main.main20.view;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

	public Button button;
	
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("View is now loaded!");
    }
  
    //LISTENNER
    public void handleButtonClick() {
    	System.err.println("run some code the user doesn�t see");
    	button.setText("stop touching me!!! ;-)");
    }

}