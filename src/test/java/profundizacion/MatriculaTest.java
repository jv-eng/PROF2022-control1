package profundizacion;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import static org.junit.jupiter.api.Assertions.*;


public class MatriculaTest {

	@Test
	public void vectorVacioTest() {
		Matricula m = new Matricula(null);
		assertThrows(Exception.class, () -> m.getImporte());
	}
	
	@Test
	public void importeMatriculaTest() throws Exception {
		Matricula m = mock(Matricula.class);
		m.vectorAsignaturas.add((Asignatura) new Object());
		m.vectorAsignaturas.add((Asignatura) new Object());
		m.vectorAsignaturas.add((Asignatura) new Object());
		
		when(m.getImporte()).thenReturn((double) 10);
		when(m.getImporte()).thenReturn((double) 10);
		when(m.getImporte()).thenReturn((double) 10);
		
		assertEquals((double)30, m.getImporte());
	}
	
	@Test
	public void comprobarNumEjecucionesTest() throws Exception {
		Matricula m = mock(Matricula.class);
		Asignatura a = mock(Asignatura.class);
		verify(a, times(m.vectorAsignaturas.size())).getImporte();
		assertTrue(true);
	}
}
