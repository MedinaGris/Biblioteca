package biblioteca.model;

import biblioteca.entity.Alumnos;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author medina Gris
 */
public class AlumnosImpl implements IAlumnosModel {

    private SessionFactory sfunsis = null;
    private Session session_unsis = null;

    @Override
    public List<Alumnos> obtenerRegistros() {
        List<Alumnos> listaAlumnos = null;
        try {

            Configuration unsisCfg = new Configuration();
            unsisCfg.configure("\\src\\main\\resources\\hibernate_umar.cfg.xml");
            sfunsis = unsisCfg.buildSessionFactory();
            session_unsis = sfunsis.openSession();

            listaAlumnos = session_unsis.createCriteria(Alumnos.class).list();

            session_unsis.close();
            sfunsis.close();

        } catch (HibernateException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return listaAlumnos;
    }

}
