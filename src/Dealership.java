import java.util.ArrayList;
import java.util.List;

class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    //CONSTRUCTOR
    Dealership(String name, String address, String phone){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<Vehicle>();
    }
    public String toString(){
        return String.format("DEALERSHIP NAME: '%s' #CARS: %d\n", this.name, this.inventory.size());
    }
    //METHODS
    public List<Vehicle> getVehiclesByPrice(double min, double max){
        ArrayList<Vehicle> matches = new ArrayList<>();
        for(Vehicle v : inventory){
            if(v.price >= min && v.price <= max){
                matches.add(v);
            }
        }
        return matches;
    }

    public List<Vehicle> getVehiclesByMakeModel(String make, String model){
        ArrayList<Vehicle> matches = new ArrayList<>();
        for(Vehicle v : inventory){
            if(v.make.equalsIgnoreCase(make) && v.model.equalsIgnoreCase(model)){
                matches.add(v);
            }
        }
        return matches;
    }

    public List<Vehicle> getVehiclesByYear(int min, int max){
        ArrayList<Vehicle> matches = new ArrayList<>();
        for(Vehicle v : inventory){
            if(v.year >= min && v.year <= max){
                matches.add(v);
            }
        }
        return matches;
    }

    public List<Vehicle> getVehiclesByColor(String color){
        ArrayList<Vehicle> matches = new ArrayList<>();
        for(Vehicle v : inventory){
            if(v.color.equalsIgnoreCase(color)){
                matches.add(v);
            }
        }
        return matches;
    }

    public List<Vehicle> getVehiclesByMileage(int min, int max){
        return inventory;
    }
    public List<Vehicle> getVehiclesByType(String Type){
        return inventory;
    }
    public List<Vehicle> getAllVehicles(){
        return inventory;
    }

    Vehicle addVehicle(Vehicle v){
        inventory.add(v);
        return v;
    }
    void removeVehicle(Vehicle v){
        inventory.remove(v);
    }

    public static void main(String[] args) {
        var d = new Dealership("XYZ MOTORS", "", "");

     //ADD TO INVENTORY
        d.addVehicle(new Vehicle(123,
             1999,
             "MAZDA",
             "MX-5",
             "ROADSTER",
             "WHITE",
             128000,
             5000));
        d.addVehicle(new Vehicle(456,
             2004,
             "Toyota",
             "Camry",
             "Sedan",
             "Silver",
             156000,
             3000));

        System.out.println(d); //show dealership

        for(Vehicle v : d.getAllVehicles()){
            System.out.println(v);
        }
    }
}