/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.model;

import biblioteca.entity.LibrosEjemplares;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author medina Gris
 */
public class LibrosEjemplaresImpl implements ILibrosEjemplaresModel {

    private SessionFactory sf = null;
    private Session session_bd = null;


    @Override
    public List<LibrosEjemplares> obtenerRegistros(int id) {
        List<LibrosEjemplares> listaEjemplares = null;
        try {
     Configuration bdCfg = new Configuration();

            switch(id){
                case 1: bdCfg.configure("hibernate.cfg.xml");
                        break;
                case 2: bdCfg.configure("hibernateumar.cfg.xml");
                        break;
                case 3: bdCfg.configure("hibernateutm.cfg.xml");

            }
            sf = bdCfg.buildSessionFactory();
            session_bd = sf.openSession();
            listaEjemplares = session_bd.createCriteria(LibrosEjemplares.class).list();

         
            session_bd.close();
            sf.close();

        } catch (HibernateException e) {
            System.out.println("Error: " + e.getMessage());
            session_bd.close();
            sf.close();
        }
        return listaEjemplares;
    }

}
