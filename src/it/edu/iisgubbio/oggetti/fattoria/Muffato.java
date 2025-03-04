package it.edu.iisgubbio.oggetti.fattoria;

public class Muffato extends Formaggio {
	protected String muffa;
	protected boolean interno;
	public Muffato(String nome, double prezzoAlKg,String muffa) {
		super(nome, prezzoAlKg, 0);
		this.muffa = muffa;
		this.interno = true;
	}
	public void setInterno(boolean interno) {
		this.interno = interno;
	}
	public String toString() {
		String descrizione = "il nome del prodotto è "+ nome +" il prezzo è "+ prezzoAlKg+"€";
		if (dop) {
			descrizione += " è DOP ";
		}else {
			descrizione += " non è DOP ";
		}
		if(stagionatura > 0) {
			descrizione= descrizione +"la stagionatura è di "+ stagionatura +" mesi";
		}
		descrizione=descrizione+" il nome della muffa è"+muffa;
		if(interno) {
			descrizione=descrizione+" la muffa è all'interno";
		}else {
			descrizione=descrizione+" la muffa è all'esterno";
		}
		return descrizione;
	}
		
	

}
