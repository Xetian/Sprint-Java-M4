
package com.estudio.sprintjavam4;



/**
 *
 * @author ETIAN PARRA
 */
public class VisitaTerreno {
    private int identVisita =0;
    private int rutCliente =0;
    private String dia ="";
    private String hora ="";
    private String lugar ="";
    private String comentarios ="";

    public VisitaTerreno() {
    }

    public VisitaTerreno(int identVisita, int rutCliente, String dia, 
            String hora, String lugar, String comentarios) {
        this.identVisita = identVisita;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.comentarios = comentarios;
    }

    public int getIdentVisita() {
        return identVisita;
    }

    public void setIdentVisita(int identVisita) {
        this.identVisita = identVisita;
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

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
        }

    @Override
    public String toString() {
        return "\n----------------------"
                + "\n- VISITA TERRENO -" 
                + "\n IDENTIFICACION VISITA : " + getIdentVisita() 
                + "\nRUT CLIENTE : " + getRutCliente() 
                + "\nDIA : " + getDia() 
                + "\nHORA : " + getHora() 
                + "\n LUGAR : " + getLugar() 
                + "\nCOMENTARIOS : " + getComentarios()
                + "\n----------------------";
    }
    
    
    
}
