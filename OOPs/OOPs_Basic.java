//package OOPs;

// Public class matching the filename
public class OOPs_Basic {
    public static void main(String[] args) {
        Car_Class car = new Car_Class("Tesla Model 3", 2022);
        /*'Car_Class car': Declares a variable 'car' of type 'Car_Class'
         * 'new Car_Class()'': Creates a new instance of 'Car_Class' and assigns it to the variable 'car'
         */
        // car.model = "TATA" => Direct setting value to the objects
        // car.setYear(2022); => Set the value using setter
        //car.displayDetails();
        System.out.println("Model: " + car.getModel() +" Year: " + car.getYear());
        
        Engine engine = new Engine();
        engine.start();
    }
}

// Default access (package-private) class
class Car_Class {
    private String model;
    private int year;

    //Constructor  to initialize model and year
    Car_Class(String model, int year){
        this.model = model;
        this.year = year;
    }

    //Creating getter and setter method for model.
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    //Creating getter and setter method for year.
    public int getYear(){
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

// Another default access class
class Engine {
    public void start() {
        System.out.println("Engine started.");
    }
}
