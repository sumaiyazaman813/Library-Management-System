package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;

public class background {
	  static FileInputStream input;
	 public static Background background (String x) {
  
	try {
		input = new FileInputStream(x);
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} 

    // create a image 
    Image image = new Image(input); 

    // create a background image 
    BackgroundImage backgroundimage = new BackgroundImage(image,
                                     BackgroundRepeat.REPEAT,  
                                     BackgroundRepeat.REPEAT,  
                                     BackgroundPosition.CENTER,  
                                        BackgroundSize.DEFAULT); 

    // create Background 
    Background background = new Background(backgroundimage); 
    return  background;
}
}
