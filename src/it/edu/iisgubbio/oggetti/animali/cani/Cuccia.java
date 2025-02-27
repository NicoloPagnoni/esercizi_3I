package it.edu.iisgubbio.oggetti.animali.cani;

public class Cuccia {
	private String colore;
	private int posti;
	private boolean interno;
	private double prezzo;
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	public int getPosti() {
		return posti;
	}
	public void setPosti(int posti) {
		this.posti = posti;
	}
	public boolean isInterno() {
		return interno;
	}
	public void setInterno(boolean interno) {
		this.interno = interno;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public String toString() {
		String a="Il prezzo è "+prezzo+"€ i posti sono "+posti;
		
		if(!interno) {
			a=a+" è da esterno ";
		}else {
			a=a+" è da interno ";
		}
		if(colore!=null) {
			a=a+"è di colore "+colore;
		}
		return a;
	}
	
}
