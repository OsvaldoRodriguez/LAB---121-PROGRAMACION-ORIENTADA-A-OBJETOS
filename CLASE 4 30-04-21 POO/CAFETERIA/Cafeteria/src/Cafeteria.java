
public class Cafeteria {
	private String nombre;
	private int nro_cafes, nro_pasteles, nro_pedidos, nro_meseros;
	private Pastel[] pastel = new Pastel[30];
	private Pedido[] pedido = new Pedido[30];
	private Cafe[] cafe = new Cafe[30];
	private Mesero[]  mesero = new Mesero[30];
	
	
	
	
	
	
	public Cafeteria(String nombre) {
		this.nombre = nombre;
		// agregacion
		nro_pasteles = 0;
		nro_cafes = 0;
		nro_meseros = 0;
		
		
		// si o si tiene que haber un pedido
		// composicion
		nro_pedidos = 2;
		
		
		Pedido P1 = new Pedido("28/04/2021", "123l23");
		pedido[0] = P1;
		
		
		P1 = new Pedido("27/04/2021");
		pedido[1] = P1;
		
		// leer por teclado los pedidos
		
//		System.out.println("digite la cantidad de pedidos");
//		int numero = leer.nextInt();
//		nro_pedidos = numero;
//		for(int i = 0; i < nro_pedidos; i++) {
//			Pedido x = new Pedido();
//			x.leer();
//		}
		
	}
	public void mostrar() {
		System.out.println("Cafeteria\n nombre: " + nombre + " nroPasteles: " + nro_pasteles);
		System.out.println("PASTELES");
		System.out.println("*********************************");
		for(int i = 0; i < nro_pasteles; i++) {
			pastel[i].mostrar();
			
		}
		System.out.println("*********************************");

		System.out.println("nro Pedidos: " + nro_pedidos);
		System.out.println("PEIDDOS");
		for(int i = 0; i < nro_pedidos; i++) {
			pedido[i].mostrar();
		}

		System.out.println("*********************************");

		System.out.println("nro Cafe: " + nro_cafes);
		System.out.println("CAFE\n");
		for(int i = 0; i < nro_cafes; i++) {
			cafe[i].mostrar();
		}

	}
	
	public void adiPastel(Pastel P) {
		if(nro_pasteles < 30) {
			pastel[nro_pasteles] = P;
			nro_pasteles++;
		}
	}
	
	public void adiCafe(Cafe c) {
		if(nro_cafes < 30) {
			cafe[nro_cafes] = c;
			nro_cafes++;
		}
	}
	
	public void adiMesero(Mesero m) {
		if(nro_meseros < 30) {
			mesero[nro_meseros] = m;
			nro_meseros++;
		}
	}
	public void mostrar(String ci) {
		for(int i = 0; i < nro_pedidos; i++) {
			if(pedido[i].pedidoCliente_X(ci) == true) {
				pedido[i].mostrar();
			}
		}
	}
	
	
	public void sol2() {
		for(int i = 0; i < nro_pedidos; i++) {
			int cnt = 0;
			for(int j = 0; j < pedido[i].getNro_productos(); j++) {
//				System.out.println(pedido[i].getPro()[0][j]);
				if(existeCodigo(pedido[i].getPro()[0][j])) {
					cnt++;
				}
			}
			if(cnt == 0)
				pedido[i].mostrar();
		}
	}
	
	public boolean existeCodigo(String cod) {
		for(int i = 0; i < nro_pasteles; i++) {
			if(pastel[i].getCodigo().equals(cod))
				return true;
		}
		return false;
	}
	
	
	public void solucionfinal3() {
		
		int mx = 0;
		for(int i = 0; i < nro_cafes; i++) {
			
			int actual = sol3(cafe[i].getTipo());
//			System.out.println(cafe[i].getTipo() + " " + actual);
			if(actual > mx) {
				mx = actual;
			}
		}
		for(int i = 0; i < nro_cafes; i++) {
			int actual = sol3(cafe[i].getTipo());
			if(actual == mx) {
				System.out.println(cafe[i].getTipo());
			}
		}
		
		
		
		
	}
	public int sol3(String tipoCafe) {
		int cantidad = 0;
		for(int i = 0; i < nro_pedidos; i++) {
			for(int j = 0; j < pedido[i].getNro_productos(); j++) {
//				System.out.println(pedido[i].getPro()[0][j]);
				// costo del cafe
				// sino existe -> 0
				if(Cafe_es_tipoCafe(pedido[i].getPro()[0][j], tipoCafe))
					cantidad++;
			
			}
		}
		return cantidad;
	}
	
	public boolean Cafe_es_tipoCafe(String cod, String tipoCafe) {
		for(int i = 0; i < nro_cafes; i++) {
			if(cafe[i].getCodigo().equals(cod) && cafe[i].getTipo().equals(tipoCafe))
				return true;
		}
		return false;
	}
	public Pedido[] getPedido() {
		return pedido;
	}
	public void setPedido(Pedido[] pedido) {
		this.pedido = pedido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNro_cafes() {
		return nro_cafes;
	}
	public void setNro_cafes(int nro_cafes) {
		this.nro_cafes = nro_cafes;
	}
	public int getNro_pasteles() {
		return nro_pasteles;
	}
	public void setNro_pasteles(int nro_pasteles) {
		this.nro_pasteles = nro_pasteles;
	}
	public int getNro_pedidos_() {
		return nro_pedidos;
	}
	public void setNro_pedidos_(int nro_pedidos) {
		this.nro_pedidos = nro_pedidos;
	}
	public int getNro_meseros() {
		return nro_meseros;
	}
	public void setNro_meseros(int nro_meseros) {
		this.nro_meseros = nro_meseros;
	}
	public Pastel[] getPastel() {
		return pastel;
	}
	public void setPastel(Pastel[] pastel) {
		this.pastel = pastel;
	}
	
	public int getNro_pedidos() {
		return nro_pedidos;
	}
	public void setNro_pedidos(int nro_pedidos) {
		this.nro_pedidos = nro_pedidos;
	}
	public Cafe[] getCafe() {
		return cafe;
	}
	public void setCafe(Cafe[] cafe) {
		this.cafe = cafe;
	}
	public Mesero[] getMesero() {
		return mesero;
	}
	public void setMesero(Mesero[] mesero) {
		this.mesero = mesero;
	}
	
	
}
