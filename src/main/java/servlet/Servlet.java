package servlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistence.Person;
import persistence.PersonRepository;
import service.Service;

@WebServlet("/index")
public class Servlet extends HttpServlet{
	
	@Override
	  public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException, ServletException {
	    httpServletResponse.setContentType("text/html;charset=utf-8");
	    httpServletResponse.setStatus(HttpServletResponse.SC_OK);
	    httpServletRequest.getRequestDispatcher("/index.jsp").forward(httpServletRequest, httpServletResponse);
	  }
	
	@Override
	public void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException, ServletException{
		
		String name=httpServletRequest.getParameter("name");
		String email=httpServletRequest.getParameter("email");
		
		Person person=new Person(name,email);
		Service service=new Service();
		service.add(person);
	}
}
