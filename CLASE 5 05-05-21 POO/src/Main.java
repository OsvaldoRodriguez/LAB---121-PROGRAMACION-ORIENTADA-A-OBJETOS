/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Main {
    public static void main(String args[]){
        Pasajero p = new Pasajero("juan", 123,123);
//        p.mostrar();
        
        Silla s = new Silla("asbs", "sfsdf");
        s.mostrar();
        
        Avioni a = new Avioni();
        a.mostrar();
    }
}
