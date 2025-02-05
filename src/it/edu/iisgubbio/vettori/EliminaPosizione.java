package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class EliminaPosizione extends Application {
	
	TextField tfNumeri= new TextField();
	TextField tfPosizione= new TextField();
	Button bScambio= new Button("Scambio");
	Label lElimina= new Label("Elimina posizione");
	Label lElenco= new Label("Elenco");
	Label lRisultato= new Label("Risultato");
	Label lRisposta= new Label("???");
	
	@Override
	public void start(Stage finestra) throws Exception {
		GridPane principale= new GridPane();
		
		principale.add(tfNumeri, 1, 0);
		principale.add(tfPosizione, 1, 1);
		principale.add(lElimina, 0, 1);
		principale.add(lElenco, 0, 0);
		principale.add(lRisultato, 0, 2);
		principale.add(lRisposta, 1, 2);
		principale.add(bScambio, 1, 3);
		
		Scene scena = new Scene(principale);
		finestra.setTitle("Scambio Min Max");
		finestra.setScene(scena);
		finestra.show();

		bScambio.setOnAction( e -> eseguiScambio() );	
	}
	int[] testoNumeri (String testo) {
		String parti[];
		int vettoreNumeri[];
		parti= testo.split(" ");
		vettoreNumeri= new int[parti.length];
		for(int i=0;i<parti.length;i++) {
			vettoreNumeri[i]=Integer.parseInt(parti[i]);
		}
		return vettoreNumeri;
	}
	private void eseguiScambio() {
		int numeri[],q=0, posizione;
		boolean presente=false;
		posizione=Integer.parseInt(tfPosizione.getText());
		numeri=testoNumeri(tfNumeri.getText());
		int vettore[]= new int[numeri.length];
		for(int pos=0;pos<numeri.length;pos++) {
			presente=false;
			if(pos==posizione) {
				presente=true;
			}
			if(presente==false) {
				vettore[q]=numeri[pos];
				q+=1;
			}
		}
		int nuovo[]= new int[q];
		for(int pos=0;pos<q;pos++) {
			nuovo[pos]=vettore[pos];
		}
		String se="";
		for(int pos=0;pos<nuovo.length;pos++) {
			se+=","+(nuovo[pos]);

		}
		lRisposta.setText(se);
	}
	public static void main(String[] args) {
		launch(args);
	}

}
