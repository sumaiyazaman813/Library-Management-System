package application;

import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import java.util.Scanner;

import javax.swing.JOptionPane;

import java.io.*;

import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.paint.Color; 
import javafx.stage.Stage; 
import javafx.scene.text.Font; 
import javafx.scene.text.FontPosture; 
import javafx.scene.text.FontWeight; 
import javafx.scene.text.Text;

import java.util.Scanner;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;




public class delect {
	
	
	
	static Stage window;
	static Scanner x ;
	
	
public static void display() {
	 
	window =new Stage();
	
	Button m = new Button("Member List");
	Button b = new Button("Book List");
	Button back =new Button("Back");
	m.setStyle(" -fx-font: normal bold 15px 'serif';");
	b.setStyle(" -fx-font: normal bold 15px 'serif';");
	back.setStyle(" -fx-font: normal bold 15px 'serif';");
	
	
	m.setOnAction(e->{
		delectmember();
		window.close();
	});
	
	b.setOnAction(x->{
		delectbook();
	});
	
	back.setOnAction(z->{
		heart.display();
		window.close();
	});
	
	GridPane g =new GridPane();
	g.add(m, 0, 2);
	g.add(b, 5, 2);
	g.add(back, 5,10);
	g.setAlignment(Pos.CENTER);
	  g.setVgap(10); 
	     g.setHgap(20);   
	     g.setBackground(background.background("e.jpg")); 
	Scene s = new Scene(g,300,300,Color.BLACK);
	 window.getIcons().add((Image) icon.display());
	window.setScene(s);
	  window.getIcons().add((Image) icon.display());
	window.show();
	
	
}	

public static void delectmember() {
	
	Stage raisa = new Stage();
    Text t = new Text("Enter ID");
    
	TextField t1 = new TextField();
	t1.setPromptText("Enter Member Id");
	t1.setFocusTraversable(false);
	//text1.setPromptText("Enter your name");
	//text1.setFocusTraversable(false);
	 t.setFont(Font.font(25));;
	 t.setFill(Color.WHITE);
	 Button btn = new Button("OK");
     btn.setFont(Font.font(20));
     
     btn.setOnAction(e->{
    	 raisa.close();
    	removemember(t1.getText());
    	heart.display();
      });
    // Button btn1 = new Button("copy");
   //  btn1.setFont(Font.font(20));
     
  //   btn1.setOnAction(e->{
    	 
    	//copy.cop();
    	
      

    
   //  });

	GridPane g = new GridPane();
	    g.setPadding(new Insets(10, 10, 20, 10)); 
	    g.setHgap(10); 
	    g.setVgap(10); 
        g.add(t, 0, 0);
        g.add(t1,0, 1);
        g.add(btn, 0, 3);
       // g.add(btn1, 0, 2);
        g.setAlignment(Pos.CENTER);
        g.setBackground(background.background("E:/auto/Library management System/image/e.jpg"));   
 Scene s =new Scene(g,300,300);
   raisa.getIcons().add((Image) icon.display());
      raisa.setScene(s);
      raisa.setTitle("Delete");
     
      raisa.show();
	
}




public static void delectbook() {
	
	Stage raisa = new Stage();
    Text t = new Text("Enter Book ID");
    
	TextField t1 = new TextField();
	t1.setPromptText("Enter Id");
	t1.setFocusTraversable(false);
	//text1.setPromptText("Enter your name");
	//text1.setFocusTraversable(false);
	 t.setFont(Font.font(25));;
	 t.setFill(Color.WHITE);
     Button btn = new Button("OK");
     btn.setFont(Font.font(20));
     btn.setOnAction(e->{
     removebook(t1.getText());
     });
	GridPane g = new GridPane();
       g.add(t, 0, 0);
       g.add(t1,0, 1);
       g.add(btn,0, 3);
       g.setAlignment(Pos.CENTER);
       g.setBackground(background.background("E:/auto/Library management System/image/e11.jpg")); 
 Scene s =new Scene(g,300,300);
raisa.getIcons().add((Image) icon.display());
      raisa.setScene(s);
      raisa.setTitle("Delete");
      raisa.show();
	
}


public static void removemember(String z) {
	String tempFile="temp.txt";
	File oldfile =new File("member.txt");
	File newfile = new File(tempFile);
	String id="";
	String name="";
	String gmail="";
	String phone="";
	
	
	
	try {
		FileWriter fw = new FileWriter(tempFile,true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw =  new PrintWriter(bw);
		x = new Scanner(new File("member.txt"));
		//x.useDelimiter("[    \n]");
		while(x.hasNext()) {
			id= x.next();
			name= x.next();
			gmail= x.next();
			phone= x.next();
			System.out.println(z+"="+id+"\n");
			//System.out.println(id+"     "+name+"         "+gmail+"          "+phone+"\n");
			if((id.equals(z)==false)) {
				fw.write(id+"     "+name+"         "+gmail+"          "+phone+"\n");
				
			}
		}
	
		x.close();
		pw.flush();
		pw.close(); 
		window.close();
		oldfile.delete();
		
		File dump=new File("member.txt");
		
		
		
		// File renfile= new File("test.txt");
		 newfile.renameTo(dump);
		 System.out.println("i am in\n");
		 
		 heart.display();
		// File d =new File("E:/auto/Library management System/image/file/member.txt");
		// d.createNewFile();
		
		}catch(Exception ex){
			JOptionPane.showMessageDialog(null, "Delaaeted");
			
			
		}
}
	












	
	public static void removebook(String z) {
		String tempFile="temp.txt";
		File oldfile =new File("book.txt");
		File newfile = new File(tempFile);
		String id="";
		String name="";
		String gmail="";
		String phone="";
		
		
		
		try {
			FileWriter fw = new FileWriter(tempFile,true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw =  new PrintWriter(bw);
			x = new Scanner(new File("book.txt"));
			//x.useDelimiter("[    \n]");
			while(x.hasNext()) {
				id= x.next();
				name= x.next();
				gmail= x.next();
				phone= x.next();
				System.out.println(z+"="+id+"\n");
				//System.out.println(id+"     "+name+"         "+gmail+"          "+phone+"\n");
				if((id.equals(z)==false)) {
					fw.write(id+"     "+name+"         "+gmail+"          "+phone+"\n");
					
				}
			}
		
			x.close();
			pw.flush();
			pw.close(); 
			window.close();
			oldfile.delete();
			
			File dump=new File("book.txt");
			
			
			
			// File renfile= new File("test.txt");
			 newfile.renameTo(dump);
			 System.out.println("i am in\n");
			 
			 heart.display();
			// File d =new File("E:/auto/Library management System/image/file/member.txt");
			// d.createNewFile();
			
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "Deleted");
				
				
			}
			
			
		}
	
	
	

	
	

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
