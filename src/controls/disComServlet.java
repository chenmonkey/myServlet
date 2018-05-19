package controls;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import daos.DaoFactory;
import entities.Comments;


@WebServlet(asyncSupported = true, urlPatterns = { "/display" })
public class disComServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public disComServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  request.setCharacterEncoding("utf-8");
	  response.setCharacterEncoding("text/html;charset=utf-8");
	  String name=request.getParameter("name");
	  String content=request.getParameter("content");
	  List<Comments> list=DaoFactory.INSTANCE.displayComments();
	  Comments comments=new Comments();
	  comments.setName(name);
	  comments.setContent(content);
	  list.add(comments);
	  request.setAttribute("list", list);
	  RequestDispatcher rd=request.getRequestDispatcher("blog.jsp");   
	  rd.forward(request,response);
	  
	}

}
