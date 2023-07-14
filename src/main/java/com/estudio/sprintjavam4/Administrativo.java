
package com.estudio.sprintjavam4;

/**
 *
 * @author ETIAN PARRA
 */
public class Administrativo extends Usuario{
    private String area ="";
    private String experiencia ="";

    public Administrativo() {
    }


    public Administrativo(String area, String experiencia, 
            String nombre, String fechaNac, int run) {
        super(nombre, fechaNac, run);
        this.area = area;
        this.experiencia = experiencia;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
     }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
      }

    @Override
    public void analizarUsuario() {
        System.out.println("------------------");
        System.out.println("- ADMINISTRATIVO -");
        System.out.println("------------------");
        System.out.println("NOMBRE : "+super.getNombre());
        System.out.println("RUN : "+super.getRun());
        System.out.println("AREA : "+getArea());
        System.out.println("EXPERIENCIA : "+getExperiencia());
        System.out.println(" ");
    }
    
    
    @Override
    public String toString() {
        return  "\n------------------------"
                + "\n- ADMINISTRATIVO -" 
                + "\n   "
                + "\nAREA : " + getArea() 
                + "\nEXPERIENCIA : " + getExperiencia()
                + "\n----------------------";
    }
    
    
}
