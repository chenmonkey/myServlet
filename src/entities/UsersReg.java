package entities;

import java.util.Date;

//用户注册实体类
public class UsersReg {
private String username;//用户名
private String mypassword;//密码
private String email;//电子邮箱
private String gender;//性别
private Date birthday;//出生日期
private String[] favorite;//爱好（爱好有多种，用字符串表示）
private String introduce;//自我介绍
private boolean isAccept;//是否接受协议

/*
* 保留不带参数的构造方法
*/
public UsersReg() {
	
}

public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getMypassword() {
	return mypassword;
}
public void setMypassword(String mypassword) {
	this.mypassword = mypassword;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public Date getBirthday() {
	return birthday;
}
public void setBirthday(Date birthday) {
	this.birthday = birthday;
}
public String[] getFavorite() {
	return favorite;
}
public void setFavorite(String[] favorite) {
	this.favorite = favorite;
}
public String getIntroduce() {
	return introduce;
}
public void setIntroduce(String introduce) {
	this.introduce = introduce;
}
public boolean isAccept() {
	return isAccept;
}
public void setAccept(boolean isAccept) {
	this.isAccept = isAccept;
}

}
