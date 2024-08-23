package entidades;

public class Forma {

	private double altura;
	
	private double base;
	
	private double largura;
	
	private String forma;

	public Forma(double altura, double base, double largura, String forma) {
		this.altura = altura;
		this.base = base;
		this.largura = largura;
		this.forma = forma;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}
	
}
