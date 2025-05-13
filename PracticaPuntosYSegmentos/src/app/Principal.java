package app;

import clases.Punto;
import clases.Segmento;

public class Principal {

	public static void main(String[] args) {
		Punto p1 = new Punto (1,6);
		Punto p2 = new Punto (4,6);
		Punto p3 = new Punto (2,9);
		Punto p4 = new Punto (7,1);
		
		Segmento s1 = new Segmento (p1, p2);
		Segmento s2 = new Segmento (p3, p4);

	}

}
