/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado;

/**
 *
 * @author Dell
 */
public class Empleado implements java.io.Serializable{
    private String nombre, apellido, genero, fechaNac, fechaIngresoEmpresa;
    private double salario;
    private String codigo;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    Empleado(){
        this.nombre = "Osvaldo";
        this.apellido = "Rodriguez";
        this.genero = "Masculino";
        this.fechaNac = "23/12/1998";
        this.fechaIngresoEmpresa = "04/04/2019";
        this.salario = 3090.6;
        
    }

    public Empleado(String codigo, String nombre, String apellido, String genero, String fechaNac, String fechaIngresoEmpresa, double salario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.fechaNac = fechaNac;
        this.fechaIngresoEmpresa = fechaIngresoEmpresa;
        this.salario = salario;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getFechaIngresoEmpresa() {
        return fechaIngresoEmpresa;
    }

    public void setFechaIngresoEmpresa(String fechaIngresoEmpresa) {
        this.fechaIngresoEmpresa = fechaIngresoEmpresa;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    }
