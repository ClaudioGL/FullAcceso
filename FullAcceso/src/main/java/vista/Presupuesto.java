/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.BoxLayout;
import static javax.swing.BoxLayout.X_AXIS;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import modelo_catalogo.Item;
import modelo_catalogo.Obra;

/**
 *
 * @author claug
 */
public class Presupuesto extends JFrame implements InterfaceVista {
    
    private BotonesPresupuesto botones;
    private TablaPresupuesto tabla;
    private JLabel lbTotal;
    private JTextField txtTotal;
    private JPanel panel;
    private ArrayList<Item> itemizado = new ArrayList<Item>();
    
      public Presupuesto(){
        this.init();
    }
    public void init(){
        this.setSize(600, 600);
       BorderLayout dist = new BorderLayout();
       this.setLayout(dist);
       
       this.botones = new BotonesPresupuesto();
       this.tabla = new TablaPresupuesto();
       
       this.lbTotal = new JLabel("Total");
       this.txtTotal = new JTextField("");
       this.panel = new JPanel();
       
       
       this.botones.getBtnAgregar().setActionCommand(AGREGAR_SELECCION);
       this.botones.getBtnEliminar().setActionCommand(ELIMINAR_SELECCION);
               
       this.panel.add(this.lbTotal);
       this.panel.add(this.txtTotal);
       
       this.add(this.botones, BorderLayout.NORTH);
       this.add(this.tabla, BorderLayout.CENTER);
       this.add(this.panel, BorderLayout.SOUTH);
    }
    
     public void setInformacion (){
        Iterator<Item> iteraItem = this.itemizado.iterator();
        while(iteraItem.hasNext()){ 

                    Item item = iteraItem.next();
                    Object [] data = new Object[5];
                    data[0] = item.getObra().getDescripcion();
                    data[1] = item.getObra().getUnidad().getNombre();
                    data[2] = item.getObra().getPrecioUnitario();
                    data[3] = item.getCantidad();
                    data[4] = "$ " + item.getTotal();
                   
                    this.tabla.getModelo().addRow(data);
                    
                }
        this.tabla.getTabla().setModel(this.tabla.getModelo());
       
    }
    public void limpiaTabla(){
          int filas=tabla.getTabla().getRowCount();
        for(int i = 0;i<filas; i++) {
            this.tabla.getModelo().removeRow(0);
        }
    }
    public void agregarObra(Obra obra, int cantidad){
       Item it= new Item();
       
       it.setCantidad(cantidad);
       it.setObra(obra);
       this.itemizado.add(it);
       
       this.txtTotal.setText(String.valueOf(this.total()));
    }
    public int total(){
        int total = 0;
        for(int i=0; i<itemizado.size();i++){
           total += this.itemizado.get(i).getTotal();
        }
        return total;
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
        
        this.botones.getBtnAgregar().addActionListener(controlador);
        this.botones.getBtnEliminar().addActionListener(controlador);
    }
    
}
