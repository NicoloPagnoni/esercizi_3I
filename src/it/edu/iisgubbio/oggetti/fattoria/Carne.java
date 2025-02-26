package it.edu.iisgubbio.oggetti.fattoria;

public class Carne extends Prodotto{
	private boolean kosher;
	private boolean bianca;
	public Carne(String nome, double prezzoAlKg, boolean kosher, boolean bianca) {
		super(nome, prezzoAlKg);
		this.kosher = kosher;
		this.bianca = bianca;
		
	}
	public String toString() {
		String descrizione= nome+" "+prezzoAlKg+"€/Kg";
		if(kosher) {
			descrizione=descrizione+" Kosher";
		}else {
			descrizione=descrizione+" NON Kosher";
		}
		if(bianca) {
			descrizione=descrizione+" [carne bianca]";
		}else {
			descrizione=descrizione+" [carne rossa]";
		}
		return descrizione;
	}
	public boolean isKosher() {
		return kosher;
	}
	public boolean isBianca() {
		return bianca;
	}
	

}
