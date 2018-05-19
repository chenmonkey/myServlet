package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entities.Comments;
import tools.DBManager;

public class CommentsDao{
	 //保存游客留言
	  public int saveComments(Comments comments) {
		  int tag=-1;//假设初始时留言不成功
		  Connection conn=null;
		  try {
			  if(comments.getName().equals("")||comments.getContent().equals("")) {
			  }else {
				  conn=DBManager.INSTANCE.getConnection();
				  String sql="insert into comments(name,content) values(?,?)";
				  PreparedStatement ps=conn.prepareStatement(sql);
				  ps.setString(1, comments.getName());
				  ps.setString(2, comments.getContent());
				  tag=ps.executeUpdate();
				  ps.close();
			  }
		  }catch(Exception e) {
			  
		  }finally {
			  DBManager.INSTANCE.closeConnection(conn);
		  }
		return tag;
	  }
	  
	  //显示游客留言
	  public List<Comments> displayComments() {
		Connection conn=null;
		List<Comments> list=new ArrayList<Comments>();//调用list接口下的ArrayList实现类，将数据存入集合中
		Comments comments=null;
		try {
			conn=DBManager.INSTANCE.getConnection();
			String sql="select name,content from comments";
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				String name=rs.getString("name");
				String content=rs.getString("content");
				comments=new Comments();
				comments.setName(name);
				comments.setContent(content);
				list.add(comments);
			}
			rs.close();
			ps.close();
		}catch(Exception e) {
			DBManager.INSTANCE.closeConnection(conn);
		}
		return list;

	  }
	}
