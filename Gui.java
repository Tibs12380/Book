//Gui.java
/*
 *
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui extends JFrame implements ActionListener{

    String name;
    String hairColor;
    String race;
    String characterClass;
    String gender;
    int age;

    private JTextArea textPane = new JTextArea("Would you like to create a new character?");
    JButton defaultCharacter = new JButton("Use Default Character");
    JButton customCharacter = new JButton("Create Custom Character");
    JButton human = new JButton("Human");
    JButton dwarf = new JButton("Dwarf");
    JButton elf = new JButton("Elf");
    JButton bladeMaster = new JButton("Blade Master");
    JButton tank = new JButton("Tank");
    JButton trickster = new JButton("Trickster");
    Container pane = getContentPane();
    Player p1 = new Player();

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

        FlowLayout layout = new FlowLayout();
        pane.setLayout(layout);
        textPane.setBackground(Color.GRAY);
        textPane.setForeground((Color.WHITE));
        pane.add(textPane);
        defaultCharacter.addActionListener(this);
        customCharacter.addActionListener(this);
        pane.add(defaultCharacter);
        pane.add(customCharacter);
        pane.setBackground(Color.gray);



        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      //  JOptionPane.showMessageDialog(null,"Do you want to create you on character?");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == customCharacter) {
            name = JOptionPane.showInputDialog(null,"What is your name");
            hairColor = JOptionPane.showInputDialog(null,"What is your haircolor");
            age = Integer.parseInt(JOptionPane.showInputDialog(null,"What is your age?"));
            pane.remove(customCharacter);
            pane.remove(defaultCharacter);
            textPane.setText("Please chose your race");
            human.addActionListener(this);
            pane.add(human);
            dwarf.addActionListener(this);
            pane.add(dwarf);
            elf.addActionListener(this);
            pane.add(elf);
            pane.repaint();
        }
         else if(e.getSource() == human){
            race = "Human";
            textPane.append("\n\n\nWhat is your class?");
            bladeMaster.addActionListener(this);
            pane.add(bladeMaster);
            tank.addActionListener(this);
            pane.add(tank);
            trickster.addActionListener(this);
            pane.add(trickster);
        }

        else if (e.getSource() == defaultCharacter){


        }


    }
}

