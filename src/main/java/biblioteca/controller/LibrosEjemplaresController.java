
package biblioteca.controller;


import biblioteca.entity.LibrosEjemplares;
import biblioteca.service.ILibrosEjemplaresService;
import biblioteca.service.LibrosEjemplaresServiceImpl;
import java.util.ArrayList;
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
    private LibrosEjemplares LibroEjemUmar;
    private List<LibrosEjemplares> ListaLibrosEjemplaresUmar;
    private LibrosEjemplares LibroEjemUtm;
    private List<LibrosEjemplares> ListaLibrosEjemplaresUtm;

  
    @PostConstruct
    public void init() {
        service = new LibrosEjemplaresServiceImpl();
        LibroEjem = new LibrosEjemplares();
        ListaLibrosEjemplares = service.obtenerRegistros(1);
        ListaLibrosEjemplaresUmar = service.obtenerRegistros(2);
        ListaLibrosEjemplaresUtm = service.obtenerRegistros(3);
        
        System.out.println("ListaLibrosEjemplares"+ListaLibrosEjemplares.size());
        System.out.println("ListaLibrosEjemplares"+ListaLibrosEjemplaresUmar.size());
        System.out.println("ListaLibrosEjemplares"+ListaLibrosEjemplaresUtm.size());


    }
    
   
    public LibrosEjemplares getLibroCatalogo() {
        return LibroEjem;
    }
    public LibrosEjemplares getLibroCatalogoUmar() {
        return LibroEjemUmar;
    }
    public LibrosEjemplares getLibroCatalogoUtm() {
        return LibroEjemUtm;
    }
 
    public List<LibrosEjemplares> getListaRegistros() {
        return ListaLibrosEjemplares;
    }
    public List<LibrosEjemplares> getListaRegistrosUmar() {
        return ListaLibrosEjemplaresUmar;
    }
    public List<LibrosEjemplares> getListaRegistrosUtm() {
        return ListaLibrosEjemplaresUtm;
    }
    
    

            

}
