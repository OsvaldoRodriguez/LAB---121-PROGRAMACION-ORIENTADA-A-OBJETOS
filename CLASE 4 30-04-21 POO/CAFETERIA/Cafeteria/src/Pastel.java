
public class Pastel extends Producto {
	private int nro_porciones;
	private String porciones;
	
	
	public Pastel(String codigo, int precio, int nro_porciones, String porciones) {
		super(codigo, precio);
		this.nro_porciones = nro_porciones;
		this.porciones = porciones;
	}
	
	
	
	@Override
	public String toString() {
		return "Pastel [nro_porciones=" + nro_porciones + ", porciones=" + porciones + "]";
	}
	public void mostrar() {
		super.mostrar();
		System.out.println("Pastel\n nroPorciones " + nro_porciones + " porciones " + porciones);
	}


	public int getNro_porciones() {
		return nro_porciones;
	}
	public void setNro_porciones(int nro_porciones) {
		this.nro_porciones = nro_porciones;
	}
	public String getPorciones() {
		return porciones;
	}
	public void setPorciones(String porciones) {
		this.porciones = porciones;
	}
	
	
	
}
