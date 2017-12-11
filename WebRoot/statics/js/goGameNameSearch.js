 
$(function(){
 
 
	

	 //输入一个字符的事件
	$("#goAddSearchGame").bind('click',function(){
		  
		var gameName=$("#gameName").val();
		 
		  
		$.ajax({ 
			async:false,
			contentType:"application/jsonp; charset=utf-8",
			type:"get",
			url:"http://localhost:8080/SindaySearch/addSearchName",
			data:{userCode:gameName},
			dataType:"jsonp", 
			//jsonpCallback:"successCallback",
			success:function(roleJson){
			 
			},
			error:function(e){
				 
				//alert(arguments[1]);
			 
				console.log(e);
			}
		});
		
		  
		
		
		
	});
	
	
	 
	
	
});













