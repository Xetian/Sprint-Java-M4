
package com.estudio.sprintjavam4;



/**
 *
 * @author ETIAN PARRA
 */
public class Accidente {
    private int identificador =0;
    private int rutCliente =0;
    private String dia ="";
    private String hora ="";
    private String lugar ="";
    private String origen ="";
    private String consecuencias ="";

    public Accidente() {
    }

    public Accidente(int identificador, int rutCliente, 
            String dia, String hora, String lugar, String origen, 
            String consecuencias) {
        this.identificador = identificador;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.origen = origen;
        this.consecuencias = consecuencias;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(int rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getConsecuencias() {
        return consecuencias;
    }

    public void setConsecuencias(String consecuencias) {
        this.consecuencias = consecuencias;
    }

    @Override
    public String toString() {
        return "\n------------------"
                + "-ACCIDENTE-" 
                + "\nIDENTIFICADOR : " + getIdentificador() 
                + "\nRUT CLIENTE : " + getRutCliente() 
                + "\nDIA : "+ getDia() 
                + "\nHORA : " + getHora() 
                + "\nLUGAR : " + getLugar() 
                + "\nOrigen : " + getOrigen() 
                + "\nCONSECUENCIA : "+getConsecuencias()
                + "\n---------------------------";
    }

    
    
}
