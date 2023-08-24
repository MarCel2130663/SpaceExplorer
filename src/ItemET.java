public class ItemET implements Item{

    String nom;
    String fonction;

    ItemET(String nom){
        this.nom = nom;
        fonction = "Il vole tout le contenu de votre inventaire!";
    }

    public String getNom(){
        return nom;
    }

    public String getFonction(){
        return fonction;
    }

    public void utiliser(Vaisseau vaisseau){
        vaisseau.getInventaire().clear();
    }

}
