/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author claug
 */
public class PanelProveedor extends JPanel{
    
        private JLabel lbNombre, lbPago;
	private JTextField txtNombre, txtPago;
       
    
     public PanelProveedor(){
            
           GridLayout distribucion = new GridLayout(2, 2);
           this.setLayout(distribucion);
            
            this.lbNombre = new JLabel("nombre");
            this.lbPago= new JLabel("Pago");
            
            this.txtNombre = new JTextField("");
            this.txtPago = new JTextField("");
            
            
            this.add(this.lbNombre);
            this.add(this.txtNombre);
            this.add(this.lbPago);
            this.add(this.txtPago);
        }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtPago() {
        return txtPago;
    }

    public void setTxtPago(JTextField txtPago) {
        this.txtPago = txtPago;
    }
    
}
