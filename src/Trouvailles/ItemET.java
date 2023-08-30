package Trouvailles;
import Vehicule.Vaisseau;

public class ItemET extends Item {

    public ItemET(String nom){
        super(nom);
        utilite = "Apprenez a le connaitre!";
    }

    public String getNom(){
        return nom;
    }

    public String getUtilite(){
        return utilite;
    }

    public void utiliser(Vaisseau vaisseau){
        vaisseau.getInventaire().clear();
        System.out.println("L'extraterrestre vole tout le contenu de votre vaisseau.");
    }

}
