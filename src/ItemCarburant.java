public class ItemCarburant implements Item{

    String nom;
    String fonction;

    ItemCarburant(String nom){
        this.nom = nom;
        fonction = "Vous avez fait le plein d'essence!";
    }

    public String getNom(){
        return nom;
    }

    public String getFonction(){
        return fonction;
    }

    public void utiliser(Vaisseau vaisseau){
        vaisseau.setCarburant(vaisseau.getCarburant() + (int)((Math.random() * 10) + 20));
    }

}
