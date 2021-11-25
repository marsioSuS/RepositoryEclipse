package it.edu.iisgubbio.CoseACaso.AutoClicker;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class AutoClicker extends Application  {
	
	Label testo ;
	Label lPunti = new Label ("vaiii");
	Label lRisultato = new Label ("RISULTATO?");
	Button bClick = new Button ("CLICCAMI");
	
	int n= 10  , n1 = 0;
	
	public void  start (Stage primaryStage ) throws Exception {
		
		
		bClick.setOnAction(e -> calcolaClick());
		testo = new Label("go!!!");
	    
		 
		BorderPane pannello = new BorderPane();
		
		pannello.setTop(lPunti);
		// pannello.setBottom(lPunti);
		// pannello.setLeft(sinistra);
		pannello.setRight(testo);
        pannello.setCenter(bClick);
        
        lPunti.setMaxSize(500, 500);
		
		 Scene scene = new Scene(pannello);
		 primaryStage.setTitle("Hello Canvas!");
		 primaryStage.setScene(scene);
		 primaryStage.show();
		 
		 
		 Timeline timeline = new Timeline(new KeyFrame(
				 Duration.seconds(1), // ogni quanto va chiamata la funzione
				 x -> aggiornaTimer()));
			    timeline.setCycleCount(11);
			    timeline.play();
			    
		
		
	}

	private void aggiornaTimer () {

		testo.setText(""+ (n--));
	}
	private void calcolaClick() {
		int ntimer;
		ntimer = Integer.parseInt(testo.getText());
		n1++; 
		if (ntimer==0) {
			bClick.setDisable(true);
			
		}
		
		lPunti.setText("" + n1);
	
	}
	public static void main(String[] args) {
		launch(args);
	}
	

}
