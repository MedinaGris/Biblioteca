/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.model;

import biblioteca.entity.LibrosCatalogo;
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

    private SessionFactory sf;
    private Session session;

    @Override
    public List<LibrosEjemplares> obtenerRegistros() {
        List<LibrosEjemplares> listaEjemplares = null;
        try {
            sf = new Configuration().configure().buildSessionFactory();
            session = sf.openSession();

            listaEjemplares = session.createCriteria(LibrosCatalogo.class).list();

            session.close();
            sf.close();

        } catch (HibernateException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return listaEjemplares;
    }
}
