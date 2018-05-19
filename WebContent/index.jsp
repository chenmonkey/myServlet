<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Monkey的小站</title>
<script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="js/myServlet.js"></script>
<style type="text/css">
*{margin:0px;padding:0px;}
ul{list-style:none;}

/*头部*/
#head{position:absoulute;width:100%;height:60px;text-align:center;background:#f3f3fa;}
#head-left{position:relative;width:60%;float:left;height:60px;line-height:60px;}
#head-title{font-size:30pt;filter:shadow(color=black);color:#ff7575;font-family:华文彩云;}
#head-right{position:relative;width:38%;float:left;height:60px;}
#searchView{position:relative;width:200px;height:40px;float:left;top:50%;margin-top:-20px;
border-radius:5px 0 0 5px;border:1px solid #e0e0e0;background-color:#fcfcfc;}
#searchWord{position:relative;width:40px;height:40px;line-height:40px;float:left;top:50%;margin-top:-20px;
border-radius:0 5px 5px 0;border:1px solid #fcfcfc;background-color:#bebebe;
font-family:幼圆;}
input:-moz-placeholder,   
textarea:-moz-placeholder {color: #999999;}     
input:-ms-input-placeholder,   
textarea:-ms-input-placeholder {color: #999999;}   
input::-webkit-input-placeholder,   
textarea::-webkit-input-placeholder {color: #999999;}  

/*菜单导航栏*/
#nav{width:100%;height:60px;background:#1e90ff;}
#nav ul li{position:relative;float:right;line-height:60px;text-align:center;z-index:999;}
#nav ul li:hover{background:#ffbd9d;}
#nav ul li a{text-decoration:none;padding:0 20px;color:white;font-size:20px;}
#nav ul li ul{position:absolute;display:none;background:#1e90ff;width:100%;}
#nav ul li ul li{float:none;line-height:30px;border-top:1px solid #1e90ff;}
#nav ul li ul li a{color:white;}
#nav ul li ul li a:hover{background:#ffbd9d;}
#nav ul li:hover ul{display:block;}

/*中心板块*/
/*风景美照*/
#main{position:absolute;width:100%;}
#centerPlate{position:relative;width:60%;height:340px;float:left;}
#scenery-head{position:relative;background:#fbfffd;border:1px;
border-radius:10px 10px 0 0;width:100%;float:left;height:40px;line-height:40px;}
#scenery-nav{color:#ff8f59;font-size:24px;font-weight:600;font-family:华文行楷;}
#sceneryImg{position:relative;width:100%;height:300px;}
#sceneryImg img{width:100%;height:100%;}

/*推荐板块*/
#rec{position:relative;width:40%;height:340px;float:right;background:#f3f3fa;z-index:0;}
#rec-head{position:relative;background:#f3f3fa;border:1px;
border-radius:10px 10px 0 0;width:100%;float:right;height:40px;line-height:40px;
border-bottom:1px solid #ff8f59;}
#rec-head a{text-decoration:none;color:#ff8f59;font-size:24px;font-weight:600;font-family:华文行楷;}
#rec-con{position:relative;width:100%;height:300px;padding-top:50px;}
#rec-con ul li{padding:36px 10px 0 8px;}
#rec-con ul li a{text-decoration:none;color:#6c6c6c;font-size:18px;}
#rec-con ul li a:hover{color:#00bb00;}
#english{font-family:Times New Roman;}
#chinese{font-family:"楷体";}
#time{float:right;}


/*作品展示模块*/
#worksDisplay{position:relative;width:100%;height:200px;}
#worksHead{position:relative;width:6%;height:200px;float:left;background:#ffbd9d;border-top:5px solid #ffbd9d;}
#pWorks{position:relative;background:#f3f3fa;width:30px;height:120px;top:50%;left:50%;margin:-60px 0 0 -15px;font-family:楷体;font-size:24px;text-align:center;}
#imgDisplay1{position:relative;width:40%;height:200px;float:left;border-top:5px solid #ffbd9d;}
#imgDisplay1 img{width:100%;height:100%;}
#imgDisplay2{position:relative;width:27%;height:200px;float:left;border-top:5px solid #ffbd9d;}
#imgDisplay2 img{width:100%;height:100%;}
#imgDisplay3{position:relative;width:27%;height:200px;float:left;border-top:5px solid #ffbd9d;}
#imgDisplay3 img{width:100%;height:100%;}
#imglabel{position:absolute;width:100%;height:200px;background:black;opacity:0.75;text-align:center;display:none;left:0;top:0;}
#imglabel span{display:inline-block;margin-top:50px;size:14px;font-family:楷体;}
#imgDisplay1:hover #imglabel{display:block;}
#imgDisplay2:hover #imglabel{display:block;}
#imgDisplay3:hover #imglabel{display:block;}
</style>

<script type="text/javascript">
//centerPlate板块图片轮播
$.switchP();
</script>
</head>

<body>
<!--网站标题+搜索框  -->
<div id="head">
<div id="head-left"><b id="head-title">Monkey小站</b></div>
<div id="head-right"><input type="text" id="searchView" placeholder="请输入关键字">
<div id="searchWord">搜索</div>
</div>
</div>


<!-- 菜单导航栏 -->
<div id="nav">
<ul>
<li><a href="#">未来规划</a></li>
<li><a href="#">文字小秀</a>
  <ul>
     <li><a href="#">技术类</a></li>
     <li><a href="#">文学类</a></li>
  </ul>
  </li>
<li><a href="blog.jsp">我的小博</a></li>
<li><a href="index.jsp">我的主页</a></li>
</ul>
</div>

<!-- 中心板块，包括“风景美照”和“个人基本信息” -->
<div id="main">
 <div id="centerPlate">
   <div id="scenery-head"><p id="scenery-nav">最爱<span>@</span>一抹时光</p></div>
   <div id="sceneryImg"><img id="imgs" src="images/scenery1.jpg" alt="风景美照1"> </div>
 </div>
 <div id="rec">
  <div id="rec-head"><a href="">推荐阅读</a></div>
  <div id="rec-con">
    <ul>
     <li><a href="#"><strong><span id="english">Spring Tools Suites(STS)</span><span id="chinese">的下载与安装</span></strong></a>            <span id="time">2018-04-18</span></li>
     <li><a href="#"><strong><span id="english">postgresql</span><span id="chinese">的下载与安装</span></strong></a>                          <span id="time">2018-04-16</span></li>
     <li><a href="#"><strong><span id="english">GIT</span><span id="chinese">的下载与安装</span></strong></a>                                 <span id="time">2018-04-16</span></li>
     <li><a href="#"><strong><span id="chinese">下载安装</span><span id="english">jdk</span><span id="chinese">并配置环境</span></strong></a>  <span id="time">2018-04-16</span></li>
     <li><a href="#"><strong><span id="chinese">下载安装</span><span id="english">Tomcat8.5.30</span></strong></a>                            <span id="time">2018-04-16</span></li>
    </ul>
  </div>
 </div>
 <div id="worksDisplay">  
  <div id="imgDisplay1"><img id="img1" src="images/blog.jpg">
    <a href="#">
       <div id="imglabel" ><span>功能：留言板<br>语言：html、css、js<br>数据库：postgresql<br>框架：MVC<br></span></div>
    </a>
  </div>
  <div id="imgDisplay2"><img  src="images/work.jpg">
    <a href="#">
       <div id="imglabel" ><span>功能：网页展示<br>语言：html、css、js<br>框架：bootstrap<br></span></div>
    </a>
  </div>
  <div id="imgDisplay3"><img src="images/java.jpg">
    <a href="#">
       <div id="imglabel" ><span>功能：数据库的增删改查<br>语言：java<br>数据库：postgresql<br></span></div>
    </a>
  </div>
  <div id="worksHead"><div id="pWorks">作品展示</div></div>
 </div>
</div>
</body>
</html>