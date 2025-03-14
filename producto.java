package HDT7;

import java.util.*;

public class producto {

    private String sku;
    private String nombreProducto;
    private String descripcionProducto;
    private Map<String, Integer> talla;

    public producto(String sku, String nombreProducto, String descripcionProducto, Map<String, Integer> tallas) {
        this.sku = sku;
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.talla = new HashMap<>();
    }

    public String getSku() {
        return sku;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public Map<String, Integer> getTalla() {
        return new HashMap<>(talla);
    }

    public void setTallas(Map<String, Integer> talla) {
        this.talla = new HashMap<>(talla);
    }

    public void addTalla(String tallas, int cantidad) {
        talla.put(tallas, cantidad);
    }

    @Override
    public String toString() {
        return "SKU" + sku + ", de Nombre: " + nombreProducto + "con la Descripción: " + descripcionProducto
                + "Con la Talla: " + talla;
    }
}