/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author medina Gris
 */
@Entity
@Table(name = "prestamos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Prestamos.findAll", query = "SELECT p FROM Prestamos p"),
    @NamedQuery(name = "Prestamos.findByIdPrestamo", query = "SELECT p FROM Prestamos p WHERE p.idPrestamo = :idPrestamo"),
    @NamedQuery(name = "Prestamos.findByFechaPrestamo", query = "SELECT p FROM Prestamos p WHERE p.fechaPrestamo = :fechaPrestamo"),
    @NamedQuery(name = "Prestamos.findByFechaDevolucionAsignada", query = "SELECT p FROM Prestamos p WHERE p.fechaDevolucionAsignada = :fechaDevolucionAsignada"),
    @NamedQuery(name = "Prestamos.findByFechaDevolucionReal", query = "SELECT p FROM Prestamos p WHERE p.fechaDevolucionReal = :fechaDevolucionReal")})
public class Prestamos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_prestamo")
    private Integer idPrestamo;
    @Column(name = "fecha_prestamo")
    @Temporal(TemporalType.DATE)
    private Date fechaPrestamo;
    @Column(name = "fecha_devolucion_asignada")
    @Temporal(TemporalType.DATE)
    private Date fechaDevolucionAsignada;
    @Column(name = "fecha_devolucion_real")
    @Temporal(TemporalType.DATE)
    private Date fechaDevolucionReal;
    @JoinColumn(name = "matricula", referencedColumnName = "matricula")
    @ManyToOne
    private Alumnos matricula;
    @JoinColumn(name = "id_ejemplar", referencedColumnName = "id_ejemplar")
    @ManyToOne
    private LibrosEjemplares idEjemplar;

    public Prestamos() {
    }

    public Prestamos(Integer idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public Integer getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(Integer idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucionAsignada() {
        return fechaDevolucionAsignada;
    }

    public void setFechaDevolucionAsignada(Date fechaDevolucionAsignada) {
        this.fechaDevolucionAsignada = fechaDevolucionAsignada;
    }

    public Date getFechaDevolucionReal() {
        return fechaDevolucionReal;
    }

    public void setFechaDevolucionReal(Date fechaDevolucionReal) {
        this.fechaDevolucionReal = fechaDevolucionReal;
    }

    public Alumnos getMatricula() {
        return matricula;
    }

    public void setMatricula(Alumnos matricula) {
        this.matricula = matricula;
    }

    public LibrosEjemplares getIdEjemplar() {
        return idEjemplar;
    }

    public void setIdEjemplar(LibrosEjemplares idEjemplar) {
        this.idEjemplar = idEjemplar;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPrestamo != null ? idPrestamo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prestamos)) {
            return false;
        }
        Prestamos other = (Prestamos) object;
        if ((this.idPrestamo == null && other.idPrestamo != null) || (this.idPrestamo != null && !this.idPrestamo.equals(other.idPrestamo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "biblioteca.entity.Prestamos[ idPrestamo=" + idPrestamo + " ]";
    }
    
}
