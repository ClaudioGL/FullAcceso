/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author claug
 */
class PanelObra extends JPanel{
    
    private JLabel lbDescripcion, lbValor;
	private JTextField txtDescripcion, txtValor;
        //private JTextArea txtDescripcion;
	 private JPanel panel1, panel2;
        private JComboBox combo;
        private String [] unidades = {"GL", "ML", "M2", "M3"," UN", "OTRO"};
    
     public PanelObra(){
            
            this.setLayout(new BorderLayout());
            panel1 = new JPanel();
            panel2 = new JPanel();
            
            GridLayout distribucion = new GridLayout(2, 2);
            panel1.setLayout(distribucion);
            panel2.setLayout( new FlowLayout());
            
             this.lbDescripcion = new JLabel("Descripcion");
            this.lbValor = new JLabel("Valor Producto");
            
            this.txtValor = new JTextField("");
            this.txtDescripcion = new JTextField("");
            
            this.combo = new JComboBox(this.unidades);
            
            this.panel1.add(this.lbDescripcion);
            this.panel1.add(this.txtDescripcion);
            this.panel1.add(this.lbValor);
            this.panel1.add(this.txtValor);
            
            panel2.add(combo);
            
            this.add(this.panel1, BorderLayout.CENTER);
            this.add(this.panel2, BorderLayout.SOUTH);
        }

    public JTextField getTxtDescripcion() {
        return txtDescripcion;
    }

    public JTextField getTxtValor() {
        return txtValor;
    }

    public JComboBox getCombo() {
        return combo;
    }
     
    
     
}
