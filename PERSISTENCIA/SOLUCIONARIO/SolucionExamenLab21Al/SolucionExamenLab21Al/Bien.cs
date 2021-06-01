/*
 * Created by SharpDevelop.
 * User: Dell
 * Date: 5/21/2021
 * Time: 9:33 PM
 * 
 * To change this template use Tools | Options | Coding | Edit Standard Headers.
 */
using System;
using System.IO;

	/// <summary>
	/// Description of Bien.
	/// </summary>
	//
//[Serializable]
public class Bien{
	protected string avaluo;
	public Bien(){
	}
	
	public void leer(){
		
		Console.WriteLine("AVALUO\n avaluo");
		avaluo = Leer.Cadena();
	}
	
	public void mostrar(){
		Console.WriteLine("AVALUO\n avaluo: " + avaluo);
	}
	
//	public void escribirAR(BinaryWriter w){
//		w.Write(avaluo);
//	}
//	public void leerAR(BinaryReader r){
//		avaluo = r.ReadString();
//	}
	
	public string getAvaluo(){
		return avaluo;
	}
	
	public void setAvaluo(string avaluo){
		this.avaluo =avaluo;
	}
}

