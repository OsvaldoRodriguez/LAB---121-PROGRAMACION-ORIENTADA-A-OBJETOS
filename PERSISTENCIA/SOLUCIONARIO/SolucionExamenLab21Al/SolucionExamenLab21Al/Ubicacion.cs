/*
 * Created by SharpDevelop.
 * User: Dell
 * Date: 5/21/2021
 * Time: 9:23 PM
 * 
 * To change this template use Tools | Options | Coding | Edit Standard Headers.
 */
using System;
using System.IO;

	/// <summary>
	/// Description of Ubicacion.
	/// </summary>
	/// 
[Serializable]
public class Ubicacion{
	private string zona, calle, nro;
	public Ubicacion(){
		zona = "xya";
		calle = "wer";
		nro = "sdflk";
		
	}
	public void leer(){
		Console.WriteLine("UBICACION\n  zona - calle - nro");
		zona = Leer.Cadena();
		calle = Leer.Cadena();
		nro = Leer.Cadena(); // int
	}
	
	public void mostrar(){
		Console.WriteLine("UBICACION\n zona: " + zona + " calle: " + calle + " nro: " + nro);
	}
	
	public void escribirAR(BinaryWriter w){
		w.Write(zona);
		w.Write(calle);
		w.Write(nro);
	}
	
	public void leerAR(BinaryReader r){
		zona = r.ReadString();
		calle = r.ReadString();
		nro = r.ReadString();
	}
}

