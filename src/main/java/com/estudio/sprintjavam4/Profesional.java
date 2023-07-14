
package com.estudio.sprintjavam4;



/**
 *
 * @author ETIAN PARRA
 */
public class Profesional extends Usuario {
    private String titulo ="";
    private String fechaIng ="";

    public Profesional() {
    }


    public Profesional(String titulo, String fechaIng, String nombre, 
            String fechaNac, int run) {
        super(nombre, fechaNac, run);
        this.titulo = titulo;
        this.fechaIng = fechaIng;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
       this.titulo = titulo;
     }

    public String getFechaIng() {
        return fechaIng;
    }

    public void setFechaIng(String fechaIng) {
        this.fechaIng = fechaIng;
    }

    
    @Override
    public void analizarUsuario(){
        System.out.println(" ");
        System.out.println("-----------");
        System.out.println("- PROFESIONAL -");
        System.out.println("-----------");
        System.out.println("NOMBRE : "+super.getNombre());
        System.out.println("RUN : "+super.getRun());
        System.out.println("TITULO : "+getTitulo());
        System.out.println("FECHA INGRESO : "+getFechaIng());
        System.out.println(" ");
    }
    
    @Override
    public String toString() {
        return "-----------------"
                +"\n- PROFESIONAL -" 
                + "\n TITULO : " + getTitulo() 
                + "\nFECHA INGRESO : "+ getFechaIng() 
                + "\n------------";
    }
    
    
}
