package controller;

import java.io.IOException;
import model.FeetConverter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Austin Rathje

/**
 * Servlet implementation class getMeterServlet
 */
@WebServlet("/getMeterServlet")
public class getMeterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public getMeterServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userFeet = request.getParameter("userFeet");

		FeetConverter userDistance = new FeetConverter(Double.parseDouble(userFeet));
		request.setAttribute("userDistanceCollector", userDistance);
		getServletContext().getRequestDispatcher("/meterResult.jsp").forward(request, response);
	}

}
