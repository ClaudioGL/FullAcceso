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
import javax.swing.JFrame;
import modelo_catalogo.Obra;

/**
 *
 * @author claug
 */
public class Catalogo extends JFrame implements InterfaceVista{
    private TablaCatalogo tabla;
    private BotonesCatalogo botones;
    
    public Catalogo(){
        this.init();
    }
    private void init(){
        
       this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
       BorderLayout dist = new BorderLayout();
       this.setLayout(dist);
       
       this.botones = new BotonesCatalogo();
       this.tabla = new TablaCatalogo();
       
       this.botones.getBtnObra().setActionCommand(OBRA_AGREGAR);
       this.botones.getBtnPresupuesto().setActionCommand(PRESUPUESTO_AGREGAR);
       this.botones.getBtnProveedor().setActionCommand(PROVEEDOR_AGREGAR);
       this.botones.getBtnUnidad().setActionCommand(UNIDAD_AGREGAR);
               
       
       this.add(this.botones, BorderLayout.NORTH);
       this.add(this.tabla, BorderLayout.CENTER);
    }
       
    public void setInformacion (ArrayList<Obra> obras){
        Iterator<Obra> iteraObra = obras.iterator();
        while(iteraObra.hasNext()){ 

                    Obra obra = iteraObra.next();
                    Object [] data = new Object[5];
                    data[0] = obra.getDescripcion();
                    data[1] = obra.getUnidad();
                    data[2] = obra.getPrecioUnitario();
                   
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

    @Override
    public void iniciar() {
        this.setVisible(true);
    }

    @Override
    public void detener() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setControlador(Controlador controlador) {
       this.botones.getBtnObra().addActionListener(controlador);
       this.botones.getBtnPresupuesto().addActionListener(controlador);
       this.botones.getBtnProveedor().addActionListener(controlador);
       this.botones.getBtnUnidad().addActionListener(controlador);
    }
    
    
}
