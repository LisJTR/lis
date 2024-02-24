package Herencia_Polimorfismo;

import java.util.ArrayList;

import java.util.Scanner;

public class Instituto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sr = new Scanner(System.in);
		
		ArrayList<Personas> pers = new ArrayList<Personas>();
		
		
		int opcion = 0;
		while (opcion!=4) {
			
		System.out.println("1 - Alumno ");
		System.out.println("2 - Profesor ");
		System.out.println("3 - Mostrar la información");
		System.out.println("4 - No introducir más datos");
		opcion=sr.nextInt();
		
		switch (opcion) {
		case 1:
			
			System.out.println("Cuantos alumnos quieres introducir ");
			int n=sr.nextInt();
			
			for (int i = 0; i < n; i++) {
				Alumno a = new Alumno(); /* Los sitios a ubicar de mis objetos, serán diferentes dependiedo de la estructura de mi programa*/
										/*Si yo lo pongo fuera del recorrido del array, machaco una y otra vez la información en cada vuelta*/
			System.out.println("Introduce el nombre de alumno " );
			a.setNombre(sr.next());
			System.out.println("Introduce la edad del alumno " );
			a.setEdad(sr.nextInt());	
			
		
			pers.add(i,a);
			
			}
			
			break;
			
			
		case 2:
			
			System.out.println("Cuantos alumnos quieres introducir ");
			int n2=sr.nextInt();
			
			for (int i = 0; i < n2; i++) {
				Profesor p = new Profesor();
				
				System.out.println("Introduce el nombre del profesor " );
			p.setNombre(sr.next());
			System.out.println("Introduce la edad del profesor " );
			p.setEdad(sr.nextInt());
			System.out.println("¿Que asignatura imparte?");
			p.setAsignatura(sr.next());
			
			pers.add(i, p);
			
			}
			
			
			
			break;
			
		case 3:
			
			
			for (Personas i:pers) { /* Tengo que recorrer el array con los valores que tendría en cada vuelta, por eso esta para que recorra y enseñe la información dependiedo del i */
				
				if (i instanceof Alumno) {
				
					i.saludar();
					i.realizarAccionEspecial();
				
			
				} else if (i  instanceof Profesor){
			
					i.saludar();
					i.realizarAccionEspecial();
					
		
		}
			
						
				}
			
			break;	
			
			
		case 4:
			
			System.out.println("Gracias por introducir datos en la BBDD");
			break;	
			
			}
		
		}
		
		
	
			
		
			
			

					
				
					
			
		sr.close();
	}

}
