package futbol;

public class Jugador extends Futbolista implements Comparable<Object> {
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}
	
	public Jugador() {
        super();
        this.golesMarcados = 289;
        this.dorsal = 7; 
	}   
	
	public int compareTo(Object o) {
        Jugador j = (Jugador) o;
        return Math.abs(this.getEdad() - j.getEdad());
	}
	
	public String toString() {
	    return "El futbolista " + getNombre() + " tiene " + getEdad() + ", y juega de " + getPosicion() + " con el dorsal " + this.dorsal + ". Ha marcado " + this.golesMarcados;
	}
	
	public boolean jugarConLasManos() {
		return false;
	}
}
