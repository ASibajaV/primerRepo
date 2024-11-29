package org.colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Colecciones {

	public static void main(String[] args) {
		
		//ArrayList, HashSet y HashMap
		
		//Colección de arreglos dinámicos		
		ArrayList<String> movies = new ArrayList<String>(); //se deja () para hacerle saber que es un arreglo dinámico
		
		movies.add("About time");
		movies.add("Titanic");
		movies.add("Matrix");
		
		String topPelis = movies.get(0);
				
		int size = movies.size();
		
		for (String movie : movies){
			System.out.println("Movie: " + movie);
		}
		
		//Colección de arreglos estáticos
		int [] numerosTelefono = {888555, 666777, 444488};
		for (int num : numerosTelefono){
			System.out.println("Teléfono: " + num);
		}
		System.out.println(Arrays.toString(numerosTelefono));
		
		//Hashes
		HashSet<String> namesCH47 = new HashSet<String>();
		namesCH47.add("Areli");
		namesCH47.add("Abi");
		namesCH47.add("Alex");
		namesCH47.add("Abi");
		namesCH47.add("Arez");
		
		int sizeCH47 = namesCH47.size();
		namesCH47.remove("Alex");
		
		sizeCH47 = namesCH47.size();
		System.out.println(sizeCH47);
		
		boolean isArezHere = namesCH47.contains("Arez");
		System.out.println(isArezHere);
		
		namesCH47.add("Irving");
		
		for (String name : namesCH47) {
			System.out.println("Un nombre es " + name);
		}
		
		//Hash Maps
		HashMap <Integer, String> users = new HashMap <Integer, String>();
		users.put(0, "Batman"); // se agrega como (clave, valor). Cuando usemos funciones como get(), se necesita poner la clave
		users.put(1, "Shazam");
		users.put(2, "Sirenoman");
		System.out.println(users);
		
		int sizeUsers = users.size();
		System.out.println(sizeUsers);
		
		System.out.println(users.get(2));
		
		for (int key : users.keySet()) {// keySet nos da el conjunto de todo el mapa
			System.out.println("Clave: " + key + "| Usuario: " + users.get(key));
		}
		

		
	}//Main's End
}
