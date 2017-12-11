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
  <script type="text/javascript">
		$(function(){
		
	 
	 
		var indexs=0;
		$('#jia').click(function(){
		 		 indexs=indexs+1;
		 		 
		 		 if(indexs<=8){
		 		 var domcs="#"+indexs;
		 		 $(domcs).show();
		 	 
		 		 }else{
		 		  indexs=0;
		 		 	
		 		 }
	
		 		});
		 	
		 		
		 	});
</script>
  
  
   <script src="statics/js/calendar/WdatePicker.js"></script>
  </head>
  
  <body style="background-image: url('statics/suCai/timg (2).jpg');">
 	
   
    <form action="<%=basePath%>game/doAddGame" method="post" enctype="multipart/form-data">
  	<table style="color: yellow;margin-left: 200px">
   
    	<tr>
    	<td>游戏名称</td>
    	<td><input type="text" name="gameName" id="gameName"></td>
    	</tr>
    	<h4 style="color: red;" id="ErrorsCode"></h4>
    	<tr>
    	<td>游戏介绍</td>
    	<td><input type="text" name="introduce" id="introduce" height="200px"></td>
    	</tr>
    	 
    	<td>打折百分比</td>
    	<td><select name="discount">
    		<option selected="selected" value="10">不打折</option>
    		<option   value="9">9折</option>
    		<option   value="8">8折</option>
    		<option   value="7">7折</option>
    		<option   value="6">6折</option>
    		<option   value="5">5折</option>
    		<option   value="4">4折</option>
    		<option   value="3">3折</option>
    		<option   value="2">2折</option>
    		<option   value="1">1折</option>
    		</select>
    	</td>
     </tr>
     <tr>
     	<td>是否封禁地区/国家</td>
     	<td>
     		<select id="a_countrys" name="countryNotVIP">
     			 
     		</select>
     	</td>
     </tr>
     <tr>
     	<td>是否限制年龄</td>
     	<td>
     		开启限制<input name="ageBans" type="radio" value="1">
     		 不 限 制<input name="ageBans" type="radio" value="9999">
     	</td>
     </tr>
     
     
        <tr>
    	<td>价格</td>
    	<td><input type="text" name="gamePrice" id="gamePrice"></td>
    	</tr>
    	<tr>
    	<td>腾讯视频vid(有多个请用英文逗号隔开：记住是英文逗号！)</td>
    	<td><input type="text" name="video" id="video"></td>
    	</tr>
    	<tr>
    	<td>下载地址</td>
    	<td><input type="text" name="download" id="download"></td>
    	</tr>
    	
    	<tr>
    	<td>当前版本</td>
    	<td><input type="text" name="edition" id="edition"></td>
    	</tr>
    	
    	<tr>
    	<td>首页显示图片(500KB)</td>
    	<td><input type="file" id="a_userPortrait" name="a_userPortrait"></td>
  		</tr>
  		<tr>
  		<td> 商店页面显示图片</td>
    	 <td><input  type='file'   name='s_userPortrait'></td>
			  
    	 <td><img  id='jia' width="20px" height="20px" src="<%=basePath%>/statics/meiHuaImage/BodyForCrop9.png"></td>
    	 
    	 </tr>
    	 <tr><td></td><td  id='1'  style='display: none'><input type='file'   name='s_userPortrait'><button class='jian' onclick='$(this).parent().parent().remove();'>-</button></td></tr>
  		<tr><td></td><td  id='2'  style='display: none'><input type='file'  name='s_userPortrait'><button class='jian' onclick='$(this).parent().parent().remove();'>-</button></td></tr>
  		<tr><td></td><td  id='3'  style='display: none'><input type='file'  name='s_userPortrait'><button class='jian' onclick='$(this).parent().parent().remove();'>-</button></td></tr>
  		<tr><td></td><td  id='4'  style='display: none'><input type='file'  name='s_userPortrait'><button class='jian' onclick='$(this).parent().parent().remove();'>-</button></td></tr>
  		<tr><td></td><td  id='5'  style='display: none'><input type='file'  name='s_userPortrait'><button class='jian' onclick='$(this).parent().parent().remove();'>-</button></td></tr>
  		<tr><td></td><td  id='6'  style='display: none'><input type='file'  name='s_userPortrait'><button class='jian' onclick='$(this).parent().parent().remove();'>-</button></td></tr>
  		<tr><td></td><td  id='7'  style='display: none'><input type='file'  name='s_userPortrait'><button class='jian' onclick='$(this).parent().parent().remove();'>-</button></td></tr>
  		<tr><td></td><td  id='8'  style='display: none'><input type='file'  name='s_userPortrait'><button class='jian' onclick='$(this).parent().parent().remove();'>-</button></td></tr>
    	   
    	<tr>
    		<td>分类:</td>
    		<td></td>
    	</tr>
    	
    	<tr>
    	<td>
    	<input type="text" id="jiazaiDIY">
    	<span style="color: red;" id="beError"></span>
    	</td>
    		<td>添加自定义标签
    		<img  id='jiaDiy' width="20px" height="20px" src="<%=basePath%>/statics/meiHuaImage/BodyForCrop9.png">
    		</td>
    		
    	</tr>
    	
    	
    	<tr>
    		 <td id="classL5"></td>
    		<td id="classF5"></td>
    	</tr>
    	<tr>
    		<td colspan="3">
    		 <div  style="border: solid 1px royalblue;height: 100px;" id='gooddiv'>
 			 	<span id="100v"></span>
 			 </div>
 			 </td>
    	</tr>
    	
    		
    	<tr><td></td> <td><input id=""goAddSearchGame"" type="submit" value="提交"> </td></tr>
    	<tr><td><h4 id='ssb'>${ErrorFile}</h4></td></tr>
    	  </table>
    </form>
     
  		<script type="text/javascript" src="statics/js/goGameNameSearch.js"></script>
     		<script type="text/javascript" src="statics/js/country.js"></script>
     	   <script type="text/javascript" src="statics/js/gameLabeLonding.js"></script>
    	  <script type="text/javascript" src="statics/js/userAdd.js"></script>
  </body>
</html>
