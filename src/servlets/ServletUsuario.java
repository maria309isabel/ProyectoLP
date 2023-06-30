package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Usuario;
import service.UsuarioService;

/**
 * Servlet implementation class ServletUsuario
 */
@WebServlet("/ServletUsuario")
public class ServletUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UsuarioService u = new UsuarioService();
    /**
     * Default constructor. 
     */
    public ServletUsuario() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		if (login.equals("iniciar"))
			iniciarSesion(request, response);
		else if (login.equals("salir"))
			cerrarSesion(request, response);
		else if (login.equals("registrar"))
			registarUsuario(request, response);
	}

	private void registarUsuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Usuario obj = new Usuario();
		String user = request.getParameter("txtusuario");
		String contra = request.getParameter("txtcontra");
		obj.setUser(user);
		obj.setContra(contra);
		int registro = u.registrarUsuario(obj);
		if (registro != -1) {
            request.setAttribute("mensaje", "Usted se a registrado correctamente");
            request.getRequestDispatcher("registrar.jsp").forward(request, response);
        } else {
            response.sendRedirect("error.html");
        }
    }

	private void cerrarSesion(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion = request.getSession();
		sesion.invalidate();
		request.setAttribute("msg", "Iniciar sesion");
		request.getRequestDispatcher("login.jsp").forward(request, response);
		
	}

	private void iniciarSesion(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String login = request.getParameter("txtusuario");
	        String password = request.getParameter("txtcontra");
	        System.out.println("Login: "+login);
	        System.out.println("Clave: "+password);
	        Usuario obj = u.loginUsuario(login, password);
	        if (obj != null) {
	            if (obj.getContra().equals(password)) {
	                HttpSession sesion = request.getSession();
	                sesion.setAttribute("datos", obj);
	                request.getRequestDispatcher("menuPrincipal.jsp").forward(request, response);
	            }
	            else {
	                request.setAttribute("msg", "Usuario Incorrecto");
	                request.getRequestDispatcher("login.jsp").forward(request, response);

	            }
	        }
	        else {
	            request.setAttribute("msg", "Contraseña Incorrecta");
	            request.getRequestDispatcher("login.jsp").forward(request, response);
	        }
	    }

	}