public class Pasajero {
    private String nombre;
    private int ci;
    private int nroAsiento;

    public int getNroAsiento() {
        return nroAsiento;
    }

    public void setNroAsiento(int nroAsiento) {
        this.nroAsiento = nroAsiento;
    }

    public Pasajero(String nombre, int ci, int nroAsiento) {
        this.nombre = nombre;
        this.ci = ci;
        this.nroAsiento = nroAsiento;
    }
    public Pasajero(){
        this.nombre = "";
        this.ci = 0;
        this.nroAsiento = 0;
    }
    
    public void mostrar(){
        System.out.println("nombre: "  + nombre + " ci : " + ci + " nroAsiento: "  + nroAsiento );
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }
    
    
    
    
}
