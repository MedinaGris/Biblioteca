/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.controller;

/**
 *
 * @author medina
 */
import biblioteca.entity.Tardados;
import biblioteca.service.GeneralServiceImpl;
import biblioteca.service.IGeneralService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@RequestScoped
@ManagedBean(name = "General")
public class GeneralController {
    private IGeneralService service;
    private List<Tardados>listaMasTardados = new ArrayList();
    private List<Tardados>listaMasTardadosUnsis;
    private List<Tardados>listaMasTardadosUmar;
    private List<Tardados>listaMasTardadosUtm;

        
    Tardados tardados;

  
    @PostConstruct
    public void init() {
        service = new GeneralServiceImpl();
        tardados = new Tardados();
        listaMasTardadosUnsis = service.obtenerRegistros(1);
        listaMasTardadosUmar = service.obtenerRegistros(2);
        listaMasTardadosUtm = service.obtenerRegistros(3);
        listaMasTardados.addAll(listaMasTardadosUnsis);
        listaMasTardados.addAll(listaMasTardadosUmar);
        listaMasTardados.addAll(listaMasTardadosUtm);
        
    }
    
   
    public Tardados getAlumno() {
        return tardados;
    }


 
    public List<Tardados> getListaRegistros() {
        Collections.sort(listaMasTardados);
        List<Tardados> response =new ArrayList<Tardados>();
        for(int i=0;i<5;i++){
            response.add(listaMasTardados.get(i));
        }
        return response;
    }

    public static void main(String[] args) {
        GeneralController g = new GeneralController();
        System.out.println("iniciando----");
        g.init();
        for(Tardados t:g.getListaRegistros()){
            System.out.println("datos"+t.getIdEjemplar()+" "+t.getDiferencia()+" "+t.getPertenece());
        }
        
    }
    
}


   
    