/*
 * Created by SharpDevelop.
 * User: Dell
 * Date: 5/21/2021
 * Time: 9:19 PM
 * 
 * To change this template use Tools | Options | Coding | Edit Standard Headers.
 */
using System;
using System.IO;
[Serializable]
public class FolioReal{
	
	private int nro;
	public FolioReal(){	
	}
	
	public void leer(){
		Console.WriteLine("FOLIO REAL\n" + " nro: ");
		nro = Leer.Integer();
	}
	
	public void mostrar(){
		Console.WriteLine("FOLIO REAL\n" +  "nro: " + nro);		
	}
	
	public void escribirAR(BinaryWriter e){
		e.Write(nro);
	}
	
	public void leerAR(BinaryReader r){
		nro = r.ReadInt32();
	}
}

