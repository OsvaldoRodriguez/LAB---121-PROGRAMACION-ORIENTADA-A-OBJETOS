/*
 * Created by SharpDevelop.
 * User: Dell
 * Date: 5/21/2021
 * Time: 9:18 PM
 * 
 * To change this template use Tools | Options | Coding | Edit Standard Headers.
 */
using System;

class Program{
	public static void Main(string[] args){
			bool sw = true;
//            int cod;
            string opp;
            while( sw ) {
                // Hacemos que el fondo y el las letras sean de colores mas atractivos
                Console.ForegroundColor = ConsoleColor.DarkBlue;
                Console.BackgroundColor = ConsoleColor.Gray;
                Console.WriteLine("\n                                        ");
                Console.WriteLine("             MENU                           ");
                Console.WriteLine("    ARCHIVO DE PRODUCTOS     ");
                Console.WriteLine("    ====================                          ");
                Console.WriteLine("                                        ");
                Console.WriteLine("1. CREAR                                ");
                Console.WriteLine("2. ADICION                              ");
                Console.WriteLine("3. LISTADO                              ");
                Console.WriteLine("4. ELIMINACION                          ");
                Console.WriteLine("5. MODIFICACION                         ");
                Console.WriteLine("6. BIENES INMUEBLES CON NOMBRE X                                   ");
                Console.WriteLine("7. SALIR                                ");
                Console.WriteLine("                                        ");
                Console.Write("INTRODUSCA  UNA  OPCION             =>  ");
                
                ArchBI arprod= new ArchBI(@"D:\bienInmueble.dat");
                // leemos un caracter si esta en el intervalo 1-6 hace las 
                // Opciones que se detallan si es 7 o otro caracter sale del programa
                // haciendo un beep
                switch( Console.ReadKey().KeyChar ) {
                	case '1':
                		arprod.crearNuevo();
                		break;
                	case '2':
                		arprod.adicionar();
                		break;
                	case '3':
                		arprod.listar();
                		break;
                	case '4':
                		
//                		Console.WriteLine("el propietario no tiene bien inmueble");
                		break;
                	case '5':
                		
                        break;
                    case '6':
                        //...
                        Console.WriteLine("digite nombre del propietario");
                		opp = Leer.Cadena();
                		//                        arprod.eliminar(opp);
                		
                		Console.WriteLine(opp);
                		if( ! arprod.solucion(opp))
                			Console.WriteLine("no es propietario");
                        break;
                    default:
                        Console.WriteLine("\n   El programa ya termino  !!!");
                        // La siguiente linea provoca un bip de la maquina.
                        //Console.Beep();
                        sw = false;
                        break;
                }
            }
            
            Console.ReadKey();
	}
	
	
}
