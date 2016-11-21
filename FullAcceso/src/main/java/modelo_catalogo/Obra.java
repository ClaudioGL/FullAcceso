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
    private String tipo;
    private Proveedor proveedor;
    private Unidad unidad;
    private int precioUnitario;

    public Obra() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Unidad getUnidad() {
        return unidad;
    }

    public void setUnidad(Unidad unidad) {
        this.unidad = unidad;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    

    
    
    @Override
    public String toString() {
        return "Obra{" + "id=" + id + ", descripcion=" + descripcion + ", unidad=" + unidad + ", precioUnitario=" + precioUnitario + '}';
    }
    
    
    
}
