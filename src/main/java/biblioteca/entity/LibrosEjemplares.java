/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author medina Gris
 */
@Entity
@Table(name = "libros_ejemplares")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LibrosEjemplares.findAll", query = "SELECT l FROM LibrosEjemplares l"),
    @NamedQuery(name = "LibrosEjemplares.findByIdEjemplar", query = "SELECT l FROM LibrosEjemplares l WHERE l.idEjemplar = :idEjemplar"),
    @NamedQuery(name = "LibrosEjemplares.findByCondicionFisica", query = "SELECT l FROM LibrosEjemplares l WHERE l.condicionFisica = :condicionFisica"),
    @NamedQuery(name = "LibrosEjemplares.findByPerteneceA", query = "SELECT l FROM LibrosEjemplares l WHERE l.perteneceA = :perteneceA")})
public class LibrosEjemplares implements Serializable {

    @OneToMany(mappedBy = "idEjemplar")
    private Collection<Prestamos> prestamosCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "id_ejemplar")
    private String idEjemplar;
    @Size(max = 50)
    @Column(name = "condicion_fisica")
    private String condicionFisica;
    @Size(max = 20)
    @Column(name = "pertenece_a")
    private String perteneceA;
    @JoinColumn(name = "id_libro", referencedColumnName = "id_libro")
    @ManyToOne(optional = false)
    private LibrosCatalogo idLibro;

    public LibrosEjemplares() {
    }

    public LibrosEjemplares(String idEjemplar) {
        this.idEjemplar = idEjemplar;
    }

    public String getIdEjemplar() {
        return idEjemplar;
    }

    public void setIdEjemplar(String idEjemplar) {
        this.idEjemplar = idEjemplar;
    }

    public String getCondicionFisica() {
        return condicionFisica;
    }

    public void setCondicionFisica(String condicionFisica) {
        this.condicionFisica = condicionFisica;
    }

    public String getPerteneceA() {
        return perteneceA;
    }

    public void setPerteneceA(String perteneceA) {
        this.perteneceA = perteneceA;
    }

    public LibrosCatalogo getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(LibrosCatalogo idLibro) {
        this.idLibro = idLibro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEjemplar != null ? idEjemplar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LibrosEjemplares)) {
            return false;
        }
        LibrosEjemplares other = (LibrosEjemplares) object;
        if ((this.idEjemplar == null && other.idEjemplar != null) || (this.idEjemplar != null && !this.idEjemplar.equals(other.idEjemplar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "biblioteca.entity.LibrosEjemplares[ idEjemplar=" + idEjemplar + " ]";
    }

    @XmlTransient
    public Collection<Prestamos> getPrestamosCollection() {
        return prestamosCollection;
    }

    public void setPrestamosCollection(Collection<Prestamos> prestamosCollection) {
        this.prestamosCollection = prestamosCollection;
    }
    
}
