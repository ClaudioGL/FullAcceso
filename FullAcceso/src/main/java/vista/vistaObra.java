/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import modelo_catalogo.Obra;

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
        
        this.botones.getGuardar().setActionCommand(GUARDAR);
        this.botones.getCancelar().setActionCommand(CANCELAR);
        
        
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
        obra.setUnidad((String)this.panelObra.getCombo().getSelectedItem());
        obra.setPrecioUnitario(Integer.parseInt(this.panelObra.getTxtValor().getText()));
        
        return obra;
    }
    
}
