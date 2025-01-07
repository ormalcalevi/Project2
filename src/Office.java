public class Office extends Property{

    public Office(String address, double area, double price) {
        super(address, area, price);
    }

    @Override
    public void texlt() {
        System.out.print(super.getPrice()*0.05);
    }
    @Override
    public String toString() {
        return "Office{" + super.toString()+"}";
    }


}
