public class ItemCarburant extends Item{

    ItemCarburant(String nom){
        super(nom);
        utilite = "Vous pouvez faire le plein d'essence!";
    }

    public void utiliser(Vaisseau vaisseau){
        vaisseau.setCarburant(vaisseau.getCarburant() + (int)((Math.random() * 20) + 20));
        System.out.println("Vous avez maintenant " + vaisseau.getCarburant() + " litres d'essence.");
    }

}
