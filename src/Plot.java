public class Plot extends Property{
    public enum Type { URBAN, AGRICULTURAL, INDUSTRIAL };

    private Type type;
    public Plot(String address, double area, double price , Type type) {
        super(address, area, price);
        this.type=type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void texlt() {
        switch (this.type){
            case URBAN ->System.out.print(super.getPrice()*0.10);
            case AGRICULTURAL -> System.out.print(super.getPrice()*0.02);
            case INDUSTRIAL -> System.out.print(super.getPrice()*0.05);
        }

    }

    @Override
    public String toString() {
        return "Plot{" +
                "type=" + type + "="+super.toString()+
                '}';
    }
}
