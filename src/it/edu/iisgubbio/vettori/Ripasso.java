package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ripasso extends Application{
	
	TextField tfValori= new TextField();
	Button bRicerca= new Button("Ricerca");
	Label lValori= new Label("Valori");
	Label lPosizione= new Label("Posizione");
	Label lRPosizione= new Label("???");
	Label lMassimo= new Label("Max");
	Label lRMax= new Label("???");
	Label lElenco= new Label("Elenco");
	Label lRElenco= new Label("???");
	
	@Override
	public void start(Stage finestra) throws Exception {
		GridPane principale= new GridPane();
		
		principale.add(tfValori, 1, 0);
		principale.add(lValori, 0, 0);
		principale.add(lMassimo, 0, 1);
		principale.add(lRMax, 1, 1);
		principale.add(lPosizione, 0, 2);
		principale.add(lRPosizione, 1, 2);
		principale.add(lElenco, 0, 3);
		principale.add(lRElenco, 1, 3);
		principale.add(bRicerca, 1, 4);
		bRicerca.setMaxWidth(Integer.MAX_VALUE);
		
		Scene scena = new Scene(principale);
		finestra.setTitle("Ripasso");
		finestra.setScene(scena);
		finestra.show();

		bRicerca.setOnAction( e -> eseguiRicerca() );
	}
	private void eseguiRicerca() {
		String testo,parti[];
		int massimo, c=0;
		testo=tfValori.getText();
		parti=testo.split(" ");
		int numeri[]= new int[parti.length];
		for(int pos=0;pos<parti.length;pos++) {
			numeri[pos]=Integer.parseInt(parti[pos]);
		}
		massimo=numeri[0];
		for(int pos=1;pos<numeri.length;pos++) {
			if(numeri[pos]>massimo) {
				massimo=numeri[pos];
				c=pos;
			}	
		}
		String se="";
		for(int pos=0;pos<numeri.length;pos++) {
			se+=";"+(numeri[pos]);
		}
		lRMax.setText(""+massimo);
		lRPosizione.setText(""+c);
		lRElenco.setText(se);
	}
	public static void main(String[] args) {
		launch(args);
	}
}
