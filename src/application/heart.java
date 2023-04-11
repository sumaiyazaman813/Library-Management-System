package application;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import com.sun.javafx.geom.Shape;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
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
import javafx.scene.layout.Region;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;  


         
public class heart{
	
	
	
	
	
	
	
	
	
	
	

	
	
    static FileInputStream input;
    static FileInputStream input1;
   public static void display() {  
	   
	   

	
	  Stage  primarystage =new  Stage();
	   Stage window = primarystage;
	  
      Button button1 = new Button("ADD MEMBER"); 
      button1.setOnAction(e ->{
    	  addmember.display();
    	  window.close();
    	});
      
      
      Button button2 = new Button("ADD BOOK"); 
      button2.setOnAction(e ->{
    	 addbook.display();
    	  window.close();
  	 
    	});
      Button button3 = new Button("MEMBER LIST"); 
      button3.setOnAction(e ->{
    	  file.display();
    	 
    	
    	});
      
      Button button4 = new Button("BOOK LIST"); 
      button4.setOnAction(e ->{
    	  file.displayb();
    	 
    	});
       
      Button button5 = new Button("ISSUE TO"); 
      button5.setOnAction(e ->{
    	  issueto.display();
    	  
    	});
      
      Button button6 = new Button("RETURN BOOK"); 
      button6.setOnAction(e ->{
    	  returned.display();
    	 
    	});

      Button button7 = new Button("LOG OUT"); 
      button7.setOnAction(e ->{
    	  window.close();
    	});

      Button button8 = new Button("DELETE"); 
      button8.setOnAction(e ->{
  	       delect.display();
  	       window.close();
    	});
      
      button1.setStyle(" -fx-font: normal bold 15px 'serif';"); 
      button2.setStyle(" -fx-font: normal bold 15px 'serif';"); 
      button3.setStyle(" -fx-font: normal bold 15px 'serif';"); 
      button4.setStyle(" -fx-font: normal bold 15px 'serif';"); 
      button5.setStyle(" -fx-font: normal bold 15px 'serif';"); 
      button6.setStyle(" -fx-font: normal bold 15px 'serif';"); 
      button7.setStyle(" -fx-font: normal bold 15px 'serif';");   
      button7.setStyle(" -fx-font: normal bold 15px 'serif';"); 
      button8.setStyle(" -fx-font: normal bold 15px 'serif';");   
      
    
        
      
      button1.setPrefWidth(150);
      button2.setPrefWidth(150);
      button3.setPrefWidth(150);
      button4.setPrefWidth(150);
      button5.setPrefWidth(150);
      button6.setPrefWidth(150);
      button7.setPrefWidth(150);
      button7.setPrefWidth(100);
      button7.setPrefWidth(100);
      button8.setPrefWidth(100);
      
      
      button7.setShape(new Circle(100000));
      button7.setMaxSize(100,1000);
      button7.setOnMouseEntered(e -> button7.setStyle("-fx-background-color: #F0E68C;-fx-font: normal bold 15px 'serif';-fx-border-color:black; -fx-border-width: 1 1 1 1;"));
      button7.setOnMouseExited(e -> button7.setStyle("-fx-font: normal bold 15px 'serif';"));
      button7.setCursor(Cursor.HAND);
   
    GridPane gridPane = new GridPane();    
    
    //Setting size for the pane 
    gridPane.setMinSize(400, 400); 
    
    //Setting the padding  
    gridPane.setPadding(new Insets(30, 10, 30, 10)); 
    
    //Setting the vertical and horizontal gaps between the columns 
    gridPane.setVgap(40); 
    gridPane.setHgap(10);       
    
    //Setting the Grid alignment 
    gridPane.setAlignment(Pos.TOP_LEFT); 
     
    //Arranging all the nodes in the grid 
    gridPane.add(button1, 0, 0);
    gridPane.add(button8, 20, 4);
    gridPane.add(button2, 0, 1); 
    gridPane.add(button3, 0, 2); 
    gridPane.add(button4, 0, 3); 
    gridPane.add(button5, 0, 4); 
    gridPane.add(button6, 0, 5); 
    gridPane.add(button7, 20, 5); 
    
  //  gridPane.add(button2, 1, 4); 
     
    //Styling nodes  
   // button1.setStyle(" -fx-font: normal bold 15px 'serif';"); 
   // button2.setStyle("-fx-background-color: black;-fx-font: normal bold 10px 'serif'; -fx-text-fill: white;"); 
   // text0.setStyle("-fx-font: normal bold 30px 'serif' "); 
  //  text1.setStyle("-fx-font: normal bold 20px 'serif' "); 
  //  text2.setStyle("-fx-font: normal bold 20px 'serif' ");  
    
    
  //  gridPane.setStyle("-fx-background-image:url('E:/auto/default/image/libray.png')");
      
    // create a input stream 
   // "E:/auto/Library management System/image/s.jpg"
	
    gridPane.setBackground(background.background("e.jpeg")); 
     
    Scene scene1 = new Scene(gridPane); 
  
    window.getIcons().add((Image) icon.display());
    
    
    
    
    
     window.setTitle(" Library Management"); 
    
    //Adding scene to the stage 
     window.setScene(scene1);
    
    //Displaying the contents of the stage 
     window.show(); 
	
   }
}

