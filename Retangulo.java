package entidades;

public class Retangulo extends Forma {
	
	public Retangulo(double altura, double largura, String forma) {
	super(altura, largura, largura, "Retângulo");
	}
	
	public double calcularArea() {
		return getAltura() * getLargura();
	}
	
	
	
}
