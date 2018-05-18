package co.com.poli.appinventario2.dao.impl;

import co.com.poli.appinventario2.dao.IProductoDao;
import co.com.poli.appinventario2.datos.ProductoData;
import co.com.poli.appinventario2.model.Producto;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class ProductoDaoImpl implements IProductoDao {

    @Override
    public List<Producto> obtenerProducto() {
        return ProductoData.getListaProductos();
    }

    @Override
    public Producto obtenerProducto(String codigo) {
        Producto producto = null;
        List<Producto> listado = ProductoData.getListaProductos();
        for (Producto prod : listado) {
            if (prod.getCodigo().equals(codigo)) {
                producto = prod;
            }
        }
        return producto;
    }

}
