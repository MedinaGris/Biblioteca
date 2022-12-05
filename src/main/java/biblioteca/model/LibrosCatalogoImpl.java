
package biblioteca.model;

import biblioteca.entity.Alumnos;
import biblioteca.entity.LibrosCatalogo;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author medina Gris
 */
public class LibrosCatalogoImpl implements ILibrosCatalogoModel{
      private SessionFactory sfunsis = null;
    private Session session_unsis = null;

    @Override
    public List<LibrosCatalogo> obtenerRegistros() {
        List<LibrosCatalogo> listaLibrosCatalogo = null;
        try {

            Configuration unsisCfg = new Configuration();
            unsisCfg.configure("hibernateumar.cfg.xml");
            sfunsis = unsisCfg.buildSessionFactory();
            session_unsis = sfunsis.openSession();

            listaLibrosCatalogo = session_unsis.createCriteria(LibrosCatalogo.class).list();

            session_unsis.close();
            sfunsis.close();

        } catch (HibernateException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return listaLibrosCatalogo;
    }
    

}
