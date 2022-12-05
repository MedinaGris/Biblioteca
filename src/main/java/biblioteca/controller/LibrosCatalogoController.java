package biblioteca.controller;

import biblioteca.entity.LibrosCatalogo;
import biblioteca.service.ILibrosCatalogoService;
import biblioteca.service.LibrosCatalogoServiceImpl;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


/**
 *
 * @author medina Gris
 */
@RequestScoped
@ManagedBean(name = "LibroCatalogo")
public class LibrosCatalogoController {
    
    private ILibrosCatalogoService service;
    private LibrosCatalogo LibroCat;
    private List<LibrosCatalogo> ListaLibrosCatalogo;
    private LibrosCatalogo LibroCatUmar;
    private List<LibrosCatalogo> ListaLibrosCatalogoUmar;
    private LibrosCatalogo LibroCatUtm;
    private List<LibrosCatalogo> ListaLibrosCatalogoUtm;

  
    @PostConstruct
    public void init() {
        service = new LibrosCatalogoServiceImpl();
        LibroCat = new LibrosCatalogo();
        ListaLibrosCatalogo = service.obtenerRegistros(1);
        LibroCatUmar = new LibrosCatalogo();
        ListaLibrosCatalogoUmar = service.obtenerRegistros(2);
        LibroCatUtm = new LibrosCatalogo();
        ListaLibrosCatalogoUtm = service.obtenerRegistros(3);
        
    }
    
   
    public LibrosCatalogo getLibroCatalogo() {
        return LibroCat;
    }
    
    public LibrosCatalogo getLibroCatalogoUmar() {
        return LibroCat;
    }
        
    public LibrosCatalogo getLibroCatalogoUtm() {
        return LibroCat;
    }
 
    public List<LibrosCatalogo> getListaRegistros() {
        return ListaLibrosCatalogo;
    }
    
    public List<LibrosCatalogo> getListaRegistrosUmar() {
        return ListaLibrosCatalogoUmar;
    }
    public List<LibrosCatalogo> getListaRegistrosUtm() {
        return ListaLibrosCatalogoUtm;
    }

    
    public static void main(String[] args) {
        LibrosCatalogoController c= new LibrosCatalogoController();
        c.init();
        System.out.println(c.getListaRegistros());
    }
}
