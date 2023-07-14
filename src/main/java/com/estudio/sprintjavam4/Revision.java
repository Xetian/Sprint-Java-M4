package com.estudio.sprintjavam4;

/**
 *
 * @author ETIAN PARRA
 */
public class Revision {

    private int numRevision =0;
    private int visitaTerreno =0;
    private String nombreRevision ="";
    private String detalleRevisar ="";
    private int estado =0;

    public Revision() {
    }

    public Revision(int numRevision, int visitaTerreno, 
            String nombreRevision, String detalleRevisar, int estado) {
        this.numRevision = numRevision;
        this.visitaTerreno = visitaTerreno;
        this.nombreRevision = nombreRevision;
        this.detalleRevisar = detalleRevisar;
        this.estado = estado;
    }

    public int getNumRevision() {
        return numRevision;
    }

    public void setNumRevision(int numRevision) {
        this.numRevision = numRevision;
    }

    public int getVisitaTerreno() {
        return visitaTerreno;
    }

    public void setVisitaTerreno(int visitaTerreno) {
        this.visitaTerreno = visitaTerreno;
    }

    public String getNombreRevision() {
        return nombreRevision;
    }

    public void setNombreRevision(String nombreRevision) {
        this.nombreRevision = nombreRevision;
     }

    public String getDetalleRevisar() {
        return detalleRevisar;
    }

    public void setDetalleRevisar(String detalleRevisar) {
        this.detalleRevisar = detalleRevisar;
     }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    public String obtenerEstado() {
        if (getEstado() == 1) {
            return "Sin problemas";
        }
        if (getEstado() == 2) {
            return "Con observaciones";
        } else {
            return "No aprueba";
        }
    }

    @Override
    public String toString() {
        return "\n------------------"
                + "- REVISION -" 
                + "\nNUMERO REVISION : " + getNumRevision()
                + "\nVISITA TERRENO : " + getVisitaTerreno()
                + "\nNOMBRE REVISION : " + getNombreRevision()
                + "\nDETALLE REVISAR : " + getDetalleRevisar()
                + "\nESTADO : " + getEstado()
                +"\n------------------------";
    }

}
