<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'alert.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="statics/js/jquery-1.8.3.min.js"></script>
	<script type="text/javascript">
		$(function(){
		 
		});
	</script>
  </head>
  
  <body>
  <div id="search">
   <form action="${pageContext.request.contextPath}/game/SelectToName" method="post">
   	<div>
  	 <input type="text" id="userCodes" name="gameName" height="50px" width="200px">
  	 <input type="submit" value="搜索">
  	</div>
  	<table id="userRoles" style="position: absolute;background-color: white;" height="50px" width="200px">
   		
   	</table>
   	
  </form>
  </div>
  
   	<script type="text/javascript" src="statics/js/demo.js"></script>
  </body>
</html>
