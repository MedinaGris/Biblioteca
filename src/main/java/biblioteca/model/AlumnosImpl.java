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

    private SessionFactory sf = null;
    private Session session_bd = null;

    @Override
    public List<Alumnos> obtenerRegistros(int id) {
        List<Alumnos> listaAlumnos = null;
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
            listaAlumnos = session_bd.createCriteria(Alumnos.class).list();
            session_bd.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return listaAlumnos;
    }

}
