package daos;

import java.util.List;

import entities.Comments;

public class DaoFactory {
  public static DaoFactory INSTANCE;
  static {
	  INSTANCE=new DaoFactory();
  }
  private DaoFactory() {
		super();
	}
public int saveComments(Comments comments) {
	return new CommentsDao().saveComments(comments);
	
}
public List<Comments> displayComments() {
	return new CommentsDao().displayComments();
	
	
}
}
