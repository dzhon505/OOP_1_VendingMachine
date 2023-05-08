package Interfaces;

/*
    * Интерфейс работы очереди queue
 */
public interface iQueueBehaviour {
    void takeInQueue(iActorBehaviour actor);
    void releaseFromQueue();
    void takeOrder();
    void giveOrder();
    void returnOrder();
    void returnedOrder();



}