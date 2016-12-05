//Gui.java
/*
 *
 */
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui extends JFrame implements ActionListener{
	
	//driver
	public static void main(Sring args[]){
		Gui frame = new Gui();
		frame.setVisible(true);
	}
	
	 // constructor
    public Gui( ) {
        //set the frame default properties
        setTitle     ( "The Adventures of You" );
        setSize      ( 400,200 );
        setLocation  ( 100,100 );
        Container pane = getContentPane();
        //pane.setBackground(Color.blue);
        pane.setBackground(new Color(0,20,40));
        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation( EXIT_ON_CLOSE );
    }  
    
    //Make buttons
    
    Start = new JButton("Open to the first page");
    defualt = new JButton("Use default character");
    Customised = new JButton("Create your own character");

    
}