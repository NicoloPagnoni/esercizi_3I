package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SopraMedia extends Application{
	
	TextField tfNumeri= new TextField();
	Button bMedia= new Button("sopra la media");
	Label lRisultato= new Label("???");
	
	@Override
	public void start(Stage finestra) throws Exception {
		GridPane principale= new GridPane();
		
		principale.add(tfNumeri, 0, 0, 5, 1);
		principale.add(bMedia, 0, 1, 5, 1);
		principale.add(lRisultato, 0, 2, 5, 1);
		bMedia.setMaxWidth(Integer.MAX_VALUE);
		principale.setVgap(10);
		principale.setHgap(10);
		
		Scene scena = new Scene(principale);
		finestra.setTitle("MinimoMassimo");
		finestra.setScene(scena);
		finestra.show();
		
		bMedia.setOnAction( e -> eseguiMedia() );
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
	private void eseguiMedia() {
		int numeri[];
		double somma=0,media;
		numeri=testoNumeri(tfNumeri.getText());
		for(int pos=0;pos<numeri.length;pos++) {
			somma+=numeri[pos];
		}
		media=somma/numeri.length;
		String se="";
		for(int pos=0;pos<numeri.length;pos++) {
			if(numeri[pos]>media) {
				se+=","+(numeri[pos]);
			}
		}
		lRisultato.setText(se);
	}
	public static void main(String[] args) {
		 launch(args);
	}
}
