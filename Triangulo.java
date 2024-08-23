package entidades;

public class Triangulo extends Forma{

	public Triangulo(double altura, double base, String forma) {
	super(altura, base, base, "Triângulo");
}
	
	public double calcularArea() {
		return getAltura() * getBase();
	}
}