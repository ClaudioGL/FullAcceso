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
    
    private JLabel lbNombre, lbDescripcion, lbValor;
	private JTextField txtNombre, txtValor;
        private JTextArea txtDescripcion;
	 private JPanel panel1, panel2;
        private JComboBox combo;
        private String [] categorias = {"maderas", "pinturas", "tabiqueria"};
    
     public PanelObra(){
            
            this.setLayout(new BorderLayout());
            panel1 = new JPanel();
            panel2 = new JPanel();
            
            GridLayout distribucion = new GridLayout(3, 2);
            panel1.setLayout(distribucion);
            panel2.setLayout( new FlowLayout());
            
            this.lbNombre = new JLabel("Nombre");
            this.lbDescripcion = new JLabel("Descripcion");
            this.lbValor = new JLabel("Valor Producto");
            
            this.txtNombre = new JTextField("");
            this.txtValor = new JTextField("");
            this.txtDescripcion = new JTextArea(5, 20);
            
            this.combo = new JComboBox(this.categorias);
            
            this.panel1.add(this.lbNombre);
            this.panel1.add(this.txtNombre);
            this.panel1.add(this.lbDescripcion);
            this.panel1.add(this.txtDescripcion);
            this.panel1.add(this.lbValor);
            this.panel1.add(this.txtValor);
            
            panel2.add(combo);
            
            this.add(this.panel1, BorderLayout.CENTER);
            this.add(this.panel2, BorderLayout.SOUTH);
        }
    
}
