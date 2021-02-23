package ed.examen.modelo;

/**
 * @author buba Faty
 *@version 1.1
 **/
public class Persona{
	
	private String dni;
	private String nombre;
	private String apellido1;
	
	public Persona() {}
	
	 
	public Persona(String dni, String nombre, String apellido1) {
		this.dni = dni;
		this.nombre = nombre; 
		this.apellido1 = apellido1;
	}
	
	
	/**
	 * @return Esto te devuelve el DNI del alumno
	 **/
	public String getDni() {
		return dni;
	}
	
	
	
	/**
	 * Recoge un dni para asignarselo a la persona y verifica que cumple con los parámetros exigidos.
	 * @param dni toma como parámetro el dni de la persona
	 * @throws Exception  te devuelve una excepción si el dni introducido no es de longitud 9 y el ultimo carácter es una letra
	 **/
	public void setDni(String dni) throws Exception {
		//comprobacion de si el ultimo caracter es una letra
		if(Character.isLetter(dni.charAt(dni.length()))) {
			this.dni=dni;
		}else {
			throw new Exception("El ultimo caracter introducido no es una letra");
		}
	}
	
	
	/**
	 * Esta función te devuelve un String correspondiente al nombre de la persona
	 * @return nombre de la persona
	 **/
	public String getNombre() {
		return nombre;
	}
	
	
	/**
	 * Esta es una función le introducimos un String con un nombre para asignarselo a una Persona
	 * @param nombre toma como parámetro el nombre de la persona
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	/**
	 * Este método te devuelve un tipo String con el apellido de la persona solicitada
	 * @return devuelve el apellido de la persona
	 **/
	public String getApellido1() {
		return apellido1;
	}
	
	
	/**
	 * La función de este método es introducirle un String  con el apellido de la persona para asignarselo
	 * @param apellido1 toma como parámetro el apellido de la persona
	 **/
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	}
	

}
