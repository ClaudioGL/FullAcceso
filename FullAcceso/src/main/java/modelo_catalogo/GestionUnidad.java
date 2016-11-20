/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo_catalogo;

import java.util.ArrayList;
import persistencia.impl.UnidadImpl;

/**
 *
 * @author claug
 */
public class GestionUnidad {
    
    public Unidad buscar(String nombre){
        UnidadImpl lormDao = new UnidadImpl(); 
        Unidad resp = lormDao.buscar(nombre);
        return resp;
    }
    
    public boolean agregar(Unidad unidad){
        UnidadImpl lormDao = new UnidadImpl(); 
        boolean resp = lormDao.guardar(unidad);
        return resp;
    }
    
//    public boolean eliminar(String rut){
//        ContactoDaoImpl lormDao = new ContactoDaoImpl(); 
//        boolean resp = lormDao.delete(rut);
//        return resp;
//    }
    
     public Unidad buscar(int id){
        UnidadImpl lormDao = new UnidadImpl(); 
        Unidad resp = lormDao.buscarId(id);
        return resp;
    }
//    
//    public boolean actualizar(String rut, Contacto contacto){
//        ContactoDaoImpl lormDao = new ContactoDaoImpl(); 
//        boolean resp = lormDao.update(rut,contacto);
//        return resp;
//    }
    
    public ArrayList<Unidad> listar(){
        UnidadImpl lormDao = new UnidadImpl(); 
        ArrayList<Unidad> resp = lormDao.listar();
        return resp;
    }
    
}
