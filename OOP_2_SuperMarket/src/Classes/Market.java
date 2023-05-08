package Classes;

import java.util.ArrayList;
import java.util.List;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;
import Interfaces.iActorBehaviour;

public class Market implements iMarketBehaviour, iQueueBehaviour {
    /*
        * Создали список (очередь покупателей)
     */
    private List<iActorBehaviour> queue;
    /*
        * инициализируем queue
     */
    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }
    /*
        * Метод начало работы маркета
        * условие проверки на VIP
        * выполение метода добавления в очерердь takeInQueue
     */
    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        if (actor.getActor().getVipId() == 0){
            System.out.println(actor.getActor().getName()+" клиент пришел в магазин ");
            takeInQueue(actor);
        }else {
        System.out.println(actor.getActor().getName()+" "+actor.getActor().getVipId()+" клиент пришел в магазин ");
        takeInQueue(actor);
        }
    }
    /*
        * метод добавления в очередь queue
        * проверка акционного покупателя
     */
    @Override
    public void takeInQueue(iActorBehaviour actor) {

        if (actor.getActor().getCount()>3){
            System.out.println(actor.getActor().getName()+ " Акционный товар закончился ");
            System.out.println(actor.getActor().getName()+ " клиент ушел из магазина ");
        }else {
            this.queue.add(actor);
        if (actor.getActor().getVipId() == 0){
            System.out.println(actor.getActor().getName()+" клиент добавлен в очередь ");
        }else {
            System.out.println(actor.getActor().getName() + " " + actor.getActor().getVipId() + " клиент добавлен в очередь ");
        }}

    }
    /*
        * метод конец работы маркета
     */
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor:actors){
            if (actor.getActor().getVipId() == 0){
                System.out.println(actor.getName()+" клиент ушел из магазина ");
                this.queue.remove(actor);
            }else {
                System.out.println(actor.getName() + " " + actor.getActor().getVipId() + " клиент ушел из магазина ");
                this.queue.remove(actor);
            }
        }

    }
    /*
        * метод обновления выполненых действий
     */
    @Override
    public void update() {
        takeOrder();
        giveOrder();
        returnOrder();
        returnedOrder();
        releaseFromQueue();
    }

    /*
        * Метод выхода из очереди
     */
    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor:queue){
            if (actor.isTakeOrder()){
                releaseActors.add(actor.getActor());
                if (actor.getActor().getVipId() == 0){
                    System.out.println(actor.getActor().getName()+" клиент ушел из очереди ");
                }else {
                    System.out.println(actor.getActor().getName() +" "+ actor.getActor().getVipId()+" клиент ушел из очереди ");
                }
            }
        }
        releaseFromMarket(releaseActors);
    }
    /*
        * метод сделал закза
     */
    @Override
    public void takeOrder() {
        for (iActorBehaviour actor:queue){
            if (!actor.isMakeOrder()){
                actor.setMakeOrder(true);
                if (actor.getActor().getVipId() == 0){
                    System.out.println(actor.getActor().getName()+" клиент сделал заказ ");
                }else {
                    System.out.println(actor.getActor().getName()+" "+ actor.getActor().getVipId() + " клиент сделал заказ ");
                }
            }
        }
    }
    /*
        * метод получения заказа
     */
    @Override
    public void giveOrder() {
        for(iActorBehaviour actor:queue){
            if(actor.isMakeOrder()){
                actor.setTakeOrder(true);
                if (actor.getActor().getVipId() == 0){
                    System.out.println(actor.getActor().getName()+" клиент получил свой заказ ");
                }else {
                    System.out.println(actor.getActor().getName() +" "+ actor.getActor().getVipId() + " клиент получил свой заказ ");
                }
            }
        }
    }
    /*
        * Метод оформления возврата
     */
    @Override
    public void returnOrder() {
        for(iActorBehaviour actor:queue){
            if(!actor.isReturnOrder()){
                actor.setReturnOrder(true);
                System.out.println(actor.getActor().getName()+" клиент возвращает товар ");
            }
        }
    }
    /*
        * метод возврат завершен
     */
    @Override
    public void returnedOrder() {
        for (iActorBehaviour actor:queue){
            if (actor.isReturnOrder()){
                actor.setReturnedOrder(true);
                System.out.println(actor.getActor().getName()+" клиент вернул товар ");
            }
        }
    }




}