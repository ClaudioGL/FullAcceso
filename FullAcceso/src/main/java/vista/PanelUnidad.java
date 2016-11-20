/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author claug
 */
public class PanelUnidad extends JPanel {
    
        private JLabel lbNombre;
	private JTextField txtNombre;
       
    
     public PanelUnidad(){
            
           GridLayout distribucion = new GridLayout(1, 2);
           this.setLayout(distribucion);
            
            this.lbNombre = new JLabel("Nombre");
            
            this.txtNombre = new JTextField("");
            
            
            this.add(this.lbNombre);
            this.add(this.txtNombre);
        }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }
     
    
}
