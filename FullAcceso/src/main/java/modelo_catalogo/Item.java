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
public class Item {
    
    private int cantidad, total;
    private Obra obra;

    public Item() {
    }

    public int getCantidad() {
        return cantidad;
    }

    public Obra getObra() {
        return obra;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    public int getTotal() {
        this.total = this.cantidad * (this.obra.getPrecioUnitario());
        return total;
    }
   
}
