/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo_catalogo.Obra;
import vista.Catalogo;
import vista.vistaObra;

/**
 *
 * @author claug
 */
public class Launcher {
    
   public static void main(String [] args){
       
       Catalogo catalogo = new Catalogo();
       vistaObra obra = new vistaObra();
       
       catalogo.setVisible(true);
       obra.setVisible(true);
       
   } 
    
}
