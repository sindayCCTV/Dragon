<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'userAdd.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="statics/js/jquery-1.8.3.min.js"></script>
  
   <script src="statics/js/calendar/WdatePicker.js"></script>
  </head>
  
  <body>
  		
    <form action="<%=basePath%>user/addUser" method="post" enctype="multipart/form-data">
    	账号<input type="text" name="userCode" id="userCode">
    	<br>
    	<h4 id="ErrorsCode"></h4>
    	名称<input type="text" name="userName" id="userName">
    	<br><br>
    	性别 <input type="radio" name="userSex" value="男">男<input type="radio" value="女" name="userSex">女
    	<br><br>
    	交友信条
    	<input type="text" name="userCreed" id="userCreed" height="200px">
    	<br><br>
    
    	出生日期  <input name="userBirthday_a" class="Wdate" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd',readOnly:true})" />
		<br><br>
		您所在地区/国家
		<select id="u_countrys" name="userCountry">
     			 
     	</select>
     	<br><br>
    	密码<input type="text" name="userPwd"><br><br>
    	电话<input type="text" name="userPhone" id="userPhone"><br><br>
    	头像(500KB/正方形)<input type="file" id="a_userPortrait" name="a_userPortrait">
    	<br><br>
    	 
    	<h4 style="color: red;">${ErrorFile}</h4>
    	<br><br>
    	<input value="注 册" type="submit"> 
    </form>
    	<script type="text/javascript" src="statics/js/userAdd.js"></script>
    	<script type="text/javascript" src="statics/js/country.js"></script>
  </body>
</html>
