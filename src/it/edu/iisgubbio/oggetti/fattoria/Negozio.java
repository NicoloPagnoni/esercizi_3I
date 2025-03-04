package it.edu.iisgubbio.oggetti.fattoria;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Negozio extends Application {
    TextField tfNome = new TextField();
    TextField tfPrezzo = new TextField();
    TextField tfStagionatura = new TextField();
    TextField tfNomeMuffa = new TextField();
    CheckBox cbBiologico = new CheckBox("biologico");
    CheckBox cbCarneBianca = new CheckBox("carne bianca");
    CheckBox cbKosher = new CheckBox("kosher");
    CheckBox cbInterna = new CheckBox("muffa interna");
    ToggleButton tbDOP = new ToggleButton("D O P");

    ListView<Prodotto> lvProdotti = new ListView<Prodotto>();

    @Override
    public void start(Stage primaryStage) {
        Label lNome = new Label("nome:");
        Label lPrezzo = new Label("prezzo:");
        Label lStagionatura = new Label("stagionatura:");
        Label lNomeMuffa = new Label("nome muffa:");

        Button bProdotto = new Button("crea prodotto");
        Button bOrtaggio = new Button("crea ortaggio");
        Button bFormaggio = new Button("crea formaggio");
        Button bMuffato = new Button("crea muffato");
        Button bCarne = new Button("crea carne");

        GridPane root = new GridPane();
        root.add(lvProdotti,0,0, 2, 14);
        root.add(lNome,2,0);
        root.add(tfNome,3,0);
        root.add(lPrezzo,2,1);
        root.add(tfPrezzo,3,1);
        root.add(lStagionatura,2,2);
        root.add(tfStagionatura,3,2);
        root.add(lNomeMuffa,2,3);
        root.add(tfNomeMuffa,3,3);
        root.add(cbBiologico,3,4);
        root.add(cbCarneBianca,3,5);
        root.add(cbKosher,3,6);
        root.add(cbInterna,3,7);
        root.add(tbDOP,3,8);
        root.add(bProdotto,2,9, 2, 1);
        root.add(bOrtaggio,2, 10, 2, 1);
        root.add(bFormaggio,2, 11, 2, 1);
        root.add(bMuffato,2, 12, 2, 1);
        root.add(bCarne,2, 13, 2, 1);

        bProdotto.setMaxWidth(Integer.MAX_VALUE);
        bOrtaggio.setMaxWidth(Integer.MAX_VALUE);
        bFormaggio.setMaxWidth(Integer.MAX_VALUE);
        bMuffato.setMaxWidth(Integer.MAX_VALUE);
        bCarne.setMaxWidth(Integer.MAX_VALUE);
        
        lvProdotti.setPrefWidth(400);

        root.setHgap(5);
        root.setVgap(5);
        root.setPadding(new Insets(5));

        Scene scene = new Scene(root);

        primaryStage.setTitle("Prodotti in vendita");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        bProdotto.setOnAction( e -> eseguiProdotto() );
        bOrtaggio.setOnAction( e -> eseguiOrtaggio() );
        bFormaggio.setOnAction( e -> eseguiFormaggio() );
        bMuffato.setOnAction( e -> eseguiMuffato() );
        bCarne.setOnAction( e -> eseguiCarne() );
    }
    private void eseguiProdotto() {
    	String nome=tfNome.getText();
    	double prezzo=Double.parseDouble(tfPrezzo.getText());
    	Prodotto p=new Prodotto(nome,prezzo);
    	lvProdotti.getItems().add(p);
	}
    
	private void eseguiOrtaggio() {
		String nome=tfNome.getText();
		double prezzo=Double.parseDouble(tfPrezzo.getText());
		boolean biologico=cbBiologico.isSelected();
		
		Ortaggio o= new Ortaggio(nome,prezzo,biologico);
		lvProdotti.getItems().add(o);
	}
	
	private void eseguiFormaggio() {
		String nome=tfNome.getText();
		double prezzo=Double.parseDouble(tfPrezzo.getText());
		int stagionatura=Integer.parseInt(tfStagionatura.getText());
		boolean dop=tbDOP.isSelected();
		
		Formaggio f= new Formaggio(nome,prezzo,stagionatura,dop);
		lvProdotti.getItems().add(f);
	}

	private void eseguiMuffato() {
		String nome=tfNome.getText();
		double prezzo=Double.parseDouble(tfPrezzo.getText());
		int stagionatura=Integer.parseInt(tfStagionatura.getText());
		boolean dop=tbDOP.isSelected();
		String muffa=tfNomeMuffa.getText();
		boolean interno=cbInterna.isSelected();
		
		Muffato m= new Muffato(nome,prezzo,muffa);
		m.setInterno(interno);
		m.setStagionatura(stagionatura);
		m.setDop(dop);
		lvProdotti.getItems().add(m);
	}

	private void eseguiCarne() {
		String nome=tfNome.getText();
		double prezzo=Double.parseDouble(tfPrezzo.getText());
		boolean kosher=cbKosher.isSelected();
		boolean bianca=cbCarneBianca.isSelected();
		
		Carne c= new Carne(nome,prezzo,kosher,bianca);
		lvProdotti.getItems().add(c);
	}
	public static void main(String[] args) {
        launch(args);
    }
}
