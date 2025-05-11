class Vehicle {
    int vin;
    int year;
    String make;
    String model;
    String vehicleType;
    String color;
    int odometer;
    double price;

    Vehicle(int vin, int year, String make, String model, String vehicleType, String color, int odometer,double price){
         this.vin = vin;
         this.year = year;
         this.make = make;
         this.model = model;
         this.vehicleType = vehicleType;
         this.color = color;
         this.price = price;
         this.odometer = odometer;
    }
    Vehicle(int vin){    // OVERLOADED CONSTRUCTOR
        this.vin = vin;  // assign value from parameter to property, without this line it will receive arguments but not set them.
    }
    public String toString(){
        return String.format("VIN: '%d'\nYEAR: '%d'\nMAKE: '%s'\nMODEL: '%s'\nCOLOR: '%s'\n",
                this.vin, this.year, this.make, this.model, this.color);
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(123, 1999, "MAZDA", "MX-5", "ROADSTER", "WHITE", 128000, 5000);
        Vehicle v2 = new Vehicle(456, 2004, "Toyota", "Camry", "Sedan", "Silver", 156000, 3000);
        Vehicle v3 = new Vehicle(789);
        System.out.println(v1);
        System.out.println(v2);
        System.out.printf("VIN: '%d', ", v3.vin);

    }
}
