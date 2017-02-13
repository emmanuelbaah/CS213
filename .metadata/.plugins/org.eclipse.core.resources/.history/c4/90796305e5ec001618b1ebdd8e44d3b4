package FxTesting1.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FxController {
	
	@FXML Button f2c;
	@FXML Button c2f;
	@FXML TextField f;
	@FXML TextField c;
	
	public void convert(ActionEvent e){
		Button b = (Button)e.getSource();
		
		if(b==f2c){
			c.setText("un travailler");
		}else if (b==c2f){
			f.setText("deux cadets ");
		}else{
			System.out.println("Something wrong?");
		}
	}
}
