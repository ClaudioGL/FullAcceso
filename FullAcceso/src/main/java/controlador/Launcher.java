/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo_catalogo.GestionObra;
import modelo_catalogo.GestionProveedor;
import modelo_catalogo.GestionUnidad;
import modelo_catalogo.Obra;
import persistencia.dao.ObraDao;
import persistencia.factory.DAOFactory;
import persistencia.factory.TipoBD;
import vista.Catalogo;
import vista.Presupuesto;
import vista.VistaProveedor;
import vista.VistaSeleccion;
import vista.VistaUnidad;
import vista.vistaObra;

/**
 *
 * @author claug
 */
public class Launcher {
    
   public static void main(String [] args){
       
       GestionObra  modelo = new GestionObra();
       GestionProveedor modeloPro = new GestionProveedor();
       GestionUnidad modeloUni = new GestionUnidad();
       Catalogo catalogo = new Catalogo();
       vistaObra obra = new vistaObra();
       Presupuesto presupuesto = new Presupuesto();
       VistaSeleccion vistaSeleccion = new VistaSeleccion();
       VistaProveedor vistaPro = new VistaProveedor();
       VistaUnidad vistaUni = new VistaUnidad();
       
       Controlador controlador = new Controlador(catalogo, obra, presupuesto, vistaSeleccion, vistaPro, vistaUni, modelo, modeloPro, modeloUni);
       
       catalogo.setControlador(controlador);
       obra.setControlador(controlador);
       presupuesto.setControlador(controlador);
       vistaSeleccion.setControlador(controlador);
       vistaPro.setControlador(controlador);
       vistaUni.setControlador(controlador);
       
       catalogo.iniciar();
       
       
       


       
//       Obra o = new Obra();
//       o.setDescripcion("pintura");
//       o.setUnidad("litros");
//       o.setPrecioUnitario(20000);
       
       
//       DAOFactory fabrica = DAOFactory.getFactory(TipoBD.DERBY);
//        ObraDao categoriaDao = fabrica.getObraDao();
//        categoriaDao.guardar(o);
   } 
    
}
