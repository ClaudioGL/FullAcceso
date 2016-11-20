/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo_catalogo;

import java.util.ArrayList;
import persistencia.impl.ProveedorImpl;


/**
 *
 * @author claug
 */
public class GestionProveedor {
    
     public Proveedor buscar(String nombre){
        ProveedorImpl lormDao = new ProveedorImpl(); 
        Proveedor resp = lormDao.buscar(nombre);
        return resp;
    }
    
        public boolean agregar(Proveedor proveedor){
        ProveedorImpl lormDao = new ProveedorImpl(); 
        boolean resp = lormDao.guardar(proveedor);
        return resp;
    }
    
//    public boolean eliminar(String rut){
//        ContactoDaoImpl lormDao = new ContactoDaoImpl(); 
//        boolean resp = lormDao.delete(rut);
//        return resp;
//    }
    
     public Proveedor buscarId(int id){
        ProveedorImpl lormDao = new ProveedorImpl(); 
        Proveedor resp = lormDao.buscarId(id);
        return resp;
    }
//    
//    public boolean actualizar(String rut, Contacto contacto){
//        ContactoDaoImpl lormDao = new ContactoDaoImpl(); 
//        boolean resp = lormDao.update(rut,contacto);
//        return resp;
//    }
    
    public ArrayList<Proveedor> listar(){
        ProveedorImpl lormDao = new ProveedorImpl(); 
        ArrayList<Proveedor> resp = lormDao.listar();
        return resp;
    }
}
