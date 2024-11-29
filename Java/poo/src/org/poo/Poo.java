package org.poo;

public class Poo {
	
	//Declarar atributos, variables de instancia
	
	public String nombre;
	protected String apellido;
	private String puesto;
	private int edad;
	public double salario;
	private int id;
	
	//Método constructor
	public Poo(String nombre, String apellido, String puesto, int edad, double salario, int id) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.puesto = puesto;
		this.edad = edad;
		this.salario = salario;
		this.id = id;
		}
	
	//Métodos de comportamiento:
	public void trabajar(){
		System.out.println("Estoy trabajando");
	}
	public void calcularSalario() {
		System.out.println("El salario es de $" + this.salario);
	}
	public void informacion() {
		System.out.println("Nombre: "+ this.nombre + " " + this.apellido);
		System.out.println("Edad: " + this.edad);
		System.out.println("Puesto: "+ this.puesto);
		System.out.println("Salario: "+ this.salario);
	}

	public String getNombre() {
		return nombre;
	}
	
	
	
	
	
	//Métodos de conversión a String (toString)
		@Override
	public String toString() {
		return "Poo [nombre=" + nombre + ", apellido=" + apellido + ", puesto=" + puesto + ", edad=" + edad
				+ ", salario=" + salario + "]";
	}	
	
	//GETTERS AND SETTERS
	public int getId() {
		return id;
	}

		public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}