
import java.util.EmptyStackException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws NullPointerException{

        // creation items
        Item[] tabItems = new Item[5];
        tabItems[0] = new ItemCarburant("un bidon d'essence");
        tabItems[1] = new ItemCarburant("des mineraux galactiques");
        tabItems[2] = new ItemET("un copain extraterrestre");
        tabItems[3] = new ItemPointsVie("des materiaux spatiaux");
        tabItems[4] = new ItemPointsVie("un moteur ultra puissant");

        // creation planetes
        Planete[] tabPlanetes = new Planete[9];
        tabPlanetes[0] = new Planete("Mercure", 20, 0, tabItems[0]);
        tabPlanetes[1] = new Planete("Venus", 30, 10, tabItems[1]);
        tabPlanetes[2] = new Planete("Terre", 40, 0, null);
        tabPlanetes[3] = new Planete("Mars", 30, 0, tabItems[1]);
        tabPlanetes[4] = new Planete("Jupiter", 20, 7, tabItems[4]);
        tabPlanetes[5] = new Planete("Saturne", 30, 0, tabItems[3]);
        tabPlanetes[6] = new Planete("Uranus", 40, 0, tabItems[2]);
        tabPlanetes[7] = new Planete("Neptune", 30, 5, null);
        tabPlanetes[8] = new Planete("Pluton", 20, 0, tabItems[0]);

        Vaisseau vaisseau = new Vaisseau();
        Stack<Planete> cheminParcouru = new Stack<>();
        Planete planeteActuelle = tabPlanetes[2];
        Planete nouvellePlanete;
        Scanner sc = new Scanner(System.in);
        int choixUtilisateur;
        char continuer;

        cheminParcouru.push(planeteActuelle);

        System.out.println("\nBienvenue dans Space Explorer!");

        do {
            try{
                System.out.print("Appuyez sur [C] pour continuer.\n>> ");
                continuer = sc.next().toUpperCase().charAt(0);
                InputMismatchException l = new InputMismatchException();
                if(continuer != 'C')
                    throw l;
            }catch(InputMismatchException l){
                do{
                    System.out.print("Appuyez sur [C] pour continuer.\n>> ");
                    continuer = sc.next().toUpperCase().charAt(0);
                }while(continuer != 'C');

            }

            System.out.print("""

                    Que desirez-vous faire?
                    \t[1] Examiner le vaisseau
                    \t[2] Explorer une planete
                    \t[3] Ouvrir l'inventaire
                    \t[4] Annuler le dernier voyage (a vos frais)
                    \t[5] Quitter l'espace et revenir sur Terre
                    >>\s""");
            choixUtilisateur = sc.nextInt();
            System.out.println();

            switch (choixUtilisateur) {
                case 1 -> // examiner le vaisseau
                        System.out.println("Carburant : " + vaisseau.getCarburant() + " litres\nPoints de vie : " + vaisseau.getPointsVie()
                                + " points");

                case 2 -> { // explorer une planete
                    do {
                        nouvellePlanete = tabPlanetes[(int) (Math.random() * 8)];
                    } while (nouvellePlanete == planeteActuelle);
                    nouvellePlanete.explorer(vaisseau);
                    System.out.println("Vous atterrissez sur " + nouvellePlanete.getNom() + ". Vous avez depense " + nouvellePlanete.getCarburantConsomme() + " litres d'essence.");
                    try{
                        NullPointerException u = new NullPointerException();
                        if(nouvellePlanete.getPointsViePerdus() == 0){
                            throw u;
                        }
                        System.out.println("Des dechets spatiaux vous heurtent de plein fouet! Vous perdez " + nouvellePlanete.getPointsViePerdus() + " points de vie.");
                    }
                    catch(NullPointerException u){
                        System.out.println("Vous etes en securite!");
                    }
                    try {
                        NullPointerException n = new NullPointerException();
                        if(nouvellePlanete.getItem() == null)
                            throw n;
                        System.out.println("Vous y decouvrez " + nouvellePlanete.getItem().getNom() + ".\n" + nouvellePlanete.getItem().getUtilite());
                        vaisseau.ajouterInventaire(nouvellePlanete.getItem());
                    }
                    catch(NullPointerException n){
                        System.out.println("Vous n'y decouvrez rien.");
                    }
                    cheminParcouru.push(nouvellePlanete);
                    planeteActuelle = nouvellePlanete;
                }

                case 3 -> { // ouvrir l'inventaire
                    int i;
                    try {
                        NullPointerException e = new NullPointerException();
                        if (vaisseau.getInventaire().isEmpty()){
                            throw e;
                        }
                        System.out.println("Quel item voulez-vous utiliser?");
                        for (i = 0; i < vaisseau.getInventaire().size(); i++) {
                            System.out.println("\t[" + (i+1) + "] " + vaisseau.getInventaire().get(i).getNom());
                        }

                        System.out.println("\t[" + (i + 1) + "] Fermer l'inventaire");
                        System.out.print(">> ");
                        choixUtilisateur = sc.nextInt();
                        if(choixUtilisateur < i + 1){
                            vaisseau.getInventaire().get(choixUtilisateur - 1).utiliser(vaisseau);
                            try{
                                NullPointerException x = new NullPointerException();
                                if(vaisseau.getInventaire().isEmpty()){
                                    throw x;
                                }
                                vaisseau.getInventaire().remove(i-1);
                            }
                            catch (NullPointerException x){
                                System.out.println("Votre inventaire est maintenant vide");
                            }

                        }
                    }
                    catch(NullPointerException e){
                        System.out.println("Votre inventaire est vide.");
                    }
                }

                case 4 -> { // annuler le dernier voyage
                    try{
                        EmptyStackException s = new EmptyStackException();
                        if(cheminParcouru.isEmpty()) {
                            throw s;
                        }
                        cheminParcouru.pop();
                        nouvellePlanete = cheminParcouru.peek();
                        nouvellePlanete.explorer(vaisseau);
                        System.out.println("Vous atterrissez sur " + nouvellePlanete.getNom() + ". Vous avez depense " + nouvellePlanete.getCarburantConsomme() + " litres d'essence.");
                        try {
                            NullPointerException u = new NullPointerException();
                            if (nouvellePlanete.getPointsViePerdus() == 0) {
                                throw u;
                            }
                            System.out.println("Des dechets spatiaux vous heurtent de plein fouet! Vous perdez " + nouvellePlanete.getPointsViePerdus() + " points de vie.");
                        } catch (NullPointerException u) {
                            System.out.println("Vous etes en securite!");
                        }
                        planeteActuelle = nouvellePlanete;
                    }
                    catch(EmptyStackException s) {
                        System.out.println("Impossible de revenir en arriere.");
                    }
                }

                case 5 -> System.out.println("Bon retour a la maison!");
            }
        }while(choixUtilisateur != 5 && vaisseau.getCarburant() > 0 && vaisseau.getPointsVie() > 0);

        // nouveau stack pour afficher chemin parcouru
        Stack<Planete> stack2 = new Stack<>();
        while(!cheminParcouru.empty()){
            stack2.push(cheminParcouru.peek());
            cheminParcouru.pop();
        }

        System.out.println();
        for(int i = 0; i <= stack2.size(); i++){
            System.out.print(stack2.peek().getNom() + " --> ");
            stack2.pop();
        }
        if(choixUtilisateur == 5)
            System.out.print("Terre");

        sc.close();

    }

}
