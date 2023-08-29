public class Planete{

    private String nom;
    private int carburantConsomme;
    private int pointsViePerdus;
    private Item item;

    Planete(String nom, int carburantConsomme, int pointsViePerdus, Item item){
        this.nom = nom;
        this.carburantConsomme = carburantConsomme;
        this.pointsViePerdus = pointsViePerdus;
        this.item = item;
    }

    public String getNom(){
        return nom;
    }

    public int getCarburantConsomme(){
        return carburantConsomme;
    }

    public int getPointsViePerdus(){
        return pointsViePerdus;
    }

    public Item getItem(){
        return item;
    }

    public void explorer(Vaisseau vaisseau){
        vaisseau.setCarburant(vaisseau.getCarburant() - carburantConsomme);
        vaisseau.setPointsVie(vaisseau.getPointsVie() - pointsViePerdus);
    }

}
