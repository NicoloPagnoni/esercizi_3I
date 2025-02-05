package it.edu.iisgubbio.negozi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Interessi extends Application{
	
	Label lCapitale= new Label("Capitale iniziale");
	Label lAnni= new Label("Anni");
	Label lInteressi= new Label("Interessi");
	Label lRisultato= new Label("??");
	TextField tfCapitale= new TextField();
	TextField tfAnni= new TextField();
	TextField tfInteressi= new TextField();
	Button bCalcola= new Button("Calcola");

	@Override
	public void start(Stage finestra) throws Exception {
		GridPane principale= new GridPane();
		
		principale.add(lCapitale, 0, 0);
		principale.add(lAnni, 0, 1);
		principale.add(lInteressi, 0, 2);
		principale.add(lRisultato, 1, 3);
		principale.add(tfCapitale, 1, 0);
		principale.add(tfAnni, 1, 1);
		principale.add(tfInteressi, 1, 2);
		principale.add(bCalcola, 0, 3);
		
		Scene scena = new Scene(principale);
		
		scena.getStylesheets().add("it/edu/iisgubbio/negozi/Interessi.css");
		principale.getStyleClass().add("principale");
		lRisultato.getStyleClass().add("risultato");
		finestra.setTitle("Interessi");
		finestra.setScene(scena);
		finestra.show();
		
		bCalcola.setOnAction( e -> eseguiCalcola() );
	}
	private void eseguiCalcola() {
		double capitaleIniziale,interessi,risultato,a;
		int anni;
		String sRisultato;
		
		capitaleIniziale=Double.parseDouble(tfCapitale.getText());
		interessi=Double.parseDouble(tfInteressi.getText());
		anni=Integer.parseInt(tfAnni.getText());
		risultato=capitaleIniziale;
		for(int x=1; x<=anni; x++) {
			risultato=risultato+risultato/100*interessi;
			
		}
		sRisultato=""+risultato;
		lRisultato.setText(sRisultato);
	}
	public static void main(String[] args) {
		 launch(args);
	}		
}
