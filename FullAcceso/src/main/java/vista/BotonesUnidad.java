/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.BoxLayout;
import static javax.swing.BoxLayout.X_AXIS;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author claug
 */
public class BotonesUnidad extends JPanel {
    private JButton guardar;
    private JButton cancelar;
        
     public BotonesUnidad(){
         
         this.setLayout(new BoxLayout(this, X_AXIS));
    
         this.guardar = new JButton("Guardar");
         this.cancelar = new JButton("Cancelar");
       
         this.add(this.guardar);
         this.add(this.cancelar);
    
     }

    public JButton getGuardar() {
        return guardar;
    }

    public JButton getCancelar() {
        return cancelar;
    }
    
}
