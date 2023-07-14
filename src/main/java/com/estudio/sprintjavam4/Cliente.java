
package com.estudio.sprintjavam4;

/**
 *
 * @author ETIAN PARRA
 */
public class Cliente extends Usuario{
  
    private String nombres ="";
    private String apellidos ="";
    private int rut =0;
    private String telefono ="";
    private String afp ="";
    private int sistSalud =0;
    private String direccion ="";
    private String comuna ="";
    private int edad =0;

    public Cliente() {
    }

    public Cliente(String nombres, String apellidos, 
            int rut, String telefono, String afp, int sistSalud, 
            String direccion, String comuna, int edad, String nombre, 
            String fechaNac, int run) {
        super(nombre, fechaNac, run);
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.rut = rut;
        this.telefono = telefono;
        this.afp = afp;
        this.sistSalud = sistSalud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
    }


    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }

    public int getSistSalud() {
        return sistSalud;
    }

    public void setSistSalud(int sistSalud) {
        this.sistSalud = sistSalud;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return  "\n---------------------"
                + "\n- CLIENTE -" 
                + "\nNOMBRE : " + getNombres() 
                + "\nAPELLIDO : " + getApellidos()
                + "\nRUT : " + getRut() 
                + "\nTELEFONO : " + getTelefono() 
                + "\nAFP : " + getAfp() 
                + "\nSISTEMA DE SALUD : " + getSistSalud() 
                + "\nDIRECCION : " + getDireccion() 
                + "\nCOMUNA : " + getComuna() 
                + "\nEDAD : " + getEdad()
                + "\n--------------------";
    }

   public String obtenerNombre(){
       return "getNombres()"+" "+"getApellidos()";
   }
   
    public String obtenerSistemaSalud() {
        if (getSistSalud() == 1) {
            return "FONASA";
        }
        if (getSistSalud() == 2) {
            return "ISAPRE";
        } else {
            return "NO DEFINIDO";
        }
    }
   
    @Override
   public void analizarUsuario(){
        System.out.println(" ");
        System.out.println("-----------");
        System.out.println("- CLIENTE -");
        System.out.println("-----------");
        System.out.println("NOMBRE : "+super.getNombre());
        System.out.println("RUN : "+super.getRun());
        System.out.println("DIRECCION : "+getDireccion());
        System.out.println("COMUNA : "+getComuna());
        System.out.println(" ");
   }
    
    
}
