/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.controller;

import biblioteca.entity.Alumnos;
import biblioteca.service.AlumnosServiceImpl;
import biblioteca.service.IAlumnosService;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author medina Gris
 */
@RequestScoped
@ManagedBean(name = "Alumnos")
public class AlumnosController {
    private IAlumnosService service;
    private Alumnos Alumno;
    private List<Alumnos> ListaAlumnos;

  
    @PostConstruct
    public void init() {
        service = new AlumnosServiceImpl();
        Alumno = new Alumnos();
        ListaAlumnos = service.obtenerRegistros();
    }
    
   
    public Alumnos getAlumno() {
        return Alumno;
    }
 
    public List<Alumnos> getListaRegistros() {
        return ListaAlumnos;
    }
    
    
}
