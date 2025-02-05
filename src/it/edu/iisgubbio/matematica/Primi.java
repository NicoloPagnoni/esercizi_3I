package it.edu.iisgubbio.matematica;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Primi extends Application {
	
	Label lNumero= new Label("Numero");
	Label lRisultato= new Label("??");
	TextField tfNumero= new TextField();
	Button bPrimi= new Button("Primi");
	
	@Override
	public void start(Stage finestra) throws Exception {
		GridPane principale= new GridPane();
		
		principale.add(lNumero, 0, 0);
		principale.add(lRisultato, 0, 1, 3, 1);
		principale.add(tfNumero, 1, 0);
		principale.add(bPrimi, 2, 0);
		
		Scene scena = new Scene(principale);
		finestra.setTitle("Primi");
		finestra.setScene(scena);
		finestra.show();
		
		bPrimi.setOnAction( e -> eseguiPrimi() );
	}
	private void eseguiPrimi() {
		int numero;
		numero = Integer.parseInt(tfNumero.getText());
		if(numero%2!=0 && numero%numero==0 && numero%3!=0) {
			lRisultato.setText("è un numero primo");
		}else {
			if(numero==2 || numero==3) {
				lRisultato.setText("è un numero primo");
			}else {
				lRisultato.setText("non è un numero primo");
			}	
		}
	}
	public static void main(String[] args) {
		 launch(args);
	}		
}
