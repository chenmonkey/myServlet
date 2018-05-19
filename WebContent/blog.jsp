<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.*"%>
<%@ page import="entities.Comments" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的博客</title>
<script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="js/myServlet.js"></script>
<style type="text/css">
ul {list-style: none;} /*  去掉ul标签默认的点样式  */
a{text-decoration:none;font-size:18px;}
*{margin:0;padding:0;}
/*
*左半边div
*/
#all-left{position:relative;width:40%;height:600px;float:left;text-align:center;
background:url(images/timg.jpg);background-size:100% 100%;background-repeat:no-repeat;}
/*
*博客div
*/
#blog{position:absolute;width:100%;height:100%;background:white;opacity:0.75;text-align:center;}
/*
*博客div的上部分，显示头像和个人介绍
*/
#blog-top{margin-bottom:40px;}
#sculpture{position:relative;width:100px;height:100px;margin:auto;border-radius:50%;background:url(images/me.jpg);
background-size:100%;background-position:center;}
#introduce p{font-family:楷体;font-size:20px;color:#616130;}
#youke{font-size:28px;text-align:left;font-family:华文楷体;margin-left:30px;}
/*
*博客div的中部css,显示留言
*/
#displayComments{position:relative;}

/*
*右半部分div
*/
#all-right{position:relative;width:60%;height:600px;float:right;text-align:center;background-color:#f0f0f0;}
#all-right p{font-size:24px;font-family:华文楷体;margin-top:100px;}
/*
*留言板的div
*/
#message{position:relative;width:500px;height:280px;border-radius:5px;left:50%;margin-left:-250px;margin-top:10px;background-color:white;}
#uimg{width:45px;height:40px;padding-top:10px;margin-left:20px;float:left;}
#uimg img{position:relative;width:40px;height:40px;border-radius:50%;}
#uname{position:relative;padding-top:20px;margin-left:20px;margin-bottom:10px;text-align:left;float:float;}
#spell{position:relative;margin-left:65px;margin-bottom:20px;padding-top:20px;text-align:left;}
#spell textarea{width:400px;height:120px;}
#bctton{position:relative;margin:auto;}
</style>

<script type="text/javascript">

$(document).ready(function(){
	$.saveClick();
});
</script>

</head>
<body>
<form name="com" id="com" method="post" action="display">
<div id="all-left">
<div id="blog"><!-- 博客的整个div布局 -->
<div id="blog-top"><!-- div的上部分----包含个人图片和自我说明 -->
<div id="sculpture"></div><!-- 个人图像 -->
<div id="introduce"><!-- 自我介绍 -->
<h3>陈孟齐的博客<br />
   Chen's&nbsp;Blog</h3><br />
 <p>我是一名信管专业的大三的学生，爱学习也爱生活。</p>
</div>
</div>


<p id="youke">游客留言</p><br>
<c:if test="${!empty list}">
<table border="1px" style="border-collapse:collapse;" width="400px" align="center">
 <tr>
    <th width="100px">称呼</th>
    <th width="300px">留言内容</th>
 </tr>
 <c:forEach items="${list}" var="list">
 <tr>
 <td>${list.name}</td>
 <td>${list.content}</td>
 </tr>
 </c:forEach>
</table>
</c:if>
</div>
</div>

<div id="all-right">
<p>留言板</p>

<div id="message"><!-- 写留言的div(隐藏) -->
<div id="uimg"><img src="images/eiffel.jpg" id="toux" name="toux"></div>
<div id="uname"><!-- 输入称呼的div -->
<label>请输入你的称呼：</label><input type="text" id="name" name="name"><br />
</div>
<div id="spell"><!-- 写留言的div -->
<label>输入留言内容：</label><br />
<textarea rows="5" cols="10" id="content" name="content"></textarea>
</div>
<div id="bctton"><!-- 保存按钮的div -->
<input type="submit" id="save" value="发表留言" >
</div>
</div>
</div>
</form>
</body>
</html>