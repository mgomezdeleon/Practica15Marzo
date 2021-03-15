import java.util.Scanner;
public class TablasMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Práctica Tablas de Multiplicar
			saludar();
			
		//*****************************************
		// Crear una función que imprima las 10 tablas de 
		// multiplicar
		//*****************************************
			multiplicar();
		
	}
	public static void saludar() {
		// TODO Auto-generated method stub
		System.out.println("Buenos días Ceinmark");
	}
	public static void  multiplicar() {
		for(int i=0;i<=10;i++) {
			System.out.println("La tabla del "+i);
			System.out.println(0);
			System.out.println(i*1);
			System.out.println(i*2);
			System.out.println(i*3);
			System.out.println(i*4);
			System.out.println(i*5);
			System.out.println(i*6);
			System.out.println(i*7);
			System.out.println(i*8);
			System.out.println(i*9);
			System.out.println(i*10);
			
			
			
		}
		
	}
}
