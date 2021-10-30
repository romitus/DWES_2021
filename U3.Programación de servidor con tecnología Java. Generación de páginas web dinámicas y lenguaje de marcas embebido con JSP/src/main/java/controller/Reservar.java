package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

/**
 * Servlet implementation class Reservar
 */
@WebServlet("/Reservar")
public class Reservar extends HttpServlet {
	private static final long serialVersionUID = 1L;
	final static Logger logger = Logger.getLogger(Reservar.class);
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Reservar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession sesion = request.getSession();
		if (!sesion.isNew() && sesion.getAttribute("LOGEADO") != null && ((boolean) sesion.getAttribute("LOGEADO"))) {
			request.getRequestDispatcher("reserva.jsp").forward(request, response);
		}else {
			logger.error("Intento de entrar en Reservar sin tener sesión");
			response.sendRedirect(request.getContextPath()+"/Inicio");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession sesion = request.getSession();
		request.setCharacterEncoding("UTF-8");
		sesion.setAttribute("fechaInicio", request.getParameter("finicio"));
		sesion.setAttribute("fechaFin", request.getParameter("ffin"));
		sesion.setAttribute("numeroPersonas", request.getParameter("npersonas"));
		sesion.setAttribute("servicio1", request.getParameter("wifi"));
		sesion.setAttribute("servicio2", request.getParameter("limpieza"));
		sesion.setAttribute("servicio3", request.getParameter("toallas"));
		sesion.setAttribute("servicio4", request.getParameter("ruta"));
		sesion.setAttribute("servicio5", request.getParameter("desayuno"));
		sesion.setAttribute("servicio6", request.getParameter("sauna"));
		
		response.sendRedirect(request.getContextPath()+"/Confirmar");
		
	}

}
