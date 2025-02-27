package it.edu.iisgubbio.oggetti.fattoria;

public class Ortaggio extends Prodotto{
	protected boolean biologico;
	
	public Ortaggio(String nome, double prezzoAlChilo, boolean biologico) {
		super(nome, prezzoAlChilo);
		this.biologico = biologico;
	}

}
