package it.edu.iisgubbio.matematica;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Divisori extends Application{
	
	Label lNumero= new Label("Numero");
	Label lRisultato= new Label("??");
	TextField tfNumero= new TextField();
	Button bDivisori= new Button("Divisori");
	
	@Override
	public void start(Stage finestra) throws Exception {
		GridPane principale= new GridPane();
		
		principale.add(lNumero, 0, 0);
		principale.add(lRisultato, 0, 1, 3, 1);
		principale.add(tfNumero, 1, 0);
		principale.add(bDivisori, 2, 0);
		
		Scene scena = new Scene(principale);
		finestra.setTitle("Divisori");
		finestra.setScene(scena);
		finestra.show();
		
		bDivisori.setOnAction( e -> eseguiDivisori() );
	}
	private void eseguiDivisori() {
		int numero; boolean primoNumero;
		String sequenza;
		primoNumero = true;
		sequenza = "";
		numero = Integer.parseInt(tfNumero.getText());
		for( int n = 2; numero-1 >= n; n++) {
			if(numero%n==0) {
				if(primoNumero) {
					sequenza = (sequenza + n);
					primoNumero = false;
				} else {
					sequenza = (sequenza + ", " +n);
				}
			} 	
		}
		
		lRisultato.setText(sequenza);
	}
	public static void main(String[] args) {
		 launch(args);
	}		
}
