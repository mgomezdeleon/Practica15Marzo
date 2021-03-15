import java.util.Scanner;
public class TablasMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Práctica Tablas de Multiplicar
			saludar();
			tablaMultiplicarJorge();
		//*****************************************
		// Crear una función que imprima las 10 tablas de 
		// multiplicar
		//*****************************************
		
		
	}
	public static void saludar() {
		// TODO Auto-generated method stub
		System.out.println("Buenos días Ceinmark");
	}
	
	public static void tablaMultiplicarJorge() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("\n"+"La tabla del: "+ i);
			for (int j = 1; j <= 10; j++) {
				System.out.println(i+" x "+j+" = "+i*j);
			}
		}
	}
}
