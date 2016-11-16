/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.factory;

import persistencia.dao.ObraDao;
import persistencia.impl.ObraImpl;

/**
 *
 * @author claug
 */
public class DAOFactory {
    public static DAOFactory getFactory(TipoBD bd) {

        switch (bd) {

            case DERBY:
                return new DerbyDaoFactory();
            case MYSQL:
                throw new IllegalArgumentException();
            case ORACLE:
                throw new IllegalArgumentException();
            default:
                throw new IllegalArgumentException();
        }

    }

   public ObraDao getObraDao() { return new ObraImpl(); }
    
}
