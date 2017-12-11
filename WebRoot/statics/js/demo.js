 
$(function(){
 
 
	

	 //输入一个字符的事件
	$("#userCodes").bind('input propertychange',function(){
	 
		var usercode=$("#userCodes").val();
 
		 var userRole=$("#userRoles");
		 if(usercode!=null&&usercode!=""){
			 
		$.ajax({ 
			async:false,
			contentType:"application/jsonp; charset=utf-8",
			type:"get",
			url:"http://localhost:8080/SindaySearch/searchName",
			data:{userCode:usercode},
			dataType:"jsonp",
		 	jsonp: "jsonpCallback",
			//jsonpCallback:"successCallback",
			success:function(roleJson){
			 
				if(roleJson!=null){
					userRole.html("");
					var options="";
				 
					for(var i=0;i<roleJson.length;i++){
						options+="<tr><td>"+roleJson[i].sName+" </td></tr>";
						
					}
					
					
					
					userRole.html(options);
					$("#userRoles tr").on("mouseover",function(){
						$(this).css('background-color','green');
						$(this).css('color','white');
					});
					$("#userRoles tr").on("mouseout",function(){
						$(this).css('background-color','white')
						$(this).css('color','black');
					});
					$("#userRoles tr").on("click",function(){
						var wenzi=$(this).text();
						$("#userCodes").val(wenzi);
					});
					
				}
			},
			error:function(e){
				 
				//alert(arguments[1]);
			 
				console.log(e);
			}
		});
		
		 }
		
		
		
	});
	
	
	
	$("#userCodes").focus(function(){
	 
		var usercode=$("#userCodes").val();
		 
		 var userRole=$("#userRoles");
		 if(usercode!=null&&usercode!=""){
			 
		$.ajax({ 
			async:false,
			contentType:"application/jsonp; charset=utf-8",
			type:"get",
			url:"http://localhost:8080/SindaySearch/searchName",
			data:{userCode:usercode},
			dataType:"jsonp",
		 	jsonp: "jsonpCallback",
			//jsonpCallback:"successCallback",
			success:function(roleJson){
				 
				if(roleJson!=null){
					userRole.html("");
					var options="";
					
					for(var i=0;i<roleJson.length;i++){
						options+="<tr><td>"+roleJson[i].sName+" </td></tr>";
						
					}
				 
					
					userRole.html(options);
					$("#userRoles tr").on("mouseover",function(){
						$(this).css('background-color','green');
						$(this).css('color','white');
					});
					$("#userRoles tr").on("mouseout",function(){
						$(this).css('background-color','white')
						$(this).css('color','black');
					});
					$("#userRoles tr").on("click",function(){
						var wenzi=$(this).text();
						$("#userCodes").val(wenzi);
					});
				}
			},
			error:function(e){
				 
				//alert(arguments[1]);
			 
				console.log(e);
			}
		});
		
		 }
		
	});
	
	
	 $("#search").mouseleave(function(){
		  
			 $("#userRoles").hide();
	 });
	 $("#search").mouseover(function(){
		  
		 $("#userRoles").show();
	 });
	
	
});













