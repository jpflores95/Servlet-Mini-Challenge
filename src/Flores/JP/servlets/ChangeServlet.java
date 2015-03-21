package Flores.JP.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ChangeServlet
 */
@WebServlet("/pref")
public class ChangeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String color = request.getParameter("color");
		String font = request.getParameter("font");
		String bg = request.getParameter("bg");
		
		HttpSession session = request.getSession();
		session.setAttribute("color",color);
		session.setAttribute("font",font);
		session.setAttribute("bg",bg);
		
		//cookie
		Cookie c = new Cookie("color",color);
		Cookie c1 = new Cookie("font",font);
		Cookie c2 = new Cookie("bg",bg);
		
		c.setMaxAge(60*60*60);
		response.addCookie(c);
		c1.setMaxAge(60*60*60);
		response.addCookie(c1);
		c2.setMaxAge(60*60*60);
		response.addCookie(c2);
		
		request.getRequestDispatcher("index.jsp").forward(request,response);
				
	}

}
