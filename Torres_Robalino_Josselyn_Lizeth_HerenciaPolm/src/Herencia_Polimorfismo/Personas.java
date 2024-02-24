package Herencia_Polimorfismo;

public abstract class Personas{

	private String nombre;
	private int edad;
	
	public abstract void saludar();
	public abstract void realizarAccionEspecial();
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
