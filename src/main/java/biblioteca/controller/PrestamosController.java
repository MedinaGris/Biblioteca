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

  
    @PostConstruct
    public void init() {
        service = new PrestamosServiceImpl();
        prestamo = new Prestamos();
        ListaPrestamos = service.obtenerRegistros();
    }
    
   
    public Prestamos getLibroCatalogo() {
        return prestamo;
    }
 
    public List<Prestamos> getListaRegistros() {
        return ListaPrestamos;
    }

}
