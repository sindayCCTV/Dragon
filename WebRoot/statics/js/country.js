 
$(function(){
 
 var countrys=$("#a_countrys");
 var usercountry=$("#u_countrys");
 
		$.ajax({ 
			async:false,
			contentType:"application/jsonp; charset=utf-8",
			type:"get",
			url:"/SindayAttack/country/allCountry",
			dataType:"json", 
			success:function(roleJson){
	 
				if(roleJson!=null){
				 
					countrys.html("");
					usercountry.html("");
					var options="<option selected='selected' value='9999'>不封禁</option>";
					for(var i=0;i<roleJson.length;i++){
						options+="<option  value='"+roleJson[i].countryId+"'>"+roleJson[i].countryName+"</option>";
						
													  }
					countrys.html(options);
					var useroptions="";
					for(var i=0;i<roleJson.length;i++){
						useroptions+="<option  value='"+roleJson[i].countryId+"'>"+roleJson[i].countryName+"</option>";
						
													  }
					usercountry.html(useroptions);
									}
			},
			error:function(e){
				 
	 
			 
				console.log(e);
			}
		});
		
	 
		
	 
	
});













