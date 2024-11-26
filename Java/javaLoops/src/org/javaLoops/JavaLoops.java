package org.javaLoops;
import java.util.Scanner;

public class JavaLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	



		
			
			/*int contador = 0;
			int oddsAddition = 0;
			int numberToCheck = 1;
			
			while(contador<20) {
				
				if(isOdd(numberToCheck)) {
					System.out.println("ping: " + numberToCheck);
					oddsAddition += numberToCheck;
					contador ++;
				}
				
				numberToCheck ++;
				
			}
			
			System.out.println ("La suma de los primeros 10 números impares es: " + oddsAddition);*/
			
			
			//CICLO WHILE
			/*int contador = 1;
			
			while (contador<=5) {
				System.out.println("Iteración: " + contador);
				contador++;
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
				System.out.println("Iteración: " + i);*/
			//}
			
			/*for each de Java:
			  TipoDeElemento (identificadorElemento) : collection (array, List, set, map)
			  Es una función pre-construida, por eso solo recive parámetros.*/
			
			/*String[] names = {"Xamitl", "Maggy", "Alex"};
			String misCompaneros = "";		
			
			for (String name : names) {
				misCompaneros += (name + " ");
			}
			
			System.out.println(misCompaneros);*/
			
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
			            Implement a Do While loop that calculates Fibonacci(n)

			            n
			            Fibonacci(n)
			            0
			            0
			            1
			            1
			            2
			            1
			            3
			            2
			            4
			            3
			            5
			            5
			            6
			            8
			            7
			            13
			            ...
			            ...*/
			        
			    
			
		
		
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

		
			
		}//Main's End

		
		

			public static boolean isOdd (int numero) {
				
				if ((numero % 2) == 0) {
					return false;
				}else {
					return true;
				}

			}
			

	}

}
