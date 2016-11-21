/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo_catalogo.GestionObra;
import modelo_catalogo.GestionProveedor;
import modelo_catalogo.GestionUnidad;
import modelo_catalogo.Obra;
import vista.Catalogo;
import vista.InterfaceVista;
import vista.Presupuesto;
import vista.VistaProveedor;
import vista.VistaSeleccion;
import vista.VistaUnidad;
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
    private VistaProveedor vistaProveedor;
    private VistaUnidad vistaUnidad;
    
    private GestionObra modelo;
    private GestionProveedor modeloPro;
    private GestionUnidad modeloUni;

    public Controlador(Catalogo catalogo, vistaObra obra, Presupuesto presupuesto, VistaSeleccion vistaSeleccion,VistaProveedor vistaProveedor, VistaUnidad vistaUnidad,
            GestionObra modelo, GestionProveedor modeloPro, GestionUnidad modeloUni) {
        this.catalogo = catalogo;
        this.obra = obra;
        this.modelo = modelo;
        this.presupuesto = presupuesto;
        this.vistaSeleccion = vistaSeleccion;
        this.vistaProveedor = vistaProveedor;
        this.vistaUnidad = vistaUnidad;
        this.modeloPro = modeloPro;
        this.modeloUni = modeloUni;
        catalogo.setInformacion(modelo.listar());
        }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
       if (e.getActionCommand().equals(InterfaceVista.OBRA_AGREGAR)) {
           obra.listarComboBox(modeloPro.listar(), modeloUni.listar());
            obra.iniciar(); 
        }else if(e.getActionCommand().equals(InterfaceVista.GUARDAR_OBRA)){
            Obra o = new Obra();
            o = obra.getDatos();
            o.setProveedor(modeloPro.buscar(obra.getProveedorNombre()));
            o.setUnidad(modeloUni.buscar(obra.getUnidadNombre()));
            modelo.agregar(o);
            catalogo.limpiaTabla();
            catalogo.setInformacion(this.modelo.listar());
            obra.detener();
        }else if(e.getActionCommand().equals(InterfaceVista.PRESUPUESTO_AGREGAR)){
            presupuesto.iniciar();
        }else if(e.getActionCommand().equals(InterfaceVista.AGREGAR_SELECCION)){
            vistaSeleccion.limpiaTabla();
            vistaSeleccion.setInformacion(this.modelo.listar());
            vistaSeleccion.iniciar();
        }else if(e.getActionCommand().equals(InterfaceVista.SELECCIONAR)){
            
            presupuesto.limpiaTabla();
            int cantidad = vistaSeleccion.getDatos();
            presupuesto.agregarObra(modelo.buscar(vistaSeleccion.getIdSelected()), cantidad);
            presupuesto.setInformacion();
            vistaSeleccion.detener();
        }else if(e.getActionCommand().equals(InterfaceVista.PROVEEDOR_AGREGAR)){
            vistaProveedor.iniciar();
        }else if(e.getActionCommand().equals(InterfaceVista.GUARDAR_PROVEEDOR)){
            modeloPro.agregar(vistaProveedor.getDatos());
            catalogo.limpiaTabla();
            catalogo.setInformacion(this.modelo.listar());
            vistaProveedor.detener();
        }else if(e.getActionCommand().equals(InterfaceVista.UNIDAD_AGREGAR)){
            vistaUnidad.iniciar();
        }else if(e.getActionCommand().equals(InterfaceVista.GUARDAR_UNIDAD)){
            modeloUni.agregar(vistaUnidad.getDatos());
            catalogo.limpiaTabla();
            catalogo.setInformacion(this.modelo.listar());
            vistaUnidad.detener();
        }
    }
    
}
