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

			String linea="";
			for (int tabla=1; tabla<=10; tabla++) {
			linea="";
				for (int multiplo=1; multiplo<=10; multiplo++) {
					linea+=(multiplo+"x"+tabla+"= "+multiplo*tabla+"  \t");
				}
				System.out.println(linea);
			}
		
	}
	public static void saludar() {
		// TODO Auto-generated method stub
		System.out.println("Buenos días Ceinmark");
	}
}
