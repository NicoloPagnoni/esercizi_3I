package it.edu.iisgubbio.verifica;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Pagnoni extends Application {
	
	Button bGrande= new Button("Più grande");
	Button bElimina= new Button("Elimina");
	Button bVisualizza= new Button("Visualizza");
	TextField tfNumeri= new TextField();
	TextField tfPosizione= new TextField();
	Label lRisultato= new Label("???");
	
	
	@Override
	public void start(Stage finestra) throws Exception {
		GridPane principale= new GridPane();
		
		principale.add(tfNumeri, 0, 0);
		principale.add(tfPosizione, 0, 1);
		principale.add(bGrande, 0, 2);
		principale.add(bElimina, 0, 3);
		principale.add(bVisualizza, 0, 4);
		principale.add(lRisultato,0, 5);
		bGrande.setMaxWidth(Integer.MAX_VALUE);
		bElimina.setMaxWidth(Integer.MAX_VALUE);
		bVisualizza.setMaxWidth(Integer.MAX_VALUE);
		
		Scene scena = new Scene(principale);
		finestra.setTitle("Verifica");
		finestra.setScene(scena);
		finestra.show();
		
		bGrande.setOnAction( e -> eseguiGrande() );
		bElimina.setOnAction( e -> eseguiElimina() );
		bVisualizza.setOnAction( e -> eseguiVisualizza() );
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
	private void eseguiGrande() {
		String testo,parti[];
		int piccolo;
		int grande;
		testo=tfNumeri.getText();
		parti=testo.split(" ");
		int numeri[]= new int[parti.length];
		for(int pos=0;pos<parti.length;pos++) {
			numeri[pos]=Integer.parseInt(parti[pos]);
		}
		piccolo=numeri[0];
		for(int pos=1;pos<numeri.length;pos++) {
			if(numeri[pos]<piccolo) {
				piccolo=numeri[pos];
			}	
		}
		grande=numeri[0];
		for(int pos=1;pos<numeri.length;pos++) {
			if(numeri[pos]>grande) {
				grande=numeri[pos];	
			}	
		}
		lRisultato.setText(""+piccolo+","+grande);
	}
	private void eseguiElimina() {
		int numeri[],c=0,q=0, posizione;
		boolean presente=false;
		posizione=Integer.parseInt(tfPosizione.getText());
		numeri=testoNumeri(tfNumeri.getText());
		int vettore[]= new int[numeri.length];
		vettore[0]=numeri[0];
		for(int pos=0;pos<numeri.length;pos++) {
			c=numeri[pos];
			presente=false;
			if(c==posizione) {
				presente=true;
			}
			if(presente==false) {
				vettore[q]=c;
				q+=1;
			}
		}
		int nuovo[]= new int[q];
		for(int pos=0;pos<q;pos++) {
			nuovo[pos]=vettore[pos];
		}
		String se="";
		for(int pos=0;pos<nuovo.length;pos++) {
			se+=","+(vettore[pos]);

		}
		lRisultato.setText(se);
	}
	private void eseguiVisualizza() {
		String testo,parti[];
		int piccolo;
		int grande;
		testo=tfNumeri.getText();
		parti=testo.split(" ");
		int numeri[]= new int[parti.length];
		for(int pos=0;pos<parti.length;pos++) {
			numeri[pos]=Integer.parseInt(parti[pos]);
		}
		lRisultato.setText(",");
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
