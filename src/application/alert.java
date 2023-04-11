package application;

	import java.awt.Font;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.event.ActionEvent;
	import javafx.event.EventHandler;
	import javafx.geometry.Insets; 
	import javafx.geometry.Pos;
	import javafx.scene.Group;
	import javafx.scene.Parent;
	import javafx.scene.Scene; 
	import javafx.scene.control.Button;
	import javafx.scene.control.ButtonBase;
	import javafx.scene.control.Labeled;
	import javafx.scene.control.PasswordField;
	import javafx.scene.layout.Background;
	import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
	import javafx.scene.layout.VBox;
	import javafx.scene.text.Text; 
	import javafx.scene.control.TextField;
	import javafx.stage.Modality;
	import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.image.Image;
	import javafx.scene.control.Label; 
	import javafx.scene.control.Label;

	public class alert  {
		static FileInputStream input1;
		static FileInputStream input;
	    public static void display(String title, String message) {
	        Stage window = new Stage();
	         
	         String text=message;
	        
	        //Block events to other windows
	        window.initModality(Modality.APPLICATION_MODAL);
	        window.setTitle(title);
	        window.setMinWidth(250);
	        window.setMinHeight(250);

	        Text label = new Text(text);
	        label.setStyle("-fx-background-color: white; -fx-font: normal bold 40px 'serif'; -fx-text-fill: white;");
	        
	        Button closeButton = new Button("Close this window");
	        closeButton.setStyle(" -fx-font: normal bold 15px 'serif';");
	        closeButton.setOnAction(e -> window.close());

	        VBox layout = new VBox(10);
	      //  layout.setStyle("-fx-background-color: red;");
	        layout.getChildren().addAll(label, closeButton);
	        layout.setAlignment(Pos.CENTER);
              
	        
	       // "E:/auto/Library management System/image/e.jpg"
	        
	       
	       // layout.setBackground(background.background("E:/auto/Library management System/image/e.jpg")); 
	        //Display window and wait for it to be closed before returning
	        Scene scene = new Scene(layout);
	        

	        window.getIcons().add((Image) icon.display());
	        

	        window.setScene(scene);
	        window.showAndWait();
	    }

	}


