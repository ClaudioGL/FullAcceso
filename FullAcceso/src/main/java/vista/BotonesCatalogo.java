/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author claug
 */
public class BotonesCatalogo extends JPanel {
    
    private JButton btnObra, btnPresupuesto, btnProveedor, btnUnidad;
    private ImageIcon icoObra, icoCategoria;
    
    public BotonesCatalogo(){
        
        this.setLayout(new FlowLayout());
//        GridLayout dist = new GridLayout(2,1);
//        this.setLayout(dist);
        
        //this.icoObra = new ImageIcon("E:\\c\\Programas\\iconos/settings.png");
        this.btnObra = new JButton("Nueva Obra");
        this.btnPresupuesto = new JButton("Presupuesto");
        this.btnProveedor = new JButton("Nuevo Proveedor");
        this.btnUnidad = new JButton("Nueva Unidad");
       
        
        //this.btnObra.setIcon(this.icoProducto);
        
        
        this.add(this.btnObra);
        this.add(this.btnPresupuesto);
        this.add(this.btnProveedor);
        this.add(this.btnUnidad);
       // this.add(this.btnCategoria);
        
    } 

    public JButton getBtnObra() {
        return btnObra;
    }

    public void setBtnObra(JButton btnObra) {
        this.btnObra = btnObra;
    }

    public JButton getBtnPresupuesto() {
        return btnPresupuesto;
    }

    public JButton getBtnProveedor() {
        return btnProveedor;
    }

    public void setBtnProveedor(JButton btnProveedor) {
        this.btnProveedor = btnProveedor;
    }

    public JButton getBtnUnidad() {
        return btnUnidad;
    }

    public void setBtnUnidad(JButton btnUnidad) {
        this.btnUnidad = btnUnidad;
    }
  

    
}
