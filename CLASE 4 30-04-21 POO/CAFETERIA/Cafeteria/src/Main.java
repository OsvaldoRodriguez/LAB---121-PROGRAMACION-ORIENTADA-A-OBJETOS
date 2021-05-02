
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cafeteria C1 = new Cafeteria("NOMBRE1");
		
		Pastel P1 = new Pastel("P1", 123, 2, "medianas");
		Pastel P2 = new Pastel("P2", 13, 20, "medianas");
		Pastel P3 = new Pastel("P3", 12343, 42, "medianas");
		
		
		Cafe CC1 = new Cafe("C1", 123, "cappuccino");
		Cafe CC2 = new Cafe("C2", 12, "expreso");
		Cafe CC3 = new Cafe("C3", 3, "americano");
		Cafe CC4 = new Cafe("C4", 1231, "expreso");
		
		Mesero M1 = new Mesero("M1", "Juanito");
		Mesero M2 = new Mesero("M2", "Alfonsino");
		Mesero M3 = new Mesero("M3", "Marleny");
		
		
		// adicionando pasteles
		C1.adiPastel(P1);
		C1.adiPastel(P2);
		C1.adiPastel(P3);
		
		//adicionando cafes
		C1.adiCafe(CC1);
		C1.adiCafe(CC2);
		C1.adiCafe(CC3);
		C1.adiCafe(CC4);
		
		// adicionando a meseros
		
		C1.adiMesero(M1);
		C1.adiMesero(M2);
		C1.adiMesero(M3);
		
		C1.mostrar();
		
		
//		Pedido P1 = new Pedido("28/04/2021", "123l23");
//		P1.mostrar();
		
//		System.out.println("SOLUCION A");
//		C1.mostrar("12345678");
		
//		System.out.println("SOLUCION C");
//		C1.sol2();
		System.out.println("SOLUCION E");
		C1.solucionfinal3();
	}

}
