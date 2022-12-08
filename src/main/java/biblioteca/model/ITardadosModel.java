/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package biblioteca.model;

import biblioteca.entity.Tardados;
import java.util.List;

/**
 *
 * @author medina
 */
public interface ITardadosModel {
    
      public List<Tardados> obtenerRegistros(int id);
}
