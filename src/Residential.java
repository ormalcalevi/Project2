public abstract class Residential  extends Property{

    private int parkingLots=0;

    public Residential(String address, double area, double price, int parkingLots) {
        super(address, area, price);
        setParkingLots(parkingLots);
    }
    @Override
    public void texlt() {

    }

    public int getParkingLots() {
        return parkingLots;
    }

    public void setParkingLots(int parkingLots) {
        this.parkingLots = parkingLots;
    }

    @Override
    public String toString() {
        return "Residential{" +super.toString()+
                " parkingLots=" + parkingLots +
                '}';
    }
}
