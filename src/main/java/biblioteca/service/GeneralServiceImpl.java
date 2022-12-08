/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.service;

import biblioteca.entity.Alumnos;
import biblioteca.entity.Tardados;
import biblioteca.model.AlumnosImpl;
import biblioteca.model.IAlumnosModel;
import biblioteca.model.ITardadosModel;
import biblioteca.model.TardadosImpl;
import java.util.List;

/**
 *
 * @author medina
 */
public class GeneralServiceImpl implements IGeneralService {
    ITardadosModel model = new TardadosImpl();

    @Override
    public List<Tardados> obtenerRegistros(int id) {
    return model.obtenerRegistros(id);
    }
    
}
