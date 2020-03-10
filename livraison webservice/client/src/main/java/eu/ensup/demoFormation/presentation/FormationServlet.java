package eu.ensup.demoFormation.presentation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import client.Formation;
import client.FormationServiceService;
import client.IFormationService;

/**
 * Servlet implementation class FormationServlet
 */
@WebServlet(value = "/ajoutFormation")
public class FormationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FormationServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// "nomformation" valeur r�cup�rer dans la jsp , via methode doPost, qui
		// appel doGet
		FormationServiceService fss = new FormationServiceService();
		IFormationService port = fss.getFormationServicePort();

		Formation formation = new Formation();
		formation.setTheme(request.getParameter("nomformation"));
		port.creationFormation(formation);

		response.sendRedirect("succesAjoutFormation.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
