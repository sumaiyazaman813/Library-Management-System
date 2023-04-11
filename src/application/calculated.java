package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

import javafx.stage.Stage;

public class calculated {
	static Stage window;
	static Scanner x ;
	static int D,M,Y;
	static int D1,M1,Y1;
	static  String N;
	public static void calculate(String idx ,String idy,String day,String month,String year){
	String z= idx+idy;
	D1=Integer.parseInt(day);
	M1=Integer.parseInt(month);
	Y1=Integer.parseInt(year);
	
	
	String tempFile="temp.txt";
	File oldfile =new File("issue.txt");
	File newfile = new File(tempFile);
	
	
	
	
	try {
		FileWriter fw = new FileWriter(tempFile,true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw =  new PrintWriter(bw);
		x = new Scanner(new File("issue.txt"));
		//x.useDelimiter("[    \n]");
		while(x.hasNext()) {
			String ID= x.next();
			String DAY= x.next();
			String MONTH= x.next();
			String YEAR= x.next();
			String NAME= x.next();
			String Extra= x.next();
			String BOOK=x.next();
	
			
			if((ID.equals(z)==false)) {
				fw.write(ID+" "+DAY+"  "+MONTH+"  "+YEAR+"   "+NAME+"  "+Extra+"  "+BOOK+"\n");
				
			}
			else {
				N=NAME;  
				D=Integer.parseInt(DAY);
				M=Integer.parseInt(MONTH);
				Y=Integer.parseInt(YEAR);
			
				
			}
		}
	
		x.close();
		pw.flush();
		pw.close(); 
		fw.close();
		bw.close();
		
	
		oldfile.delete();
		
		File dump=new File("issue.txt");
		
		 newfile.renameTo(dump);
		 System.out.println(N+D+M+Y);
		date.display(N, D, M, Y, D1, M1, Y1);
		 heart.display();
		
		
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Deleted");
			
			
		}

}
 }
