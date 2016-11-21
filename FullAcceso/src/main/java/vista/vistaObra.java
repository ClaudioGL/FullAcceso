/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import modelo_catalogo.Obra;
import modelo_catalogo.Proveedor;
import modelo_catalogo.Unidad;

/**
 *
 * @author claug
 */
public class vistaObra extends JFrame implements InterfaceVista{
    
    private PanelObra panelObra;
    private BotonesObra botones;

    public vistaObra() {
        this.init();
    }
    
     public void init(){
        
        this.setSize(500, 200);
        
        BorderLayout dist = new BorderLayout();
        this.setLayout(dist);
        
        this.panelObra = new PanelObra();
        this.botones = new BotonesObra();
        
        this.botones.getGuardar().setActionCommand(GUARDAR_OBRA);
        this.botones.getCancelar().setActionCommand(CANCELAR_OBRA);
        
        
        this.add(this.panelObra, BorderLayout.CENTER);
        this.add(this.botones, BorderLayout.SOUTH);
        
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
        this.botones.getGuardar().addActionListener(controlador);
        this.botones.getCancelar().addActionListener(controlador);
   }
    public Obra getDatos(){
        Obra obra = new Obra();
        obra.setDescripcion(this.panelObra.getTxtDescripcion().getText());
        obra.setTipo((String)this.panelObra.getCombo1().getSelectedItem());
        obra.setPrecioUnitario(Integer.parseInt(this.panelObra.getTxtValor().getText()));
        
        return obra;
    }
    public String getProveedorNombre(){
        String pro = (String)this.panelObra.getCombo2().getSelectedItem();
        return pro;
    }
    public String getUnidadNombre(){
        String uni = (String)this.panelObra.getCombo3().getSelectedItem();
        return uni;
    }
      public void listarComboBox(ArrayList <Proveedor> proveedores, ArrayList <Unidad> unidades){
         for(int i =0;i<proveedores.size();i++){
           this.panelObra.getCombo2().addItem(proveedores.get(i).getNombre());
         }
         for(int j =0;j<proveedores.size();j++){
           this.panelObra.getCombo3().addItem(unidades.get(j).getNombre());
         }
     }
    
}
