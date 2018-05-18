package co.com.poli.appinventario2.business.impl;

import co.com.poli.appinventario2.business.IProductoBusiness;
import co.com.poli.appinventario2.dao.IProductoDao;
import co.com.poli.appinventario2.model.Producto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoBusinessImpl implements IProductoBusiness{

    @Autowired
    private IProductoDao productoDao;

    @Override
    public List<Producto> obtenerProducto() {
        return productoDao.obtenerProducto();
    }

    @Override
    public Producto obtenerProducto(String codigo) {
        return productoDao.obtenerProducto(codigo);
    }
}
