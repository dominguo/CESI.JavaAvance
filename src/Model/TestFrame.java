package Model; /**
 * Created by pcthomas on 05/10/2016.
 */

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.io.*;
import java.text.AttributedCharacterIterator;
import java.awt.Graphics;
import javax.swing.JPanel;

public class TestFrame extends JFrame {

    public static void main(String[] args) {

        //new Model.TestFrame();

        JFrame fenetre = new JFrame();

        //Définit un titre pour notre fenêtre
        fenetre.setTitle("Ma première fenêtre Java");
        //Définit sa taille : 400 pixels de large et 100 pixels de haut
        fenetre.setSize(800, 400);
        //Nous demandons maintenant à notre objet de se positionner au centre
        fenetre.setLocationRelativeTo(null);
        //Termine le processus lorsqu'on clique sur la croix rouge
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Et enfin, la rendre visible
        fenetre.setVisible(true);

        JPanel panel = new JPanel();


        JButton btn = new JButton("Cliquez ici !");

        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                fenetre.setTitle("You clicked me!");
                panel.setBackground(Color.red);
            }
        });


        panel.add(btn);

        fenetre.add(panel);




    }


}
