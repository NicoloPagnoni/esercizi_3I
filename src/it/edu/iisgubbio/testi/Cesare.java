package it.edu.iisgubbio.testi;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Cesare extends Application{
	
	TextField tfParola1= new TextField();
	TextField tfParola2= new TextField();
	Button bCifra=new Button("Cifra ⬇");
	Button bDecifra=new Button("Decifra ⬆");
	
	@Override
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		
		principale.add(tfParola1, 0, 0,2,1);
		principale.add(tfParola2, 0, 2,2,1);
		principale.add(bCifra, 0, 1);
		principale.add(bDecifra, 1, 1);
		bCifra.setMaxWidth(Integer.MAX_VALUE);
		bDecifra.setMaxWidth(Integer.MAX_VALUE);
		Insets spazio=new Insets(10);
		principale.setPadding(spazio);
		principale.setVgap(10);
		principale.setHgap(10);
		
		Scene scena = new Scene(principale);	  	        
	    finestra.setTitle("Cesare");
	    finestra.setScene(scena);
		finestra.show();
			
		bCifra.setOnAction( e -> eseguiCifra() );
		bDecifra.setOnAction( e -> eseguiDecifra() );
	}
	private void eseguiCifra() {
		char lettere[]=tfParola1.getText().toCharArray();
		for(int i=0;i<lettere.length;i++) {
			switch(lettere[i]) {
			case 'z':
				lettere[i]='c';
				break;
			case 'y':
				lettere[i]='b';
				break;
			case 'x':
				lettere[i]='a';
				break;
				default:
					lettere[i]=(char)(lettere[i]+3);
			}
			
		}
		String parole= new String(lettere);
		tfParola2.setText(parole);
	}
	private void eseguiDecifra() {
		char lettere[]=tfParola2.getText().toCharArray();
		for(int i=0;i<lettere.length;i++) {
			switch(lettere[i]) {
			case 'c':
				lettere[i]='z';
				break;
			case 'b':
				lettere[i]='y';
				break;
			case 'a':
				lettere[i]='x';
				break;
				default:
					lettere[i]=(char)(lettere[i]-3);
			}
			
		}
		String parole= new String(lettere);
		tfParola1.setText(parole);
	}
	public static void main(String[] args) {
		launch(args);
	}
}
