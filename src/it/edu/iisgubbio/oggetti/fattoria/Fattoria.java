package it.edu.iisgubbio.oggetti.fattoria;

public class Fattoria {

	public static void main(String[] args) {
		Prodotto carote= new Prodotto("carote",2.50);
		System.out.println(carote);
		double p=carote.calcolaPrezzo(4);
		System.out.println(p);

	}

}
