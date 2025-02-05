package it.edu.iisgubbio.testi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Palindromo extends Application{
	
	TextField tfParola= new TextField();
	Label lTesto = new Label("Testo");
	Label lRisultato = new Label("???");
	Button bControlla=new Button("Controlla");
	
	@Override
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		
		principale.add(tfParola, 1, 0);
		principale.add(lTesto, 0, 0);
		principale.add(lRisultato, 0, 2,2,1);
		principale.add(bControlla, 0, 1,2,1);
		bControlla.setMaxWidth(Integer.MAX_VALUE);
		
		Scene scena = new Scene(principale);	  	        
	    finestra.setTitle("Palindromo");
	    finestra.setScene(scena);
		finestra.show();
			
		bControlla.setOnAction( e -> eseguiControlla() );
	}
	private void eseguiControlla() {
		char lettere[];
		String lettera=tfParola.getText();
		lettere=lettera.toCharArray();
		char contrario[]= new char[lettere.length];
		for(int pos=0,i=lettere.length-1;pos<lettere.length;pos++) {
			contrario[pos]=lettere[i];
			i--;
		}
		String testo= new String(lettere);
		String opposto= new String(contrario);
		if(testo.equals(opposto)) {
			lRisultato.setText("è un palindromo");
		}else {
			lRisultato.setText("non è un palindromo");
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}
