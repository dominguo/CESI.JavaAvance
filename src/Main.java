import Controller.AuthController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame{

	/**
	 * @param authController
	 */
	private AuthController authController = null;

	/**
	 *
	 * @constructor Main
	 */
	public Main(AuthController authController){
		this.authController = authController;
	}

	/**
	 *
	 * get & set
	 */
	public AuthController authController()
	{
		return this.authController;
	}

	public void setAuthController(AuthController authController)
	{
		this.authController = authController;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Model.Donnees db = new Model.Donnees();
		afficheFenetreAuth();
	}


	public static void afficheFenetreAuth(){

		JFrame fenetre = new JFrame();

		//Définit un titre pour notre fenêtre
		fenetre.setTitle("MaBanque");
		//Définit sa taille : 400 pixels de large et 100 pixels de haut
		fenetre.setSize(800, 400);
		//Nous demandons maintenant à notre objet de se positionner au centre
		fenetre.setLocationRelativeTo(null);
		//Termine le processus lorsqu'on clique sur la croix rouge
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Et enfin, la rendre visible
		fenetre.setVisible(true);

		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());

		JButton btnValider = new JButton("Valider");
		JButton btnAnnuler = new JButton("Annuler");

		JTextField tfPrenom = new JTextField();
		JTextField tfNom = new JTextField();
		tfPrenom.setColumns(10);
		tfNom.setColumns(10);

		JLabel lPrenom = new JLabel("Prenom: ");
		JLabel lNom = new JLabel("Nom: ");


		/*Ajout des composants au Panel*/
		panel.add(btnValider);
		panel.add(btnAnnuler);
		panel.add(tfPrenom);
		panel.add(tfNom);
		panel.add(lPrenom);
		panel.add(lNom);


		/*Ajout du panel à la Fenetre*/
		fenetre.add(panel);


		// Dans la vue -> renvoie vers la fonction qui va bien dans le controller
		btnValider.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				AuthController authController = new AuthController();

				String prenom = tfPrenom.getText();
				String nom = tfNom.getText();

				authController.Authentification(prenom, nom);



				// Nouvelle fenetre
				fenetre.setTitle("You clicked me!");
				panel.setBackground(Color.red);

			}
		});

	}
}
