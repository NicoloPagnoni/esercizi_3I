package it.edu.iisgubbio.oggetti.animali.cani;

public class Cane {
	private String nome;
	private String razza;
	private int anno;
	private int grammiCibo;
	private String nomeProprietario;
	
	public Cane() {

	}
	
	public Cane(String nome, String razza, int anno, int grammiCibo, String nomeProprietario) {
		super();
		this.nome = nome;
		this.razza = razza;
		this.anno = anno;
		this.grammiCibo = grammiCibo;
		this.nomeProprietario = nomeProprietario;
	}
	
	public String toString() {
		return "Si chiama "+nome+" è di razza "+razza;
	}
	
}
