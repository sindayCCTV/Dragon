<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <form action="${pageContext.request.contextPath}/dologin" method="post">
    	<div class="info">${error}</div>
    	<input type="text" class="input-text" id="userCode" name="userCode" placeholder="请输入用户名" />
		
		<input type="password" id="userPassword" name="userPassword" placeholder="请输入密码"  />		
		<input type="submit" >
    </form>
  
    
    <a href="${pageContext.request.contextPath}/user/toAddUser">没有账号？点我注册</a>
  </body>
</html>
