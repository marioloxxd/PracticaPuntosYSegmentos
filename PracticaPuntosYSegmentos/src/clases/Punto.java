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
	
	public void setX() {
		this.x = x;
	}
	
	public int getX() {
		return this.x;
	}
	
	public void setY() {
		this.y = y;
	}
	
	public int getY() {
		return this.y;
	}
	
	public String toString() {
		return "El punto esta en: " + "(" + this.x + ", " + this.y + ")";
	}
	
	
	


}
