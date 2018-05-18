package co.com.poli.appinventario2.business;

import co.com.poli.appinventario2.model.Producto;
import java.util.List;

public interface IProductoBusiness {

    List<Producto> obtenerProducto();

    Producto obtenerProducto(String codigo);
}
