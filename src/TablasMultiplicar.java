import java.util.Scanner;
public class TablasMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Práctica Tablas de Multiplicar
			saludar();
			tablaAlexandr();
		//*****************************************
		// Crear una función que imprima las 10 tablas de 
		// multiplicar
		//*****************************************
		
		
	}
	public static void saludar() {
		// TODO Auto-generated method stub
		System.out.println("Buenos días Ceinmark");
	}
	
	public static void tablaAlexandr() {
		System.out.println("----------------");
			for(int tabla = 1, numero = 1, resultado = tabla * numero; tabla < 11; numero++){
			
				if(numero == 11){
					tabla++;
					numero = 1;
					System.out.println("----------------\n");
				}
				if(tabla == 11){
					System.exit(0);
				}
				resultado = tabla * numero;
				System.out.println(tabla + " X " + numero + " = " + resultado);
			}
		}
	}

