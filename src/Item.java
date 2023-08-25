public class Item {

    protected String nom;
    protected String utilite;

    Item(String nom){
        this.nom = nom;
        utilite = "Cet item est inutile.";
    }

    public String getNom(){
        return nom;
    }

    public String getUtilite(){
        return utilite;
    }

    public void utiliser(Vaisseau vaisseau){}

}
