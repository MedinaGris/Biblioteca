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

  
    @PostConstruct
    public void init() {
        service = new LibrosCatalogoServiceImpl();
        LibroCat = new LibrosCatalogo();
        ListaLibrosCatalogo = service.obtenerRegistros();
    }
    
   
    public LibrosCatalogo getLibroCatalogo() {
        return LibroCat;
    }
 
    public List<LibrosCatalogo> getListaRegistros() {
        return ListaLibrosCatalogo;
    }

    
    public static void main(String[] args) {
        LibrosCatalogoController c= new LibrosCatalogoController();
        c.init();
        System.out.println(c.getListaRegistros());
    }
}
