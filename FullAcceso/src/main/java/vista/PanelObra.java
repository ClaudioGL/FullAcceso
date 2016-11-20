/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
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
        private JComboBox combo1, combo2, combo3;
        private String [] arregloPro;
        private String [] arregloUni;
        private String [] tipo = {"OBRA", "PRODUCTO", "MANO DE OBRA", "OTRO"};
    
     public PanelObra(){
            
            this.setLayout(new BorderLayout());
            panel1 = new JPanel();
            panel2 = new JPanel();
            
            GridLayout distribucion = new GridLayout(2, 2);
            GridLayout dist = new GridLayout(3, 2);
            panel1.setLayout(distribucion);
            panel2.setLayout(dist);
            
             this.lbDescripcion = new JLabel("Descripcion");
            this.lbValor = new JLabel("Valor Producto");
            
            this.txtValor = new JTextField("");
            this.txtDescripcion = new JTextField("");
            
            this.combo1 = new JComboBox(this.tipo);
            this.combo2 = new JComboBox();
            this.combo3 = new JComboBox();
            
            this.panel1.add(this.lbDescripcion);
            this.panel1.add(this.txtDescripcion);
            this.panel1.add(this.lbValor);
            this.panel1.add(this.txtValor);
            
            panel2.add(combo1);
            panel2.add(combo2);
            panel2.add(combo3);
            
            this.add(this.panel1, BorderLayout.CENTER);
            this.add(this.panel2, BorderLayout.SOUTH);
        }
//     public void listarComboBox(ArrayList <Proveedor> proveedores, ArrayList <Unidad> unidades){
//         for(int i =0;i<proveedores.size();i++){
//           combo2.addItem(proveedores.get(i).getNombre());
//         }
//         for(int j =0;j<proveedores.size();j++){
//           combo3.addItem(unidades.get(j).getNombre());
//         }
//     }

    public JTextField getTxtDescripcion() {
        return txtDescripcion;
    }

    public JTextField getTxtValor() {
        return txtValor;
    }

    public JComboBox getCombo1() {
        return combo1;
    }

    public JComboBox getCombo2() {
        return combo2;
    }

    public JComboBox getCombo3() {
        return combo3;
    }
    

  
     
    
     
}
