package futbol;

public class Portero extends Futbolista implements Comparable<Object> {
	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}
	
	public String toString() {
	    return "El futbolista " + getNombre() + " tiene " + getEdad() + ", y juega de " + getPosicion() + " con el dorsal " + this.dorsal + ". Le han marcado " + this.golesRecibidos;
	}
	
	public int compareTo(Object o) {
		Portero p = (Portero) o;
		return Math.abs(this.golesRecibidos - p.golesRecibidos);
	}
	
	public boolean jugarConLasManos() {
		return true;
	}
}