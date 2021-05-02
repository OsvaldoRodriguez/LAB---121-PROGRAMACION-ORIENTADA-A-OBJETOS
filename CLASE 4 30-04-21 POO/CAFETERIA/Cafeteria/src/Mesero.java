
public class Mesero {
	private String cod_mesero, nombre;

	public String getCod_mesero() {
		return cod_mesero;
	}

	public void setCod_mesero(String cod_mesero) {
		this.cod_mesero = cod_mesero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Mesero(String cod_mesero, String nombre) {
		this.cod_mesero = cod_mesero;
		this.nombre = nombre;
	}
	
	public void mostrar() {
		System.out.println("MESERO\n cod: " + cod_mesero + " nombre: " + nombre);
	}
	
	
	
}
