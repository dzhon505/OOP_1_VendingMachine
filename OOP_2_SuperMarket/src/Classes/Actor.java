package Classes;
import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;
/*
    * Создали обстрактный класс Actor
    * Имплементировали в него интерфейсы
    * добавили неизменяемые поля
 */
public abstract class Actor implements iActorBehaviour, iReturnOrder{
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    protected boolean isReturnOrder;
    protected boolean isReturnedOrder;

/*
    * Создали конструктор класса Actor
 */
    public Actor(String name) {
        this.name = name;
    }
/*
    *Ввели абстрактные переменные
 */
    public abstract String getName();
    public abstract int getVipId();
//    public abstract String getActionName();
    public abstract int getCount();

}