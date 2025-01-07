import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class exercise2Main {

    static class PriceException extends Exception {

        public PriceException(String message) {
            super(message);
        }
    }

    private static void check(int price) throws PriceException {
        if (price < 0) {
            throw new PriceException("Illegal serial number - a negative number");
        }

    }

    static RealEstateManager manager = new RealEstateManager("Avi");
    private static ArrayList<Property> arrey = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);


    public static void start() {
        arrey = DataManager.PropertyArrey();
        manager.setProperties(arrey);
        Menu();
    }

    private static void Menu() {
        int input = 0;
        boolean bool = true;
        while (bool) {
            System.out.println("choose one option : 1=propertiesList , 2=financialReport , 3=commercialYield, 4=PropertiesByCity ,5=NumberOfCities, -1=exit!");
            input = scanner.nextInt();

            switch (input) {

                case 1:
                    System.out.println("1=propertiesList");
                    System.out.println("enter Maxprice");
                    double priceMax = scanner.nextDouble();
                    propertiesList(priceMax);
                    break;

                case 2:
                    System.out.println("2=financialReport");
                    financialReport();
                    break;

                case 3:
                    System.out.println("3=commercialYield");
                    commercialYield();
                    break;

                case 4:
                    System.out.println("4=commercialYield");
                    System.out.println("enter city");
                    String city = scanner.next();
                    PropertiesByCity(city);
                    break;

                case 5:
                    System.out.println("5=NumberOfCities");
                    NumberOfCities();
                    break;

                case -1:
                    bool = false;
                    System.out.println("exit BYE BYE");
                    break;
            }
        }


    }

    private static void propertiesList(double maxPrice){
        try {
            check((int)maxPrice);
        } catch (PriceException e) {
            System.out.println(e.getMessage());
        }
        ArrayList<Property> arreyMax = new ArrayList<>();

        arreyMax=manager.arreyMaxPrice(maxPrice);
        for ( Property property : arreyMax) {
            System.out.println(property.toString());
        }
    }

    private static void financialReport(){
        for ( Property property : manager.getProperties()) {
            if(property instanceof Office){
                Office office=(Office) property;
                System.out.print("Office must pay: "); office.texlt(); System.out.print(" tax");
                System.out.println();
            }
            if(property instanceof Commercial){
                Commercial commercial=(Commercial) property;
                System.out.print("Commercial must pay: "); commercial.texlt(); System.out.print(" tax");
                System.out.println();
            }
            if(property instanceof Plot){
                Plot plot=(Plot) property;
                System.out.print("Plot must pay: "); plot.texlt(); System.out.print(" tax");
                System.out.println();
            }
            if(property instanceof Apartment){
                Apartment apartment =(Apartment) property;
                System.out.print("Aparment must pay: "); apartment.texlt(); System.out.print(" tax");
                System.out.println();
            }
            if(property instanceof Vila ){
                Vila vila=(Vila) property;
                System.out.print("Vila must pay: "); vila.texlt(); System.out.print(" tax");
                System.out.println();
            }
            if(property instanceof Vacation){
                Vacation vacation=(Vacation) property;
                System.out.print("Vacation must pay: "); vacation.texlt(); System.out.print(" tax");
                System.out.println();
            }
    }
}

    private static void commercialYield(){
        double sum=0;
        for ( Property property : manager.getProperties()) {

                if(property instanceof Commercial){
                    Commercial commercial=(Commercial) property;
                    sum+=commercial.getYield();
                }
            }
        System.out.println("The total yield:"+sum);
        }
//4:
    public static void propertiesByCity() {
        System.out.print("Enter city name: ");
        String cityInput = scanner.nextLine();
        String city1 = cityInput.toLowerCase();
        city1 = city1.replace("-", " ");

        boolean check = true;
        for(Property property : manager.getProperties()) {
            String city = property.getAddress().toLowerCase();

            if(city1.equals(city)) {
                System.out.println(property + "\n");
                check = false;
            }
        }

        if(check) {
            System.out.println("No property was found in " + cityInput + ".\n");
        }
    }

//5:
    private static void NumberOfCities(){
        String cities="";
        for ( Property property : manager.getProperties()) {
            if(!(cities.contains(property.getAddress()))){
               cities= cities.concat(property.getAddress());
               cities= cities.concat(",");
            }
        }
        String [] splits=cities.split(",");
        System.out.println("the number of cities:" + splits.length);

        for (int i = 0; i < splits.length; i++) {
            System.out.println(splits[i]);
        }


    }

}
