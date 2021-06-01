/*
 * Created by SharpDevelop.
 * User: Dell
 * Date: 5/21/2021
 * Time: 9:55 PM
 * 
 * To change this template use Tools | Options | Coding | Edit Standard Headers.
 */
using System.IO;
using System;

	/// <summary>
	/// Description of ArchBI.
	/// </summary>
public class ArchBI{
	private string nombre;
	public ArchBI( string na ) {
		nombre = na;
	}
	/// Metodo que crea un nuevo archivo borrando si existia uno
	/// anterior.
	public void crearNuevo() {
		if( System.IO.File.Exists(nombre) ) {
			Console.WriteLine("Realmente quiere crear el archivo ojo que se borraran los registros?. s/n");
			if( Console.ReadKey().KeyChar == 's' )
				System.IO.File.Delete(nombre);
		}
		else{
			System.IO.File.Create(nombre);
			Console.WriteLine("El archivo creado.");
		}
	}
	/// Adiciona un producto al final del archivo.
	public void adicionar() {
		Stream archp = File.Open(nombre, FileMode.Append);
		BinaryWriter escritor = new BinaryWriter(archp);
		BienInmueble prod = new BienInmueble();
		try {
			do {
				prod.leer1(); // todo bien
				prod.escribirAR(escritor);
				Console.Write("Desea continuar añadiendo productos? s/n => ");
			} while( Console.ReadKey().KeyChar == 's' );
		}
		catch( Exception ) {
			Console.WriteLine("Fallo en adicionar el objeto !!!");
		}
		finally {
			archp.Close();
		}
	}
	public void listar() {
		
		// Abrimos el archivo o se crea un nuevo archivo si no existe
		Stream archp = File.Open(nombre, FileMode.Open);
		BinaryReader lector = new BinaryReader(archp);
		BienInmueble prod = new BienInmueble();
		try {
			Console.Write("");
			while( true ) {
				prod.leerAR(lector);
				prod.mostrar1();
			}
		}
		catch( Exception ) {
			Console.WriteLine("Fin de archivo ...");
		}
		finally {
			archp.Close();
		}
	}



	public bool solucion(string nomPropietario) {
		
		bool flag = false;
		// Abrimos el archivo o se crea un nuevo archivo si no existe
		Stream archp = File.Open(nombre, FileMode.Open);
		BinaryReader lector = new BinaryReader(archp);
		BienInmueble prod = new BienInmueble();
		try {
			Console.Write("");
			while( true ) {
				prod.leerAR(lector);
				
				
				if(prod.getP().isNombre(nomPropietario)){
					flag = true;
					prod.mostrar1();
				}
				
			}
		}
		catch( Exception ) {
			Console.WriteLine("Fin de archivo ...");
		}
		finally {
			archp.Close();
		}
		
		return flag;
	}	
//	public bool eliminar( string codigo ) {
//		bool sw = false;
//		try {
//			// Abrimos el archivo o se crea un nuevo archivo si no existe
//			Stream archp = File.Open(nombre, FileMode.Open);
//			Stream archTemporal = File.Open(@"D:\temp.dat", FileMode.OpenOrCreate);
//			BinaryReader lector = new BinaryReader(archp);
//			BinaryWriter escribeTemp = new BinaryWriter(archTemporal);
//			Provincia prod = new Provincia(); // cambiar
//			
//			try {
//				while( true ) {
//					prod.leerAP(lector);
//					if( prod.getNombre().Equals(codigo) ) {
//						prod.escribirAP(escribeTemp);
//					}
//					else {
//						sw = true;
//					}
//				}
//			}
//			catch( Exception ) {
//				// No hace nada.
//			}
//			finally {
//				archp.Close();
//				archTemporal.Close();
//				File.Replace(@"D:\temp.dat", nombre, nombre + ".bak");
//			}
//		}
//		catch( Exception ) {
//			Console.WriteLine("El archivo no se puede acceder !!!");
//		}
//		return sw;
//	}
	/// Modifica un producto por el codigo que se le pasa como parametro.
	/// <param name="codigo">El codigo, un estero, que se va a eliminar.</param>
	/// <returns>Un valor booleano, indica que si realmente se ha eliminado.</returns>
//	public bool modificar( int codigo ) {
//		bool sw = false;
//		try {
//			// Abrimos el archivo o se crea un nuevo archivo si no existe
//			Stream archp = File.Open(nombre, FileMode.OpenOrCreate);
//			Stream archTemporal = File.Open(@"C:\temp.dat", FileMode.OpenOrCreate);
//			BinaryReader lector = new BinaryReader(archp);
//			BinaryWriter escribeTemp = new BinaryWriter(archTemporal);
//			Producto prod = new Producto();
//			try {
//				while( true ) {
//					prod.leerAP(lector);
//					if( prod.getCodigo()== codigo ) {
//						prod.mostrar();
//						Console.WriteLine("\nIngrese los nuevos valores :");
//						prod.leer();
//						sw = true;
//					}
//					prod.escribirAP(escribeTemp);
//				}
//			}
//			catch( Exception ) {
//				// No hace nada.
//			}
//			finally {
//				archp.Close();
//				archTemporal.Close();
//				File.Replace(@"C:\temp.dat", nombre, nombre+".bak");
//			}
//		}
//		catch( Exception ) {
//			Console.WriteLine("El archivo no se puede acceder !!!");
//		}
//		return sw;
//	}
}

