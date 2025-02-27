package it.edu.iisgubbio.oggetti.animali.test;

import it.edu.iisgubbio.oggetti.animali.cani.Cane;
import it.edu.iisgubbio.oggetti.animali.cani.Cuccia;

public class ProvaAnimali {

	public static void main(String[] args) {
		Cuccia cuccia;
		cuccia= new Cuccia();
		cuccia.setPrezzo(87);
		cuccia.setPosti(1);
		cuccia.setInterno(false);
		cuccia.setColore("rosso");
		
		System.out.println(cuccia);

	}

}
