import Drinks.Drink;
import Drinks.HotDrinks;
import VendingMachines.VendingMachine;

public class Main {
    public static void main(String[] args) throws Exception{
        VendingMachine itemMachine = new VendingMachine(300);

        itemMachine.addDrink(new Drink("Aqua Minerale", 40.0, 0.5));
        itemMachine.addDrink(new Drink("Cola", 100.0, 1));
        itemMachine.addDrink(new Drink("Sprite", 180.0, 2));
        itemMachine.addDrink(new HotDrinks("Americano", 80.0, 0.2, 90));
        itemMachine.addDrink(new HotDrinks("Caputchino", 150.0, 0.4, 70));
        itemMachine.addDrink(new HotDrinks("Latte", 160.0, 0.3, 65));

        for (Drink prod :
                itemMachine.getProdAll()) {
            System.out.println(prod.toString());
        }
    }}