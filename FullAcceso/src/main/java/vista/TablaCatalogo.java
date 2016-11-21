/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author claug
 */
public class TablaCatalogo extends JPanel {
    private JTable tabla;
    private DefaultTableModel modelo;
    private String Columnas [] = {"descripcion", "unidad", "proveedor", "precio unitario"};
    
    
    public TablaCatalogo(){
        Object [][] datos = {};   
        this.modelo = new DefaultTableModel(datos, Columnas);
        this.tabla = new JTable(modelo);
        JScrollPane js = new JScrollPane(this.tabla);
        
        this.add(js);
    }

    public JTable getTabla() {
        return tabla;
    }

    public DefaultTableModel getModelo() {
        return modelo;
    }

    public String[] getColumnas() {
        return Columnas;
    }
    
}
