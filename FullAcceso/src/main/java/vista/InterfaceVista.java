/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;

/**
 *
 * @author claug
 */
public interface InterfaceVista {
    
        /**
     *Método que permitira desplegar una venta 
     */
    void iniciar();
    /**
     * Metodo que oculta o cierra una ventana
     */
    void detener();
     /**
     * Método que permine asignar un controlador a la ventana, que sea capaz de controlar las acciones con cada uno de sus botones 
     * @param controlador: recibe el controlador a asignar 
     */ 
    void setControlador(Controlador controlador); 
    
    /**
     * Constantes utilizadas en las ventanas
     */
    static final String OBRA_AGREGAR = "obra_Agregar";
    static final String PRESUPUESTO_AGREGAR = "presupuesto_Agregar";
    
    static final String GUARDAR = "Guardar";
    static final String CANCELAR = "Cancelar";
    static final String AGREGAR = "Agregar";
    static final String ELIMINAR = "Eliminar";
    static final String SELECCIONAR = "Seleccionar";
    
    static final String VISTA_VER="vista_Ver";
    static final String VOLVER_AGREGAR="Volver Agregar";
    static final String VOLVER_VER= "Volver ver";
    
}
