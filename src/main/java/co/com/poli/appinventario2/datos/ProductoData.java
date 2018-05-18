package co.com.poli.appinventario2.datos;

import co.com.poli.appinventario2.model.Producto;
import java.util.ArrayList;
import java.util.List;

public class ProductoData {

    private static List<Producto> listaProductos;

    static {
        listaProductos = new ArrayList<Producto>() {

            {
                add(new Producto("100", "Mantequilla", 80D));
                add(new Producto("200", "Leche", 60D));
                add(new Producto("300", "Carne", 30D));
                add(new Producto("400", "Huevos", 250D));
            }

        };
    }

    public static List<Producto> getListaProductos() {
        return listaProductos;
    }

    public static void setListaProductos(List<Producto> aListaProductos) {
        listaProductos = aListaProductos;
    }

}
