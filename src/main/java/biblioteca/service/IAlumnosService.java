/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package biblioteca.service;


import biblioteca.entity.Alumnos;
import java.util.List;

/**
 *
 * @author medina Gris
 */
public interface IAlumnosService {
    public List<Alumnos> obtenerRegistros(int id);
}
