/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.dao;

import java.util.ArrayList;
import modelo_catalogo.Obra;
import modelo_catalogo.Proveedor;
import modelo_catalogo.Unidad;

/**
 *
 * @author claug
 */
public interface ObraDao {
    
        public Obra buscar(String nombre);

	public boolean guardar(Obra cat);

	public void editar();

	public ArrayList<Obra> listar();

	public boolean borrar(int idCat);
        
        public Obra buscarId(int id);
}
