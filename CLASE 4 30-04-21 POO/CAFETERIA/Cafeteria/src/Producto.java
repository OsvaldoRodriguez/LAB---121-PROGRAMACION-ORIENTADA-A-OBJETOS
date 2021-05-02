
public class Producto {
	private String codigo;
	private int precio;
	
	public Producto() {
		
	}
	
	
	public Producto(String codigo, int precio) {
		this.codigo = codigo;
		this.precio = precio;
	}
	
	public void mostrar() {
//		System.out.println(toString());
		System.out.println("Producto\n Codigo: " + codigo + " precio: " + precio);
	}
	
	
	
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", precio=" + precio + "]";
	}


	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	
}
