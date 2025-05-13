package clases;

public class Punto {
	
	public int x;
	public int y;
	
	
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	public Punto() {
		this.x = 0;
		this.y = 0;
	}
	
	
	/**
	 * Creamos un Set para asignar valor a la x
	 */
	public void setX() {
		this.x = x;
	}
	
	
	/**
	 * Creamos un get para recibir el valor de x
	 * @return el valor de x
	 */
	public int getX() {
		return this.x;
	}
	
	/**
	 * Creamos un Set para asignar valor a la y
	 */
	public void setY() {
		this.y = y;
	}
	
	/**
	 * Creamos un get para recibir el valor de y
	 * @return el valor de y
	 */
	public int getY() {
		return this.y;
	}
	
	public String toString() {
		return "El punto esta en: " + "(" + this.x + ", " + this.y + ")";
	}
	
	
	
	
	


}
