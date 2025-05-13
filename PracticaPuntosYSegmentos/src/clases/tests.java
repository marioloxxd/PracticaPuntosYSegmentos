package clases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class tests {

	@Test
	void testPuntoIntInt() {
		Punto p1 = new Punto (1,5);
		Punto p2 = new Punto (-4,-3);
		Punto p3 = new Punto (6,-4);
		Punto p4 = new Punto (2,2);
		
		Segmento s1 = new Segmento (p1, p2);
		Segmento s2 = new Segmento (p3, p4);
		
		s1.Distancia();
		s2.Distancia();
	}

}
