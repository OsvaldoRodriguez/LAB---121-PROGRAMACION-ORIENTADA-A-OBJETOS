/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Dell
 */
public class ArchivoEmpleado implements java.io.Serializable{
    private String nomArch;
    private Empleado empleado = new Empleado();

    public ArchivoEmpleado(String nomArch) {
        this.nomArch = nomArch;
    }
    
    public void crear() throws ClassNotFoundException, IOException{
        ObjectOutputStream arch = new ObjectOutputStream(new FileOutputStream(nomArch));
        arch.close();
    }
    
    
}
