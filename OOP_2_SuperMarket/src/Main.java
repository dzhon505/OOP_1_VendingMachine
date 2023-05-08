import Classes.ActionClient;
import Classes.Market;
import Classes.OrdinaryClient;
import Classes.SpecialClient;
import Interfaces.iActorBehaviour;

public class Main {
    public static void main(String[] args) throws Exception{
        Market market = new Market();
        iActorBehaviour item1 = new OrdinaryClient("Boris");
        iActorBehaviour item2 = new SpecialClient("Fedor", 1102);
        iActorBehaviour item3 = new OrdinaryClient("Dasha");
        iActorBehaviour item4 = new ActionClient("Misha", "-50%", 1);
        iActorBehaviour item5 = new ActionClient("Shiha", "-50%", 2);
        iActorBehaviour item6 = new ActionClient("Grisha", "-50%", 3);
        iActorBehaviour item7 = new ActionClient("Kola", "-50%", 4);
        market.acceptToMarket(item1);
        market.acceptToMarket(item2);
        market.acceptToMarket(item3);
        market.acceptToMarket(item4);
        market.acceptToMarket(item5);
        market.acceptToMarket(item6);
        market.acceptToMarket(item7);
        market.update();
    }


}