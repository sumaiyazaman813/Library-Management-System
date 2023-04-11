package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class file {
	
	  static Scanner scan;
        
	   public static void sendfile(String name,String name1,String name2,String name3) {

			File f = new File("member.txt");
			write(name1+"     ",name+"         ",name2+"          ",name3+"\n",f);
		   
	   }
	   private static void write(String string1,String string2,String string3,String string4, File f) {
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
	   
	   
	   
	   
	   public static void sendfileb(String name,String name1,String name2,String name3) {

			File f = new File("book.txt");
			write1(name1+"     ",name+"         ",name2+"          ",name3+"\n",f);
		   
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
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
		public static  void display() {
			
		    Stage primaryStage =new Stage();
		    primaryStage.setTitle("Borders");
	        Group root = new Group();
	        Scene scene = new Scene(root, 630, 350,Color.ROSYBROWN);
	        
	        GridPane gridpane = new GridPane();
	        gridpane.setPadding(new Insets(5));
	        gridpane.setHgap(10);
	        gridpane.setVgap(10);
	        
	        TextArea list = new TextArea();
	        list.setPrefHeight(300);
	        list.setPrefWidth(600);
	        list.setPrefRowCount(10);
	        list.setPrefColumnCount(100);
	        list.setWrapText(true);
	        
	        Text text1= new Text("  --ID--");
	        Text text2= new Text("Name--------");
	        Text text3= new Text("Gmail---------------");
	        Text text4= new Text("Phone----");
	        Button button8 = new Button("Back"); 
	        button8.setOnAction(e ->{
	    	      heart.display();
	    	       primaryStage.close();
	      	});
	        text1.setStyle("-fx-font: normal bold 30px 'serif';-fx-text-color: white;");
	        text2.setStyle("-fx-font: normal bold 30px 'serif';-fx-text-fill: white;");
	        text3.setStyle("-fx-font: normal bold 30px 'serif';-fx-text-fill: white;");
	        text4.setStyle("-fx-font: normal bold 30px 'serif';-fx-text-fill: white;");
	        
	        GridPane gridpane1 = new GridPane();
	        gridpane1.add(text1, 1,0);
	        gridpane1.add(text2, 5,0 );
	        gridpane1.add(text3, 15,0 );
	        gridpane1.add(text4, 30,0 );
	      //  gridpane1.add(button8, 30,0 );
	        //cssEditorFld.setPrefWidth(1500);
	        gridpane.setPadding(new Insets(30, 10, 30, 10)); 
	        GridPane.setHalignment(list, HPos.CENTER);
	       
	       gridpane.add(list, 1, 1);
	       gridpane.add(button8, 1,0 );
	        File file = new File("member.txt");
			
			try {
				scan = new Scanner(file);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			String fileContent = "";
			while (scan.hasNextLine()) {
				fileContent = fileContent.concat(scan.nextLine() + "\n");
			}
			
			
            scan.close();
			GridPane group= new GridPane();
			group.getChildren().addAll(gridpane1,gridpane);
		
	        
			list.setStyle("-fx-font: normal bold 20px 'serif';");
			list.setText(fileContent);
	        // list.setDisable(true);
	        
	        root.getChildren().add(group);     
	        primaryStage.getIcons().add((Image) icon.display());
	        primaryStage.setScene(scene);
	        primaryStage.show();
	    }


	





















	   
public static  void displayb() {
	
    Stage primaryStage =new Stage();
    primaryStage.setTitle("Borders");
    Group root = new Group();
    Scene scene = new Scene(root, 630, 350,Color.ROSYBROWN);
    
    GridPane gridpane = new GridPane();
    gridpane.setPadding(new Insets(5));
    gridpane.setHgap(10);
    gridpane.setVgap(10);
    
    TextArea list = new TextArea();
    list.setPrefHeight(300);
    list.setPrefWidth(600);
    list.setPrefRowCount(10);
    list.setPrefColumnCount(100);
    list.setWrapText(true);
    
 //   Text text1= new Text("  --ID--");
  //  Text text2= new Text("Name--------");
  //  Text text3= new Text("Gmail---------------");
  //  Text text4= new Text("Phone----");
   Button button8 = new Button("Back"); 
    button8.setOnAction(e ->{
	      heart.display();
	       primaryStage.close();
  	});
   // text1.setStyle("-fx-font: normal bold 30px 'serif';-fx-text-color: white;");
  //  text2.setStyle("-fx-font: normal bold 30px 'serif';-fx-text-fill: white;");
   // text3.setStyle("-fx-font: normal bold 30px 'serif';-fx-text-fill: white;");
   // text4.setStyle("-fx-font: normal bold 30px 'serif';-fx-text-fill: white;");
    
    GridPane gridpane1 = new GridPane();
  //  gridpane1.add(text1, 1,0);
  //  gridpane1.add(text2, 5,0 );
  //  gridpane1.add(text3, 15,0 );
 //   gridpane1.add(text4, 30,0 );
  //  gridpane1.add(button8, 30,0 );
    //cssEditorFld.setPrefWidth(1500);
    gridpane.setPadding(new Insets(30, 10, 30, 10)); 
    GridPane.setHalignment(list, HPos.CENTER);
   
   gridpane.add(list, 1, 1);
   gridpane.add(button8, 1,0 );
    File file = new File("book.txt");
	
	try {
		scan = new Scanner(file);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	String fileContent = "";
	while (scan.hasNextLine()) {
		fileContent = fileContent.concat(scan.nextLine() + "\n");
	}
    scan.close();
	GridPane group= new GridPane();
	group.getChildren().addAll(gridpane1,gridpane);

    
	list.setStyle("-fx-font: normal bold 20px 'serif';");
	list.setText(fileContent);
    // list.setDisable(true);
    
    root.getChildren().add(group);     
    primaryStage.getIcons().add((Image) icon.display());
    primaryStage.setScene(scene);
    primaryStage.show();
}






public static  void displayi() {
	
    Stage primaryStage =new Stage();
    primaryStage.setTitle("Borders");
    Group root = new Group();
    Scene scene = new Scene(root, 630, 350,Color.ROSYBROWN);
    
    GridPane gridpane = new GridPane();
    gridpane.setPadding(new Insets(5));
    gridpane.setHgap(10);
    gridpane.setVgap(10);
    
    TextArea list = new TextArea();
    list.setPrefHeight(300);
    list.setPrefWidth(600);
    list.setPrefRowCount(10);
    list.setPrefColumnCount(100);
    list.setWrapText(true);
    
 //   Text text1= new Text("  --ID--");
  //  Text text2= new Text("Name--------");
  //  Text text3= new Text("Gmail---------------");
  //  Text text4= new Text("Phone----");
   Button button8 = new Button("Back"); 
    button8.setOnAction(e ->{
	      heart.display();
	       primaryStage.close();
  	});
   // text1.setStyle("-fx-font: normal bold 30px 'serif';-fx-text-color: white;");
  //  text2.setStyle("-fx-font: normal bold 30px 'serif';-fx-text-fill: white;");
   // text3.setStyle("-fx-font: normal bold 30px 'serif';-fx-text-fill: white;");
   // text4.setStyle("-fx-font: normal bold 30px 'serif';-fx-text-fill: white;");
    
    GridPane gridpane1 = new GridPane();
  //  gridpane1.add(text1, 1,0);
  //  gridpane1.add(text2, 5,0 );
  //  gridpane1.add(text3, 15,0 );
 //   gridpane1.add(text4, 30,0 );
  //  gridpane1.add(button8, 30,0 );
    //cssEditorFld.setPrefWidth(1500);
    gridpane.setPadding(new Insets(30, 10, 30, 10)); 
    GridPane.setHalignment(list, HPos.CENTER);
   
   gridpane.add(list, 1, 1);
   gridpane.add(button8, 1,0 );
    File file = new File("issue.txt");
	
	try {
		scan = new Scanner(file);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	String fileContent = "";
	while (scan.hasNextLine()) {
		fileContent = fileContent.concat(scan.nextLine() + "\n");
	}
    scan.close();
	GridPane group= new GridPane();
	group.getChildren().addAll(gridpane1,gridpane);

    
	list.setStyle("-fx-font: normal bold 20px 'serif';");
	list.setText(fileContent);
    // list.setDisable(true);
    
    root.getChildren().add(group);     
    primaryStage.getIcons().add((Image) icon.display());
    primaryStage.setScene(scene);
    primaryStage.show();
}
}

