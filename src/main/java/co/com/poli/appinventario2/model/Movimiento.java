package co.com.poli.appinventario2.model;

import java.util.Objects;

public class Movimiento {

    private String id_movimiento;
    private Producto producto;
    private Double cantidad;
    private String tipo;
    private Double precio;

    public Movimiento() {

    }

    public Movimiento(String id_movimiento, Producto producto, Double cantidad, String tipo, Double precio) {
        this.id_movimiento = id_movimiento;
        this.producto = producto;
        this.cantidad = cantidad;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getId_movimiento() {
        return id_movimiento;
    }

    public void setId_movimiento(String id_movimiento) {
        this.id_movimiento = id_movimiento;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.id_movimiento);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Movimiento other = (Movimiento) obj;
        if (!Objects.equals(this.id_movimiento, other.id_movimiento)) {
            return false;
        }
        return true;
    }

}
