/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import modelo_catalogo.Proveedor;

/**
 *
 * @author claug
 */
public class VistaProveedor extends JFrame implements InterfaceVista{
    
    private PanelProveedor panelProveedor;
    private BotonesProveedor botones;

    public VistaProveedor() {
        this.init();
    }
    
     public void init(){
        
        this.setSize(500, 200);
        
        BorderLayout dist = new BorderLayout();
        this.setLayout(dist);
        
        this.panelProveedor = new PanelProveedor();
        this.botones = new BotonesProveedor();
        
        this.botones.getGuardar().setActionCommand(GUARDAR_PROVEEDOR);
        this.botones.getCancelar().setActionCommand(CANCELAR_PROVEEDOR);
        
        
        this.add(this.panelProveedor, BorderLayout.CENTER);
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
     public Proveedor getDatos(){
        Proveedor pro = new Proveedor();
        pro.setNombre(this.panelProveedor.getTxtNombre().getText());
        pro.setPago(this.panelProveedor.getTxtPago().getText());
        
        return pro;
    }
}
