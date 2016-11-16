/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo_catalogo.GestionObra;
import vista.Catalogo;
import vista.InterfaceVista;
import vista.Presupuesto;
import vista.VistaSeleccion;
import vista.vistaObra;

/**
 *
 * @author claug
 */
public class Controlador implements ActionListener{
    
    private Catalogo catalogo;
    private vistaObra obra;
    private Presupuesto presupuesto;
    private VistaSeleccion vistaSeleccion;
    private GestionObra modelo;

    public Controlador(Catalogo catalogo, vistaObra obra, Presupuesto presupuesto, VistaSeleccion vistaSeleccion, GestionObra modelo) {
        this.catalogo = catalogo;
        this.obra = obra;
        this.modelo = modelo;
        this.presupuesto = presupuesto;
        this.vistaSeleccion = vistaSeleccion;
        catalogo.setInformacion(modelo.listar());
        }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
       if (e.getActionCommand().equals(InterfaceVista.OBRA_AGREGAR)) {        
            obra.iniciar(); 
        }else if(e.getActionCommand().equals(InterfaceVista.GUARDAR)){
            modelo.agregar(obra.getDatos());
            catalogo.limpiaTabla();
            catalogo.setInformacion(this.modelo.listar());
            obra.detener();
        }else if(e.getActionCommand().equals(InterfaceVista.PRESUPUESTO_AGREGAR)){
            presupuesto.iniciar();
        }else if(e.getActionCommand().equals(InterfaceVista.AGREGAR)){
            vistaSeleccion.limpiaTabla();
            vistaSeleccion.setInformacion(this.modelo.listar());
            vistaSeleccion.iniciar();
        }else if(e.getActionCommand().equals(InterfaceVista.SELECCIONAR)){
            
            presupuesto.limpiaTabla();
            int cantidad = vistaSeleccion.getDatos();
            presupuesto.agregarObra(modelo.buscar(vistaSeleccion.getIdSelected()), cantidad);
            presupuesto.setInformacion();
            vistaSeleccion.detener();
        }  
    }
    
}
