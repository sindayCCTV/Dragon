package Dragon.sinday.Contool;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import Dragon.sinday.pojo.Jurisdiction;
import Dragon.sinday.pojo.Role;

public class Constants {
	public final static String USER_SESSION = "userSession"; 
	public final static String search_SESSION = "searchSession";
	public final static String SYS_MESSAGE = "message";
	public final static int pageSize = 5;
	public static List<Jurisdiction> myRole;
	
	
	public static int GetAge(Date date){
	 
		 
		//�õ��������
		@SuppressWarnings("deprecation")
		int birthYear = date.getYear();
		System.out.println(birthYear);
		@SuppressWarnings("deprecation")
		int todayY =(new Date()).getYear();
		System.out.println(todayY);
		int age =  todayY- birthYear;
		
		 System.out.println("����ˮ"+age);
		return age;
	}
}
