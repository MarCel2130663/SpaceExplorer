import java.util.ArrayList;
import java.util.List;

public class Vaisseau {

    private int carburant;
    private int pointsVie;
    private List<Item> inventaire;

    Vaisseau(){
        carburant = 500;
        pointsVie = 50;
        inventaire = new ArrayList<>();
    }

    public int getCarburant(){
        return carburant;
    }

    public void setCarburant(int carburant) {
        this.carburant = carburant;
    }

    public int getPointsVie(){
        return pointsVie;
    }

    public void setPointsVie(int pointsVie){
        this.pointsVie = pointsVie;
    }

    public List<Item> getInventaire(){
        return inventaire;
    }

    public void ajouterInventaire(Item item){
        inventaire.add(item);
    }


}
