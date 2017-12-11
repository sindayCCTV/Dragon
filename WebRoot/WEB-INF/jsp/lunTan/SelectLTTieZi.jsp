<%@page import="Dragon.sinday.pojo.LTanComment"%>
<%@page import="Dragon.sinday.pojo.User"%>
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
    
    <title>My JSP 'SelectLTTieZi.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
	<script  type="text/javascript" src="statics/js/jquery-1.8.3.min.js">
	</script>
	<script type="text/javascript">
		$(function(){
		
			  
		 $('.pl').each(function(index){
		 	 
		 	  
		 	   var texts=$(this).text();
		   var str="{Sg"; 
			var thisisT="";
			 var images=texts.split("*"); 
			  for (var iams in images) {
		 	 
		 	 
			if(images[iams].indexOf(str)>0){
				 
				thisisT=thisisT+"<img width='80px'   src='<%=basePath %>statics/biaoQing/"+images[iams]+"' />";
			}else{
				 thisisT=thisisT+images[iams];
			}
			  $(this).html("");
		     $(this).html(thisisT);
		 
		 } 
		 
		});
		
		})
	
	</script>
  </head>
  
  <body style="background-image: url('statics/lunTanImage/beijingtu.png');">
    <div>
    	<table align="center" border="1px" width="100%">
			 	<tr  style="background-image: url(images/longWenBeiJing.jpg);">
			 		<td width="10%" colspan="2"><img src="<%=basePath %>${ltUser.userPortrait}" style="width: 120px;height: 120px;" /> </td>
			 		<td rowspan="5" width="800px">
			 			<span  align="center" style="color:#000000;background-color: #ADADAD;opacity: 0.7;height: 80px;font-size: 40px;">
			 			${oneLT.lTName} 
			 			</span> 
			 			<span><h3 class="pl" style="color: #269ABC;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			 				${oneLT.lTtext} 
			 			</h3> </span>
			 			<c:if test='${oneLT.images!=""}'>
			 			<img src="<%=basePath %>${oneLT.images} " />
			 			</c:if>
			 		</td>
			 		 
			 	</tr>
			 	<tr>
			 	
			 		<td style="color: #2E6DA4;font-weight: 800;">贴主：</td><td align="center" style="color: red;">${ltUser.userName}</td>
			 		
			 	</tr>
			 	<tr>
			 		<td style="color: #2E6DA4;font-weight: 800;">性别：</td><td align="center" style="color: red;">${ltUser.userSex}</td>
			 	</tr>
			</table>
			
			<%
			 List<User> user_gaiComm=
			 (List<User>)request.getAttribute("user_gaiComm");
			 List<LTanComment> gaiComm=
			 (List<LTanComment>)request.getAttribute("ltComm");
				for(LTanComment lt:gaiComm){
					for(User usr:user_gaiComm){
						if(usr.getUserCode().equals(lt.getC_userCode())){
					
				%>
    	 
    				<table align="center" border="1px" width="100%">
			 	<tr  style="background-image: url(images/beijingHuaWen.jpg);">
			 	
			 		<td width="10%" colspan="2"><img src="<%=basePath %><%=usr.getUserPortrait() %>" style="width: 120px;height: 120px;" /> </td>
			 		
			 		<td rowspan="5" width="800px">
			 			<span    style="color:#000000;background-color: #ADADAD;opacity: 0.7;height: 80px;font-size: 20px;position: relative;left: 5%;">
			 				 评论于:<%=lt.getcTime() %>
			 			</span> 
			 			<span><h3 class="pl" style="color: #269ABC;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			 				
			 				  <%=lt.getcText() %>
			 			</h3> </span>
			 			 
			 			 <%
			 			 	if(!lt.getImages().equals("")&&lt.getImages()!=null){
			 			 	 
			 			 	%>
			 			 	<img src="<%=basePath %><%=lt.getImages() %>" />
			 			 	<%
			 			 	}
			 			  %>
			 				

			 						
			 				

			 			 
			 		
			 		</td>
			 		 
			 	</tr>
			 	<tr>
			 		<td style="color: #2E6DA4;font-weight: 800;">来者：</td><td align="center" style="color: #146EB4;"><%=usr.getUserName() %></td>
			 		
			 	</tr>
			 	<tr>
			 		<td style="color: #2E6DA4;font-weight: 800;">性别：</td><td align="center" style="color: #146EB4;"><%=usr.getUserSex()%></td>
			 	</tr>
			</table>
    			    
    		<%
					}
					}
				}
			
			 %>
    
    </div>
  </body>
</html>
