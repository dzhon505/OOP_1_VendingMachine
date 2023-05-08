package Classes;

public class ActionClient extends Actor{
    private int count;
    private int idVip;
    private String actionName;
    public ActionClient(String name, String actionName, int count) {
        super(name);
        this.actionName = actionName;
        this.count = count;
    }

    @Override
    public int getVipId(){
        return idVip;
    }

    @Override
    public int getCount() {
        return count;
    }



    @Override
    public String getName() {
        return super.name;
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
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
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
