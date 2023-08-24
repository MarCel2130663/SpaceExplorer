import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args){

        // creation items
        ItemCarburant bidonEssence = new ItemCarburant("un bidon d'essence");
        ItemCarburant minerauxGalactiques = new ItemCarburant("des mineraux galactiques");
        ItemCarburant extraterrestre = new ItemCarburant("un copain extraterrestre");
        ItemPointsVie materiauxSpatiaux = new ItemPointsVie("des materiaux spatiaux");
        ItemPointsVie moteurPuissant = new ItemPointsVie("un moteur ultra puissant");

        // creation planetes
        Planete[] tabPlanetes = new Planete[9];
        tabPlanetes[0] = new Planete("Mercure", 20, bidonEssence);
        tabPlanetes[1] = new Planete("Venus", 30, materiauxSpatiaux);
        tabPlanetes[2] = new Planete("Terre", 40, null);
        tabPlanetes[3] = new Planete("Mars", 30, minerauxGalactiques);
        tabPlanetes[4] = new Planete("Jupiter", 20, moteurPuissant);
        tabPlanetes[5] = new Planete("Saturne", 30, materiauxSpatiaux);
        tabPlanetes[6] = new Planete("Uranus", 40, extraterrestre);
        tabPlanetes[7] = new Planete("Neptune", 30, null);
        tabPlanetes[8] = new Planete("Pluton", 20, bidonEssence);

        Vaisseau vaisseau = new Vaisseau();
        Stack<Planete> cheminParcouru = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int choixUtilisateur;

        System.out.println("Bienvenue dans Space Explorer!\n");

        System.out.println("Que desirez-vous faire?\n[1] Examiner le vaisseau\n[2] Explorer une planete\n" +
                "[3] Ouvrir l'inventaire\n[4] Annuler le dernier voyage (a vos frais)\n");
        choixUtilisateur = sc.nextInt();

        switch(choixUtilisateur) {
            case 1:
                System.out.println("Carburant : " + vaisseau.getCarburant() + "litres\nPoints de vie : " + vaisseau.getPointsVie()
                        + "points");

            case 2:
                System.out.println("Vous atterrissez sur " + tabPlanetes[(int)(Math.random() * 8)].getNom());
        }

    }

}
