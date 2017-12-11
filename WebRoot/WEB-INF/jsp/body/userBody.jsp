<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'userBody.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
	
	 a{
	 			font-size: 17px;
	 			font-family: "微软雅黑";
	 			text-decoration: none;
				color: white; 
	 		}
	 		a:hover{
			color: cornflowerblue;
			}
			li{
				margin-top: 50px;
			}
	
	</style>
  </head>
  
  <body style="background-image: url('statics/suCai/timg (1).jpg');">
    <div>
    	
    	<div>
    	<c:forEach var="iamRole"  items="${ErJiRole}" >
			<c:if test="${iamRole.jLive==1}">
			<div>
				<li class="youxiala"><a href="<%=basePath%>${iamRole.jLocation}?songId=${iamRole.jId}" target="Bow">${iamRole.jName}</a> </li>
			</div>
			</c:if>
		</c:forEach>
    	</div>
    </div>
  </body>
</html>
