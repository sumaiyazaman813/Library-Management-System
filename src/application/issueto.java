
package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class issueto {
	
	
	static Stage window;
	
	public static void display() {
		 
		window =new Stage();
		
     	Button m = new Button("Issue");
		Button b = new Button("Issue List");
		Button back =new Button("Back");
		m.setStyle(" -fx-font: normal bold 15px 'serif';");
		b.setStyle(" -fx-font: normal bold 15px 'serif';");
		back.setStyle(" -fx-font: normal bold 15px 'serif';");
		
		
		m.setOnAction(e->{
			issueto();
			
		});
		
		b.setOnAction(x->{
			file.displayi();
			
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
	
	public static void issueto(){
	Stage raisa = new Stage();
    Text t = new Text("Enter ID");
    
	TextField t1 = new TextField();
	t1.setPromptText("Enter Member Id");
	t1.setFocusTraversable(false);
	
	TextField t2 = new TextField();
	t2.setPromptText("Enter BooK Id");
	t2.setFocusTraversable(false);
	
	TextField t3 = new TextField();
	t3.setPromptText("DAY");
	t3.setFocusTraversable(false);
	
	
	
	TextField t4 = new TextField();
	t4.setPromptText("mONTH");
	t4.setFocusTraversable(false);
	
	TextField t5 = new TextField();
	t5.setPromptText("year");
	t5.setFocusTraversable(false);
	
	//text1.setPromptText("Enter your name");
	//text1.setFocusTraversable(false);
	 t.setFont(Font.font(25));;
	 t.setFill(Color.WHITE);
	 Button btn = new Button("OK");
     btn.setFont(Font.font(20));
     
     
     btn.setOnAction(e->{ 
    	 if(t1.getText().isEmpty()||t2.getText().isEmpty()||t4.getText().isEmpty()||t3.getText().isEmpty()||t5.getText().isBlank()) {
    		 alert.display("WARNING","YOU HAVE TO FILL UP ALL TEXT FIELD");
    	 }
    	 else {
    	 String x =t3.getText()+"  "+t4.getText()+"  "+t5.getText();
    	 issuetofile.file(t1.getText(), t2.getText(),x);
    	 
    	 raisa.close();
    	
    	heart.display();
    	 }
      });
   

	GridPane g = new GridPane();
	    g.setPadding(new Insets(10, 10, 20, 10)); 
	    g.setHgap(10); 
	    g.setVgap(10); 
        g.add(t, 0, 0);
        g.add(t1,0, 1);
     
        g.add(t2,0, 2);
        g.add(t3,0, 3);
        g.add(t4,0, 4);
        g.add(t5,0, 5);
        g.add(btn, 0, 6);
       // g.add(btn1, 0, 2);
        g.setAlignment(Pos.CENTER);
        g.setBackground(background.background("e.jpg"));   
 Scene s =new Scene(g,300,300);
   raisa.getIcons().add((Image) icon.display());
      raisa.setScene(s);
      raisa.setTitle("ISSUE TO");
     
      raisa.show();
	
	}
	
	
	

}
