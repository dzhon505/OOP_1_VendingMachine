package Interfaces;

import Classes.Actor;

import java.util.List;
/*
    * Интерфейс методов работы market
 */
public interface iMarketBehaviour {
    void acceptToMarket(iActorBehaviour actor);
    void releaseFromMarket(List<Actor> actors);
    void update();
}