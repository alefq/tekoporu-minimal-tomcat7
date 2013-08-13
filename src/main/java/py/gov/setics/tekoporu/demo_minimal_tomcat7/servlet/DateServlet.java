package py.gov.setics.tekoporu.demo_minimal_tomcat7.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import py.gov.setics.tekoporu.demo_minimal_tomcat7.business.DateBC;

@WebServlet(name = "dateServlet", urlPatterns = { "/date" })
public class DateServlet extends HttpServlet implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2602737732876920278L;
	@Inject
	private DateBC service;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.println("La fecha en Asunción es: "
				+ service.getCurrentDate("America/Asuncion"));
		out.println("La fecha en Alemania es: "
				+ service.getCurrentDate("Germany"));
		out.println("La fecha en America/New_York es: " + service.getCurrentDate("America/New_York"));
		out.close();
	}
}
