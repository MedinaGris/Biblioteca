/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package biblioteca.service;

import biblioteca.entity.Tardados;
import java.util.List;

/**
 *
 * @author medina
 */
public interface IGeneralService {
        public List<Tardados> obtenerRegistros(int id);

}
