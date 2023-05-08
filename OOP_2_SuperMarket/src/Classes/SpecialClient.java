package Classes;
/*
 * Создали класс наследник Actor
 */
public class SpecialClient extends Actor{
    private int idVip;
    /*
     * Конструктор
     */
    public SpecialClient(String name, int id){
        super(name);
        this.idVip = id;
    }

    @Override
    public String getName() {
        return super.name;
    }
    public int getVipId(){
        return idVip;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        super.isTakeOrder = pickUpOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }
    @Override
    public Actor getActor() {
        return this;
    }

    @Override
    public void setReturnOrder(boolean returnOrder) {
        super.isReturnOrder = returnOrder;
    }

    @Override
    public void setReturnedOrder(boolean returnedOrder) {
        super.isReturnedOrder = returnedOrder;
    }

    @Override
    public boolean isReturnOrder() {
        return super.isReturnOrder;
    }

    @Override
    public boolean isReturnedOrder() {
        return super.isReturnedOrder;
    }
}