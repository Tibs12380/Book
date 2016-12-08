//Gui.java
/*
 *
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui extends JFrame implements ActionListener{
    //creats a JTextArea
    private JTextArea textPane = new JTextArea("Would you like to create a new character?");
//create buttons
    private JButton defaultCharacter = new JButton("Use Default Character");
    private JButton customCharacter = new JButton("Create Custom Character");
    private JButton human = new JButton("Human");
    private JButton dwarf = new JButton("Dwarf");
    private JButton elf = new JButton("Elf");
    private JButton bladeMaster = new JButton("Blade Master");
    private JButton tank = new JButton("Tank");
    private JButton trickster = new JButton("Trickster");
    private JButton male = new JButton("Male");
    private JButton female = new JButton("Female");
    private JButton begin = new JButton("Begin your adventure");
    private JButton north = new JButton("North");
    private JButton west = new JButton("West");
    private JButton strike = new JButton("Strike!");
    private JButton climbDown = new JButton("Climb Down");
    private JButton stayUp = new JButton("Stay Up");
    private JButton enter = new JButton("Enter the cave");
    private JButton carryOn = new JButton("Carry On");
    private JButton goOn = new JButton("Continue");
    private JButton turnBack = new JButton("Turn Back");
    //creates the Container
    private Container pane = getContentPane();
    //intalises the player class
    private Player p1 = new Player();

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
        setDefaultCloseOperation( EXIT_ON_CLOSE );
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //what happens if buttons are presses
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
            textPane.setText("  " + p1.getName() + " has travled northto find the gauntlets of"
                    + " the caped warrior know as Hoinhim.\n Along the way you reached a crossroads going north or west.\nWhich way do you go?");
            north.addActionListener(this);
            pane.add(north);
            west.addActionListener(this);
            pane.add(west);
        }
        else if(e.getSource() == north) {
            remove(north);
            remove(west);
            textPane.setText("The north road was nice and smooth giving you a comfortable ride on your horse." +
            "\nThough this did not last long for you was attacked by a troll causing your horse to get scared and throwing you off her back." +
                    "You have no choice but to fight.\n What do you do?");
            strike.addActionListener(this);
            pane.add(strike);
        }
        else if(e.getSource() == strike) {
            remove(strike);
            repaint();
            if(p1.getCharacterClass()=="Tank"){
                textPane.setText("You kill the troll be slamming your body against his thus pushing him down a hidden hole");
            }
            else if(p1.getCharacterClass()=="Blade Master"){
                textPane.setText("You kill the troll with two slices from each of your swords removing both his arms and legs");
            }
            else if(p1.getCharacterClass() == "Trickster"){
                textPane.setText("You look through you bag to find something to at the troll.\nWithout looking or caring" +
                        "you start to fling items behind you,\n when you turn around with the item you want to throw you notice that the troll  " +
                        "has a screwdriver in it month. The troll falls forward forcing the screwdriver into its brain.");
            }
            textPane.append("\nAfter dealing with the troll and losing your horse you notice a ledge that can be climbed down."+
                    "\n Do you climb down?");

            climbDown.addActionListener(this);
            pane.add(climbDown);
            stayUp.addActionListener(this);
            pane.add(stayUp);

        }
        else if(e.getSource() == climbDown) {
            if(p1.getRace() == "Human" && p1.getGender() == "Female"){
                remove(climbDown);
                remove(stayUp);
                repaint();
                textPane.setText("While climbing down the side you see a spider causing you to scream which makes the rock your holding onto to fall.\n" +
                        "Sadly you plummet to your death.\nThe end");
            }
            else{
                remove(climbDown);
                remove(stayUp);
                repaint();
                textPane.setText("You make it to an entrance of a cave.\nDo you enter the cave or do you carry on going down?");
                enter.addActionListener(this);
                pane.add(enter);
                carryOn.addActionListener(this);
                pane.add(carryOn);
            }
        }
        else if(e.getSource() == enter) {
            if(p1.getRace() == "Human" && p1.getCharacterClass()!= "Trickster"){
                remove(enter);
                remove(carryOn);
                repaint();
                textPane.setText("When you enter the cave a minotaur charges at you throwing you out the entrance." +
                        "\nYou hit off the wall behind you, the impact leaves shatters all your internal bones and creates " +
                        "an your body is held in the wall from the create you made on it.\nThe end");
            }
            else{
                remove(enter);
                remove(carryOn);
                repaint();
                textPane.setText("When you enter the cave a minotaur charges at you, " +
                        "\nluckily you are agile enough to move out of the way just in time.\n" +
                        "The minotaur however isnt and falls to his death.\nYou carry on down the cave and and riddle appears" +
                        "\"Only those who are young in heart may continue\"");
                goOn.addActionListener(this);
                pane.add(goOn);
                turnBack.addActionListener(this);
                pane.add(turnBack);
            }
        }
        else if(e.getSource() == goOn) {
            remove(goOn);
            remove(turnBack);
            repaint();
            if(p1.getAge()>=51){
                textPane.setText("You hear a voice bellow above you that says you are not \nyoung of heart thus have broken the " +
                        "seal of Hoinhim\nI therefore have no choice to smite you.\n You are melt from the inside, with your blood turning into steam, " +
                        "melts your veins, arteries, organs and bone.\nThe End");
            }
            else{
                remove(goOn);
                remove(turnBack);
                repaint();
                textPane.setText("You enter without a problem, grab the grunalets,and return home a hero.\nThe king" +
                        "makes you the earl of the town and gives you a new house.\nThe End");

            }
        }
        else if(e.getSource() == turnBack) {
            remove(turnBack);
            remove(goOn);
            repaint();
            textPane.setText("You go home failing your quest but you with the experiance you gained " +
                    " you became a respected solider in the kings army.\n The End");
        }
        else if(e.getSource() == carryOn) {
            textPane.setText("The wall started to crumble above you. A hundred rocks fall on top of you which cause you to fall off the wall,\n" +
                    "although you survive the fall the falling rolls flatten your body. The End");
        }
        else if(e.getSource() == west) {
            textPane.setText("The path started to crumble, and your horse lost its footing sending you into the abyss below.\n" +
                    "As you fall you see a glimmer of light which is reflecting from the gauntlets you are looking for.\n" +
                    "Sadly you don't survive the fall. The End");
        }


    }
}

