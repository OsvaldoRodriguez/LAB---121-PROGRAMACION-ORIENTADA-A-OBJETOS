/*
 * Created by SharpDevelop.
 * User: Dell
 * Date: 5/21/2021
 * Time: 9:29 PM
 * 
 * To change this template use Tools | Options | Coding | Edit Standard Headers.
 */
using System;
using System.IO;

	/// <summary>
	/// Description of Propietario.
	/// </summary>
	/// 
	[Serializable]
public class Propietario{
	private int np;
	private string []P = new string[100];
	
	
	public Propietario(){
	}
	
	
	public bool isNombre(String nombre){
		
		for(int i = 0; i < np; i++){
			if(P[i].Equals(nombre))
				return true;
		}
		return false;
	}
	public void leer(){
		Console.WriteLine("PROPIETARIO\n np - nombre prop");
		np = Leer.Integer();
		for(int i = 0; i < np; i++)
			P[i] = Leer.Cadena();
	}
	
	public void mostrar(){
		Console.WriteLine("PROPIETARIO\n np: " + np);
		for(int i = 0; i < np; i++)
			Console.Write(P[i] + " ");
		Console.WriteLine();
	}
	
	public void escribirAR(BinaryWriter w){
		w.Write(np);
		for(int i = 0; i < np; i++){
			w.Write(P[i]);
		}
	}
	
	public void leerAR(BinaryReader r){
		np = r.ReadInt32();
		for(int i = 0; i < np; i++)
			P[i] = r.ReadString();
	}
}

