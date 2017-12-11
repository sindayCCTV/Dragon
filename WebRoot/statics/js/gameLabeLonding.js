 $(function(){
 
  var tds=$("#classL5");
  var tdF=$("#classF5");
	 
		$.ajax({
			type:"GET",
			
			url:"/SindayAttack/gameLabel/allLabel", 
			dataType:"json",
			 
			success:function(result){
				 if(result!=null){
					 tds.html("");
					 tdF.html("");
					 var options="";
					 var options2="";
					 for(var i=0;i<result.length;i++){
						 if(i<5){
						 options+="<span style='border: solid 2px;color: gold;background-color: black;'    class='leixing' name='"+result[i].labelId+"'>"+ result[i].labelName+"</span>&nbsp;&nbsp;";
						 }else{
						options2+="<span style='border: solid 2px;color: gold;background-color: black;'   class='leixing' name='"+result[i].labelId+"'>"+ result[i].labelName+"</span>&nbsp;&nbsp;";	 
						 }
						 
					 }
					 tds.html(options);
					 tdF.html(options2);
					 
					 $('.leixing').click(function(){
						 	var dangqian=$(this).text();
						 	var valuess=$(this).attr('name');
						 	var $sc=$("<input name='labels' style='width:10px;text-align: center;' type='checkbox' checked='checked' readonly='readonly' value='"+valuess+"'>"+dangqian+"</input>");
						 	
						 		$("#100v").after($sc);
						 })
					
						 
					 
				 }
				 
			},
			error:function(){
			 
			}
			
			
			
		});
		
		
		
		$("#jiaDiy").click(function(){
			var labeltext=$("#jiazaiDIY").val();
			if(labeltext!=null&&labeltext!=''){
				$("#beError").css('color',' green');
				$("#beError").text("√");
				
				$.ajax({
					type:"GET",
					
					url:"/SindayAttack/gameLabel/addLable", 
					contentType:"application/json; charset=utf-8",
					data:{labName:labeltext},
					dataType:"json",
					success:function(result){
						if(result!=null){
							var $sc=$("<input name='labels' style='width:10px;text-align: center;' type='checkbox' checked='checked' readonly='readonly' value='"+result.labelId+"'>"+result.labelName+"</input>");
						 	
					 		$("#100v").after($sc);
						}
						
						
					},
					error:function(){
					 
					}
					
					
					
				});
				
				
				
				
				
			}else{
				$("#beError").css('color',' red');
				$("#beError").text("×你不能贴个空标签，好吧");
			}
			
		});
		
	

	
});













