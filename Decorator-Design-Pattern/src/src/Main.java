import model.BasicIceCream;
import model.ChocolateFlavor;
import model.VanillaFlavor;
import repository.Icecream;

public class Main {
    public static void main(String[] args) {

        //Basic Ice-Cream
        Icecream basicICeCreame = new BasicIceCream();
        System.out.println("Ice-cream price BDT: "+basicICeCreame.cost());

        //Vanilla Ice-Cream
        Icecream vanilla = new VanillaFlavor(basicICeCreame);
        System.out.println(vanilla.cost());

        //Chocolate Ice-Cream
        Icecream chocolate = new ChocolateFlavor(basicICeCreame);
        System.out.println(chocolate.cost());

    }
}
