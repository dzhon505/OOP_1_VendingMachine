package Interfaces;

import Classes.Actor;
/*
    * Интерфейс поведения покупателей actor
 */

public interface iActorBehaviour extends iReturnOrder{
    void setMakeOrder(boolean makeOrder);
    void setTakeOrder(boolean pickUpOrder);
    boolean isMakeOrder();
    boolean isTakeOrder();
    Actor getActor();
}