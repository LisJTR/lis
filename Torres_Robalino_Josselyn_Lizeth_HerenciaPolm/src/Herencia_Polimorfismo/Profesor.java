package Herencia_Polimorfismo;

public class Profesor extends Personas {

	private String Asignatura;
	
	
	
	 public String getAsignatura() {
		return Asignatura;
	}

	public void setAsignatura(String asignatura) {
		Asignatura = asignatura;
	}
  
	
	@Override
	 public void saludar() {
		// TODO Auto-generated method stub
		
		System.out.println("Hola soy " +  this.getNombre() + " imparto : " +  Asignatura);
	}

	 @Override
	 public void realizarAccionEspecial() {
		// TODO Auto-generated method stub
		
		
		System.out.println("Hola soy el profesor " + this.getNombre() + " y doy clase de " +  Asignatura + " y tengo " + this.getEdad());
		
		
		
		
	}

	@Override
	public String toString() {
		return "Nombre profesor: " + getNombre() + "\n" +  " Edad: " + getEdad() ;
	}

	 
}
