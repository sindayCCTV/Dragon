 $(function(){
 
  
	
	var ErrorsCode=$("#ErrorsCode");
	$("#userCode").blur(function(){
	 
		var usercode=$("#userCode").val();
	 
		$.ajax({
			type:"GET",
			
			url:"/SindayAttack/user/exitUserCode",
			data:{userCode:usercode},
			dataType:"json",
			 
			success:function(result){
				 
				ErrorsCode.html("");
				
				if(result.isexist=="exist"){//userCode存在
					ErrorsCode.html("该账号已存在");
				}else{
					ErrorsCode.html("恭喜你，该账号可以使用");
				}
			},
			error:function(){
			 
			}
			
			
			
		});
		
		
		
		
		
	});
	 
	
	

	
});













