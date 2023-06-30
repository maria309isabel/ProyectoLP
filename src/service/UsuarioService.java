package service;

import beans.Usuario;
import dao.DAOFactory;
import interfaces.UsuarioDAO;
import utils.Constantes;

public class UsuarioService {
	
	DAOFactory fabrica = DAOFactory.getDAOFactory(Constantes.ORIGEN_DE_DATOS_MYSQL);
	UsuarioDAO objpro = fabrica.getUsuario();
	
	public Usuario loginUsuario (String user, String contra) {
		return objpro.loginUsuario(user, contra);
	}
	
	public int registrarUsuario (Usuario obj) {
		return objpro.registrarUsuario(obj);
	}

}
