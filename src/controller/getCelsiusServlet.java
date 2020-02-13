package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.FahrenheitConverter;

//Austin Rathje

/**
 * Servlet implementation class getCelsiusServlet
 */
@WebServlet("/getCelsiusServlet")
public class getCelsiusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public getCelsiusServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userFahrenheit = request.getParameter("userFahrenheit");

		FahrenheitConverter userTemperatures = new FahrenheitConverter(Double.parseDouble(userFahrenheit));
		request.setAttribute("userTemperatureCollector", userTemperatures);
		getServletContext().getRequestDispatcher("/CelsiusResult.jsp").forward(request, response);
	}

}
