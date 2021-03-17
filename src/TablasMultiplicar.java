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
		Tabla();
		
	}
	public static void saludar() {
		// TODO Auto-generated method stub
		System.out.println("Buenos días Ceinmark");
	}
	public static void Tabla() {
		
		int num = 1, num2 = 2, num3=3,num4=4,num5=5,num6=6,num7=7,num8=8,num9=9,num10 =10;
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i +"x" + num + "=" + (i*num));
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(i +"x" + num2 + "=" + (i*num2));
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(i +"x" + num3 + "=" + (i*num3));
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(i +"x" + num4 + "=" + (i*num4));
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(i +"x" + num5 + "=" + (i*num5));
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(i +"x" + num6 + "=" + (i*num6));
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(i +"x" + num7 + "=" + (i*num7));
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(i +"x" + num8 + "=" + (i*num8));
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(i +"x" + num9 + "=" + (i*num9));
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(i +"x" + num10 + "=" + (i*num10));
		}
		
		
	}
}
