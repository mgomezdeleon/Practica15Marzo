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
		tablasPablo();
		
	}
	public static void saludar() {
		// TODO Auto-generated method stub
		System.out.println("Buenos días Ceinmark");
	}
	
	public static void tablasPablo() {
		
		int tablas=10;
		
		for(int i=1;i<tablas;i++) {
			
			System.out.println("\n----------\n"
					+ "Tabla del " + i + 
					"\n----------\n");
			
			for(int j = 0; j<10; j++) {
				
				System.out.println(i + " * " + j + " = " + i*j);
				
			}
			
		}
		
	}
}
