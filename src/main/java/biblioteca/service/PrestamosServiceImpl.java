/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.service;

import biblioteca.entity.Prestamos;
import biblioteca.model.IPrestamosModel;
import biblioteca.model.PrestamosImpl;
import java.util.List;

/**
 *
 * @author medina Gris
 */
public class PrestamosServiceImpl implements IPrestamosService{
IPrestamosModel model= new PrestamosImpl();
    @Override
    public List<Prestamos> obtenerRegistros(int id) {
        System.out.println("Obteniendo registros libro prestamos");
        return model.obtenerRegistros(id);
    }
}
