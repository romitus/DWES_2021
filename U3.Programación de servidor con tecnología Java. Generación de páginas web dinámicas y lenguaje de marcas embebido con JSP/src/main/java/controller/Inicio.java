package controller;

import java.io.IOException;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Inicio
 */
@WebServlet("/Inicio")
public class Inicio extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*" + "@"
			+ "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

	private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Inicio() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession sesion = request.getSession();
		if (!sesion.isNew() && sesion.getAttribute("LOGEADO") != null && ((boolean) sesion.getAttribute("LOGEADO"))) {
			request.getRequestDispatcher("sesionIniciada.jsp").forward(request, response);
		}
		request.getRequestDispatcher("inicio.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession sesion = request.getSession();
		request.setCharacterEncoding("UTF-8");

		if (request.getParameter("usuario") != null && request.getParameter("password") != null
				&& request.getParameter("cpassword").equals(request.getParameter("password"))
				&& request.getParameter("email") != null
				&& EMAIL_PATTERN.matcher(request.getParameter("email")).matches()) {
			//Meto los valores en sesión o en cookies
			sesion.setAttribute("usuario", request.getParameter("usuario"));
			sesion.setAttribute("tiempoCreacion", sesion.getCreationTime());
			sesion.setAttribute("LOGEADO", true);
			response.sendRedirect(request.getContextPath()+"/Reservar");	
		}else {
			response.sendRedirect(request.getContextPath()+"/Inicio");
		}
	}

}
