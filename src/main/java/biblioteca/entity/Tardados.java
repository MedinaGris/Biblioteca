/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.entity;

import java.io.Serializable;


/**
 *
 * @author medina
 */

public class Tardados implements Serializable, Comparable<Tardados> {
    

    private String idEjemplar;
    private String pertenece;
    private String fechaDevolucionAsignada;
    private String fechaDevolucionReal;
    private int diferencia;

    public String getIdEjemplar() {
        return idEjemplar;
    }

    public String getPertenece() {
        return pertenece;
    }

    public void setPertenece_a(String pertenece) {
        this.pertenece = pertenece;
    }

    public String getFechaDevolucionAsignada() {
        return fechaDevolucionAsignada;
    }

    public void setFechaDevolucionAsignada(String fechaDevolucionAsignada) {
        this.fechaDevolucionAsignada = fechaDevolucionAsignada;
    }

    public String getFechaDevolucionReal() {
        return fechaDevolucionReal;
    }

    public void setFechaDevolucionReal(String fechaDevolucionReal) {
        this.fechaDevolucionReal = fechaDevolucionReal;
    }

    public int getDiferencia() {
        return diferencia;
    }

    public void setDiferencia(int diferencia) {
        this.diferencia = diferencia;
    }

    public void setIdEjemplar(String idEjemplar) {
        this.idEjemplar = idEjemplar;
    }

    @Override
    public int compareTo(Tardados e){
        if(e.getDiferencia()<diferencia){
            return -1;
        }else if(e.getDiferencia()==diferencia){
            return 0;
        }else{
            return 1;
        }
    }
    
}
