/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.dao;

import java.util.ArrayList;
import modelo_catalogo.Proveedor;

/**
 *
 * @author claug
 */
public interface ProveedorDao {
    
        public Proveedor buscar(String nombre);

	public boolean guardar(Proveedor pro);

	public void editar();

	public ArrayList<Proveedor> listar();

	public boolean borrar(int idPro);
        
        public Proveedor buscarId(int id);
    
}
