
public class Pedido {
	private String pro[][] = new String[2][15];
	private String fecha, nitCliente;
	private int nro_productos;
	
	
	
	public Pedido(String fecha, String nitCliente) {
//		super();
		this.fecha = fecha;
		this.nitCliente = nitCliente;
		nro_productos = 3;
		
		// codigos
		pro[0][0] = "C1";
		pro[0][1] = "C2";
		pro[0][2] = "C3";
		// cantidad;
		
		pro[1][0] = "10";
		pro[1][1] = "100";
		pro[1][2] = "12";
		
	}
	
	public Pedido(String fecha) {
//		super();
		this.fecha = fecha;
		this.nitCliente = "12345678";
		nro_productos = 2;
		
		// codigos
		pro[0][0] = "C1";
		pro[0][1] = "P1";
		// cantidad;
		
		pro[1][0] = "1";
		pro[1][1] = "8";
		pro[1][2] = "9";
		
	}
	
	public boolean pedidoCliente_X(String ci) {
		boolean flag = false;
		if(getNitCliente().equals(ci))
			flag = true;
		return flag;
	}
	public String[][] getPro() {
		return pro;
	}
	public void setPro(String[][] pro) {
		this.pro = pro;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getNitCliente() {
		return nitCliente;
	}
	public void setNitCliente(String nitCliente) {
		this.nitCliente = nitCliente;
	}
	
	
	
	public int getNro_productos() {
		return nro_productos;
	}
	public void setNro_productos(int nro_productos) {
		this.nro_productos = nro_productos;
	}
	public void mostrar() {
		System.out.println("Pedido\n" + " Fecha " + fecha + " NitCliente: " + nitCliente + " nroProductos: " + nro_productos);
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < nro_productos; j++) {
				System.out.print(pro[i][j] + " ");
			}
			System.out.println();
		}
	}
}
