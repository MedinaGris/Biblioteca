
package biblioteca.model;

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
     private SessionFactory sf;
    private Session session;
    @Override
    public List<LibrosCatalogo> obtenerRegistros() {
         List <LibrosCatalogo> listaLibros=null;
       try {
            sf = new Configuration().configure().buildSessionFactory();
            session = sf.openSession();

           listaLibros =session.createCriteria(LibrosCatalogo.class).list();
            
            session.close();
            sf.close();

        } catch (HibernateException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return listaLibros;
    }
    
    
    
    
        public static void main(String[] args) {
        ILibrosCatalogoModel modelo = new LibrosCatalogoImpl();
        
            System.out.println(modelo.obtenerRegistros());
            System.out.println("jjjj");
        
    }
}
