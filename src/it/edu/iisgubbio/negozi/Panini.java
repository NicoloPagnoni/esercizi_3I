package it.edu.iisgubbio.negozi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Panini extends Application {
	
	Label lPersone= new Label("Persone");
	Label lPrezzo= new Label("Prezzo");
	Label lTotale= new Label("??");
	Label lScontato= new Label("Scontato");
	Label lSconto= new Label("??");
	TextField tfPersone= new TextField();
	TextField tfPrezzo= new TextField();
	Button bTotale= new Button("Totale");
	
	@Override
	public void start(Stage finestra) throws Exception {
		GridPane principale= new GridPane();
		
		principale.add(lPersone, 0, 0);
		principale.add(lPrezzo, 0, 1);
		principale.add(lScontato, 0, 3);
		principale.add(tfPersone, 1, 0);
		principale.add(tfPrezzo, 1, 1);
		principale.add(bTotale, 0, 2);
		principale.add(lTotale, 1, 2);
		principale.add(lSconto, 1, 3);
		
		Scene scena = new Scene(principale);
		scena.getStylesheets().add("it/edu/iisgubbio/negozi/Panini.css");
		principale.getStyleClass().add("principale");
		lTotale.getStyleClass().add("risultato");
		lSconto.getStyleClass().add("risultato");
		
		finestra.setTitle("Panini");
		finestra.setScene(scena);
		finestra.show();
		
		bTotale.setOnAction( e -> eseguiTotale() );
	}
	private void eseguiTotale() {
		int persone;
		double prezzo,sconto,totale;
		String sSconto,sTotale;
		
		persone=Integer.parseInt(tfPersone.getText());
		prezzo= Double.parseDouble(tfPrezzo.getText());
		sconto=0;
		totale=persone*prezzo;
		if(totale>=100) {
			sconto=totale-(totale*20/100);
		}else {
			if(totale>=50) {
				sconto=totale-(totale*10/100);
			}
		}
		sSconto=""+sconto;
		sTotale=""+totale;
		lSconto.setText(sSconto);
		lTotale.setText(sTotale);
	}
	public static void main(String[] args) {
		 launch(args);
	}		

}
