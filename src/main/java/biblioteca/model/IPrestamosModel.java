/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package biblioteca.model;

import biblioteca.entity.Prestamos;
import java.util.List;

/**
 *
 * @author medina Gris
 */
public interface IPrestamosModel {
    public List<Prestamos> obtenerRegistros(int id);
}
