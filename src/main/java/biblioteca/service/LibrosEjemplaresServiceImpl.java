/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.service;


import biblioteca.entity.LibrosEjemplares;
import biblioteca.model.ILibrosEjemplaresModel;
import biblioteca.model.LibrosEjemplaresImpl;

import java.util.List;

/**
 *
 * @author medina Gris
 */
public class LibrosEjemplaresServiceImpl implements ILibrosEjemplaresService {

    ILibrosEjemplaresModel model = new LibrosEjemplaresImpl();

    @Override
    public List<LibrosEjemplares> obtenerRegistros() {
        return model.obtenerRegistros();
    }

}
