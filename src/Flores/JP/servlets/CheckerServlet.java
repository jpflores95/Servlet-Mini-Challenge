package Flores.JP.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckerServlet
 */
@WebServlet("/Checker")
public class CheckerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//check if user has logged in
		Cookie[] cookieList = request.getCookies();
		
		String color = "red";
		String font = "black";
		String bg = "blue";
		
		for(Cookie c: cookieList){
			if(c.getName().equals("color")){
				color = c.getValue();
			
			}
			else if (c.getName().equals("font"))
			{
				font = c.getValue();
			}
			
			else if(c.getName().equals("bg"))
			{
				bg = c.getValue();
			}
		}
		
		request.getSession().setAttribute("color", color);
		request.getSession().setAttribute("font", font);
		request.getSession().setAttribute("bg", bg);
		request.getRequestDispatcher("index.jsp").forward(request,response);
			
	
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
