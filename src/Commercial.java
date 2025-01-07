public class Commercial extends Property{

    private boolean storeroom=false;
    private double yield=0.0;

    public Commercial(String address, double area, double price, boolean storeroom, double yield) {
        super(address, area, price);
        setStoreroom(storeroom);
        setYield(yield);
    }
    public Commercial(String address, double area, double price, double yield) {
        super(address, area, price);
        setYield(yield);
    }

    @Override
    public void texlt() {
        System.out.print(super.getPrice()*0.05);
    }

    public boolean isStoreroom() {
        return storeroom;
    }

    public void setStoreroom(boolean storeroom) {
        this.storeroom = storeroom;
    }

    public double getYield() {
        return yield;
    }

    public void setYield(double yield) {
        if(yield<0){
            this.yield = 0.0;
        }
        this.yield = yield;
    }


    @Override
    public String toString() {
        return "Commercial{" +
                "storeroom=" + storeroom +
                ", yield=" + yield + " " + super.toString()+
                '}';
    }
}
