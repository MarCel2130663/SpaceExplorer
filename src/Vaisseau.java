import java.util.ArrayList;
import java.util.List;

public class Vaisseau {

    private int carburant;
    private int pointsDeVie;
    private List<Item> inventaire = new ArrayList<>();

    Vaisseau(int carburant, int pointsDeVie){
        carburant = 500;
        pointsDeVie = 50;
    }

    public int getCarburant(){
        return carburant;
    }

    public void setCarburant(int carburant) {
        this.carburant = carburant;
    }

    public void ajouterInventaire(Item item){
        inventaire.add(item);
    }


}
