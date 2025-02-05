package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Inverti extends Application {
	
	TextField tfNumeri= new TextField();
	Label lNumeri= new Label("Numeri");
	Label lVettore= new Label("Vet B");
	Label lRisultato= new Label("???");
	Button bInverti= new Button("Inverti");
	
	@Override
	public void start(Stage finestra) throws Exception {
		GridPane principale= new GridPane();
		
		principale.add(tfNumeri, 1, 0);
		principale.add(lNumeri, 0, 0);
		principale.add(bInverti, 1, 1);
		principale.add(lVettore, 0, 2);
		principale.add(lRisultato, 1, 2);
		
		Scene scena = new Scene(principale);
		finestra.setTitle("Inverti");
		finestra.setScene(scena);
		finestra.show();

		bInverti.setOnAction( e -> eseguiInverti() );	
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
	private void eseguiInverti() {
		int numeri[],i=0;
		numeri=testoNumeri(tfNumeri.getText());
		int inverso[]= new int[numeri.length];
		for(int pos=numeri.length-1;pos>-1;pos--,i++) {
			inverso[i]=numeri[pos];
		}
		String se="";
		for(int pos=0;pos<inverso.length;pos++) {
			if(pos==0) {
				se+=""+(inverso[pos]);
			}else {
				se+=";"+(inverso[pos]);
			}
		}
		lRisultato.setText(se);
	}
	public static void main(String[] args) {
		launch(args);
	}

}
