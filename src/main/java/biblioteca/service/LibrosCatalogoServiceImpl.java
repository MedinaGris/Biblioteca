package biblioteca.service;

import biblioteca.entity.LibrosCatalogo;
import biblioteca.model.ILibrosCatalogoModel;
import biblioteca.model.LibrosCatalogoImpl;
import java.util.List;

/**
 *
 * @author medina Gris
 */
public class LibrosCatalogoServiceImpl implements ILibrosCatalogoService {

    ILibrosCatalogoModel model = new LibrosCatalogoImpl();

    @Override
    public List<LibrosCatalogo> obtenerRegistros() {
        System.out.println("Obteniendo registros libro cat");
        return model.obtenerRegistros();
    }

}
