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
			int num1 = 10;
			int num2 = 10;
			String tabla = "";
			for (int i = 1; i < num1; i++) {
				for (int j = 1; j < num2; j++) {
					tabla += j + " * " + i + " = " + (i*j) + "\t ";
				}
				tabla += "\n";
			}
			System.out.println(tabla);
	}
	public static void saludar() {
		// TODO Auto-generated method stub
		System.out.println("Buenos días Ceinmark");
	}
}
