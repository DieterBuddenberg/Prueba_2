/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dto;

/**
 *
 * @author admin
 */
public class Perfil {
    private int idPerfil;
    private String Detalle;

    /**
     * @return the idPerfil
     */
    public int getIdPerfil() {
        return idPerfil;
    }

    /**
     * @param idPerfil the idPerfil to set
     */
    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }

    /**
     * @return the Detalle
     */
    public String getDetalle() {
        return Detalle;
    }

    /**
     * @param Detalle the Detalle to set
     */
    public void setDetalle(String Detalle) {
        this.Detalle = Detalle;
    }
    
}
