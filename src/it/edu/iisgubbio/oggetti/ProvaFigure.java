package it.edu.iisgubbio.oggetti;

import it.edu.iisgubbio.oggetti.figure.Cerchio;
import it.edu.iisgubbio.oggetti.figure.TriangoloRettangolo;

public class ProvaFigure {

	public static void main(String[] args) {
		TriangoloRettangolo tr;
		tr= new TriangoloRettangolo(3,4);
		System.out.println(tr.toString());
	
		System.out.println(tr.ipotenusa());
		System.out.println(tr.perimetro());
		System.out.println(tr.area());
		tr.setAltezza(10);
		System.out.println(tr.ipotenusa());
	}
}
