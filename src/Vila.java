public class Vila extends Residential{

    private int levels=1;

    public Vila(String address, double area, double price, int parkingLots, int levels) {
        super(address, area, price, parkingLots);
        setLevels(levels);
    }

    @Override
    public void texlt() {
        System.out.print(super.getPrice()*0.08);
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        if(levels<1){
            this.levels=1;
        }
        this.levels = levels;
    }

    @Override
    public String toString() {
        return "Vila{" +
                "levels=" + levels + "  "+super.toString()+
                '}';
    }
}
