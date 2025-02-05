package it.edu.iisgubbio.matematica;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Tabellina extends Application {
	TextField tfNumero= new TextField();
	Label lRisultato= new Label("??");
	Button bTabellina= new Button("Tabellina");
	
	@Override
	public void start(Stage finestra) throws Exception {
		GridPane principale= new GridPane();
		
		principale.add(tfNumero, 0, 0);
		principale.add(lRisultato, 0, 2);
		principale.add(bTabellina, 0, 1);
		
		Scene scena = new Scene(principale);
		finestra.setTitle("Tabellina");
		finestra.setScene(scena);
		finestra.show();
		
		bTabellina.setOnAction( e -> eseguiTabellina() );
		
	}
	private void eseguiTabellina() {
		int numero;
		String sequenza;
		numero=Integer.parseInt(tfNumero.getText());
		sequenza=""+numero;
		for(int x=numero*2; x<=numero*10; x+=numero) {
			sequenza+=", "+x;
		}
		lRisultato.setText(sequenza);
		
	}
	public static void main(String[] args) {
		 launch(args);
	}		
}
