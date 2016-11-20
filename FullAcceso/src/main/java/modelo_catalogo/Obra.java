/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo_catalogo;

/**
 *
 * @author claug
 */
public class Obra {
    
    private int id;
    private String descripcion;
    private String unidad, proveedor, tipo;
    private int precioUnitario;

    public Obra() {
    }

 
    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getUnidad() {
        return unidad;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String toString() {
        return "Obra{" + "id=" + id + ", descripcion=" + descripcion + ", unidad=" + unidad + ", precioUnitario=" + precioUnitario + '}';
    }
    
    
    
}
