/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.model;

import biblioteca.entity.Tardados;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author medina
 */
public class TardadosImpl implements ITardadosModel {
     private SessionFactory sf = null;
    private Session session_bd = null;

    @Override
      public List<Tardados> obtenerRegistros(int id){
        List<Tardados> lista = new ArrayList<Tardados>();
                List<Object[]> apoyo = null;

        try {
            Configuration bdCfg = new Configuration();

            switch(id){
                case 1: bdCfg.configure("hibernateunsis.cfg.xml");
                        break;
                case 2: bdCfg.configure("hibernateumar.cfg.xml");
                        break;
                case 3: bdCfg.configure("hibernateutm.cfg.xml");
                        break;
            }
            sf = bdCfg.buildSessionFactory();
            session_bd = sf.openSession();
             String sqlQuery="select pre.id_ejemplar, pertenece_a, fecha_devolucion_asignada,fecha_devolucion_real, fecha_devolucion_real-fecha_devolucion_asignada as diferencia from libros_ejemplares le inner join prestamos pre on le.id_ejemplar=pre.id_ejemplar order by diferencia desc";
             apoyo= session_bd.createNativeQuery(sqlQuery).list();
             Tardados tar=null;

             for (Object[] t:apoyo){
                 tar= new Tardados();
                 tar.setIdEjemplar(t[0].toString());
                 tar.setPertenece_a(t[1].toString());
                 tar.setFechaDevolucionAsignada(t[2].toString());
                 tar.setFechaDevolucionReal(t[3].toString());
                 tar.setDiferencia(Integer.parseInt(t[4].toString()));
             lista.add(tar);
             }
            session_bd.close();
            sf.close();
        } catch (HibernateException e) {
             session_bd.close();
            sf.close();
            System.out.println("Error: " + e.getMessage());
        }
        return lista;
    }
      

}