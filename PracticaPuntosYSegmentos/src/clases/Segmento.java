package clases;

public class Segmento {
	
	public Punto a;
	public Punto b;
	

	
	public Segmento() {
		this.a = new Punto (0,0);
		this.b = new Punto (1,1);
	}
	
	public Segmento (Punto a, Punto b) {
		if(a.getX() == a.getY()) {
			throw new IllegalArgumentException ("Los numeros son iguales");
		}
		
		if (b.getX() == b.getY()) {
			throw new IllegalArgumentException ("Los numeros son iguales");
		}
		
		this.a = a;
		this.b = b;
	}
	
	/**
	 * Metodo Para calcular distancia
	 * @return Distancia 	
	 */
	public double Distancia() {
		return Math.sqrt(Math.pow((b.x - a.x), 2)+ Math.pow((b.y - b.x), 2));
	}

	/**
	 * Realizamos get
	 * @return Coordenada a
	 */
	public Punto getA() {
		return this.a;
	}
	
	/**
	 * Realizamos set para dar datos a this.a
	 */
	public void setA() {
		this.a = a;
	}
	
	/**
	 * Realizamos get
	 * @return Coordenada b
	 */
	public Punto getB() {
		return this.b;
	}
	
	
	/**
	 * Realizamos set para dar datos a this.b
	 */
	public void setB() {
		this.b = b;
	}
	
	
	public String toString() {
		return "[" + "(" + this.a + ")" + "(" + this.b + ")" + "]"; 
		
	}

}
