package application;

import java.io.FileInputStream;
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
import java.io.FileNotFoundException;
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

public class check {
	 static Stage window;
	 static Scene scene;
	 static FileInputStream input;
		static FileInputStream input1;
  public static void display() {
	   
	    Stage stage=new Stage();
	   window=stage;
	   Text text0 = new  Text("Welcome");
	   
    Text text1 = new Text("Admin");       
     
     
     Text text2 = new Text("Password"); 
      
        
     TextField textField1 = new TextField();       
     
            
     PasswordField textField2 = new PasswordField();  
      
   
     Button button1 = new Button("Login"); 
     button1.setOnAction(e ->{
    	 if(textField1.getText().isEmpty()||textField2.getText().isEmpty()) {
    		 alert.display("WARNING","YOU HAVE TO FILL UP ALL TEXT FIELD");
    	 }
    	 else {
   	  pass( textField1.getText(),textField2.getText());
    	 }
 	});
 
     
     
      
     
    
     GridPane gridPane = new GridPane();    
     
     //Setting size for the pane 
     gridPane.setMinSize(400, 200); 
     
     //Setting the padding  
     gridPane.setPadding(new Insets(10, 10, 20, 10)); 
     
     //Setting the vertical and horizontal gaps between the columns 
     gridPane.setVgap(10); 
     gridPane.setHgap(10);       
     
     //Setting the Grid alignment 
     gridPane.setAlignment(Pos.CENTER); 
      
     //Arranging all the nodes in the grid 
     gridPane.add(text0, 0, 0); 
     gridPane.add(text1, 0, 1); 
     gridPane.add(textField1, 1, 1); 
     gridPane.add(text2, 0, 2);       
     gridPane.add(textField2, 1, 2); 
     gridPane.add(button1, 0, 4); 
   //  gridPane.add(button2, 1, 4); 
      
     //Styling nodes  
     button1.setStyle(" -fx-font: normal bold 15px 'serif';"); 
    // button2.setStyle("-fx-background-color: black;-fx-font: normal bold 10px 'serif'; -fx-text-fill: white;"); 
     text0.setStyle("-fx-font: normal bold 50px 'serif' "); 
     text0.setFill(Color.WHITE);
     text0.setStrokeWidth(1);
     text0.setStroke(Color.WHITE);
     
     text1.setFill(Color.WHITE);
     text1.setStrokeWidth(1);
     text1.setStroke(Color.WHITE);
     
     text2.setFill(Color.WHITE);
     text2.setStrokeWidth(1);
     text2.setStroke(Color.WHITE);
       

     
     
     button1.setTextFill(Color.BLACK);
     button1.setCursor(Cursor.HAND);
     
     text1.setStyle("-fx-font: normal bold 30px 'serif' "); 
     text2.setStyle("-fx-font: normal bold 30px 'serif' ");  
   //  gridPane.setStyle("-fx-background-color: royalblue;"); 
    
 	// set background 
     gridPane.setBackground(background.background("e.jpg")); 
     
     //Creating a scene object 
      Scene scene1 = new Scene(gridPane); 
      
     

      window.getIcons().add((Image) icon.display());
      

      
      
      window.setTitle(" Library Management"); 
     
     //Adding scene to the stage 
      window.setScene(scene1);
     
     //Displaying the contents of the stage 
      window.show(); 
  }
  
  public static void pass(String string, String string2){
	   if((string.contentEquals("admin") && string2.contentEquals("1234"))==true) {
		   
		   heart.display();
		   window.close();
	   }
	   else
		   alert.display("Alert", "Sorry :( \nWrong Password or ID  ");
		   System.out.print("clicked it"+string+"   "+string2);
	      
      
  }
}
