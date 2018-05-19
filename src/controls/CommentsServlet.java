package controls;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import daos.DaoFactory;
import entities.Comments;


@WebServlet(asyncSupported = true, urlPatterns = { "/comments" })
public class CommentsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public CommentsServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("text/html;charset=utf-8");
		Comments comments=new Comments();
        comments.setName(request.getParameter("name"));
        comments.setContent(request.getParameter("content"));
        int tag=DaoFactory.INSTANCE.saveComments(comments);
        ObjectMapper om=new ObjectMapper();//objectMapper类将转换成java对象匹配JSON结构
        response.getWriter().print(om.writeValueAsString(tag));
        //respomse.getWriter()向jsp界面输出字符串
        
            
	}
}
