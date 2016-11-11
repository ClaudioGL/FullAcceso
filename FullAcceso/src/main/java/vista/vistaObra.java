/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author claug
 */
public class vistaObra extends JFrame {
    
    private PanelObra panelObra;
    private BotonesObra botones;

    public vistaObra() {
        this.init();
    }
    
     public void init(){
        
        this.setSize(500, 500);
        
        BorderLayout dist = new BorderLayout();
        this.setLayout(dist);
        
        this.panelObra = new PanelObra();
        this.botones = new BotonesObra();
        
        this.add(this.panelObra, BorderLayout.CENTER);
        this.add(this.botones, BorderLayout.SOUTH);
        
    }
    
}
