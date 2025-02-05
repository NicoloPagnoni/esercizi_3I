package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ScambioMinMax extends Application{
	
	TextField tfNumeri= new TextField();
	Button bScambio= new Button("Scambio");
	Label lElenco= new Label("Elenco");
	Label lRisultato= new Label("Risultato");
	Label lRisposta= new Label("???");
	
	@Override
	public void start(Stage finestra) throws Exception {
		GridPane principale= new GridPane();
		
		principale.add(tfNumeri, 1, 0);
		principale.add(lElenco, 0, 0);
		principale.add(lRisultato, 0, 1);
		principale.add(lRisposta, 1, 1);
		principale.add(bScambio, 1, 2);
		
		Scene scena = new Scene(principale);
		finestra.setTitle("Scambio Min Max");
		finestra.setScene(scena);
		finestra.show();

		bScambio.setOnAction( e -> eseguiScambio() );	
	}
	private void eseguiScambio() {
		String testo,parti[];
		int massimo,minimo, cMax=0, cMin=0;
		testo=tfNumeri.getText();
		parti=testo.split(" ");
		int numeri[]= new int[parti.length];
		for(int pos=0;pos<parti.length;pos++) {
			numeri[pos]=Integer.parseInt(parti[pos]);
		}
		massimo=numeri[0];
		for(int pos=1;pos<numeri.length;pos++) {
			if(numeri[pos]>massimo) {
				massimo=numeri[pos];
				cMax=pos;
			}	
		}
		minimo=numeri[0];
		for(int pos=1;pos<numeri.length;pos++) {
			if(numeri[pos]<minimo) {
				minimo=numeri[pos];
				cMin=pos;
			}	
		}
		numeri[cMin]=massimo;
		numeri[cMax]=minimo;
		String se="";
		for(int pos=0;pos<numeri.length;pos++) {
			if(pos==0) {
				se+=""+(numeri[pos]);
			}else {
				se+=";"+(numeri[pos]);
			}
		}
		lRisposta.setText(se);
	}
	public static void main(String[] args) {
		launch(args);
	}
}
