package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class addbook {

	 static  Stage window;
		public static void display() {
			


			         
		         window = new Stage();
			      Label text0 = new Label("ADD BOOK");
			 
			      Text text1 = new Text("BOOK");      
			      Text text2 = new Text("BOOK ID");
			      Text text3 = new Text("WRITER");
			      Text text4 = new Text("PUBLISHER");  
			      
			      
			      
			     
			      TextField textField1 = new TextField();
			      textField1.setStyle("-fx-font: normal bold 15px 'serif' ");    
			      TextField textField2 = new TextField();
			      textField2.setStyle("-fx-font: normal bold 15px 'serif' ");
			      TextField textField3 = new TextField();
			      textField3.setStyle("-fx-font: normal bold 15px 'serif' ");
			      TextField textField4 = new TextField();
			      textField4.setStyle("-fx-font: normal bold 15px 'serif' ");
			       
			       
			      //calling file
			    
			      
			      
			      
			      
			      
			      Button button1 = new Button("Submit");
			             button1.setOnAction(e->{
			            	 if(textField1.getText().isEmpty()||textField2.getText().isEmpty()||textField4.getText().isEmpty()||textField3.getText().isEmpty()) {
			            		 alert.display("WARNING","YOU HAVE TO FILL UP ALL TEXT FIELD");
			            	 }
			            	 else
			             file.sendfileb(textField1.getText(),textField2.getText(),textField3.getText(),textField4.getText());
			            	  window.close();
			            	 heart.display();
			             });
			 
			     
			     
			      GridPane gridPane = new GridPane();    
			     
		
			      gridPane.setMinSize(400, 200);
			     
		
			      gridPane.setPadding(new Insets(10, 10, 20, 10));
			     
			     
			      gridPane.setVgap(10);
			      gridPane.setHgap(10);      
			     
			    
			      gridPane.setAlignment(Pos.CENTER);
			       
			    
			      gridPane.add(text0, 0, 0);
			      gridPane.add(text1, 0, 1);
			      gridPane.add(textField1, 1, 1);
			      gridPane.add(text2, 0, 2);      
			      gridPane.add(textField2, 1, 2);
			      gridPane.add(text3, 0, 3);
			      gridPane.add(textField3, 1, 3);
			      gridPane.add(text4, 0, 4);
			      gridPane.add(textField4, 1, 4);
			      gridPane.add(button1, 1, 5);
			    //  gridPane.setBackground(background.background("E:/auto/Library management System/image/e.jpeg")); 
			      
			      text0.setStyle("-fx-font: fancytext bold 40px 'serif' ");
			      text1.setStyle("-fx-font: normal bold 30px 'serif' ");
			      text2.setStyle("-fx-font: normal bold 30px 'serif' ");
			      text3.setStyle("-fx-font: normal bold 30px 'serif' ");
			      text4.setStyle("-fx-font: normal bold 30px 'serif' ");
			      button1.setStyle("-fx-font: normal bold 20px 'serif' ");
			      
			      
			      text4.setFill(Color.WHITE);
			     text1.setFill(Color.WHITE);
			     text2.setFill(Color.WHITE);
			     text3.setFill(Color.WHITE);
			     text0.setTextFill(Color.WHITE);
			     
			      gridPane.setBackground(background.background("e11.jpg")); 
			      //Creating a scene object
			       Scene scene1 = new Scene(gridPane);
			       
			       window.getIcons().add((Image) icon.display());
			       window.setTitle(" Library Management");
			   
			       window.setScene(scene1);
			  
			       window.show();
			   }
		}
		
