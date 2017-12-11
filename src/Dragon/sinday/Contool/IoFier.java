package Dragon.sinday.Contool;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IoFier {
	 
	
	public static List<String> Du(){
		List<String> inputStr=new ArrayList<String>();
		 File file = new File("D:\\SearchInput.txt");// 指定要读取的文件  
		 try {
			 FileReader reader = new FileReader(file);// 获取该文件的输入流  
		        char[] bb = new char[2048];// 用来保存每次读取到的字符  
		        String str = "";// 用来将每次读取到的字符拼接，当然使用StringBuffer类更好  
		        int n;// 每次读取到的字符长度  
		        while ((n = reader.read(bb)) != -1) {  
		            str += new String(bb, 0, n);  
		        }  
		        reader.close();// 关闭输入流，释放连接  
		         for(String reads:str.split(";")){
		        	 inputStr.add(reads);
		         }
		} catch (Exception e) {
			inputStr=null;
		}
	       return inputStr;
	}
	
	public static void xie(String leirong){
		//path表示你所创建文件的路径
		File file = new File("D:\\SearchInput.txt");// 要写入的文本文件
		 if (!file.exists()) {// 如果文件不存在，则创建该文件  
	            try {
					file.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
	        } 
		 try {
			 FileWriter writer = new FileWriter(file);// 获取该文件的输出流  
		        writer.write(leirong);// 写内容  
		        writer.flush();// 清空缓冲区，立即将输出流里的内容写到文件里  
		        writer.close();// 关闭输出流，施放资源 
			 
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	
}
