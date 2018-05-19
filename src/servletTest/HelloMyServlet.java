package servletTest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class HelloMyServlet
 */
@WebServlet(asyncSupported = true, urlPatterns = { "/hello" })
public class HelloMyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloMyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("处理Get()请求。。。。");
		PrintWriter out=response.getWriter();//获得一个浏览器输出对象
		response.setContentType("text/html;charset=utf-8");//指定浏览器输出类型
		out.println("<strong>HelloServlet</strong><br />");	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("处理Post()请求。。。。");
		PrintWriter out=response.getWriter();//获得一个浏览器输出对象
		response.setContentType("text/html;charset=utf-8");//指定浏览器输出类型
		out.println("<strong>HelloServlet</strong><br />");	}

}
