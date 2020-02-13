package controller;

import java.io.IOException; 
import model.MeterConverter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Austin Rathje

/**
 * Servlet implementation class getFeetServlet
 */
@WebServlet("/getFeetServlet")
public class getFeetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public getFeetServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userMeters = request.getParameter("userMeters");

		MeterConverter userDistance = new MeterConverter(Double.parseDouble(userMeters));
		request.setAttribute("userDistanceCollector", userDistance);
		getServletContext().getRequestDispatcher("/feetResult.jsp").forward(request, response);
	}

}
