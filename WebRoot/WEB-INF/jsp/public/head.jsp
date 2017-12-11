<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
 <html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'head.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="statics/js/jquery-1.8.3.min.js"></script>
	<style type="text/css">
		.daonghangul{
	 			position: relative;top: 0px;left: 80px;
	 			list-style-type: none;padding-left: 0px;
	 			background-color: black;
	 				}
	 		
	 		.daonghangul li{
	 			float: left;margin-left: 20px;
	 		}
	 		 a{
	 			font-size: 17px;
	 			font-family: "微软雅黑";
	 			text-decoration: none;
				color: white; 
	 		}
	 		a:hover{
			color: cornflowerblue;
			}
			 .name{
	 		 	position: absolute;top: 91px;
	 		 	left: 220px;
	 		 	color:  #ADD8E6;
	 		 }
	 		 .name2{
	 		 	position: absolute;top: 120px;
	 		 	left: 225px;
	 		 	color:  #ADD8E6;
	 		 }
	 		
	</style>

  </head>
  
  <body style="background-image: url('statics/suCai/timg (2).jpg');">
   <div>
      <span class="name" style="font-size: 20px;font-weight: 800;">${userSession.userName}</span><br />
		 <span class="name2">${userSession.userCreed}</span>
	</div>
     <ul class="daonghangul" >
				<li ><a href="XiuGaiGeRenXinXi.jsp" target="Bow"> <img class="touxiang" width="100px" height="100px" src="<%=basePath%>${userSession.userPortrait}" /></a> </li>
					
					
						<c:forEach var="iamRole"  items="${myRole}" >
							<c:if test="${iamRole.jLive==0}">
						<li class="youxiala"><a href="<%=basePath%>${iamRole.jLocation}?songId=${iamRole.jId}" target="Bow">${iamRole.jName}</a> </li>
							</c:if>
						</c:forEach>
						
						 
			
						<li class="youxiala">
							<div id="search">
   							<form action="${pageContext.request.contextPath}/game/SelectToName" method="post">
  						 	<div>
  			 				<input type="text" id="userCodes" name="gameName" height="50px" width="200px">
  							 <input type="submit" value="搜索">
  							</div>
  						<table id="userRoles" style="position: absolute;background-color: white;" height="50px" width="200px">
   		
   						</table>
						
						</li>
	
	</ul>
	
	
	
	
		<script type="text/javascript" src="statics/js/demo.js"></script>
  </body>
 </html>
