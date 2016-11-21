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
import modelo_catalogo.Proveedor;
import persistencia.dao.ProveedorDao;
import persistencia.factory.DerbyDaoFactory;

/**
 *
 * @author claug
 */
public class ProveedorImpl implements ProveedorDao{
     
    private final Connection conn;

    public ProveedorImpl() {
        this.conn = DerbyDaoFactory.createConnection();
    }

    @Override
    public Proveedor buscar(String nombre) {
        
        Proveedor pro = null;
        ResultSet rs;
        String sql = "SELECT * FROM GRUPO.PROVEEDOR WHERE PRO_NOMBRE = ?";

        try {

            PreparedStatement pstm = this.conn.prepareStatement(sql);
            pstm.setString(1, nombre);
            rs = pstm.executeQuery();

            if (rs.next()) {
                pro = map(rs);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProveedorImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pro;
      }

    @Override
    public boolean guardar(Proveedor pro) {
        
        boolean resultado = false;
        String sql = "INSERT INTO GRUPO.PROVEEDOR (PRO_NOMBRE, PRO_PAGO) VALUES (?, ?)";
        
        try {
            PreparedStatement pstm = this.conn.prepareStatement(sql);
            pstm.setString(1, pro.getNombre());
            pstm.setString(2, pro.getPago());
            pstm.executeUpdate();
            resultado = true;

        } catch (SQLException ex) {
            Logger.getLogger(ProveedorImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    @Override
    public void editar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Proveedor> listar() {
        
        ArrayList<Proveedor> proveedores = new ArrayList<>();
        
        ResultSet rs;
        String sql = "SELECT * FROM GRUPO.PROVEEDOR";

        try {

            PreparedStatement pstm = this.conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            if (!rs.next()) {
                System.out.println("NO HAY DATOS");

            } else {
                do {
                    Proveedor pro = new Proveedor();
                    pro.setIdProveedor(rs.getInt("PRO_ID"));
                    pro.setNombre(rs.getString("PRO_NOMBRE"));
                    pro.setPago(rs.getString("PRO_PAGO"));
                    proveedores.add(pro);
                 } while (rs.next());
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProveedorImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return proveedores;
      }

    @Override
    public boolean borrar(int idPro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Proveedor buscarId(int id) {
        Proveedor pro = null;
        ResultSet rs;
        String sql = "SELECT * FROM GRUPO.PROVEEDOR WHERE PRO_ID = ?";

        try {

            PreparedStatement pstm = this.conn.prepareStatement(sql);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();

            if (!rs.next()) {
                System.out.println("NO HAY DATOS");

            } else {
//                do {
                    pro = new Proveedor();
                    pro.setIdProveedor(rs.getInt("PRO_ID"));
                    pro.setNombre(rs.getString("PRO_NOMBRE"));
                    pro.setPago(rs.getString("PRO_PAGO"));
                    
//                } while (rs.next());
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProveedorImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pro;
        }
      private static Proveedor map(ResultSet resultSet) throws SQLException {
        Proveedor pro = new Proveedor();
        pro.setIdProveedor(resultSet.getInt("PRO_ID"));
        pro.setNombre(resultSet.getString("PRO_NOMBRE"));
        pro.setPago(resultSet.getString("PRO_PAGO"));
       
        return pro;
    }
    
}
