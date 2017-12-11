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
    
    <title>My JSP 'lunTanList.jsp' starting page</title>
    
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
	</style>
	<script  type="text/javascript" src="statics/js/jquery-1.8.3.min.js">
	
	</script>
	<script type="text/javascript">
		$(function(){ 
			$(".uuo").hover(function(){
			 
					 $(this).children("a").css('color','yellow');
					 $(this).css('border-color','white');
					  $(this).css('border-style','double');
				},function(){
				   $(this).children("a").css('color','white');
					$(this).css('border-color','yellow');
					  $(this).css('border-style','double');
				})
		})
	</script>
	
  </head>
  
  <body>
  
    <div style="margin-left: 100px;">
    
    <c:forEach var="lts"  items="${listLT}">
    	
    	<div class="uuo" style="margin-left:10px;margin-top: 20px;float: left;border:3px;border-color: yellow;border-style: double;">
    		<a style="display: block;" href="<%=basePath%>lunTan/goSeleOne?songId=${lts.lTid}">
    		<h3 style="font-weight: 900;" align="center" >${lts.lTName}</h3>
    	<h6 align="center"><img    style="height: 150px;"   src="<%=basePath%>${lts.faceIamge}">
    		</h6>	
    	 	<h5 align="center">${lts.userCode} 于  ${lts.newTimes} 发布</h6>
 
    		
    		</a>
    	</div>
    	
    </c:forEach>
    
    </div>
    
    
  </body>
</html>
