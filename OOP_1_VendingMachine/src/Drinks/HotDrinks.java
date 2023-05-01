package Drinks;

public class HotDrinks extends Drink{ // наследование класса Drink
    private double temp;
    public HotDrinks(String name, double price, double volume, double temp){
        super(name, price, volume);
        this.temp = temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getTemp() {
        return temp;
    }

    // Переопределение вывода для HotDrinks
    @Override
    public String toString() {
        return "Drink{" +
                "name'" + super.getName() + '\'' +
                ", cost=" + super.getPrice() +" rub" +
                ", volume=" + super.getVolume() +" ml" +
                ", temp=" + temp + " \u2103"+
                '}';
    }

}
