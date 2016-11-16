/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo_catalogo.Item;
import modelo_catalogo.Obra;

/**
 *
 * @author claug
 */
public class VistaSeleccion extends JFrame implements InterfaceVista{
    
    private JPanel panel1, panel2, panel3;
    private JButton btnSeleccionar;
    private JLabel lbCantidad;
    private JTextField txtcantidad;
    private JTable tabla;
    private DefaultTableModel modelo;
    private String Columnas [] = {"id_obra", "descripcion", "unidad", "precio unitario"};
    
    public VistaSeleccion(){
        this.init();
    }
    private void init(){
        
       this.setSize(500, 600);
       this.setLocation(600, WIDTH);
       BorderLayout dist = new BorderLayout();
       this.setLayout(dist);
       
       this.panel1 = new JPanel();
       this.panel2 = new JPanel();
       this.panel3 = new JPanel(new GridLayout(1, 2));
       
       this.lbCantidad = new JLabel("Cantidad");
       this.txtcantidad = new JTextField("");
       this.btnSeleccionar = new JButton("Seleccionar");
      
       this.btnSeleccionar.setActionCommand(SELECCIONAR);
       
       Object [][] datos = {};   
       this.modelo = new DefaultTableModel(datos, Columnas);
       this.tabla = new JTable(modelo);
       JScrollPane js = new JScrollPane(this.tabla);
        
       this.panel1.add(this.btnSeleccionar);
       this.panel2.add(js);
       this.panel3.add(this.lbCantidad);
       this.panel3.add(this.txtcantidad);
        
       this.add(this.panel1, BorderLayout.NORTH);
       this.add(this.panel2, BorderLayout.CENTER);
       this.add(this.panel3, BorderLayout.SOUTH);
    }
    
        public void setInformacion (ArrayList<Obra> obras){
        Iterator<Obra> iteraObra = obras.iterator();
        while(iteraObra.hasNext()){ 

                    Obra obra = iteraObra.next();
                    Object [] data = new Object[5];
                    data[0] = obra.getId();
                    data[1] = obra.getDescripcion();
                    data[2] = obra.getUnidad();
                    data[3] = obra.getPrecioUnitario();
                   
                    this.modelo.addRow(data);
                    
                }
        this.tabla.setModel(this.modelo);
       
    }
         public void limpiaTabla(){
          int filas=tabla.getRowCount();
        for(int i = 0;i<filas; i++) {
            this.modelo.removeRow(0);
        }
    }
        public int getIdSelected(){
           
          int col = this.tabla.getSelectedColumn();
          int row = this.tabla.getSelectedRow();
          
          Point p = new Point(row,col);
          String contenidoCelda = tabla.getModel().getValueAt(row,col).toString(); 
          System.out.println(contenidoCelda);
          System.out.println(row + "," + col);
          
          int id = Integer.parseInt(this.tabla.getModel().getValueAt(row, 0).toString());
          System.out.println("id" + id);
          
          return id;
        }
        public int getDatos(){
            int cant = Integer.parseInt(this.txtcantidad.getText());
            return cant;
        }

    @Override
    public void iniciar() {
        this.setVisible(true);
     }

    @Override
    public void detener() {
        this.setVisible(false);
     }

    @Override
    public void setControlador(Controlador controlador) {
        
        this.btnSeleccionar.addActionListener(controlador);
    }
    
}
