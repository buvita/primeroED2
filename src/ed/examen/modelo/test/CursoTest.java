package ed.examen.modelo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ed.examen.modelo.Curso;
import ed.examen.modelo.Persona;

class CursoTest {
				
		Curso c= new Curso();
		Persona p=new Persona("12345678Q","Jandro","merino");
	
	
	@Test
	void testEliminarAlumno() {
		//clase valida
		boolean lanzaException = false;
		try {
			c.eliminarAlumno("12345678Z9");
		} catch (Exception e) {
			lanzaException=true;
		}
		assertFalse(lanzaException);
		
		//clase invalida
		lanzaException = false;
		try {
			c.eliminarAlumno("1234567");
		} catch (Exception e) {
			lanzaException=true;
		}
		assertFalse(lanzaException);
	}

	@Test
	void testAniadirAlumno() {
		fail("Not yet implemented");
	}

	@Test
	void testEstaRegistrado() {
		fail("Not yet implemented");
	}

	@Test
	void testCurso() {
		fail("Not yet implemented");
	}

	@Test
	void testNumeroAlumnos() {
		fail("Not yet implemented");
	}

}
