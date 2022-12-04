/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author medina Gris
 */
@Entity
@Table(name = "libros_catalogo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LibrosCatalogo.findAll", query = "SELECT l FROM LibrosCatalogo l"),
    @NamedQuery(name = "LibrosCatalogo.findByIdLibro", query = "SELECT l FROM LibrosCatalogo l WHERE l.idLibro = :idLibro"),
    @NamedQuery(name = "LibrosCatalogo.findByTitulo", query = "SELECT l FROM LibrosCatalogo l WHERE l.titulo = :titulo"),
    @NamedQuery(name = "LibrosCatalogo.findByAutor", query = "SELECT l FROM LibrosCatalogo l WHERE l.autor = :autor")})
public class LibrosCatalogo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_libro")
    private Integer idLibro;
    @Size(max = 70)
    @Column(name = "titulo")
    private String titulo;
    @Size(max = 50)
    @Column(name = "autor")
    private String autor;

    public LibrosCatalogo() {
    }

    public LibrosCatalogo(Integer idLibro) {
        this.idLibro = idLibro;
    }

    public Integer getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(Integer idLibro) {
        this.idLibro = idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLibro != null ? idLibro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LibrosCatalogo)) {
            return false;
        }
        LibrosCatalogo other = (LibrosCatalogo) object;
        if ((this.idLibro == null && other.idLibro != null) || (this.idLibro != null && !this.idLibro.equals(other.idLibro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "biblioteca.entity.LibrosCatalogo[ idLibro=" + idLibro + " ]";
    }
    
}
