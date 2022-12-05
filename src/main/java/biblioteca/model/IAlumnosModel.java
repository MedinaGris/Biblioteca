/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package biblioteca.model;

import biblioteca.entity.Alumnos;
import java.util.List;

/**
 *
 * @author medina Gris
 */
public interface IAlumnosModel {
     public List<Alumnos> obtenerRegistros(int id);
}
