package co.com.poli.appinventario2.dao;

import co.com.poli.appinventario2.model.Producto;
import java.util.List;

public interface IProductoDao {

    List<Producto> obtenerProducto();

    Producto obtenerProducto(String codigo);

}
