/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author claug
 */
public class BotonesCatalogo extends JPanel implements ActionListener {
    
    private JButton btnObra, btnCategoria;
    private ImageIcon icoObra, icoCategoria;
    
    public BotonesCatalogo(){
        
        //this.setLayout(new FlowLayout());
        GridLayout dist = new GridLayout(2,1);
        this.setLayout(dist);
        
        //this.icoObra = new ImageIcon("E:\\c\\Programas\\iconos/settings.png");
        this.btnObra = new JButton("Nueva Obra");
        //this.btnObra.setIcon(this.icoProducto);
        
        
        this.add(this.btnObra);
       // this.add(this.btnCategoria);
        
    } 

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
