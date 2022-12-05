
package biblioteca.controller;


import biblioteca.entity.LibrosEjemplares;
import biblioteca.service.ILibrosEjemplaresService;
import biblioteca.service.LibrosEjemplaresServiceImpl;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author medina Gris
 */
@RequestScoped
@ManagedBean(name = "LibroEjemplar")
public class LibrosEjemplaresController {
     private ILibrosEjemplaresService service;
    private LibrosEjemplares LibroEjem;
    private List<LibrosEjemplares> ListaLibrosEjemplares;

  
    @PostConstruct
    public void init() {
        service = new LibrosEjemplaresServiceImpl();
        LibroEjem = new LibrosEjemplares();
        ListaLibrosEjemplares = service.obtenerRegistros();
    }
    
   
    public LibrosEjemplares getLibroCatalogo() {
        return LibroEjem;
    }
 
    public List<LibrosEjemplares> getListaRegistros() {
        return ListaLibrosEjemplares;
    }

}
