package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import beans.Informe;
import interfaces.InformeDAO;
import utils.MysqlDBConexion;

public class MySqlInformeDAO implements InformeDAO {

	@Override
	public List<Informe> listarInforme() {
		Informe info = null;
		List<Informe> data = new ArrayList<Informe>();
		Connection cn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;

		try {
			cn = MysqlDBConexion.getConexion();
			String sql = "select  i.codigoInforme, s.nombre, i.fechaSolicitud, e.descripcion, e.impacto, i.comentario from informe i inner join solicitante s on i.codSolicitante = s.codSolicitante inner join incidente e on i.codIncidente = e.codIncidente order by codigoinforme asc";
			pstm = cn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while (rs.next()) {
				info = new Informe(0, sql, sql, sql, sql, sql);
				info.setCodigoInforme(rs.getInt(1));
				info.setNombreSolicitante(rs.getString(2));
				info.setFechaSolicitud(rs.getString(3));
				info.setDescripcion(rs.getString(4));
				info.setImpacto(rs.getString(5));
				info.setRecomendaciones(rs.getString(6));
				data.add(info);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
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
		return data;
	}

	@Override
	public int registrarInforme(Informe obj) {
		int estado = -1;
		Connection cn = null;
		PreparedStatement pstm = null;

		try {
			cn = MysqlDBConexion.getConexion();
			String sql = "insert into informe values(null,?,?,?,?)";
			pstm = cn.prepareStatement(sql);
			pstm.setInt(1, obj.getCodigoSolicitante());
			pstm.setString(2, obj.getFechaSolicitud());
			pstm.setInt(3,obj.getCodigoIncidente());
			pstm.setString(4, obj.getRecomendaciones());
			estado = pstm.executeUpdate();
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
		return estado;
	}

	@Override
	public Informe buscarInforme(int codigo) {
		Informe info = null;
		Connection cn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;

		try {
			cn = MysqlDBConexion.getConexion();
			String sql = "select * from Informe where codigoInforme=?";
			pstm = cn.prepareStatement(sql);
			pstm.setInt(1, codigo);
			rs = pstm.executeQuery();
			if (rs.next()) {
				info = new Informe(0, sql, sql, sql, sql, sql);
				info.setCodigoInforme(rs.getInt(1));
				info.setNombreSolicitante(rs.getString(2));
				info.setFechaSolicitud(rs.getString(3));
				info.setDescripcion(rs.getString(4));
				info.setImpacto(rs.getString(5));
				info.setRecomendaciones(rs.getString(6));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
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
		return info;
	}

	@Override
	public int eliminarInforme(int codigo) {
		int estado = -1;
		Connection cn = null;
		PreparedStatement pstm = null;

		try {
			cn = MysqlDBConexion.getConexion();
			String sql = "delete from Informe where codigoInforme=?";
			pstm = cn.prepareStatement(sql);
			pstm.setInt(1, codigo);
			estado = pstm.executeUpdate();
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
		return estado;
	}

	
	@Override
	public int actualizarInforme(Informe obj) {
		int estado = -1;
		Connection cn = null;
		PreparedStatement pstm = null;

		try {
			cn = MysqlDBConexion.getConexion();
			String sql = "update informe set codSolicitante=?, fechaSolicitud=?, codIncidente=?, comentario=? where codigoInforme=?";
			pstm = cn.prepareStatement(sql);
			pstm.setInt(1, obj.getCodigoSolicitante());
			pstm.setString(2, obj.getFechaSolicitud());
			pstm.setInt(3,obj.getCodigoIncidente());
			pstm.setString(4, obj.getRecomendaciones());
			estado = pstm.executeUpdate();
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
		return estado;
	}


}