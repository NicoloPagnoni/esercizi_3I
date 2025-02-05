package it.edu.iisgubbio.numeri;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Fibonacci extends Application {
	
	TextField tfNumero= new TextField();
	Label lNumero = new Label("n:");
	Label lFib = new Label("Fib(n):");
	Button bCalcola=new Button("Calcola");
	Label lRisultato = new Label("??");
	
	@Override
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		
		principale.add(lNumero, 0, 0);
		principale.add(tfNumero, 1,0);
		principale.add(bCalcola, 0, 1,2,1);
		principale.add(lFib, 0,2);
		principale.add(lRisultato, 1, 2);
		bCalcola.setMaxWidth(Integer.MAX_VALUE);
		
		Scene scena = new Scene(principale);	  	        
	    finestra.setTitle("Fibonacci");
	    finestra.setScene(scena);
		finestra.show();
			
		bCalcola.setOnAction( e -> eseguiCalcola() );
	}
	int fib(int x) {
		if(x==0) {
			return 0;
		}else if(x==1){
			return 1;
		}else {
			return fib(x-2)+fib(x-1);
		}
	}
	private void eseguiCalcola() {
		int n=Integer.parseInt(tfNumero.getText());
		int f=fib(n);
		lRisultato.setText(""+f);
	}
	public static void main(String[] args) {
		launch(args);
	}	
}
