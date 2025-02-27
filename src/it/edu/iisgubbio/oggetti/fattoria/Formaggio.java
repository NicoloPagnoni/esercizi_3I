package it.edu.iisgubbio.oggetti.fattoria;

public class Formaggio extends Prodotto{
	
	protected int stagionatura;
	protected boolean dop;
	
	public Formaggio(String nome, double prezzoAlKg, int stagionatura, boolean dop) {
		super(nome, prezzoAlKg);
		this.stagionatura = stagionatura;
		this.dop = dop;
	}

	public Formaggio(String nome, double prezzoAlKg, int stagionatura) {
		super(nome, prezzoAlKg);
		this.stagionatura = stagionatura;
		this.dop = false;
	}
	public String toString() {
		String descrizione = "il nome del prodotto è "+ nome +" il prezzo è "+ prezzoAlKg ;
		if (dop) {
			descrizione += " è DOP ";
		}else {
			descrizione += " non è DOP ";
		}
		if(stagionatura > 0) {
			descrizione= descrizione +"la stagionatura è di "+ stagionatura +" mesi";
		}
		return descrizione;
	}
	

}
