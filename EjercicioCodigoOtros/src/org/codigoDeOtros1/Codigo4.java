package org.codigoDeOtros1;

import java.util.Scanner; //No se había importado este util. Importar sí importa

public class Codigo4 {
	
	
	public static void jugarPPT() { //Creando función
		Scanner s = new Scanner(System.in); //Se creó el scanner de manera incompleta, faltó el System.in dentro del paréntesis 
		    
		    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		    String j1 = s.nextLine();
		    
		    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); //Texto repetía "jugador 1", lo cambié a 2 porque este juego es de dos.
		    //Scanner s2 = new Scanner(); ----- comento línea para borrar después, ya hay un scanner abierto
		    String j2 = s.nextLine();
		    s.close();//Cerrando scanner
		    
		    if (j1 == j2) { //un paréntesis demas
		      System.out.println("Empate");
		    } else {
		      int g = 2;
		      switch(j1) {
		        case "piedra":
		          if (j2 == "tijeras") {
		            g = 1;
		          }
		          break; //Faltaba este break, caso curioso que poner "break" (romper) ayuda a que no se rompa el código
		
		        case "papel":
		          if (j2 == "piedra") {
		            g = 1;
		          } //no se cerró bigote
		          
		        case "tijera":
		          if (j2.equals("papel")) {
		            g = 1;
		          }
		          break;
		        default:
		        	g = 0;
		        	break;
		      }
		      
		      if (g!=0) { //creando if para decir si gano alguien, pero si escribieron mal piedra, papel o tijeras dirá que no escribieron bien su elección
		    	  System.out.println("Gana el jugador " + g);
		      }else {
		    	  System.out.println("No se escribió bien un comando");
		      }
		      
		      
		    }
		    
    }
}
