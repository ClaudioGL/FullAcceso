/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo_catalogo.Obra;
import modelo_catalogo.Proveedor;
import modelo_catalogo.Unidad;
import persistencia.dao.ObraDao;
import persistencia.factory.DerbyDaoFactory;

/**
 *
 * @author claug
 */
public class ObraImpl implements ObraDao {
    
    private final Connection conn;

    public ObraImpl() {
        this.conn = DerbyDaoFactory.createConnection();
    }

    @Override
    public Obra buscar(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean guardar(Obra obra) {
           boolean resultado = false;
        String sql = "INSERT INTO GRUPO.OBRA (OBRA_DESCRIPCION, OBRA_PRECIO, OBRA_TIPO, PRO_ID, UNI_ID) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement pstm = this.conn.prepareStatement(sql);
            pstm.setString(1, obra.getDescripcion());
            pstm.setInt(2, obra.getPrecioUnitario());
            pstm.setString(3, obra.getTipo());
            pstm.setInt(4, obra.getProveedor().getIdProveedor());
            pstm.setInt(5, obra.getUnidad().getId());
            pstm.executeUpdate();
            resultado = true;

        } catch (SQLException ex) {
            Logger.getLogger(ObraImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    @Override
    public void editar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Obra> listar() {
        
          ArrayList<Obra> obras = new ArrayList<>();
        
        ResultSet rs;
        String sql = "SELECT * FROM GRUPO.OBRA";

        try {

            PreparedStatement pstm = this.conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            if (!rs.next()) {
                System.out.println("NO HAY DATOS");

            } else {
                do {
                    
                    Obra obra = new Obra();
                    Unidad uni = new Unidad();
                    Proveedor pro = new Proveedor();
                    obra.setId(rs.getInt("OBRA_ID"));
                    obra.setDescripcion(rs.getString("OBRA_DESCRIPCION"));
                    obra.setPrecioUnitario(rs.getInt("OBRA_PRECIO"));
                    obra.setTipo(rs.getString("OBRA_TIPO"));
                    pro.setIdProveedor(rs.getInt("PRO_ID"));
                    uni.setId(rs.getInt("UNI_ID"));
                    obra.setProveedor(pro);
                    obra.setUnidad(uni);
                    
                    obras.add(obra);

                } while (rs.next());
            }

        } catch (SQLException ex) {
            Logger.getLogger(ObraImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obras;
    }

    @Override
    public boolean borrar(int idCat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Obra buscarId(int id) {
       Obra obra = null;
        ResultSet rs;
        String sql = "SELECT * FROM GRUPO.OBRA WHERE OBRA_ID = ?";

        try {

            PreparedStatement pstm = this.conn.prepareStatement(sql);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();

            if (!rs.next()) {
                System.out.println("NO HAY DATOS");

            } else {
//                do {
                    obra = new Obra();
                    Proveedor pro = new Proveedor();
                    Unidad uni = new Unidad();
                    obra.setId(rs.getInt("OBRA_ID"));
                    obra.setDescripcion(rs.getString("OBRA_DESCRIPCION"));
                    obra.setPrecioUnitario(rs.getInt("OBRA_PRECIO"));
                    obra.setTipo(rs.getString("OBRA_TIPO"));
                    pro.setIdProveedor(rs.getInt("PRO_ID"));
                    uni.setId(rs.getInt("UNI_ID"));
                    obra.setProveedor(pro);
                    obra.setUnidad(uni);
//                } while (rs.next());
            }

        } catch (SQLException ex) {
            Logger.getLogger(ObraImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obra;
        }
   
    
}
