package application;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class issuetofile {
	static String tempmem,tempmid,tempb,tempbid;
	static Scanner x,z;
	static String id="";
	static String name="";
	static String gmail="";
	static String phone="";
	static String date;

	public static void file(String mem,String bo,String d) {//E:/auto/Library management System/image/file/member.txt
		date=d;
		tempmem="";
		tempmid="";
		tempb="";
		tempbid="";
	try {	                                           //E:/auto/Library management System/image/book.txt
		x = new Scanner(new File("member.txt"));
		//x.useDelimiter("[    \n]");
		while(x.hasNext()) {
			id= x.next();
			name= x.next();
			gmail= x.next();
			phone= x.next();
		
			System.out.print(id+"=="+mem);
	
			if((id.equals(mem))==true) {
				System.out.println(mem+" name "+id);
				tempmem= name;
				tempmid=id;
			}
		}
		x.close();
		}
	
	
	catch(Exception ex){
			JOptionPane.showMessageDialog(null, "Delaaeted");
			
			
		}
		System.out.print("Scan of member done "+tempmem);
		
		
		
		try {
		
			z = new Scanner(new File("book.txt"));
			//x.useDelimiter("[    \n]");
			while(z.hasNext()) {
				id= z.next();
				name= z.next();
				gmail= z.next();
				phone= z.next();
			if((id.equals(bo))==true) {
				tempb= name;
				tempbid=id;
			}
		}
		z.close();
		}
		
		
		catch(Exception ex){
				JOptionPane.showMessageDialog(null, "Delaaeted");
				
				
			}
		
		
		File f = new File("issue.txt");
		write1(tempmid,tempbid+" "+date+"   ",   tempmem+"  TAKENTHEBOOK  ",tempb+"\n",f);
	
		
	}
	 private static void write1(String string1,String string2,String string3,String string4, File f) {
			try {
				FileWriter fw = new FileWriter(f,true);
				fw.write(string1);
				fw.write(string2);
				fw.write(string3);
				fw.write(string4);
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
}

}
