package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import beans.Usuario;
import interfaces.UsuarioDAO;
import utils.MysqlDBConexion;

public class MySqlUsuarioDAO implements UsuarioDAO {

	@Override
	public Usuario loginUsuario(String user, String contra) {
		Usuario usu = null;
		Connection cn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			String sql = "select * from Usuario where userName=? and contra=?";
			cn = MysqlDBConexion.getConexion();
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, user);
			pstm.setString(2, contra);
			rs = pstm.executeQuery();
			 if(rs.next()) {
	            	usu = new Usuario();
	            	usu.setCodigo(rs.getInt(1));
	            	usu.setUser(rs.getString(2));
	            	usu.setContra(rs.getString(3));
	            }
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			finally {
	            try {
	                if (rs != null)
	                    rs.close();
	                if (pstm != null)
	                    pstm.close();
	                if (cn != null)
	                    cn.close();
	            } catch (Exception e2) {
	                e2.printStackTrace();
	            }
	        }
			return usu;
		}

	@Override
	public int registrarUsuario(Usuario obj) {
		int registro = -1;
		Connection cn = null;
		PreparedStatement pstm = null;
		try {
			cn = MysqlDBConexion.getConexion();
			String sql = "insert into Usuario values (null,?,?)";
			pstm = cn.prepareStatement(sql);
            pstm.setString(1, obj.getUser());
           pstm.setString(2, obj.getContra());

           registro = pstm.executeUpdate();
       } catch (Exception e) {
           e.printStackTrace();
       } finally {
           try {
               if (pstm != null) {
                   pstm.close();
               }
               if (cn != null) {
                   cn.close();
               }
           } catch (Exception e2) {
               e2.printStackTrace();
           }
       }
       return registro;
   }
}
