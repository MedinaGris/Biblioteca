/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.controller;

/**
 *
 * @author Logan
 */
import biblioteca.entity.Alumnos;
import biblioteca.service.AlumnosServiceImpl;
import biblioteca.service.IAlumnosService;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@RequestScoped
@ManagedBean(name = "General")
public class GeneralController {
    private IAlumnosService service;
    private Alumnos AlumnoUnsis;
    private List<Alumnos> ListaAlumnosUnsis;
    private Alumnos AlumnoUmar;
    private List<Alumnos> ListaAlumnosUmar;
    private Alumnos AlumnoUtm;
    private List<Alumnos> ListaAlumnosUtm;

  
    @PostConstruct
    public void init() {
        service = new AlumnosServiceImpl();
        AlumnoUnsis = new Alumnos();
        ListaAlumnosUnsis = service.obtenerRegistros(1);
    }
    
   
    public Alumnos getAlumno() {
        return AlumnoUnsis;
    }
    
    public Alumnos getAlumnoUmar() {
        return AlumnoUmar;
    }
        
    public Alumnos getAlumnoUtm() {
        return AlumnoUtm;
    }
 
    public List<Alumnos> getListaRegistros() {
        return ListaAlumnosUnsis;
    }

    public List<Alumnos> getListaRegistrosUmar() {
        return ListaAlumnosUmar;
    }
    
    public List<Alumnos> getListaRegistrosUtm() {
        return ListaAlumnosUtm;
    }

    
}


   
    