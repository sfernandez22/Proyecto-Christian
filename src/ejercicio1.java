import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int cantidadNumeros=0;
		/*int sumarUno = 0;
		int sumarDos = 0;

		int multiUno = 0;
		int multiDos = 0;*/

		int multiUno = 3;
		int multiDos = 6;
		int num1=0;
		int num2=0;

		int opc = 0;
		System.out.println("¿Con que cantidad de numeros desea operar?");
		cantidadNumeros = sn.nextInt();
		ArrayList<Integer> NumerosOperantes = new ArrayList<Integer>();

		Menu();
		System.out.println("Introduzca una opcion");
		opc = sn.nextInt();
		do {

			switch (opc) {

			case 1:
				for (int i = 0; i < cantidadNumeros; i++) {
					System.out.println("Número " + (i+1) + ":");
					NumerosOperantes.add(sn.nextInt());
				}
				sumar2(NumerosOperantes);
				break;
			case 2:
				for (int i = 0; i < cantidadNumeros; i++) {
					System.out.println("Número " + (i+1) + ":");
					NumerosOperantes.add(sn.nextInt());
				}
				multiplicar2(NumerosOperantes);
				break;
			case 3:
				System.out.println("Salir");
				break;
				
			case 4:
				System.out.println("Primer número: ");
				num1 = sn.nextInt();
				System.out.println("Segundo número: ");
				num2 = sn.nextInt();
				restar2(num1, num2);
				break;
			case 5:
				System.out.println("Primer número: ");
				num1 = sn.nextInt();
				System.out.println("Segundo número: ");
				num2 = sn.nextInt();
				dividir2(num1, num2);
				break;
			}

			
			

		}while(opc==0);

	}

	public static void Menu() {
		System.out.println("----MENU-----");
		System.out.println("1.Sumar");

		System.out.println("2.Multiplicar ");
		System.out.println("3.Salir");

		System.out.println("2.Multiplicar");
		System.out.println("3.Restar");
		System.out.println("4.Dividir");
		System.out.println("5.Salir");

		System.out.println(" ");

	}

	public static void sumar2(ArrayList<Integer> numerosSumar) {
		int resultado = numerosSumar.get(0);
		for (int i = 1; i < numerosSumar.size(); i++) {
			resultado = resultado + numerosSumar.get(i);
		}
		System.out.println("El resultado de la suma es:" + " " + resultado);
	}
	
	public static void multiplicar2(ArrayList<Integer> numerosMulti){
		int resultado = numerosMulti.get(0);
		for (int i = 1; i < numerosMulti.size(); i++) {
			resultado = resultado * numerosMulti.get(i);
		}
		System.out.println("El resultado de la multiplicación es: " + " " + resultado);
	}

	public static void restar2(int num1, int num2){
		System.out.println("El resultado de restar dos numeros es:" + " " + (num1-num2));
	}

	public static void dividir2(int num1, int num2){
		System.out.println("El resultado de dividir dos numeros es:" + " " + (num1/num2));
	}

}
