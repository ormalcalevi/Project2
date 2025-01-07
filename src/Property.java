public abstract class Property {
    private String address ="na";
    private double area=0;
    private double price=0;

    public Property(String address, double area, double price) {
        setAddress(address);
        setArea(area);
        setPrice(price);
    }
    public abstract void texlt();

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if(address.equals(null)||address.equals(" ")){
             this.address = "na";
        }
        this.address = address;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        if(area<0) {
            this.area = 0;
        }
        this.area = area;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<0){
            this.price = 0;
        }
        this.price=price;
    }

    @Override
    public String toString() {
        return "Property{" +
                "address='" + address + '\'' +
                ", area=" + area +
                ", price=" + price +
                '}';
    }
}
