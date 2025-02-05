package it.edu.iisgubbio.testi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Doppie extends Application{
	
	TextField tfTesto= new TextField();
	Button bConta= new Button("Conta");
	Label lTesto= new Label("Testo");
	Label lDoppie= new Label("n.doppie");
	Label lRisultato= new Label("???");
	
	@Override
	public void start(Stage finestra) throws Exception {
		GridPane principale= new GridPane();
		
		principale.add(tfTesto, 1, 0,5,1);
		principale.add(bConta, 1, 1, 5, 1);
		principale.add(lTesto, 0, 0);
		principale.add(lDoppie, 0, 3);
		principale.add(lRisultato, 1, 3, 5, 1);
		
		Scene scena = new Scene(principale);
		finestra.setTitle("Doppie");
		finestra.setScene(scena);
		finestra.show();
		
		bConta.setOnAction( e -> eseguiConta() );
	}
	private void eseguiConta() {
		char lettere[]=tfTesto.getText().toCharArray();
		int c=0;
		for(int pos=0;pos<lettere.length-1;pos++) {
			if(lettere[pos+1]==lettere[pos]) {
				c+=1;
				lettere[pos]='#';
				lettere[pos+1]='#';
			}		
		}
		String testo= new String(lettere);
		lRisultato.setText(""+c+""+testo);
	}
	public static void main(String[] args) {
		 launch(args);
	}
}
