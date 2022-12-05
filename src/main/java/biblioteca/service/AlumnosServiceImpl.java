/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.service;

import biblioteca.entity.Alumnos;
import biblioteca.model.AlumnosImpl;
import biblioteca.model.IAlumnosModel;
import java.util.List;

/**
 *
 * @author medina Gris
 */
public class AlumnosServiceImpl implements IAlumnosService{

     IAlumnosModel model = new AlumnosImpl();

    @Override
    public List<Alumnos> obtenerRegistros(int id) {
    return model.obtenerRegistros(id);
    }
    
}
