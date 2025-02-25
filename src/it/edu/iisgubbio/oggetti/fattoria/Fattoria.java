package it.edu.iisgubbio.oggetti.fattoria;

public class Fattoria {
	public static void main(String[]args) {
		Formaggio taleggio = new Formaggio("Taleggio",25,1,true);
		Formaggio ricotta = new Formaggio("Ricotta",4,0,false);
		
		System.out.println(taleggio);
		System.out.println(ricotta);
		
}

}
