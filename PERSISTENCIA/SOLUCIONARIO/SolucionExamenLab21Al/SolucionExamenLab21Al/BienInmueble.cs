/*
 * Created by SharpDevelop.
 * User: Dell
 * Date: 5/21/2021
 * Time: 9:35 PM
 * 
 * To change this template use Tools | Options | Coding | Edit Standard Headers.
 */
using System;
using System.IO;

	/// <summary>
	/// Description of BienInmueble.
	/// </summary>
	[Serializable]
public class BienInmueble: Bien{
	private Ubicacion U = new Ubicacion();
	private FolioReal F = new FolioReal();
	private Propietario P = new Propietario();

	
	public Propietario getP(){
		return P;
	}
	public BienInmueble(){
		U = new Ubicacion();
		F = new FolioReal();
		P = new Propietario();
	}
	
	public void leer1(){
		Console.WriteLine("BIEN INMUEBLE\n");
		
		base.leer();
		U.leer();
		F.leer();
		P.leer();
	}
	
	
	public void mostrar1(){
		
		Console.WriteLine("********************************************\nBIEN INMUEBLE\n");
		base.mostrar();
		U.mostrar();
		F.mostrar();
		P.mostrar();
		
	}
	
	public void escribirAR(BinaryWriter w){
		w.Write(avaluo); 
		U.escribirAR(w); // no  lo ha escrito
		F.escribirAR(w);
		P.escribirAR(w);
	}
	
	public void leerAR(BinaryReader r){
//		base.leerAR(w);
		avaluo = r.ReadString();
		U.leerAR(r);
		F.leerAR(r);
		P.leerAR(r);
	}
	
}

