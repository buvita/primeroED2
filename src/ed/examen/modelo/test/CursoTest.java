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
					c.eliminarAlumno("12345678Q");
				} catch (Exception e) {
					lanzaException=true;
				}
				assertFalse(lanzaException);
				
				//clase invalida
				lanzaException = false;
				try {
					c.eliminarAlumno("12345678Z");
				} catch (Exception e) {
					lanzaException=true;
				}
				assertFalse(lanzaException);
	}

	@Test
	void testAniadirAlumno() {
		int sizeBefore = c.numeroAlumnos();
		c.aniadirAlumno(p);
		int sizeAfter=c.numeroAlumnos();
		assertEquals(sizeBefore,sizeAfter-1);
	}

	@Test
	void testEstaRegistrado() {
		//clase valida
		boolean noExiste = false;
		try{
			c.estaRegistrado("12345678Q");
		}catch(Exception e) {
			noExiste=true;
		}
		assertFalse(noExiste);
		 
		//clase invalida
		
		try{
			c.estaRegistrado("12345678");
		}catch(Exception e) {
			noExiste=true;
		}
		assertFalse(noExiste);
	}
 
	

	@Test
	void testNumeroAlumnos() {
		boolean igual=false;
		if(c.numeroAlumnos()==c.getListaAlumnos().size()) {
			igual=true;
		}
		assertTrue(igual);
		
	}
	
}
