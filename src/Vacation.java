public class Vacation extends Residential{
    private int guests=1;

    public Vacation(String address, double area, double price, int parkingLots, int guests) {
        super(address, area, price, parkingLots);
        setGuests(guests);
    }

    @Override
    public void texlt() {
        System.out.print(super.getPrice()*0.25);
    }

    public int getGuests() {
        return guests;
    }

    public void setGuests(int guests) {
        if(guests<1)
        {
            this.guests = 1;
        }
        this.guests = guests;
    }

    @Override
    public String toString() {
        return "Vacation{" +
                "guests=" + guests +
                '}';
    }
}
