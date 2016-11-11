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
public class Catalogo extends JFrame{
    private TablaCatalogo tabla;
    private BotonesCatalogo botones;
    
    public Catalogo(){
        this.init();
    }
    private void init(){
        this.setSize(300, 400);
       BorderLayout dist = new BorderLayout();
       this.setLayout(dist);
       
       this.botones = new BotonesCatalogo();
       this.tabla = new TablaCatalogo();
       
       this.add(this.botones, BorderLayout.NORTH);
       this.add(this.tabla, BorderLayout.CENTER);
    }
    
    
}
