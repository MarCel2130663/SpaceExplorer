public class ItemPointsVie implements Item {

    String nom;
    String fonction;

    ItemPointsVie(String nom){
        this.nom = nom;
        fonction = "Votre vaisseau se porte mieux!";
    }

    public String getNom(){
        return nom;
    }

    public String getFonction(){
        return fonction;
    }

    public void utiliser(Vaisseau vaisseau){
        vaisseau.setPointsVie(vaisseau.getPointsVie() + (int)((Math.random() * 5) + 10));
    }

}
