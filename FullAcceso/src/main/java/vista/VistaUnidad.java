/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import modelo_catalogo.Unidad;

/**
 *
 * @author claug
 */
public class VistaUnidad extends JFrame implements InterfaceVista{
    
    private PanelUnidad panelUnidad;
    private BotonesUnidad botones;

    public VistaUnidad() {
        this.init();
    }
    
     public void init(){
        
        this.setSize(500, 200);
        
        BorderLayout dist = new BorderLayout();
        this.setLayout(dist);
        
        this.panelUnidad = new PanelUnidad();
        this.botones = new BotonesUnidad();
        
        this.botones.getGuardar().setActionCommand(GUARDAR_UNIDAD);
        this.botones.getCancelar().setActionCommand(CANCELAR_UNIDAD);
        
        
        this.add(this.panelUnidad, BorderLayout.CENTER);
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
      public Unidad getDatos(){
        Unidad uni = new Unidad();
        uni.setNombre(this.panelUnidad.getTxtNombre().getText());
       
        return uni;
    }
    
}
