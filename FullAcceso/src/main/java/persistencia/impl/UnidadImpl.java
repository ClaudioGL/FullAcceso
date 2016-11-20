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

import modelo_catalogo.Unidad;
import persistencia.dao.UnidadDao;
import persistencia.factory.DerbyDaoFactory;

/**
 *
 * @author claug
 */
public class UnidadImpl implements UnidadDao{
    
    private final Connection conn;

    public UnidadImpl() {
        this.conn = DerbyDaoFactory.createConnection();
    }

    @Override
    public Unidad buscar(String nombre) {
        Unidad uni = null;
        ResultSet rs;
        String sql = "SELECT * FROM GRUPO.UNIDAD WHERE UNI_NOMBRE = ?";

        try {

            PreparedStatement pstm = this.conn.prepareStatement(sql);
            pstm.setString(1, nombre);
            rs = pstm.executeQuery();

            if (rs.next()) {
                uni = map(rs);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UnidadImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return uni;
      }

    @Override
    public boolean guardar(Unidad uni) {
        
        boolean resultado = false;
        String sql = "INSERT INTO GRUPO.UNIDAD (UNI_NOMBRE) VALUES (?)";
        try {
            PreparedStatement pstm = this.conn.prepareStatement(sql);
            pstm.setString(1, uni.getNombre());
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
    public ArrayList<Unidad> listar() {
        
        ArrayList<Unidad> unidades = new ArrayList<>();
        ResultSet rs;
        String sql = "SELECT * FROM GRUPO.UNIDAD";

        try {

            PreparedStatement pstm = this.conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            if (!rs.next()) {
                System.out.println("NO HAY DATOS");

            } else {
                do {
                    Unidad uni = new Unidad();
                    uni.setId(rs.getInt("UNI_ID"));
                    uni.setNombre(rs.getString("UNI_NOMBRE"));
                    unidades.add(uni);
                 } while (rs.next());
            }

        } catch (SQLException ex) {
            Logger.getLogger(UnidadImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return unidades;
        }

    @Override
    public boolean borrar(int idCat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Unidad buscarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
      private static Unidad map(ResultSet resultSet) throws SQLException {
        Unidad uni = new Unidad();
        uni.setId(resultSet.getInt("UNI_ID"));
        uni.setNombre(resultSet.getString("UNI_NOMBRE"));
        
        return uni;
    }
    
}
