package interfaces;

import java.util.List;

import beans.Informe;

public interface InformeDAO {
	
	public List<Informe> listarInforme();

    public int registrarInforme(Informe obj);
    
    public int actualizarInforme(Informe obj);
    
    public Informe buscarInforme(int codigo);
    
    public int eliminarInforme(int codigo);

}
