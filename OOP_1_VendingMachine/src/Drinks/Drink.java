package Drinks;

// Базовый клас напиток
public class Drink {
    private String name; //Наименование
    private double price; // Цена
    private double volume; // Объем

    // Конструктор напитка

    public Drink(String name, double price, double volume){
        this.name = name;
        this.price = price;
        this.volume = volume;
    }

    // Геттеры 3 параметров
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getVolume() {
        return volume;
    }


    // Сеттеры 3 параметров
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if (price<=0){  // Условие не коректной цены
            throw new IllegalStateException(String.format("Цена указана некоректно!", price));
        }else
            this.price = price;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    // Переопределение вывода
    @Override
    public String toString() {
        return "Drink{" +
                "name'" + name + '\'' +
                ", cost=" + price +" rub" +
                ", volume=" + volume +" ml" +
                '}';
    }
}
