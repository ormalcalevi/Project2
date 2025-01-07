import java.util.ArrayList;

public class RealEstateManager {

    private String name;
    private ArrayList<Property> properties;

    public RealEstateManager(String name, ArrayList<Property> properties) {
        setName(name);
        setProperties(properties);
    }
    public RealEstateManager(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Property> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<Property> properties) {
        this.properties = properties;
    }

    public void addProperty (Property obj)
    {
      this.properties.add(obj);
    }

    public ArrayList<Property> arreyMaxPrice( double maxPrice){

        ArrayList<Property> arreyMax=new ArrayList<>();

        for ( Property property : this.properties) {
            if(property.getPrice()<maxPrice){
                arreyMax.add(property);
            }
        }


        return arreyMax;
    }

    public int sumOfProperty()
    {
        int sum=0;
        for ( Property property : this.properties) {
            sum+=property.getPrice();
        }
            return sum;
    }

    public String toString() {
        return "RealEstateManager{" +
                "name='" + name + '\'' +
                ", properties=" + properties +
                '}';
    }
}
