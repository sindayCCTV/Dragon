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
		 File file = new File("D:\\SearchInput.txt");// ָ��Ҫ��ȡ���ļ�  
		 try {
			 FileReader reader = new FileReader(file);// ��ȡ���ļ���������  
		        char[] bb = new char[2048];// ��������ÿ�ζ�ȡ�����ַ�  
		        String str = "";// ������ÿ�ζ�ȡ�����ַ�ƴ�ӣ���Ȼʹ��StringBuffer�����  
		        int n;// ÿ�ζ�ȡ�����ַ�����  
		        while ((n = reader.read(bb)) != -1) {  
		            str += new String(bb, 0, n);  
		        }  
		        reader.close();// �ر����������ͷ�����  
		         for(String reads:str.split(";")){
		        	 inputStr.add(reads);
		         }
		} catch (Exception e) {
			inputStr=null;
		}
	       return inputStr;
	}
	
	public static void xie(String leirong){
		//path��ʾ���������ļ���·��
		File file = new File("D:\\SearchInput.txt");// Ҫд����ı��ļ�
		 if (!file.exists()) {// ����ļ������ڣ��򴴽����ļ�  
	            try {
					file.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
	        } 
		 try {
			 FileWriter writer = new FileWriter(file);// ��ȡ���ļ��������  
		        writer.write(leirong);// д����  
		        writer.flush();// ��ջ�������������������������д���ļ���  
		        writer.close();// �ر��������ʩ����Դ 
			 
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	
}
