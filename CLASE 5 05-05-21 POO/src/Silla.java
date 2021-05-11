/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Silla {
    private String tipo; // ejecutiva o economica
    private Pasajero p = new Pasajero();
    private String preferencia;   // ventana, pasillo o centro
    public Silla(String tipo, String preferencia) {
        this.tipo = tipo;
        this.preferencia = preferencia;
//        p = null;
    }

    public void mostrar(){
        System.out.println("SILLA");
        System.out.println("Tipo: " + tipo + " preferencia: " + preferencia);
//        p.mostrar();
//    public void addiPasajero(String nombre, int ci, int nro){
//        p.setNombre(nombre);
//        p.setCi(ci);
//        p.setNroAsiento(nro);
    }
    public String getPreferencia() {
        return preferencia;
    }

    public void setPreferencia(String preferencia) {
        this.preferencia = preferencia;
    }

    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Pasajero getP() {
        return p;
    }

    public void setP(Pasajero p) {
        this.p = p;
    }
    
    
    
}
