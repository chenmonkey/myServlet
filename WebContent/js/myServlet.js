

//blog.jsp界面，当点击“发表留言”按钮时
$.saveClick=function(){
	$("#save").click(function(){
		$.ajax({
			url : "comments",
			type : "post",
			data : $("#com").serialize(),
			success : function(result) {
	  		    if (result == "1") {
				alert("留言发表成功！");
				} else {  
				alert("留言失败！");
				}
		}
		})
	})
	
}

//index.jsp页面，centerPlate板块图片轮播
$.switchP=function(){
	setInterval(test,3000);
	var index=0;
	var array=new Array("images/scenery1.jpg","images/scenery2.jpg",
			"images/scenery3.jpg","images/scenery4.jpg");
	function test(){
		var myimg=document.getElementById("imgs");
		if(index==array.length-1){
			index=0;
		}else{
			index++;
		}
		myimg.src=array[index];
	}
}