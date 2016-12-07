//Gui.java
/*
 *
 */
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui extends JFrame implements ActionListener{

    //driver
    public static void main(String args[]){
        Gui frame = new Gui();
        frame.setVisible(true);
    }

	 // constructor
    public Gui() {
        //set the frame default properties
        setTitle     ( "The Adventure up North" );
        setSize      ( 400,200 );
        setLocation  ( 100,100 );
        Container pane = getContentPane();
        pane.setBackground(Color.gray);
        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation( EXIT_ON_CLOSE );
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    //Make buttons
    public class buttons {
        JButton Start = new JButton("Open to the first page");
        JButton defaultCharacter = new JButton("Use default character");
        JButton Customised = new JButton("Create your own character");
    }

}

