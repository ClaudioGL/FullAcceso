/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.dao;

import java.util.ArrayList;
import modelo_catalogo.Unidad;

/**
 *
 * @author claug
 */
public interface UnidadDao {
    
        public Unidad buscar(String nombre);

	public boolean guardar(Unidad uni);

	public void editar();

	public ArrayList<Unidad> listar();

	public boolean borrar(int idCat);
        
        public Unidad buscarId(int id);
    
}
