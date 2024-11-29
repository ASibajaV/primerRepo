package org.poo;

import java.util.HashMap;

public class PooMain {

	public static void main(String[] args) {
		
		Poo alex = new Poo("Alejandro", "Sibaja", "Analista", 29, 25_000, 0);
		
		alex.trabajar();
		alex.calcularSalario();
		alex.informacion();
		
		System.out.println(alex.getPuesto() + ": " + alex.getSalario());
		
		double nuevoSalario = 30_000;
		alex.setSalario(nuevoSalario);
		
		String nuevoPuesto = "CEO";
		alex.setPuesto(nuevoPuesto);
		
		System.out.println(alex.getPuesto() + ": " + alex.getSalario());
		
		//Nueva clase--------------------
		
		HashMap<Integer, Poo> EmpleadoIdList = new HashMap<Integer, Poo>();
		
	}

}
