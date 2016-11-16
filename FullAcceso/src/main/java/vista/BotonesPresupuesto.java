/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import static javax.swing.BoxLayout.X_AXIS;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author claug
 */
public class BotonesPresupuesto extends JPanel {
    
    private JButton btnAgregar, btnEliminar, aceptar;
    
    public BotonesPresupuesto(){
        
//        this.setLayout(new BoxLayout(this, X_AXIS));
         this.setLayout(new FlowLayout());
    
         this.btnAgregar = new JButton("Agregar");
         this.btnEliminar = new JButton("Eliminar");
       
         this.add(this.btnAgregar);
         this.add(this.btnEliminar);
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public JButton getAceptar() {
        return aceptar;
    }
    
}
