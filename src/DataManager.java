import javax.xml.stream.events.StartElement;
import java.util.ArrayList;

public class DataManager {
    //why static
    public static ArrayList<Property> PropertyArrey() {

        ArrayList<Property> arrey = new ArrayList<>();

        arrey.add(new Plot("Kfar Saba", 16.5, 1500, Plot.Type.URBAN));
        arrey.add(new Plot("Ranna", 86.5, 5600, Plot.Type.AGRICULTURAL));
        arrey.add(new Apartment("Isreal", 56.3, 6555, 50, 6));
        arrey.add(new Apartment("Hod Hasharon", 36.9, 9874, 20, 4));
        arrey.add(new Vacation("Kfar Saba", 36.9, 9874, 20, 4));
        arrey.add(new Vacation("Tel Aviv", 399.9, 98614, 28, 7));
        arrey.add(new Vila("Mimi", 55.98, 5666, 12, 2));
        arrey.add( new Vila("Herzelia", 66.44, 9876, 14, 4));
        arrey.add(new Commercial("Natanya", 23.6, 456, 22.5));
        arrey.add(new Commercial("Israel", 63.6, 856, 65.5));
        arrey.add(new Office("Bat Yam", 38.4, 2000));
        arrey.add(new Office("Bat Yam", 67.2, 3500));

        return arrey;
    }

}