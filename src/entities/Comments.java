package entities;

/*
 * 游客留言实体类
 */
public class Comments {
private String name;
private String content;

public Comments() {
   super();	
}


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getContent() {
	return content;
}

public void setContent(String content) {
	this.content = content;
}

}
