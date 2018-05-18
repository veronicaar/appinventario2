package co.com.poli.appinventario2.controller;

import co.com.poli.appinventario2.business.IProductoBusiness;
import co.com.poli.appinventario2.model.Producto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/")
public class ProductoController {

    @Autowired
    private IProductoBusiness productoBusiness;

    @GetMapping("/productos")
    public List<Producto> obtenerProductos() {
        return productoBusiness.obtenerProducto();
    }



}
