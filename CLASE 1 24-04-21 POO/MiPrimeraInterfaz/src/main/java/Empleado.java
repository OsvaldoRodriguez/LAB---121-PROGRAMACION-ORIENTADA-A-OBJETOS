public class Empleado {
    private String nombre, apellido, genero, fechaNac;
    private double salario;

    
    Empleado(){
        this.nombre = "Osvaldo";
        this.apellido = "Rodriguez";
        this.genero = "Masculino";
        this.fechaNac = "23/12/1998";
        this.salario = 3090.6;
    }

    public Empleado(String nombre, String apellido, String genero, String fechaNac, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.fechaNac = fechaNac;
        this.salario = salario;
    }
    
    public void mostrar(){
        System.out.println("Nombre: " + nombre + " Apellido " + apellido + " GEnero: " + genero + " Fecha Nac: " + fechaNac + " Salario: " + salario);
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    }
