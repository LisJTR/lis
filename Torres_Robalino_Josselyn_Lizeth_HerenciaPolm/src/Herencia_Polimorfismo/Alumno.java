package Herencia_Polimorfismo;

public class Alumno extends Personas {


	
	@Override
	public void saludar() {
	
		
		// TODO Auto-generated method stub
		System.out.println("Hola soy " + this.getNombre());
	}

	@Override
	public void realizarAccionEspecial() {
		// TODO Auto-generated method stub
		
	
		
		if (this.getEdad()<18) {
			
			System.out.println("hola, soy  " + this.getNombre() + " ,y soy menor de edad");
			
		} else  {

			System.out.println("hola, soy  " + this.getNombre() + " ,y soy mayor de edad");
		}
		
		
		
		
	}

	@Override
	public String toString() {
		return "Nombre alumno: " + getNombre() + "\n" +  "Edad:" + getEdad();
	}

	

	
}
