package it.edu.iisgubbio.oggetti.figure;

public class TriangoloRettangolo {
	public double base;
	public double altezza;
	
	public TriangoloRettangolo(double base, double altezza) {
		this.base=base;
		this.altezza=altezza;
	}
	public double ipotenusa() {
		double i=Math.sqrt((base*base)+(altezza*altezza));
		return i;
	}
	public double perimetro() {
		double p=base+altezza+ipotenusa();
		return p;
	}
	public double area() {
		double a=(base*altezza)/2;
		return a;		
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltezza() {
		return altezza;
	}
	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}
	public String toString() {
		return "TriangoloRettangolo"+ " "+base+ " x "+altezza;
	}	
}
