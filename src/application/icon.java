package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.scene.image.Image;

public class icon {

	static FileInputStream input1;

	public static Object display() {
	try {
    		input1 = new FileInputStream("l.png");
     	} catch (FileNotFoundException e1) {
     		// TODO Auto-generated catch block
     		e1.printStackTrace();
     	} 

         // create a image 
         Image image1 = new Image(input1); 
         return image1;
	}

}
