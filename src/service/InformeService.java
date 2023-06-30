package service;

import java.util.List;

import beans.Informe;
import dao.DAOFactory;
import interfaces.InformeDAO;
import utils.Constantes;

public class InformeService {
	
	DAOFactory fabrica = DAOFactory.getDAOFactory(Constantes.ORIGEN_DE_DATOS_MYSQL);
    InformeDAO objPro = fabrica.getInforme();

    public List<Informe> listarInforme() {
        return objPro.listarInforme();
    }

    public int registraInforme(Informe obj) {
        return objPro.registrarInforme(obj);
    }
    
    public int actualizarInforme(Informe obj) {
    	return objPro.actualizarInforme(obj);
    }
    
    public Informe buscaInforme(int codigo) {
        return objPro.buscarInforme(codigo);
    }
    
    public int eliminaInforme(int codigo) {
    	return objPro.eliminarInforme(codigo);
    }

}
