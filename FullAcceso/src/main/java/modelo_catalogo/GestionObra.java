/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo_catalogo;

import java.util.ArrayList;
import persistencia.impl.ObraImpl;

/**
 *
 * @author claug
 */
public class GestionObra {
    
        public boolean agregar(Obra obra){
        ObraImpl lormDao = new ObraImpl(); 
        boolean resp = lormDao.guardar(obra);
        return resp;
    }
    
//    public boolean eliminar(String rut){
//        ContactoDaoImpl lormDao = new ContactoDaoImpl(); 
//        boolean resp = lormDao.delete(rut);
//        return resp;
//    }
    
     public Obra buscar(int id){
        ObraImpl lormDao = new ObraImpl(); 
        Obra resp = lormDao.buscarId(id);
        return resp;
    }
//    
//    public boolean actualizar(String rut, Contacto contacto){
//        ContactoDaoImpl lormDao = new ContactoDaoImpl(); 
//        boolean resp = lormDao.update(rut,contacto);
//        return resp;
//    }
    
    public ArrayList<Obra> listar(){
        ObraImpl lormDao = new ObraImpl(); 
        ArrayList<Obra> resp = lormDao.listar();
        return resp;
    }
    
//    public List<Contacto> mostrar(String rut){
//        ContactoDaoImpl lormDao = new ContactoDaoImpl(); 
//        List<Contacto> resp = lormDao.select(rut);
//        return resp;
//    }
    
}
