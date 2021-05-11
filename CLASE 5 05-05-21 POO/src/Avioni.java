/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Avioni {
    private String codigo;
    private Silla silla[] = new Silla[100];// 8 sillas -> ejecutivo restantes economico

    public Avioni(){
        codigo = "F12";
        silla[1] = new Silla("ejecutivo", "ventana");
        silla[4] = new Silla("ejecutivo", "ventana");
        silla[5] = new Silla("ejecutivo", "ventana");
        silla[8] = new Silla("ejecutivo", "ventana");
        
        String preferencia = null;
        int offset = 8;
        for(int i = 1; i <= 42; i++){
            if(i % 6 == 1 || i % 6 == 0){
                preferencia = "ventana";
            }
            if(i % 6 == 2 || i % 6== 5){
                preferencia = "centro";
                    
            }
            if(i % 6 == 3 || i % 6 == 4){
                preferencia = "pasillo";
                
            }
            silla[i + offset] = new Silla("economico", preferencia);
        }
        
        
    }
    
    public void mostrar(){
        System.out.println("codigo: " + codigo);
        for(int i = 0; i < 1; i++){
            silla[i].mostrar();
        }
    }
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Silla[] getSilla() {
        return silla;
    }

    public void setSilla(Silla[] silla) {
        this.silla = silla;
    }
    
    
    
}
