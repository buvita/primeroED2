package ed.examen.modelo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ed.examen.modelo.Persona;

class PersonaTest {
	Persona p=new Persona("12345678Q","Jandro","merino");
	@Test
	void testPersonaStringStringString() {
		assertEquals("12345678Q",p.getDni()); 
		assertEquals("Jandro",p.getNombre()); 
		assertEquals("merino",p.getApellido1()); 
	}

	@Test
	void testGetDni() {
		 boolean igual=false;
		 if(p.getDni()=="12345678Q") {
			igual=true; 
		 }
		 assertTrue(igual);
	}

	@Test
	void testSetDni() {
		//clase valida
		boolean tiraException = false;
		try {
			p.setDni("12345678Q");
		}catch(Exception e) {
			tiraException=true;
		}
		assertTrue(tiraException);
		
		//clase invalida
		try {
			p.setDni("12345678Z");
		}catch(Exception e) {
			tiraException=true;
		}
		assertTrue(tiraException);
	}

	@Test
	void testGetNombre() {
		boolean soniguales=false;
		if(p.getNombre()=="Jandro") {
			soniguales=true;
		}
		assert(soniguales);
	}

	@Test
	void testSetNombre() {
		p.setNombre("Jandro");
		assertEquals("Jandro",p.getNombre());
	} 

	@Test
	void testGetApellido1() {
		assertEquals("merino",p.getApellido1());
	}

	@Test
	void testSetApellido1() {
		p.setApellido1("merino");
		assertEquals("merino",p.getApellido1());
	}

}
