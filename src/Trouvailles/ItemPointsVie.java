package Trouvailles;
import Vehicule.Vaisseau;

public class ItemPointsVie extends Item {

    public ItemPointsVie(String nom){
        super(nom);
        utilite = "Votre vaisseau se portera mieux!";
    }

    public void utiliser(Vaisseau vaisseau){
        vaisseau.setPointsVie(vaisseau.getPointsVie() + (int)((Math.random() * 5) + 5));
        System.out.println("Vous avez maintenant " + vaisseau.getPointsVie() + " points de vie.");
    }

}
