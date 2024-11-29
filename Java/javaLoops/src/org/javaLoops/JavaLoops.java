package org.javaLoops;
import java.util.Scanner;

public class JavaLoops {

	public static void main(String[] args) {
			
			//Ejercicio que nos dejaron.
			int contadorOdd = 0;
			int oddsAddition = 0;
			int numberToCheck = 1;
			
			while(contadorOdd<20) {
				
				if(isOdd(numberToCheck)) { // en la línea 149 está la función
					System.out.println("ping: " + numberToCheck);
					oddsAddition += numberToCheck;
					contadorOdd ++;
				}
				numberToCheck ++;				
			}
			
			System.out.println ("La suma de los primeros 10 números impares es: " + oddsAddition);
			
			
			//CICLO WHILE
			//Usaremos 'while' en lugar de 'for' para hacer un contador manual.
			//Los contenidos de 'while' se leen solo si se cumple la condición, y se continuaran leyendo miesntras aun se cumpla.
			//Con 'do while' es lo mismo, pero su contenido siempre se lee al menos una vez aunque no se cumpla su condición.
			int contadorWhile = 1;
			
			while (contadorWhile<=5) {
				System.out.println("Iteración: " + contadorWhile);
				contadorWhile++;
			}
			
			System.out.println("--------------");
			
			int contadorDoWhile = 1;
			
			do {
				
				System.out.println("Iteración DoWhile: " + contadorDoWhile);
				contadorDoWhile++;
				
			} while(contadorDoWhile<=5);
			
			System.out.println("--------------");
			
			//CICLO FOR
			for(int i=5;i>=1;i--) {
				System.out.println("Iteración: " + i);
			}
			
			/*for each de Java:
			  TipoDeElemento (identificadorElemento) : collection (array, List, set, map)
			  Es una función pre-construida, por eso solo recive parámetros.*/
			
			String[] names = {"Xamitl", "Maggy", "Alex"};
			String misCompaneros = "";		
			
			for (String name : names) {
				misCompaneros += (name + " ");
			}
			
			System.out.println(misCompaneros);
			
			
			//Siguen unos ejercicios que nos dejó Lili, cuando corras un programa, se te pedirá poner números en consola:
			
			/*Part 1: While loops
			Open your IDE and create a new Java class named Table
			Copy the following code into your Java class Table and verify it works*/
			/*Implement a while loop that prints out the multiplication table of the given input number.*/

			    Scanner console = new Scanner(System.in);
			            int num;
			            
			            System.out.print("Enter any positive integer: ");
			            num = console.nextInt();
			                    
			            System.out.println("Multiplication Table of " + num);
			            
			           //TODO implement While loop to get print result
			            
			            int contador = 1;
			            
			            while (contador<=10) {
			            	System.out.println(num + " X " + contador + " = " + (num*contador));
			            	contador++;
			            }
			            
			            /*Part 2: Do While loops
			            Create a new Java class with a main method(so you can run your code) called Fibonacci
			            The Fibonacci numbers are a traditional computer science problem: "each number is the sum of the two preceding ones, starting from 0 and 1."
			            The beginning of the sequence is thus:
			            0 1 1 2 3 5 8 13 21 34 55 89 ...
			            Add the following import to be able to capture user input n
			              import java.util.Scanner;
			            Implement a Do While loop that calculates Fibonacci(n)*/

			    
			            System.out.println("Pon un número para checar hasta dónde llega en la secuencia Fibonacci: ");
			            int iteraciones = console.nextInt();
			            
			            int fiboNumber = 0;
			            int precedingOne = 0;
			            int precedingTwo = 0;
			            int contadorFibo = 0;
			            
			            do {
			            	
			            	precedingTwo = precedingOne;
			            	precedingOne = fiboNumber;
			            	fiboNumber = precedingOne + precedingTwo;
			            	System.out.println(fiboNumber);
			            	
			            	if (contadorFibo == 0) {
			            		fiboNumber ++;
			            		System.out.println(fiboNumber);
			            	}
			            	
			            	contadorFibo++;
			            	
			            }while(contadorFibo < iteraciones);
			    
			    

		/*Ejercicio For: Part 3: For loops
		Use the for loop to create a programm that ask the user to input a name and then prints each of the letters of the name
		Hint You can use the following String functions:
		lenght() -> returns the total number of characters of a given String
		chartAt(i) -> returns the character at the given position(i) of a String*/

			
			System.out.println("Cáete con un nombre: ");
			String nombre = console.next();
		
				
			for (int i=0;i<nombre.length();i++) {
				System.out.println(nombre.charAt(i));
			}
			
				
			console.close();
		}//Main's End

		
			public static boolean isOdd (int numero) {
				
				if ((numero % 2) == 0) {
					return false;
				}else {
					return true;
				}

			}
}