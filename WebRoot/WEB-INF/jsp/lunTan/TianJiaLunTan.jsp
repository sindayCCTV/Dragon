
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>TianJiaLUNTAN</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script  type="text/javascript" src="statics/js/jquery-1.8.3.min.js">
	 </script>
	<script type="text/javascript">
	 $(function(){
	 
	    $(function(){
		  		$('#biaoqin').hover(function(){
		  	 		 
		  			$('#biaoqintab').css('display','block');
		  		},function(){
		  			$('#biaoqintab').css('display','none');
		  		});
		  		
		  		$('.biaox').click(function(){
		  			var iamclik=$(this).attr('alt');
		  			var inps= $('#texts').val();
		  			inps=inps+'*'+iamclik+'*';
		  			$('#texts').val(inps);
		  		})
		  });
	});
		 </script>
		  
  </head>
 
 	<body style="background-image: url(images/beijingtu.png);color: yellow;">
		<div align="center">
		<form action="<%=basePath%>${SanJiRole[0].jLocation}" method="post" enctype="multipart/form-data">
			 <table>
			 	<tr>
			 	<td>帖子名称:</td>
			 	<td><input type="text" name="lTName">  </td>
			 	</tr>
			 	
			 	<tr>
			 	<td>帖子权限:</td>
			 	<td><select name="lTWhoSee" style="width: 200px;height: 30px;background-color: #286090;color: #ADADAD;position: relative;left: 0px;">
						<option value="1">所有人可见</option>
						<option value="2">仅好友</option>
						<option value="3">仅自己</option>
					</select>
					</td>
			 	</tr>
			 	
			 	<tr>
			 	<td>帖子展示图片:</td>
			 	<td><input type="file" name="s_userPortrait"> </td>
			 	</tr>
			 	
			 	<tr>
			 	<td>帖子封面:</td>
			 	<td><input type="file" name="s_userPortrait"> </td>
			 	</tr>
			 	
			 	<tr>
			 	<td>帖子类容:</td>
			 	<td>
				表情:
				<div id="biaoqin">
				<table id="biaoqintab" style="display: none;position: absolute;top: 50px;background-color: wheat;">
					<tr>
						<td><img class="biaox" alt="g{Sg1}.png" src="statics/biaoQing/g{Sg1}.png" width="30px" /> </td>
						<td><img class="biaox" alt="g{Sg2}.png" src="statics/biaoQing/g{Sg2}.png" width="30px" /></td>
						<td><img class="biaox" alt="g{Sg3}.png" src="statics/biaoQing/g{Sg3}.png" width="30px" /></td>
						<td><img class="biaox" alt="g{Sg4}.png" src="statics/biaoQing/g{Sg4}.png" width="30px" /></td> 
					</tr>
					
					
					<tr>
						<td><img class="biaox" alt="g{Sg5}.png" src="statics/biaoQing/g{Sg5}.png" width="30px" /></td>
						<td><img class="biaox" alt="g{Sg6}.png" src="statics/biaoQing/g{Sg6}.png" width="30px" /></td>
						<td><img class="biaox" alt="g{Sg7}.png" src="statics/biaoQing/g{Sg7}.png" width="30px" /></td>
						<td><img class="biaox" alt="g{Sg8}.png" src="statics/biaoQing/g{Sg8}.png" width="30px" /></td> 
					</tr>
					
					
					<tr>
						<td><img class="biaox" alt="g{Sg9}.png" src="statics/biaoQing/g{Sg9}.png" width="30px" /></td>
						<td><img class="biaox" alt="g{Sg10}.png" src="statics/biaoQing/g{Sg10}.png" width="30px" /></td> 
					</tr>
				</table>
				<span id="a1007">OVO</span>
				</div>
						
				 </td>
				
			 	</tr>
			 	
			 	
			 	<tr>
			 	<td colspan="2"><textarea name="lTtext" style="width: 500px;height: 100px;" id="texts"></textarea> </td>
			  
			 	</tr>
		 
			 <tr>
			 	<td colspan="2">
			 		<input type="submit" value="提交帖子相关信息">
			 	</td>
			 </tr>
			 
			 
			 </table>
			 
 
		</form>
		</div>
	</body>
</html>
