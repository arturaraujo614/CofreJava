package empresa;

import java.util.Scanner;

public class Principal {


	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int opcao;	
		double valor;
		int tipoComp;
		
		Cofrinho cofre = new Cofrinho();
		
		System.out.println("Menu");
		System.out.println("1 - Adicionar");
		System.out.println("2 - Remover");
		System.out.println("3 - Listar");
		System.out.println("4 - Converter para real");
		System.out.println("0 - Encerrar");
		opcao=teclado.nextInt();
		
		Moeda comp;
		
		while(opcao!=0) {
			switch(opcao){
				case 1:
					
					tipoComp=0;
					while(tipoComp>3 || tipoComp<=0) {
						System.out.println("1-Dolar");
						System.out.println("2-Euro");
						System.out.println("3-Real");
						tipoComp = teclado.nextInt();
					}
						System.out.println("Qual Valor?");
						// Double para receber valor em decimal	
						valor = teclado.nextDouble();
					
						if (valor<0) {
							System.out.println("Valor inválido, tente novamente");
							break;
						}
						
						comp = null;
					
						if(tipoComp==1){
							System.out.println("Valor em dolar adicionado");
							comp = new Dolar(valor);
						}
						
						if(tipoComp==2){
							System.out.println("Valor em euro adicionado");
							comp = new Euro(valor);
						}
						
						if(tipoComp==3){
							System.out.println("Valor em real adicionado");
							comp = new Real(valor);;
						}
					
					cofre.adicionar(comp);
					
					break;
					
				case 2:
					
					tipoComp=0;
					while(tipoComp>3 || tipoComp<=0) {
						System.out.println("1-Dolar");
						System.out.println("2-Euro");
						System.out.println("3-Real");
						tipoComp = teclado.nextInt();
					}
						System.out.println("Digite o valor de saque");
					
						valor = teclado.nextDouble();
					
						comp = null;
					
						if(tipoComp==1){
							comp = new Dolar(valor);
						}
						
						if(tipoComp==2){
							comp = new Euro(valor);
						}
						
						if(tipoComp==3){
							comp = new Real(valor);
						}
						
					cofre.remover(comp);
					break;
				case 3:
					cofre.listar();
					break;
				case 4:
					cofre.converter();
					break;
				default:
					System.out.println("Opcão Invalida, tente novamente");
			}
			
			System.out.println("Menu");
			System.out.println("1 - Adicionar");
			System.out.println("2 - Remover");
			System.out.println("3 - Listar");
			System.out.println("4 - Converter para real");
			System.out.println("0 - Encerrar");
			opcao=teclado.nextInt();
		}
		
	}
}
