
package com.estudio.sprintjavam4;



/**
 *  SPRINT JAVA M4
 * @author ETIAN PARRA
 */
public class Usuario implements Asesoria {

    private String nombre ="";
    private String fechaNac ="";
    private int run =0;

    public Usuario() {
    }

    public Usuario(String nombre, String fechaNac, int run) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.run = run;
    }

    public String getNombre() {
        return nombre;
    }
    //SE MODIFICA EL SETNOMBRE PARA CUMPLIR CON EL REQUERIMIENTO (ENTRE 10 Y 50 CARACT)
    public void setNombre(String nombre) {
        this.nombre = nombre;
     }

    public String getFechaNac() {
        return fechaNac;
    }
    //FORMATEAMOS LA FECHA DE NACIMIENTO A DIA MES AÑO
    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getRun() {
        return run;
    }
    //SE MODIFICA EL SETRUT() PARA CUMPLIR REQUERIMIENTO
    public void setRun(int run) {
         this.run = run;
     }

     @Override
    public void analizarUsuario() {
        System.out.println(" ");
        System.out.println("-----------");
        System.out.println("- USUARIO -");
        System.out.println("-----------");
        System.out.println("NOMBRE : "+getNombre());
        System.out.println("RUN : "+getRun());
        System.out.println(" ");
    }
    
    
    @Override
    public String toString() {
        return    "\n------------"
                + "\n- USUARIO - " 
                + "\nNOMBRE : " + getNombre() 
                + "\nFECHA NACIMIENTO : " + getFechaNac() 
                + "\nRUN : "+ getRun()
                + "\n------------";
    }
    
    
}
