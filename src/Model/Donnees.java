package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Donnees {


	public Donnees() {
		// TODO Auto-generated method stub
		// Jeux de données

		// Création d'une liste d'agences
		Agence a1 = new Agence();
		Agence a2 = new Agence();
		Agence a3 = new Agence();
		Agence a4 = new Agence();
		Agence a5 = new Agence();
		Agence a6 = new Agence();
		Agence a7 = new Agence();
		Agence a8 = new Agence();

		// Création de plusieurs ArrayList(s) d'agences
		ArrayList<Agence> arla1 = new ArrayList<Agence>();
		arla1.add(a1);
		arla1.add(a2);
		arla1.add(a3);

		ArrayList<Agence> arla2 = new ArrayList<Agence>();
		arla2.add(a4);
		arla2.add(a5);

		ArrayList<Agence> arla3 = new ArrayList<Agence>();
		arla3.add(a6);
		arla3.add(a7);
		arla3.add(a8);

		// Création d'une liste de secteurs
		Secteur s1 = new Secteur("Nancy", 54000, "France");
		s1.AddAgence(a1);
		s1.AddAgence(a2);
		s1.AddAgence(a3);

		Secteur s2 = new Secteur("Paris", 75000, "France");
		s1.AddAgence(a4);
		s1.AddAgence(a5);

		Secteur s3 = new Secteur("Lyon", 69001, "France");
		s1.AddAgence(a6);
		s1.AddAgence(a7);
		s1.AddAgence(a8);

		// Création d'une liste de banques
		Banque b1 = new Banque("BANQUE POPULAIRE");
		b1.AddSecteur(s1);
		Banque b2 = new Banque("BANQUE LCL");
		b1.AddSecteur(s2);
		Banque b3 = new Banque("BANQUE BNP PARIBAS");
		b1.AddSecteur(s3);

		// Création & association de la liste de banque au groupement de banque
		GroupementBanque grpb = new GroupementBanque();
		grpb.AddBanque(b1);
		grpb.AddBanque(b2);
		grpb.AddBanque(b3);

		// Création d'une liste de frais
		Frais fr1 = new Frais();
		Frais fr2 = new Frais();
		Frais fr3 = new Frais();

		// Création d'une liste de coffres
		Coffre cf1 = new Coffre(1, "1er Etage", "Armoire forte", "Acier 50L", null, 500000, null);
		Coffre cf2 = new Coffre(2, "2eme Etage", "Armoire forte", "Acier 50L", null, 25000, null);
		Coffre cf3 = new Coffre(3, "2eme Etage", "Armoire forte", "Acier 50L", null, 0, null);
		Coffre cf4 = new Coffre(4, "2eme Etage", "Armoire forte", "Acier 50L", null, 20, null);
		Coffre cf5 = new Coffre(5, "3eme Etage", "Armoire forte", "Acier 50L", null, 0.99, null);

		// Création d'une liste de clients
		ClientBanque cl1 = new ClientBanque(1, "Schmit", "Aurélien", a1, cf1);
		ClientBanque cl2 = new ClientBanque(2, "Castro", "Fidel", a2, cf2);
		ClientBanque cl3 = new ClientBanque(3, "Trump", "Donald", a5, cf4);

		// Création de dates
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String d1 = "01/01/2015";
		String d2 = "12/05/2012";
		String d3 = "25/08/2014";

		Date d1e = new Date();
		try {
			d1e = formatter.parse(d1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date d2e = new Date();
		try {
			d2e = formatter.parse(d1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date d3e = new Date();
		try {
			d3e = formatter.parse(d1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Création des frais
		Frais fra1 = new Frais(1, d1e, (float) 200.0, "Contrôle des huissiers");
		Frais fra2 = new Frais(2, d2e, (float) 100.0, "Taxe");
		Frais fra3 = new Frais(3, d3e, (float) 50.0, "Contrôle de routine");

		// Liste des frais
		ArrayList<Frais> fralist = new ArrayList<Frais>();
		fralist.add(fra1);
		fralist.add(fra2);
		fralist.add(fra3);

		// Ajout de clients aux agences
		a1.AddClient(cl1);
		a1.AddCoffre(cf1);
		a5.AddClient(cl2);
		a5.AddCoffre(cf2);
		a6.AddClient(cl3);
		a6.AddCoffre(cf4);

		// Création des opérations
		Operation op1 = new Operation();
		op1.setFrais(fra1);
		Operation op2 = new Operation();
		op2.setFrais(fra2);
		Operation op3 = new Operation();
		op3.setFrais(fra3);
		Operation op4 = new Operation();

		// Création d'une liste de banque
		ArrayList<Banque> bql = new ArrayList<Banque>();
		bql.add(b1);
		bql.add(b2);
		bql.add(b3);
	}

}
