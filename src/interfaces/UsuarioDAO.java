package interfaces;

import beans.Usuario;

public interface UsuarioDAO {
	
	public Usuario loginUsuario (String user, String contra);
	
	public int registrarUsuario (Usuario obj);

}
