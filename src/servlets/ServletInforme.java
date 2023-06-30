package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Informe;
import dao.MySqlInformeDAO;
import service.InformeService;

/**
 * Servlet implementation class ServletInforme
 */
@WebServlet("/ServletInforme")
public class ServletInforme extends HttpServlet {
	InformeService i = new InformeService();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletInforme() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tipo = request.getParameter("tipo");
        if (tipo.equals("listar"))
            listar(request, response);
        else if (tipo.equals("registrar"))
            registrar(request, response);
        else if (tipo.equals("actualizar"))
        	actualizar(request, response);
        else if (tipo.equals("eliminar"))
        	eliminar(request, response);
        else if (tipo.equals("buscar"))
        	buscar(request, response);
       
	}


	private void buscar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String dato = request.getParameter("codigo");
		int codigo = Integer.parseInt(dato);
		Informe x = i.buscaInforme(codigo);
		request.setAttribute("registro", x);
		request.getRequestDispatcher("actualizarInforme.jsp").forward(request, response);
	}

	private void eliminar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String dato = request.getParameter("codigo");
		int codigo = Integer.parseInt(dato);
		i.eliminaInforme(codigo);
		request.getRequestDispatcher("ServletInforme?tipo=listar").forward(request, response);
	}

	private void actualizar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		Informe obj = new Informe(0, null, null, null, null, null);
	    String solicitante = request.getParameter("txt_solicitante");
	    String fecha = request.getParameter("txt_fecha");
	    String incidente = request.getParameter("txt_incidente");
	    String recomendacion = request.getParameter("txt_recomendacion");
	    obj.setCodigoSolicitante(Integer.parseInt(solicitante));
	    obj.setFechaSolicitud(fecha);
	    obj.setCodigoIncidente(Integer.parseInt(incidente));
	    obj.setRecomendaciones(recomendacion);
	    int estado = i.actualizarInforme(obj);
	    if (estado != -1) {  
	    	listar(request, response);
	    } else {     
	        response.sendRedirect("error.html");
	    }
	}


	private void registrar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    Informe obj = new Informe(0, null, null, null, null, null);
	    String solicitante = request.getParameter("txt_solicitante");
	    String fecha = request.getParameter("txt_fecha");
	    String incidente = request.getParameter("txt_incidente");
	    String recomendacion = request.getParameter("txt_recomendacion");
	    obj.setCodigoSolicitante(Integer.parseInt(solicitante));
	    obj.setFechaSolicitud(fecha);
	    obj.setCodigoIncidente(Integer.parseInt(incidente));
	    obj.setRecomendaciones(recomendacion);
	    int estado = i.registraInforme(obj);
	    if (estado != -1) {  
	        request.setAttribute("mensaje", "El informe se ha registrado correctamente.");
	        request.getRequestDispatcher("registrar.jsp").forward(request, response);
	    } else {     
	        response.sendRedirect("error.html");
	    }
	}

	private void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Informe> info = new MySqlInformeDAO().listarInforme();
        request.setAttribute("informes", info);
        request.getRequestDispatcher("consultarIncidente.jsp").forward(request, response);
    }	
}