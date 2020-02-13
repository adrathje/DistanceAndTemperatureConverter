package controller;

//Austin Rathje

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CelsiusConverter;

/**
 * Servlet implementation class getFahrenheitServlet
 */
@WebServlet("/getFahrenheitServlet")
public class getFahrenheitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public getFahrenheitServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userCelsius = request.getParameter("userCelsius");

		CelsiusConverter userTemperatures = new CelsiusConverter(Double.parseDouble(userCelsius));
		request.setAttribute("userTemperatureCollector", userTemperatures);
		getServletContext().getRequestDispatcher("/FahrenheitResult.jsp").forward(request, response);
	}

}
