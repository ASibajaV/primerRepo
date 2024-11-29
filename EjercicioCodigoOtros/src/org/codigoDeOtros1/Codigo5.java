package org.codigoDeOtros1;

import java.util.Scanner; //importando Scanner faltante

public class Codigo5 {

	public static void numeroAfortunado() { //creando función
	    Scanner s = new Scanner(System.in); //Colocando System.in
	    System.out.print("Introduzca un número: "); //Comillas equivocadas, colocándolas como ""
	    int ni = s.nextInt(); //Cambianto parámetro a int.
	    int c = ni;
	    s.close();//Cerrando scanner
	    
	    int afo = 0;
	    int noAfo = 0;
	    
	     do { //Modificando while a do-while para que al menos se sume afo o noAfo una vez,
		  int digito = (int)(ni % 10);
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
			ni /= 10;//Añadiendo misma operación que en 'else' para evitar que se repita el mismo ni, creando un infinito
	      } else {
			noAfo++;
		    ni /= 10;
	      } //Faltaba cerrar else
	      
	      	      
	    } while (ni > 0); 
	    
	    
	    if (afo > noAfo) { //Sacamos este bloque de código del bucle while
		      System.out.println("El " + c + " es un número afortunado."); //faltó la "t" de "print"
	    } else {
		      System.out.println("El " + c + " no es un número afortunado.");
	    }
	    
     }
}		  
