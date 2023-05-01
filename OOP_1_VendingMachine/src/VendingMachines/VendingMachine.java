package VendingMachines;

import Drinks.Drink;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private int volume;
    private List<Drink> drinks;
    private List<String> workLog;
    public VendingMachine(int volume){
        this.volume = volume;
        drinks = new ArrayList<>();
        workLog = new ArrayList<>();
    }

    public void addDrink(Drink prod){
        drinks.add(prod);
    }






    public List<Drink> getProdAll(){
        return drinks;
    }
}
