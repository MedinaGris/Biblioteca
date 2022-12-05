/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.controller;

import biblioteca.entity.Prestamos;
import biblioteca.service.IPrestamosService;
import biblioteca.service.PrestamosServiceImpl;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author medina Gris
 */
@RequestScoped
@ManagedBean(name = "Prestamos")
public class PrestamosController {
     private IPrestamosService service;
    private Prestamos prestamo;
    private List<Prestamos> ListaPrestamos;
        private Prestamos prestamoUmar;
    private List<Prestamos> ListaPrestamosUmar;
        private Prestamos prestamoUtm;
    private List<Prestamos> ListaPrestamosUtm;

  
    @PostConstruct
    public void init() {
        service = new PrestamosServiceImpl();
        prestamo = new Prestamos();
        ListaPrestamos = service.obtenerRegistros(1);
        prestamoUmar = new Prestamos();
        ListaPrestamosUmar = service.obtenerRegistros(2);
        prestamoUtm = new Prestamos();
        ListaPrestamosUtm = service.obtenerRegistros(3);
    }
    
   
    public Prestamos getLibroCatalogo() {
        return prestamo;
    }
 
    public Prestamos getLibroCatalogoUmar() {
        return prestamoUmar;
    }
 
    public Prestamos getLibroCatalogoUtm() {
        return prestamoUtm;
    }
 
    public List<Prestamos> getListaRegistros() {
        return ListaPrestamos;
    }
    
    public List<Prestamos> getListaRegistrosUmar() {
        return ListaPrestamosUmar;
    }
    
    public List<Prestamos> getListaRegistrosUtm() {
        return ListaPrestamosUtm;
    }

}
