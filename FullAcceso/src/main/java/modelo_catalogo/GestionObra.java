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
        GestionProveedor gp = new GestionProveedor();
        GestionUnidad gu = new GestionUnidad();
        resp.setProveedor(gp.buscarId(resp.getProveedor().getIdProveedor()));
        resp.setUnidad(gu.buscarId(resp.getUnidad().getId()));
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
        GestionProveedor gp = new GestionProveedor();
        GestionUnidad gu = new GestionUnidad();
        for (int i=0;i<resp.size();i++){
        resp.get(i).setProveedor(gp.buscarId(resp.get(i).getProveedor().getIdProveedor()));
        resp.get(i).setUnidad(gu.buscarId(resp.get(i).getUnidad().getId()));
        }
        return resp;
    }
    
//    public List<Contacto> mostrar(String rut){
//        ContactoDaoImpl lormDao = new ContactoDaoImpl(); 
//        List<Contacto> resp = lormDao.select(rut);
//        return resp;
//    }
    
    public ArrayList<Obra> filtrar(ArrayList<Obra> obras, String proveedor, String tipo){
        ArrayList<Obra> filtrado = new ArrayList<Obra>();
        if(proveedor != "none"){
            for(int i=0;i<obras.size();i++){
                if(obras.get(i).getProveedor().equals(proveedor)){
                    filtrado.add(obras.get(i));
                }
            }
            obras = filtrado;
        }if(tipo != "none" && proveedor != "none"){
            for(int i=0;i<obras.size();i++){
                if(obras.get(i).getTipo().equals(tipo)){
                    filtrado.add(obras.get(i));
                }
            }
        }if(tipo != "none"){
            for(int i=0;i<obras.size();i++){
                if(obras.get(i).getTipo().equals(tipo)){
                    filtrado.add(obras.get(i));
                }
            }
        } 
        return filtrado;
    }
            
}
