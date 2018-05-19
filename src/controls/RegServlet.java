package controls;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.UsersReg;

/**
 * 获取reg.jsp中表单的数据，实现页面的跳转
 */

@WebServlet(asyncSupported = true, urlPatterns = { "/reg" })
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * 不带参数的构造方法
     */
    public RegServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       UsersReg ur=new UsersReg();
       String username,mypassword,gender,email,introduce,isAccept;
       Date birthday;
       String[] favorites;
       
       SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");//将日期格式进行转换为字符串格式“yyyy年mm月dd日”
		try {
    	   username=request.getParameter("username");//将获得请求参数username传递给String类型变量username
    	   mypassword=request.getParameter("mypassword");
    	   gender=request.getParameter("gender");
    	   email=request.getParameter("email");
    	   introduce=request.getParameter("introduce");
    	   birthday=sdf.parse(request.getParameter("birthday"));//parse方法解析字符串
    	   if(request.getParameter("isAccept")!=null) 
    	   {
    	   isAccept=request.getParameter("isAccept");
    	   //用来获取多个复选按钮的值，返回的是一个字符串数组
    	   }else {
    		   isAccept="false";
    	   }
    	   favorites=request.getParameterValues("favorites");
    	   
    	   ur.setUsername(username);
    	   ur.setMypassword(mypassword);
    	   ur.setGender(gender);
    	   ur.setEmail(email);
    	   ur.setFavorite(favorites);
    	   ur.setIntroduce(introduce);
    	   if(request.getParameter("isAccept")!=null)
    	   {
    	   ur.setAccept(true);
    	   }else {
    		   ur.setAccept(false);
    	   }
    	   
    	   
    	   //把注册成功的用户对象保存在session
    	   request.getSession().setAttribute("regUsers",ur) ;	   
    	   //跳转到注册成功页面(实现服务器内部跳转方式实现页面跳转)//子目录路径跳转到外层目录，加上“..”
    	   request.getRequestDispatcher("../userinfo.jsp").forward(request, response);
       }catch(Exception ex) {
    	   ex.printStackTrace();
       }
	}

}
