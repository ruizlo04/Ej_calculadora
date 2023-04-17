package ejercicio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion = 0;
		double num1 = 0, num2 = 0, total = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
		
		System.out.println("Indique la opción que desea:");
		imprimirMenu();
		opcion = sc.nextInt();
		
			switch(opcion) {
			
				case 1:
					System.out.println("Indique los números que desea sumar");
					num1 = sc.nextDouble();
					
					num2 = sc.nextDouble();
					
					System.out.println(total = num1 + num2);
					break;
					
				case 2:
					System.out.println("Indique los números que desea restar");
					num1 = sc.nextDouble();
					
					num2 = sc.nextDouble();
					
					System.out.println(total = num1 - num2);
					break;
					
				case 3:
					System.out.println("Indique los números que desea multiplicar");
					num1 = sc.nextDouble();
					
					num2 = sc.nextDouble();
					
					System.out.println(total = num1 * num2);
					break;
					
				case 4:
					System.out.println("Indique los números que desea dividir");
					num1 = sc.nextDouble();
					
					num2 = sc.nextDouble();
					
					System.out.println(total = num1 / num2);
					break;
					
				default:
					System.out.println("Opción no válida");
			}
			
		}while(opcion != 0);

	
		
	}
	
	public static void imprimirMenu() {
		System.out.println("1-Sumar");
		System.out.println("2-Restar");
		System.out.println("3-Multiplicar");
		System.out.println("4-Dividir");
	}

}
