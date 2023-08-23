public class Planetes{

    private String nom;
    private int carburantConsomme;

    Planetes(String nom, int carburantConsomme){
        this.nom = nom;
        this.carburantConsomme = carburantConsomme;
    }

    public void explorer(Vaisseau vaisseau){
        vaisseau.setCarburant(vaisseau.getCarburant() - carburantConsomme);
    }

}
