package ed.examen.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	 
	private List<Persona> listaAlumnos;

	public List<Persona> getListaAlumnos() {
		return listaAlumnos;
	}

	
	/**
	 * Este m�todo nos permitir� elimiar un alumno de la lista de alumnos
	 * @param dni
	 * @throws Exception
	 **/
	public void eliminarAlumno(String dni) throws Exception {
		if(dni.length()==9) {//comprobar la longitud del dni
			listaAlumnos.remove(new Persona(dni, "", "")); //solo hace falta el dni
		}else {
			throw new Exception("El dni no tiene la longitud adecuada");
		}
	}
	
	
	public void aniadirAlumno(Persona p) {
		listaAlumnos.add(p);
	}
	
	
	/**
	 * Esta funci�n nos va a permitir comprobar si un alumno se encuentra dentro de nuestra lista de alumnos
	 * @param dni
	 * @return
	 **/
	public Boolean estaRegistrado(String dni) {
		int i =0;
		Boolean encontrado=false;
		while (!encontrado && i<listaAlumnos.size()) {
			if(listaAlumnos.get(i).getDni().equals(dni)) {
				encontrado=true;
			}
			i++;
		}
		return encontrado;
	}	
	
	
	public Curso() {
		listaAlumnos= new ArrayList<Persona>();
	}
	
	
	/**
	 * Este m�todo devuelve un int con el tama�o de la lista de nuestros alumnos
	 * @return
	 */
	public Integer numeroAlumnos() {return listaAlumnos.size();}
	
	
	public void mostrarTodos() {
		for (Persona persona : listaAlumnos) {
			System.out.println(persona);
		}
	}

	
}
