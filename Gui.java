//Gui.java
/*
 *
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui extends JFrame implements ActionListener{
    JTextArea textPane = new JTextArea("Would you like to create a new character?");

    JButton defaultCharacter = new JButton("Use Default Character");
    JButton customCharacter = new JButton("Create Custom Character");
    JButton human = new JButton("Human");
    JButton dwarf = new JButton("Dwarf");
    JButton elf = new JButton("Elf");
    JButton bladeMaster = new JButton("Blade Master");
    JButton tank = new JButton("Tank");
    JButton trickster = new JButton("Trickster");
    JButton male = new JButton("Male");
    JButton female = new JButton("Female");
    JButton begin = new JButton("Begin your adventure");
    JButton north = new JButton("North");
    JButton west = new JButton("West");

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
        setSize      ( 500,300 );
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
        pane.setBackground(Color.GRAY);



        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      //  JOptionPane.showMessageDialog(null,"Do you want to create you on character?");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == customCharacter) {
            p1.setName(JOptionPane.showInputDialog(null,"What is your name"));
            p1.setHairColor(JOptionPane.showInputDialog(null,"What is your haircolor"));
            p1.setAge(Integer.parseInt(JOptionPane.showInputDialog(null,"What is your age?")));
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
            p1.setRace("Human");
            textPane.append("\n\n\nWhat is your class?");
            bladeMaster.addActionListener(this);
            pane.add(bladeMaster);
            tank.addActionListener(this);
            pane.add(tank);
            trickster.addActionListener(this);
            pane.add(trickster);
        }
        else if(e.getSource() == dwarf){
            p1.setRace("Dwarf");
            textPane.append("\n\n\nWhat is your class?");
            bladeMaster.addActionListener(this);
            pane.add(bladeMaster);
            tank.addActionListener(this);
            pane.add(tank);
            trickster.addActionListener(this);
            pane.add(trickster);
        }

        else if(e.getSource() == elf){
            p1.setRace("Elf");
            textPane.append("\n\n\nWhat is your class?");
            bladeMaster.addActionListener(this);
            pane.add(bladeMaster);
            tank.addActionListener(this);
            pane.add(tank);
            trickster.addActionListener(this);
            pane.add(trickster);
        }

        else if(e.getSource() == bladeMaster) {
            p1.setCharacterClass("Blade Master");
            textPane.append(("\n\nWhat is your gender"));
            male.addActionListener(this);
            pane.add(male);
            female.addActionListener(this);
            pane.add(female);
        }
        else if(e.getSource() == tank) {
            p1.setCharacterClass("Tank");
            textPane.append(("\n\nWhat is your gender"));
            male.addActionListener(this);
            pane.add(male);
            female.addActionListener(this);
            pane.add(female);
        }
        else if(e.getSource() == trickster) {
            p1.setCharacterClass("Trickser");
            textPane.append(("\n\nWhat is your gender"));
            male.addActionListener(this);
            pane.add(male);
            female.addActionListener(this);
            pane.add(female);
        }
        else if(e.getSource() == male) {
            p1.setGender("Male");
            begin.addActionListener(this);
            pane.add(begin);
        }
        else if(e.getSource() == female) {
            p1.setGender("Female");
            begin.addActionListener(this);
            pane.add(begin);
        }

        else if (e.getSource() == defaultCharacter || e.getSource() == begin){
            remove(defaultCharacter);
            remove(customCharacter);
            remove(human);
            remove(dwarf);
            remove(elf);
            remove(bladeMaster);
            remove(tank);
            remove(trickster);
            remove(male);
            remove(female);
            remove(begin);
            repaint();
            textPane.setText("  " + p1.getName() + " has travled northto find the gruantlets of"
                    + " the caped warrior know as Hoinhim.\n Along the way you reached a crossroads going north or west.\nWhich way do you go?");
            north.addActionListener(this);
            pane.add(north);
            west.addActionListener(this);
            pane.add(west);
        }
        else if(e.getSource() == north) {
            remove(north);
            remove(west);
            textPane.setText("The north road was nice and smooth giving you a comfortble ride on your horse." +
            "\nThough this did not last long for you was attacked by a troll causing your horse to get scared and throwing you off her back." +
                    "You have no choic but to fight.\n What do you do?");
        }
        else if(e.getSource() == west) {


        }


    }
}

