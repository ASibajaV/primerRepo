package org.codigoDeOtros1;

import java.util.Scanner; //importando Scanner

public class Codigo6 { //Las clases las dejamos en mayúscula por buena práctica
	  
	public static void multiplos(){
		int[] n = new int[20]; //Falta el "new" para este array y cambiar la segunda 'n' por int. Esto si lo esperado es que sea un array de 20 números
		
		for (int i = 0; i < 20; i++){ //Corrigiendo 3er parámetro a i++
		  n[i] = (int)(Math.random() * 381) + 20;
		  System.out.print(n[i] + " "); //faltaba un ".out"
		}
		
		System.out.print("\n¿Qué números quiere resaltar? "); //Se pregunta algo al usuario, no hay scanner para tomar su elección, y le eliminé la 'l' extra al 'print' 
		Scanner scan = new Scanner(System.in); //creando scanner
		
		
		//int multiplo = (opcion == 1) : 5 ? 7; //Comentando-eliminadando línea, puede que en un futuro se añadan mas opciones de múltiplos, está línea se cierra a dos opciones y haciendo que cualquier opción que no sea uno sea la 2 automaticamente
		//Triste que no use el operador ternario, creo se ocupa cuando solo hay dos opciones únicas, y aqui un usuarix puede escribir algo diferente a 1 o 2.
		int multiplo = 0;
		int opcion;
		
		do { //Creando un do-while para asegurar de que se escriba una opción válida
			System.out.print("(Opción 1 – los múltiplos de 5. Opción 2 – los múltiplos de 7): "); //Dando un poco mas de contexto al usuario resaltando las dos opciones
			opcion = scan.nextInt(); //cambiando variable a que se tome con scanner
			if(opcion == 1) {
				multiplo = 5;
			}else if (opcion == 2) {
				multiplo = 7;
			}else {
				System.out.println();			
				System.out.println("Opción no válida, elige una de las siguientes: ");
			}
		}while((opcion!=1) && (opcion!=2));
		scan.close();//Cerrando scanner
		
		for (int e : n) { //el 'for each' solo requiere el 'for', sus parámetros le dicen a Java que es un 'for each'. También cambiando 'char' por "int"
		  if ((e % multiplo) == 0) { //dejando en () e % multiplo, para dejar claro que eso tiene que ser igual a 0
		    System.out.print("[" + e + "] ");
		  }else { //Faltaba cerrar con bigote }
		    System.out.print(e + " "); //Corrigiendo 'in' por 'out'
		  }
		}
	}
}