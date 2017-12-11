<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'userList.jsp' starting page</title>
    
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
			td {
				text-align:center;
				}
			table{border-collapse: collapse;}
			  .trs{
    			border:1px solid #000;
    			 
				}
			
	</style>
	 
	
  </head>
  
  <body  style="background-color: #FFFACD">
     
      
            <table  class="providerTable" cellpadding="0" cellspacing="0">
                <tr  height="50px">
                	<td style="font-weight: 900;"  width="5%"></td>
                    <td style="font-weight: 900;" width="10%">用户ID</td>
                    <td style="font-weight: 900;" width="10%">用户账号</td>
                    <td style="font-weight: 900;" style="font-weight: 900;" width="10%">用户名称</td>
                    <td style="font-weight: 900;" width="5%">性别</td>
                    <td style="font-weight: 900;" width="5%">年龄</td>
                    <td style="font-weight: 900;" width="5%">电话</td>
                    <td style="font-weight: 900;" width="10%">用户角色</td>
                    <td style="font-weight: 900;" width="30%">操作</td>
                </tr>
                 
                   <c:forEach var="user" items="${userList}" varStatus="status">
					<tr class="trs" >
						<td>
						<span><img alt="${user.userName}的头像" src="<%=basePath%>${user.userPortrait}" width="60px" height="60px"></span>
						</td>
						<td>
						<span>${user.userId}</span>
						</td>
						<td>
						<span>${user.userCode}</span>
						</td>
						<td>
						<span>${user.userName}</span>
						</td>
						<td>
							<span>
								${user.userSex}
							</span>
						</td>
						<td>
						<span>${user.age}</span>
						</td>
						<td>
						<span>${user.userPhone}</span>
						</td>
						<td>
							<span>${user.userRole}</span>
						</td>
						<td>
						<span><a class="viewUser" href="javascript:;" userid=${user.userId } username=${user.userCode }><img src="${pageContext.request.contextPath }/statics/images/read.png" alt="查看" title="查看"/></a></span>
						<span><a class="modifyUser" href="javascript:;" userid=${user.userId } username=${user.userCode }><img src="${pageContext.request.contextPath }/statics/images/xiugai.png" alt="修改" title="修改"/></a></span>
						<span><a class="deleteUser" href="javascript:;" userid=${user.userId } username=${user.userCode }><img src="${pageContext.request.contextPath }/statics/images/schu.png" alt="删除" title="删除"/></a></span>
						</td>
					</tr>
				</c:forEach>
			</table>
  </body>
</html>
