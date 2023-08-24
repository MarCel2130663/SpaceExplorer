public class Planete{

    private String nom;
    private int carburantConsomme;
    private Item item;

    Planete(String nom, int carburantConsomme, Item item){
        this.nom = nom;
        this.carburantConsomme = carburantConsomme;
        this.item = item;
    }

    public String getNom(){
        return nom;
    }

    public Item getItem(){
        return item;
    }

    public void explorer(Vaisseau vaisseau){
        vaisseau.setCarburant(vaisseau.getCarburant() - carburantConsomme);
    }

}
