package principal;

import java.util.Scanner;

import entidades.Forma;

import entidades.Triangulo;

import entidades.Retangulo;

public class Main_Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner o = new Scanner(System.in);
		
		
			while (true) {
	            System.out.println("O que você deseja fazer?");
	            System.out.println("1. Calcular área do retângulo");
	            System.out.println("2. Calcular área do triângulo");
	            System.out.println("3. Sair");
	            System.out.println("Digite sua opção:");
	            int acao = o.nextInt();
		
	            switch (acao) {
                case 1:
                	System.out.println("Informe a altura do retângulo:");
                    double alturaRetangulo = o.nextDouble();
                    System.out.println("Informe a largura do retângulo:");
                    double larguraRetangulo = o.nextDouble();

                    Retangulo retangulo = new Retangulo(alturaRetangulo, larguraRetangulo, "Retângulo");
                    double areaRetangulo = retangulo.calcularArea();
                    System.out.println("Área do retângulo: " + areaRetangulo);
                    break;
                    
                case 2:
                	System.out.println("Informe a altura do triângulo:");
                    double alturaTriangulo = o.nextDouble();
                    System.out.println("Informe a base do triângulo:");
                    double baseTriangulo = o.nextDouble();

                    Triangulo triangulo = new Triangulo(alturaTriangulo, baseTriangulo, "Triângulo");
                    double areaTriangulo = triangulo.calcularArea();
                    System.out.println("Área do triângulo: " + areaTriangulo);
                    break;
                    
                case 3:
                       System.out.println("Saindo...");
                        return;
                		
                	 default:
                         System.out.println("Opção inválida. Tente novamente.");	
                		
                		
			}   		
		} 
	}
}