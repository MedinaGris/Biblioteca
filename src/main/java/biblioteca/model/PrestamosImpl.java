/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.model;

import biblioteca.entity.Prestamos;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author medina Gris
 */
public class PrestamosImpl implements IPrestamosModel {

    private SessionFactory sfunsis = null;
    private Session session_unsis = null;

    @Override
    public List<Prestamos> obtenerRegistros() {
        List<Prestamos> listaPrestamos = null;
        try {

            Configuration unsisCfg = new Configuration();
            unsisCfg.configure("hibernateumar.cfg.xml");
            sfunsis = unsisCfg.buildSessionFactory();
            session_unsis = sfunsis.openSession();

            listaPrestamos = session_unsis.createCriteria(Prestamos.class).list();

            session_unsis.close();
            sfunsis.close();

        } catch (HibernateException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return listaPrestamos;
    }
}
