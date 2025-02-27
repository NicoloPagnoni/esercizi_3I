package it.edu.iisgubbio.testi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class IP extends Application {
	
	TextField tfIndirizzo= new TextField();
	Button bVerifica=new Button("Verifica");
	Label lIndirizzo = new Label("Indirizzo");
	Label lRisultato = new Label("???");
	
	@Override
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		
		principale.add(tfIndirizzo, 1, 0);
		principale.add(lIndirizzo, 0, 0);
		principale.add(lRisultato, 1, 1);
		principale.add(bVerifica, 0, 1);
		
		Scene scena = new Scene(principale);	  	        
	    finestra.setTitle("IP");
	    finestra.setScene(scena);
		finestra.show();
			
		bVerifica.setOnAction( e -> eseguiVerifica() );
	}
	private void eseguiVerifica() {
    	String indirizzo = tfIndirizzo.getText();
    	boolean indirizzoAccettabile = true;
    	char [] caratteri = indirizzo.toCharArray();
    	for(int i=0; i<caratteri.length; i++) {
    		if( caratteri[i]!='.' && ( caratteri[i]<'0' || caratteri[i]>'9') ) {
    			indirizzoAccettabile = false;
    		}
    	}
    	if(indirizzoAccettabile) {
    		String [] parti = indirizzo.split("\\.");
    		if(parti.length != 4) {
    			indirizzoAccettabile = false;
    		}else {
    			int[] numeri = new int[parti.length];
    			for(int i=0; i<parti.length; i++) {
    				numeri[i] = Integer.parseInt(parti[i]);
    			}
    			for(int i=0; i<numeri.length; i++) {
    				if( numeri[i]>255 ) {
    					indirizzoAccettabile = false;
    				}
    			}
    		}
    	}
    	if(indirizzoAccettabile) {
    		lRisultato.setText("è un indirizzo IP");
    	} else {
    		lRisultato.setText("NON è un indirizzo IP");
    	}
    }
    public static void main(String[] args) {
        launch(args);
    }
}