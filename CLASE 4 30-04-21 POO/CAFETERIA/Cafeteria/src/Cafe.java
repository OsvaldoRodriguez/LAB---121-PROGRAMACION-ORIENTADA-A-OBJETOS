
public class Cafe extends Producto{
	private String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Cafe(String codigo, int precio, String tipo) {
		super(codigo, precio);
		this.tipo = tipo;
	}
	
	public void mostrar() {
		super.mostrar();
		System.out.println("CAFE\n tipo: " + tipo);
	}
	
	
}
