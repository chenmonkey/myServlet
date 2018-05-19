package servletTest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest requset, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("获得Get()请求方式");
		PrintWriter out=response.getWriter();//
		response.setContentType("text/html;charset=utf-8");
		out.println("<strong>HelloServlet</strong><br />");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("获得Post()请求方式");
		PrintWriter out=response.getWriter();
		response.setContentType("text/html;charset=utf-8");
		out.println("<strong>HelloServlet</strong><br />");
		
	}

}
